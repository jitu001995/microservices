package com.scii.service;

import com.scii.model.IPLPlayer;

public interface IIPLPlayMgmtService {
    public   String registerPlayer(IPLPlayer player);
    public  Iterable<IPLPlayer> showAllPlayers();
}
