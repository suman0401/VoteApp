package com.voterapp.main;

import java.util.Scanner;

import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIdException;
import com.voterapp.exception.UnderAgeException;
import com.voterapp.service.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectionBooth booth=new ElectionBooth();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Enter your locality");
		String locality=sc.next();
		System.out.println("Enter your voterid");
		int voteid=sc.nextInt();
		try {
			booth.CheckAge(age);
			booth.CheckLocality(locality);
			booth.CheckVoteid(voteid);
			booth.CheckEligibility(age, locality, voteid);
			System.out.println("You are eligible to vote");
		} catch (UnderAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("You are not eligible to vote");
			
		} catch (LocalityNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("You are not eligible to vote");
		
		} catch (NoVoterIdException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("You are not eligible to vote");
		} catch (NotEligibleException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("You are not eligible to vote");
		}
		
		sc.close();	
	}
	
}

	


