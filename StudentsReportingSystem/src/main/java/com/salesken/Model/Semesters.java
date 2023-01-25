package com.salesken.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Semesters {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer semesterId;
	
	private Integer semester;
	
	private Integer Maths;
	private Integer English;
	private Integer Science;

	

}
