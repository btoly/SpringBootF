package com.example.Whathg_Database.model;


import java.io.Serializable;


import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.example.Whathg_Database.model.Individual.IndividualBuilder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;





@Getter
@Setter
@Entity
@Table(name = "Experience")
public class Experience implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Exp_id;
    
	
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
       @JoinColumn(name="NationalID",nullable=false)
       private Individual NationalID; 
	

	   @ManyToOne(fetch=FetchType.LAZY,optional=false)
       @JoinColumn(name="comanyRefrence",nullable=false)
       private Company comanyRefrence; 
	
	   

	   @ManyToOne(fetch=FetchType.LAZY,optional=false)
       @JoinColumn(name="Comanyname",nullable=false)
       private Company Comanyname; 
	
	   

	   @ManyToOne(fetch=FetchType.LAZY,optional=false)
       @JoinColumn(name="edution",nullable=false)
       private Education edution; 
	

            
                @Column(name = "e_position")
                private String e_position;
	/*
	 * @NotNull(message = " cannot be Empty ")
	 * 
	 * @Column(name = "name_company") private String name_company;
	 */
                @NotNull(message = " cannot be Empty ")
                @Column(name = "s_date")
                private Timestamp s_date;
                @NotNull(message = " cannot be Empty ")
                @Column(name = "e_date")
                private Timestamp e_date;
                @NotNull(message = " cannot be Empty ")
                @Column(name = "add_by")
                private String add_by;
                @NotNull(message = " cannot be Empty ")
                @Column(name = "ref_name")
                private String ref_name;
                
                @Email(message = "Email should be valid")
                @NotNull(message = " cannot be Empty ")
                @Column(name = "ref_email")
                private String ref_email;
                
                public Experience() {
					super();
					// TODO Auto-generated constructor stub
				}

				@Builder
				public Experience(long exp_id, Individual nationalID, Company comanyRefrence, Company comanyname,
						Education edution, String e_position,
						@NotNull(message = " cannot be Empty ") String name_company,
						@NotNull(message = " cannot be Empty ") Timestamp s_date,
						@NotNull(message = " cannot be Empty ") Timestamp e_date,
						@NotNull(message = " cannot be Empty ") String add_by,
						@NotNull(message = " cannot be Empty ") String ref_name,
						@NotNull(message = " cannot be Empty ") String ref_email) {
					super();
					Exp_id = exp_id;
					NationalID = nationalID;
					this.comanyRefrence = comanyRefrence;
					Comanyname = comanyname;
					this.edution = edution;
					this.e_position = e_position;
				//	this.name_company = name_company;
					this.s_date = s_date;
					this.e_date = e_date;
					this.add_by = add_by;
					this.ref_name = ref_name;
					this.ref_email = ref_email;
				}

		
                
                
}