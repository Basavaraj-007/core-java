package com.xworkz.team.service;

import java.util.List;

import com.xworkz.team.dto.Team;
import com.xworkz.team.util.EntityManagerUtil;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class TeamService implements TeamIntf {

	EntityManagerUtil entityManagerUtil = new EntityManagerUtil();

	
	public void saveTeam(Team team) {
		
		EntityTransaction entityTransaction = EntityManagerUtil.getEntityManager().getTransaction();
		entityTransaction.begin();
		EntityManagerUtil.getEntityManager().persist(team);

		entityTransaction.commit();
		//EntityManagerUtil.getEntityManager().close();
	}

	public Team findAllPlayersByCountry(String country) {
		Query query=	EntityManagerUtil.getEntityManager().createNamedQuery("findAllPlayersByCountry");

		
		query.setParameter("country", country);

		
		List<Team> listTeam= query.getResultList();
		System.out.println("------ count of list--"+listTeam.size());
			Team retTeam=null;
			for(Team team : listTeam)
			{
				
				retTeam=team;
			}
		return retTeam;
	}

	public Team findPlayerNamesByCountry(String country) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
