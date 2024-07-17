package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.tka.dao.PlayerDao;
import com.tka.entity.CricketPlayer;

@Service

public class PlayerService {

	@Autowired
	PlayerDao d;

	public List<CricketPlayer> getPlayers() {
		List<CricketPlayer> lt = d.getPlayers();
		return lt;
	}

	public int cntPlayer() {
		List<CricketPlayer> lt = d.getPlayers();
		return lt.size();
	}

	public List<CricketPlayer> premiumPlayer() {
		List<CricketPlayer> lt = d.getPlayers();
		List<CricketPlayer> lt1 = new ArrayList();
		for (CricketPlayer p : lt) {
			if (p.getNoofyrs() > 5)
				lt1.add(p);
		}
		return lt1;
	}
	public CricketPlayer fetchSinglePlayer()
	{
		CricketPlayer cp=d.fetchSinglePlayer();
		return cp;
	}

	public void addSinglePlayer(CricketPlayer cp) {
		// TODO Auto-generated method stub
		d.addSinglePlayer(cp);
	}
	public void updateSinglePlayer(@RequestBody CricketPlayer  cp)
	{
		d.updateSinglePlayer(cp);
	}

	public int cityWiseTotPlayer(String city) {
		List<CricketPlayer> lt = d.getPlayers();
		List<CricketPlayer> lt1 = new ArrayList();
		for (CricketPlayer p : lt) {
			if (p.getCity().equalsIgnoreCase(city))
				lt1.add(p);
		}
		return lt1.size();
		
	}
	public int cityWiseTotPlayerRQ(String city,int noofyrs) {
		List<CricketPlayer> lt = d.getPlayers();
		List<CricketPlayer> lt1 = new ArrayList();
		for (CricketPlayer p : lt) {
			if (p.getCity().equalsIgnoreCase(city)&&p.getNoofyrs()==noofyrs)
				lt1.add(p);
		}
		return lt1.size();
		
	}
}
