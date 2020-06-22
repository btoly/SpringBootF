package com.example.Whathg_Database.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.example.Whathg_Database.model.Education.EducationBuilder;
import com.example.Whathg_Database.model.Individual.IndividualBuilder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "course")
public class Coures implements Serializable {
	 private static final long serialVersionUID = -3009157732242241606L;
	

	   @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	   @JoinColumn(name="NationalID",nullable=false)
	   private Individual NationalID; 
	  
	
	
	   
	   @ManyToOne(fetch=FetchType.LAZY,optional=false)
       @JoinColumn(name="comanyRefrence",nullable=false)
       private Company comanyRefrence; 
	
	   


	   @ManyToOne(fetch=FetchType.LAZY,optional=false)
       @JoinColumn(name="edution",nullable=false)
       private Education edution; 
	
	 
	  
	  //user_id
	  @Id
	  @Column(name = "courseID")
	  private String courseID;
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "nameCourse")
	  private String nameCourse;
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "addedBy")
	  private String addedBy;
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "nameInstittion")
	  private String nameInstittion;
	  @NotNull(message = " cannot be Empty ")
	  @Column(name = "courseAttch")
	  private String courseAttch;
	 
		@Column(name = "startDate")
		  private Timestamp  startDate;
		  
		  @Column(name = "endDate")
		  private Timestamp endDate;

		  
		  
		  
		  
		  
		  
		  
		public Coures() {
			super();
			// TODO Auto-generated constructor stub
		}

		
		 @Builder
		public Coures(Individual nationalID, Company comanyRefrence, Education edution, String courseID,
				@NotNull String nameCourse, @NotNull String addedBy, @NotNull String nameInstittion,
				@NotNull String courseAttch, Timestamp startDate, Timestamp endDate) {
			super();
			NationalID = nationalID;
			this.comanyRefrence = comanyRefrence;
			this.edution = edution;
			this.courseID = courseID;
			this.nameCourse = nameCourse;
			this.addedBy = addedBy;
			this.nameInstittion = nameInstittion;
			this.courseAttch = courseAttch;
			this.startDate = startDate;
			this.endDate = endDate;
		}


	

}