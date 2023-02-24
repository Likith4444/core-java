package com.xworkz.switchapp;

import com.xworkz.switchapp.switchh.Doorbell;
import com.xworkz.switchapp.switchh.Fan;
import com.xworkz.switchapp.switchh.Socket;
import com.xworkz.switchapp.switchh.Switch;
import com.xworkz.switchapp.switchh.Television;
import com.xworkz.switchapp.switchh.Tubelight;

public class AllSwitchTester {
	
	public static void main(String[] args) {
		
		Switch s1 = new Television();
		System.out.println("I'M BORED");
		System.out.println(s1.switchOnOrOff());
		
		Switch s2 = new Tubelight();
		System.out.println("IT'S TOO DARK...ON THE TUBELIGHT");
		System.out.println(s2.switchOnOrOff());
		
		Switch s3 = new Fan();
		System.out.println("IT'S TOO HOT TURN ON THE FAN");
		System.out.println(s3.switchOnOrOff());
		
		Switch s4 = new Socket();
		System.out.println("TURN ON THE SOCKET SWITCH...I NEED TO CHARGE MY PHONE");
		System.out.println(s4.switchOnOrOff());
		
		Switch s5 = new Doorbell();
		System.out.println("IS ANYONE HOME...LET'S RING THE DOORBELL");
		System.out.println(s5.switchOnOrOff());
		
	}

}
