package com.example.Whathg_Database.JwtProvider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.Whathg_Database.model.Certification;
import com.example.Whathg_Database.model.Company;
import com.example.Whathg_Database.model.Profile;
import com.example.Whathg_Database.repository.CertificationRepository;
import com.example.Whathg_Database.repository.ProfileRepository;
import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")

public class AuthRestAPIs {

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	PasswordEncoder encoder;

	@Autowired
	JwtProvider jwtProvider;
	@Autowired
	private ProfileRepository profileRepository;

	@Autowired
	private CertificationRepository certificationRepository;

	private byte[] bytes;

	//////////// Method Profile////////

	@DeleteMapping(path = { "/{id}" })
	public Profile deleteProfile(@PathVariable("id") long id) {
		Profile profile = profileRepository.findById(id).get();
		profileRepository.deleteById(id);
		return profile;
	}

	@GetMapping("/Getimages")
	public List<Profile> getProfile() {
		return profileRepository.findAll();
	}

	@DeleteMapping(path = { "/deleteCertificationn/{id}" })
	public Certification deleteCertification(@PathVariable("id") long id) {
		Certification certification = certificationRepository.findById(id).get();
		certificationRepository.deleteById(id);
		return certification;
	}

	@GetMapping("/GetCertification")
	public List<Certification> getCertification() {
		return certificationRepository.findAll();
	}

	@RequestMapping("/getCertificate/userId/{id}")
	public List<Certification> getCertificateByUserId(@PathVariable("id") String id) {

		List<Certification> certificateList = getCertification();
		List<Certification> certList = new ArrayList();
		for (Certification certificate : certificateList) {
			if (id.equals(certificate.getUsername())) {
				certList.add(certificationRepository.findById(certificate.getId()).get());
			}
		}
		return certList;
	}

	@GetMapping("/getCertificate/addBy/{id}")
	@ResponseBody
	public List<Certification>  getCertificateByUserIdAndAddBy(@PathVariable("id") String id) {

		Optional<User> user = getUserByName(id);

		if (user.isPresent()) {
			User userObj = user.get();
			List<Certification>  cert = certificationRepository.findByaddby(userObj.getName());

			return cert;

		}

		return null;
	}
	
	
	
	@PutMapping("/updateUser")
	public void update(@RequestBody User user) {
		userRepository.save(user);
	}
	
	
	
	

	@PostMapping("/addCertivcte")
	public void createaddCertivcte(@RequestBody Certification certification) throws IOException {
		certification.setPicByte(this.bytes);
		System.out.println("\n\n\n\n" + certification);
		certificationRepository.save(certification);
		this.bytes = null;
	}

	@PostMapping("/uploadimages")
	public void uploadImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
		this.bytes = file.getBytes();
	}

	@PostMapping("/add")
	public void createProfile(@RequestBody Profile profile) throws IOException {
		profile.setPicByte(this.bytes);
		System.out.println("\n\n\n\n" + profile);
		profileRepository.save(profile);
		this.bytes = null;
	}

	@GetMapping("/getcertification")
	public List<Certification> getcertification() {
		return certificationRepository.findAll();
	}

	@PutMapping("/updateCertification")
	public void updateCertification(@RequestBody Certification certification) {
		certificationRepository.save(certification);
	}

	@PutMapping("/update")
	public void updateProfile(@RequestBody Profile profile) {
		profileRepository.save(profile);
	}

	//////////// Method User////////

	@RequestMapping("/Certication/{id}")
	public Optional<User> getManyeUser(@PathVariable Long id) {
		return userRepository.findById(id);
	}

	@RequestMapping("/User/{id}")
	public Optional<User> getSingleUser(@PathVariable Long id) {
		return userRepository.findById(id);
	}

	@RequestMapping("/User/userName/{name}")
	public Optional<User> getUserByName(@PathVariable String name) {
		return userRepository.findByUsername(name);
	}

	@DeleteMapping(path = { "users/{id}" })
	public User deleteUser(@PathVariable("id") long id) {
		User user = userRepository.getOne(id);
		userRepository.deleteById(id);
		return user;
	}

	@GetMapping("/get")
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	///////// Mehode password/////////////

	////////// JTW Methode//////

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginForm loginRequest) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);

		String jwt = jwtProvider.generateJwtToken(authentication);
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();

		return ResponseEntity.ok(new JwtResponse(jwt, userDetails.getUsername(), userDetails.getAuthorities()));
	}

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpForm signUpRequest) {
		if (userRepository.existsByUsername(signUpRequest.getUsername())) {
			return new ResponseEntity<>(new ResponseMessage(" فشل -> رقم الهوية مسجل مسبقا!"),
					HttpStatus.BAD_REQUEST);
		}

		if (userRepository.existsByEmail(signUpRequest.getEmail())) {
			return new ResponseEntity<>(new ResponseMessage("فشل ->  البريد الاكتروني مسجل مسبقا !"),
					HttpStatus.BAD_REQUEST);
		}

		// Creating user's account
		User user = new User(signUpRequest.getName(), signUpRequest.getUsername(), signUpRequest.getEmail(),
				encoder.encode(signUpRequest.getPassword()), signUpRequest.getFather_Name(),
				signUpRequest.getFather_Name(), signUpRequest.getLast_name(), signUpRequest.getPhone());

		Set<String> strRoles = signUpRequest.getRole();
		Set<Role> roles = new HashSet<>();

		strRoles.forEach(role -> {
			switch (role) {
			case "admin":
				Role adminRole = roleRepository.findByName(RoleName.ROLE_ADMIN)
						.orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
				roles.add(adminRole);

				break;
			case "pm":
				Role pmRole = roleRepository.findByName(RoleName.ROLE_PM)
						.orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
				roles.add(pmRole);

				break;

			case "company":
				Role companyRole = roleRepository.findByName(RoleName.ROLE_COMPANY)
						.orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
				roles.add(companyRole);
				break;
			default:
				Role userRole = roleRepository.findByName(RoleName.ROLE_USER)
						.orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
				roles.add(userRole);
			}
		});

		user.setRoles(roles);
		userRepository.save(user);

		return new ResponseEntity<>(new ResponseMessage("User registered successfully!"), HttpStatus.OK);
	}
}