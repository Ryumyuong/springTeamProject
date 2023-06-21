package com.example.team.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.team.domain.Blank;
import com.example.team.domain.Waiting;


@Repository
@Mapper
public interface BlankMapper {
	
	public Blank getMyBlank(String b_username);
	
	public List<Blank> getBlank();
	
	public void doInsertBlank(Blank blank);
	
	public void deleteBlankList(String b_title);
}
