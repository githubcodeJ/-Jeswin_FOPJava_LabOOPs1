package com.greatlearning.Deatails;

import java.util.Scanner;

import com.greatlearning.Dep.credService;
import com.greatlearning.Employee.Employee;
public class MainClass {

	public static void main(String[] args) {
                 Employee e1=new Employee();
                 
                 credService cd =new credService();
                 String generateEmail="";
                 char[]generatePassword=null;
                 Scanner sc=new Scanner(System.in);
                 do {
                 System.out.println("Please Enter the Department of your choice");
	             System.out.println("1.Technical" );
	             System.out.println("2.Admin" );
	             System.out.println("3.Human Resourse" );
	             System.out.println("4.Legal " );
	             System.out.println("5.Exit " );

	             int choices=sc.nextInt();
	           
	             switch(choices)
	             {
	             case 1:
	            	 generateEmail=	 cd.generateEmailAddress(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"Technichal");
	            	 generatePassword=	cd.generatePassword();
	            	 break;
	             case 2:
	            	 generateEmail= cd.generateEmailAddress(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"Admin");
	            	 generatePassword=	cd.generatePassword();

	            	 break;
	             case 3:
	            	 generateEmail= cd.generateEmailAddress(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"Human Resourse");	 
	            	 generatePassword=	cd.generatePassword();

	            	 break;
	             case 4:
	            	 generateEmail= cd.generateEmailAddress(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"Legal");	  
	            	 generatePassword=	cd.generatePassword();

	            	 break;
	             case 5:
	            	 System.exit(0);
				default:
	            	 System.out.println("Enter A valid Choice");
	            
	             }
             cd.ShowCredentials(e1.getFirstName(),e1.getLastName(), generateEmail ,generatePassword);
	             

                 }while(true);
	}
	

}
