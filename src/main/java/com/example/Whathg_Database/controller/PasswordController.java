package com.example.Whathg_Database.controller;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.Whathg_Database.JwtProvider.User;
import com.example.Whathg_Database.JwtProvider.UserDetailsService;
import com.example.Whathg_Database.JwtProvider.UserDetailsServiceImpl;
import com.example.Whathg_Database.model.ForgetPasswordResponse;
import com.example.Whathg_Database.service.EmailService;
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/auth/Password")
@Controller
public class PasswordController {

	@Autowired
	private UserDetailsServiceImpl userService;

	@Autowired
	private EmailService emailService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	
	 
	
	// Display forgotPassword page
	@RequestMapping(value = "/forgot", method = RequestMethod.GET)
	public ModelAndView displayForgotPasswordPage() {
		return new ModelAndView("forgotPassword");
    }
    
    // Process form submission from forgotPassword page
	@RequestMapping(value = "/forgot", method = RequestMethod.POST)
	public ResponseEntity<ForgetPasswordResponse> processForgotPasswordForm(@RequestParam("email") String userEmail) {

		// Lookup user in database by e-mail
		Optional<User> optional = userService.findUserByEmail(userEmail);

		if (!optional.isPresent()) {
			return new ResponseEntity(new ForgetPasswordResponse("FAILED", "User not found"), HttpStatus.OK);
		} else {
			
			// Generate random 36-character string token for reset password 
			User user = optional.get();
			String resetToken = UUID.randomUUID().toString();
			System.out.println("token"+resetToken);
			user.setResetToken(resetToken);
			System.out.println(user);

			// Save token to database
			userService.save(user);

			String appUrl =  "http://localhost:4200";
			
			// Email message
			SimpleMailMessage passwordResetEmail = new SimpleMailMessage();
			passwordResetEmail.setFrom("ebthal2366@gmail.com");
			passwordResetEmail.setTo(user.getEmail());
			passwordResetEmail.setSubject("طلب إعادة تعيين كلمة المرور");
			passwordResetEmail.setText("إعادة تعيين كلمة المرور الخاصة بك ، انقر فوق الرابط أدناه:\n" + appUrl
					+ "/ChangePassword?token=" + user.getResetToken());
			
			
			System.out.println("im here");
			
			emailService.sendEmail(passwordResetEmail);
		}

		return new ResponseEntity(new ForgetPasswordResponse("SUCCESS", ""), HttpStatus.OK);

	}
	// Display form to reset password
	@RequestMapping(value = "/reset", method = RequestMethod.GET)
	public ModelAndView displayResetPasswordPage(ModelAndView modelAndView, @RequestParam("token") String token) {
		
		Optional<User> user = userService.findUserByResetToken(token);

		if (user.isPresent()) { // Token found in DB
			modelAndView.addObject("resetToken", token);
		} else { // Token not found in DB
			modelAndView.addObject("errorMessage", "Oops!  This is an invalid password reset link.");
		}

		modelAndView.setViewName("resetPassword");
		return modelAndView;
	}

	// Process reset password form
	@RequestMapping(value = "/reset", method = RequestMethod.POST)
	public ResponseEntity<ForgetPasswordResponse> setNewPassword(@RequestParam("token") String token, @RequestParam("password") String password) {

		// Find the user associated with the reset token
		System.out.println(token);
		Optional<User> user = userService.findUserByResetToken(token);
		System.out.println("before if");

		// This should always be non-null but we check just in case
		if (user.isPresent()) {
			System.out.println("inside user0");
			
			User resetUser = user.get(); 
            
			// Set new password    
            resetUser.setPassword(bCryptPasswordEncoder.encode(password));
            
			// Set the reset token to null so it cannot be used again
			resetUser.setResetToken(null);

			// Save user
			userService.save(resetUser);
			
			return new ResponseEntity(new ForgetPasswordResponse("SUCCESS", "Password updated successfully"), HttpStatus.OK);

		} else {
			return new ResponseEntity(new ForgetPasswordResponse("FAILED", "User not found"), HttpStatus.OK);
			
		}
		
		
   }
   
    // Going to reset page without a token redirects to login page
	@ExceptionHandler(MissingServletRequestParameterException.class)
	public ModelAndView handleMissingParams(MissingServletRequestParameterException ex) {
		return new ModelAndView("redirect:login");
	}
}