package com.carewassoc;
import java.lang.*;

public class Main {
		// create a StandardMembership
		public StandardMembership stam=StandardMembership.getInstance();
		
		System.out.println("Standard Member 1: " + stam.toString());
		
		StandardMembership stam2=StandardMembership.getInstance();
		// stam2.toString();
		
		StudentMembership stum=StudentMembership.getInstance();
		// stum.toString();
		StudentMembership stum2=StudentMembership.getInstance();
		// stum2.toString();

		OAPMembership oapm = OAPMembership.getInstance();
		OAPMembership oapm2 = OAPMembership.getInstance();
		// oapm.toString();
		// oapm2.toString();
}