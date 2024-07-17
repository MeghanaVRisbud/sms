package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.CricketPlayer;
import com.tka.service.PlayerService;

@RestController
public class PlayerController {
	@Autowired
	PlayerService ps;
	@Value("${c.n}")
	int a;
	
	@GetMapping("/allPlayers")
	public List<CricketPlayer> getPlayers()
	{System.out.println(a);
		List<CricketPlayer> lt=ps.getPlayers();
		
		return lt;
	}
	@GetMapping("/cntPlayers")
	public int cntPlayer()
	{
	int cnt=ps.cntPlayer();
		return cnt;
	}
	@GetMapping("/premiumPlayers")
	public List<CricketPlayer> premiumPlayer()
	{
		List<CricketPlayer>p=ps.premiumPlayer();
		return p;
	}
	@GetMapping("/singlePlayer")
	public CricketPlayer fetchSinglePlayer()
	{
		CricketPlayer cp=ps.fetchSinglePlayer();
		return cp;
    }
	@GetMapping("/citywiseTotPlayers/{city}")
	public int cityWiseTotPlayer(@PathVariable String city)
	{
		return ps.cityWiseTotPlayer(city);
		
	}
	@GetMapping("/citywiseTotPlayersRQ")
	public int cityWiseTotPlayerRQ(@RequestParam String city,@RequestParam int noofyrs)
	{
		return ps.cityWiseTotPlayerRQ(city,noofyrs);
		
	}
	@PostMapping("/addSinglePlayer")
	public void addSinglePlayer(@RequestBody CricketPlayer  cp)
	{
		System.out.println(cp);
		ps.addSinglePlayer(cp);
		
    }
	@PutMapping("/updateSinglePlayer")
	public void updateSinglePlayer(@RequestBody CricketPlayer  cp)
	{
		
		System.out.println(cp);
		ps.updateSinglePlayer(cp);
		
    }
}