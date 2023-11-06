package com.sunbeam.q2.exceptions;

public class IdNotFoundException extends Exception {
	 String msg="ID NOT FOUND IN THE TABLE !";
	 
	 public void msg() {
		 System.out.println(msg);
	 }

}
