package com.xworkz.team.dao;

import com.xworkz.team.dto.Team;
import com.xworkz.team.service.TeamService;



public class TeamDao {

	public static void main(String[] args) {

		//Team team = new Team();
		/*team.setName("MS Dhoni");
		team.setAge(40);
		team.setCountry("India");
		team.setSalary(800000);
		team.setState("Jharkand");*/
		
	
	TeamService ts =new TeamService();
	//ts.saveTeam(team);
		
	
	 Team team=ts.findAllPlayersByCountry("Australia");
	 
		 System.out.println("Team " + team.toString());
		
	
}
}