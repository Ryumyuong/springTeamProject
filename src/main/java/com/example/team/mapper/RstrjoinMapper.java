package com.example.team.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import com.example.team.domain.Rstrjoin;

@Repository
@Mapper
public interface RstrjoinMapper {
	
	
	public List<Rstrjoin> getRstrjoinList();

	public Rstrjoin getRead(String rstr_nm);
	
	public List<Rstrjoin> ranGetList();

	public Rstrjoin getsearch(String rstr_nm);
	
	

}
