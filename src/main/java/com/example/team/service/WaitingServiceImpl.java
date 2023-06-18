package com.example.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.team.domain.Waiting;
import com.example.team.mapper.WaitingMapper;

@Service
public class WaitingServiceImpl implements WaitingService {

	@Autowired
	WaitingMapper waitingMapper;
	
	@Override
	public Waiting getMyWaiting(String w_username) {
		return waitingMapper.getMyWaiting(w_username);
	}

	@Override
	public List<Waiting> getWaitingAll() {
		return waitingMapper.getWaitingAll();
	}

	@Override
	public void doInsertReserve(Waiting waiting) {
		waitingMapper.doInsertReserve(waiting);
	}

	@Override
	public void deleteWaitingList(String w_title) {
		waitingMapper.deleteWaitingList(w_title);
	}

}
