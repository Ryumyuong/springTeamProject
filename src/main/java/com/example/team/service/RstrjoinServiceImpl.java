package com.example.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.team.mapper.RstrjoinMapper;

import com.example.team.domain.Rstrjoin;

@Service
public class RstrjoinServiceImpl implements RstrjoinService {

	@Autowired
	private RstrjoinMapper rstrMapper;
	
	@Override
	public List<Rstrjoin> getRstrjoinList() {
		System.out.println("리스트 뽑아간데이............");
		return rstrMapper.getRstrjoinList();
	}

	@Override
	public Rstrjoin getRead(String rstr_nm) {
		 return rstrMapper.getRead(rstr_nm);
		 
		
	}

	@Override
	public List<Rstrjoin> rangetList() {
		return rstrMapper.ranGetList();
	}

	@Override
	public Rstrjoin getsearch(String rstr_nm) { 
		return rstrMapper.getsearch(rstr_nm);
	}
	

}
