package com.scii.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.scii.model.IPLTeam;

@FeignClient("TEAM-SERVICE")
public interface IIPLTeamServiceConsumer {
	
	@GetMapping("/team/search/{id}")
     public   ResponseEntity<IPLTeam>  searchTeamById(@PathVariable("id") int id) ;
}
