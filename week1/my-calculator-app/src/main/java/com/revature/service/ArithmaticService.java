package com.revature.service;

public class ArithmaticService {
	
	
		//Setting up the method for the addition
		public String doAddition(String number1String, String number2String) {
			double number1 = Double.parseDouble(number1String);
			double number2 = Double.parseDouble(number2String);

			double sum = number1 + number2;

			String result = "" + sum; 
			return result;
			
		}
		//Setting up the method for the subtraction
			public String doSubstraction(String number1String, String number2String) {
				double number1 = Double.parseDouble(number1String);
				double number2 = Double.parseDouble(number2String);

				double sub = number1 - number2;

				String result = "" + sub; 	
				return result;
		}
		//Setting up the method for multiplication	
			public String doMultiplication(String number1String, String number2String) {
				double number1 = Double.parseDouble(number1String);
				double number2 = Double.parseDouble(number2String);

				double multiplication = number1 * number2;

				String result = "" + multiplication;
   			    return result;
		}
		//Setting up the method for Division
			public String doDivision(String number1String, String number2String) {
				double number1 = Double.parseDouble(number1String);
				double number2 = Double.parseDouble(number2String);

				double division =  number1 / number2;
				String result = "" + division; 	 
			    return result;
		}

}
