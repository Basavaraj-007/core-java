package com.xworkz.ipl;

import java.util.Scanner;

import com.xworkz.ipl.dto.IplDTO;

public class IplTester {

	public static void main(String a[]) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enteer the Game of");
		sc.next();
		System.out.println("Enter the Type of game");
		sc.next();
		System.out.println("Enter the Sponser for the Game");
		sc.next();
		System.out.println("Enter the Managed by");
		sc.next();
		System.out.println("Enter the Match teams");
		sc.next();
		
		
		
		IplDTO ip = new IplDTO();
		ip.setGameOf("Cricket");
		ip.setType("Domestic");
		ip.setSponser("Dream11");
		ip.setManagedBy("BCCI");
		ip.setTeams("CSK v/s RCB");
		
	sc.close();	
	}
	
}
