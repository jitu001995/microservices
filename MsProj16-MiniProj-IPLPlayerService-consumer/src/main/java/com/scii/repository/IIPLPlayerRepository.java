package com.scii.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scii.model.IPLPlayer;

public interface IIPLPlayerRepository extends JpaRepository<IPLPlayer, Integer> {

}
