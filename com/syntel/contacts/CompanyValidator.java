package com.syntel.contacts;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompanyValidator {

	private static final Logger logger = LogManager.getLogger(CompanyValidator.class);
	
	String emailRegexPattern;
	String customerName;
	String customerFirstName;
	String customerLastName;
	String primaryEmail;
	String secondaryEmail;
	Date accountCreationDate;
	Boolean isEmailValid;
	Boolean isFacebook;
	String acctType;
	String socialMedia;

	public void init(){
		System.out.println("init done");
		acctType = "Individual";
		emailRegexPattern = "[\\w-]+@([\\w-]+\\.)+[\\w-]+";
		customerFirstName = "Fred Smith";
		customerLastName = null;
		primaryEmail = "youremail@myisp.domain";
		secondaryEmail = null;
		socialMedia = null;
		isFacebook = true;
		accountCreationDate = new Date();
	}

	public boolean customerContactValidation() {
		init();

		if(acctType.equals("Individual")){
			customerName = customerFirstName + customerLastName;
		}else{
			logger.debug("Cannot have person for business contact");
		}

		primaryEmail = "youremail@myisp.domain";

		secondaryEmail = null;
//if(secondaryEmail!=null)
		isEmailValid =secondaryEmail.matches(emailRegexPattern);
//if(socialMedia!=null)
		isFacebook =socialMedia.contains("FACEBOOK");

		return true;
	}

	public static void main(String[] args) {
		CompanyValidator companyValidator = new CompanyValidator();
		try{
			companyValidator.customerContactValidation();
		}catch(Exception e){
			logger.error("Throwing critical Exception");
			logger.error("Exception ",e);
		}
	}

}
