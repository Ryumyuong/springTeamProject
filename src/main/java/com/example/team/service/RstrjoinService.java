package com.example.team.service;

import java.util.List;


import com.example.team.domain.Rstrjoin;

public interface RstrjoinService {
	
	public List<Rstrjoin> getRstrjoinList();

	public Rstrjoin getRead(String rstr_nm);
	
	public List<Rstrjoin> rangetList();

	public Rstrjoin getsearch(String rstr_nm);
}
