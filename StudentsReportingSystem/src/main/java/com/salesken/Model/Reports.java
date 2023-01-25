package com.salesken.Model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Reports {
	
	
	private Double AveragePercentage;
	private Double Averagemarks;
	private List<Student> topTwoStudent=new ArrayList<>(2);

}
