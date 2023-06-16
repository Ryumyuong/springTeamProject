package com.example.team.service;

import java.util.List;

import com.example.team.domain.Blank;

public interface BlankService {

	public Blank getMyBlank(String b_username);
	
	public List<Blank> getBlank();
	
	public void deleteBlankList(String b_title);
}
