package com.example.demo;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdemoApplication {
	
	public static void main(String[] args) {
		String input="SAM";
		boolean b=Pattern.matches("[A-Z]{2,4}", input);
		System.out.println(b);
	}

	public static void main2(String[] args) {
		String input="SAM";
		boolean b=Pattern.compile("[A-Z]{2,4}").matcher(input).matches();
		System.out.println(b);
	}
	
	public static void main1(String[] args) {
		String input="SAM";
		
		//1. Define Pattern Object
		Pattern p=Pattern.compile("[A-Z]{2,4}");
		
		//2. compare with input String
		Matcher m=p.matcher(input);
		
		//3. print result of matching
		boolean b=m.matches();
		
		System.out.println(b);
		
	}
}