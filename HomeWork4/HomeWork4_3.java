package com.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork4_3 {

	public static void main (String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Number of HTTP Error : (400, 401, 402, 403, 404 )");
		String input = br.readLine();
		
		switch (input.toLowerCase()) {
		
		case "400" :
			System.out.println("Bad Request"); 
		break;
		
		case "401" :
			System.out.println("Unauthorized"); 
		break;
		
		case "402" :
			System.out.println("Payment Required"); 
			break;
			
		case "403" :
			System.out.println("Forbidden"); 
			
			break;
		
		case "404" :
			System.out.println("Not Found"); 
			break;
			
			default:
			System.out.println("Wrong!");
		}
		
		
	}
}
