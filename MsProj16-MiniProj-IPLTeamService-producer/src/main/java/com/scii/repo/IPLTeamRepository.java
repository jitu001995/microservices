package com.scii.repo;

import java.util.Iterator;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scii.model.IPLTeam;

public interface IPLTeamRepository extends JpaRepository<IPLTeam, Integer> {
   
}
