package com.scii.service;

import java.util.Iterator;

import com.scii.model.IPLTeam;

public interface IPLTeamMgmtService {
	public String saveTeam(IPLTeam team);
    public IPLTeam findTeamById(int id);
    public Iterable<IPLTeam> showAllTeams();
}
