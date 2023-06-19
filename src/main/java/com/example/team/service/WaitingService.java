package com.example.team.service;

import java.util.List;

import com.example.team.domain.Waiting;

public interface WaitingService {

	public Waiting getMyWaiting(String w_username);
	
	public List<Waiting> getWaitingAll();
	
	public void doInsertReserve(Waiting waiting);
	
	public void deleteWaitingList(String w_title);
	
	public void updateReserve(Waiting waiting);
}
