package com.xworkz.ipl.dto;

public class IplDTO {
	private String gameOf;
	  private String type;
	  private String sponser;
	  private String managedBy;
	  private String teams;
	  
	  public IplDTO() {
	  }
	  
	public String getGameOf() {
		return gameOf;
	}
	public void setGameOf(String gameOf) {
		this.gameOf = gameOf;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSponser() {
		return sponser;
	}
	public void setSponser(String sponser) {
		this.sponser = sponser;
	}
	public String getManagedBy() {
		return managedBy;
	}
	public void setManagedBy(String managedBy) {
		this.managedBy = managedBy;
	}
	public String getTeams() {
		return teams;
	}
	public void setTeams(String teams) {
		this.teams = teams;
	}
	@Override
	public String toString() {
		return "IplDTO [gameOf=" + gameOf + ", type=" + type + ", sponser=" + sponser + ", managedBy=" + managedBy
				+ ", teams=" + teams + "]";
	
	  
	  
	  }
}
