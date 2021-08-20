package com.voterapp.service;

import com.voterapp.exception.*;

public class ElectionBooth {
	
	public boolean CheckAge(int age) throws UnderAgeException{
		boolean flag=false;
		if(age>18) {
			flag= true;
		}
		else {
			throw new UnderAgeException("Under Age ");
		}
		return flag;
	
}
	String place[]= new String[]{"chennai","coimbatore","madurai","salem"};
	public boolean CheckLocality(String locality) throws LocalityNotFoundException {
		boolean flag=false;
		for(String lc:place) {
			if(lc.equalsIgnoreCase(locality)) {
				flag=true;
			}
			
			
		}
		if(flag==false){
			throw new LocalityNotFoundException("No Locality found");
		}
		
		return flag;
	}
	public boolean CheckVoteid(int voteid) throws NoVoterIdException{
		boolean flag=false;
		if(voteid >=1000 && voteid<9999) {
			flag=true;
		}
		else {
			throw new NoVoterIdException("VoterId not found");
		}
		return flag;
	}

	
	
	 public boolean CheckEligibility(int age,String locality,int voteid) throws NotEligibleException {
		boolean agefirst = CheckAge(age);
		 boolean localityfirst=CheckLocality(locality);
		 boolean voteidfirst=CheckVoteid(voteid);
		 if(agefirst && localityfirst && voteidfirst) {
			 return true;
		 }
		 else {
			 throw new NotEligibleException("Not eligible");
		 }
	}

}
