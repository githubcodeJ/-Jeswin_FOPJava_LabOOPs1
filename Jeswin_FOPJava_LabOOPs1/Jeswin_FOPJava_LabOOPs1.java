package com.greatlearning.Dep;

import java.util.Random;

public class credService {

	 public String generateEmailAddress(String fname,String sname,String Dept) {
	   return fname+sname+"@"+Dept+".abc.com";
	 }
		 
	 
	 
	 public char[] generatePassword()
	 {
		 
	 String cLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 String sLtetter="abcdefghijklmnopgrstuvwxyz";
	 String numbers="01234567890";
	 String splcharacters="!@#$%^&*+=_-";
	 String value=cLetters+sLtetter+numbers+splcharacters;
	 int i;
	 char password[]=new char[8];
	 Random r = new Random();
	 for(i=0;i<8;i++)
	 {
		 password[i]= value.charAt(r.nextInt(value.length()));
	 }
	 
	 return password;
	 }			
		



		public void ShowCredentials(String fname, String sname, String generateEmail , char[] generatePassword) {
 
			System.out.println("Dear "+fname +" "+ sname+" your generated credentials are as follows");
			System.out.println("Employee's EmailAddress is:"+ generateEmail);
			System.out.println("Employee's Password is:"+generatePassword);

			
		}
} 

