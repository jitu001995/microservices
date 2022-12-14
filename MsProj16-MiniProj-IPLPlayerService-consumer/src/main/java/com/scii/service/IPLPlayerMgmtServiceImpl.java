package com.scii.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scii.client.IIPLTeamServiceConsumer;
import com.scii.model.IPLPlayer;
import com.scii.model.IPLTeam;
import com.scii.repository.IIPLPlayerRepository;

import lombok.extern.slf4j.Slf4j;

@Service("playerService")
@Slf4j
public class IPLPlayerMgmtServiceImpl implements IIPLPlayMgmtService {
	private static  Logger logger= LoggerFactory.getLogger(IPLPlayerMgmtServiceImpl.class);
	@Autowired
	private IIPLPlayerRepository  playerRepo;
	@Autowired
	private IIPLTeamServiceConsumer  consumer;

	@Override
	public String registerPlayer(IPLPlayer player) {
		//use feign client   MS communication to get IPLTeam info being Palyer service
		 // IPLTeam team=consumer.searchTeamById(player.getTeamInfo().getTeamId()).getBody();
		  logger.info(" The consumer Palyer service has consumer team service using feignt client");
		  //assign team Object to player object
		 // player.setTeamInfo(team);
		  logger.info(" Player object is saved ...");
		  //save player object
		  return  "player with team details are saved with id value:"+playerRepo.save(player).getPlayerId();
		  
		
	}

	@Override
	public Iterable<IPLPlayer> showAllPlayers() {
		logger.info(" All  Player details retrived");
		return  playerRepo.findAll();
	}

}
