package com.example.team.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.team.domain.Waiting;


@Repository
@Mapper
public interface WaitingMapper {
	
	public Waiting getMyWaiting(String w_username);
	
	public List<Waiting> getWaitingAll();

	public void doInsertReserve(Waiting waiting);
	
	public void deleteWaitingList(String w_title);
	
	public void updateReserve(Waiting waiting);
}
