package com.example.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.team.domain.Blank;
import com.example.team.mapper.BlankMapper;

@Service
public class BlankServiceImpl implements BlankService {

	@Autowired
	BlankMapper blankMapper;
	
	@Override
	public Blank getMyBlank(String b_username) {
		return blankMapper.getMyBlank(b_username);
	}

	@Override
	public List<Blank> getBlank() {
		return blankMapper.getBlank();
	}
	
	@Override
	public void deleteBlankList(String b_title) {
		blankMapper.deleteBlankList(b_title);
	}

	@Override
	public void doInsertBlank(Blank blank) {
		blankMapper.doInsertBlank(blank);
		
	}

}
