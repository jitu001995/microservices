package com.scii.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scii.model.IPLTeam;
import com.scii.repo.IPLTeamRepository;
import com.scii.service.IPLTeamMgmtService;
@Service
public class IPLTeamMgmtServiceImpl implements IPLTeamMgmtService {
     
	@Autowired
	private IPLTeamRepository iplTeamRepo;
	
	@Override
	public String saveTeam(IPLTeam team) {
		return "team is saved with:"+iplTeamRepo.save(team).getTeamId();
	}

	@Override
	public IPLTeam findTeamById(int id) {
//		Optional<IPLTeam> opt = iplTeamRepo.findById(id);
//		if(opt.isPresent()) {
//			return opt.get();
//		} else {
//			throw new IllegalArgumentException("Invalid team id");
//		}
		return iplTeamRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Team Id"));
		
	}

	@Override
	public Iterable<IPLTeam> showAllTeams() {
		// TODO Auto-generated method stub
		return iplTeamRepo.findAll();
	}

}
