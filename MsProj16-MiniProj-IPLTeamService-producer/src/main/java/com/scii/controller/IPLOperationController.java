package com.scii.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scii.model.IPLTeam;
import com.scii.service.IPLTeamMgmtService;

@RestController
@RequestMapping("/team")
public class IPLOperationController {
   
	@Value("${title}")
	private String title;
	
	@Autowired
	private IPLTeamMgmtService teamService;
	
	@GetMapping("/")
	public String show() {
		return "title fromm git::"+title;
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> registerTeam(@RequestBody IPLTeam team){
		//use service
		String msg=teamService.saveTeam(team);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping("/search/{id}")
	public ResponseEntity<IPLTeam> searchIPLTeamById(@PathVariable("id") Integer id){
		  //use service
		IPLTeam team=teamService.findTeamById(id);
		return new ResponseEntity<IPLTeam>(team,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<Iterable<IPLTeam>> showAllTeam(){
		//use service
		Iterable<IPLTeam> it=teamService.showAllTeams();
	    return new ResponseEntity<Iterable<IPLTeam>>(it,HttpStatus.OK);	
	}
}
