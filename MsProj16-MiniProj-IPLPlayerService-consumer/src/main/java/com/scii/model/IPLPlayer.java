package com.scii.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="MS_IPLPLAYER")
@Data
public class IPLPlayer implements Serializable {
	
	@Id
	private Integer playerId;
	private String playerName;
	private String jerseyNo;
	private String category;
//	@ManyToOne(targetEntity=IPLTeam.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//	@JoinColumn(name="team_uid",referencedColumnName="team_id")
//	private IPLTeam teamInfo;
	
}
