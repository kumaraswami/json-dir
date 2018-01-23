package com.syntel.contacts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompanyDetails {
	
	private static final Logger logger = LogManager.getLogger(CompanyDetails.class);
	
	private String employeeName = null;
	
	private String getEmployeeName(Company comp) {
		
//if(  comp!=null &&   comp.getEmployee()!=null &&   comp.getEmployee().getEmployeeName()!=null)
		employeeName =  comp.getEmployee().getEmployeeName();
		
		return employeeName;
	}
	
	
	public static void main (String... string ) {
		
		CompanyDetails compDtl = new CompanyDetails();
		Company company = null;
		try {
			compDtl.getEmployeeName(company);
		} catch (Exception e) {
			logger.error("Excpetion",e);
		}
		
	}

}
