package com.xworkz.team.service;

import com.xworkz.team.dto.Team;



public interface TeamIntf {
	
	public void saveTeam (Team team);
	
	
	public Team findAllPlayersByCountry(String country);
	
	public Team findPlayerNamesByCountry(String country);
	
	


}
