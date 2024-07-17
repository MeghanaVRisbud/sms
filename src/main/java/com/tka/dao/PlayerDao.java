package com.tka.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.tka.entity.CricketPlayer;
import java.util.List;
@Repository
public class PlayerDao 
{
	@Autowired
	SessionFactory factory;
	
	public List<CricketPlayer> getPlayers()
	{
		Session s=factory.openSession();
		Criteria c=s.createCriteria(CricketPlayer.class);
		List<CricketPlayer> lt=c.list();
		return lt;
		
	}
	public CricketPlayer fetchSinglePlayer()
	{
		Session s=factory.openSession();
		CricketPlayer cp=s.load(CricketPlayer.class, 1);
		return cp;
	}
	public void addSinglePlayer(CricketPlayer cp) {
		// TODO Auto-generated method stub
		Session s=factory.openSession();
		Transaction t=s.beginTransaction();
		s.save(cp);
		t.commit();
	}
	public void updateSinglePlayer(CricketPlayer cp) {
		// TODO Auto-generated method stub
		Session s=factory.openSession();
		Transaction t=s.beginTransaction();
		s.saveOrUpdate(cp);
		t.commit();
		
	}
	
	

}
