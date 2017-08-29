package com.tariq.rmicalcclient;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.tariq.rmicalcinterface.CalculatorInterface;

public class RMICalcClient {
	
	public static void main(String [] args){
		
		try{
			Registry reg = LocateRegistry.getRegistry("192.168.96.4", 2001);
			CalculatorInterface cal = (CalculatorInterface) reg.lookup("calculator");
			System.out.println("Addition of 1 & 1: "+cal.addition(1, 1));
			System.out.println("Subtraction of 1 from 1: "+cal.subtraction(1, 1));
			System.out.println("Division of 1 by 1: "+cal.division(1, 1));
			System.out.println("Multiplication of 1 & 1: "+cal.multiplication(1, 1));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
