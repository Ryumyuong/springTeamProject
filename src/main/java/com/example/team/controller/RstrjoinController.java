package com.example.team.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.team.domain.Rstrjoin;
import com.example.team.service.RstrjoinService;

@RestController
@RequestMapping("/main/Rstr/")
public class RstrjoinController {
	
	@Autowired
	private RstrjoinService rstrjoinService;
	
	@GetMapping("/list")
	public List<Rstrjoin> list() {
		System.out.println("리스트 출력");
		return rstrjoinService.getRstrjoinList();
	}

	@GetMapping("/getRead")
	public Rstrjoin getRead(@Param("rstr_nm") String rstr_nm) {
		Rstrjoin rstr = rstrjoinService.getRead(rstr_nm);
		System.out.println("살짝쿵 가져온데이............+Rstr");
		return rstr;
		
	}
	
	@GetMapping("/getrand")
	public List<Rstrjoin> randlist() {
		return rstrjoinService.rangetList();
	}
	
	@GetMapping("/getsearch")
	public Rstrjoin getsearch(@Param("rstr_nm") String rstr_nm) {
		Rstrjoin rstr = rstrjoinService.getsearch(rstr_nm);
		System.out.println("살짝쿵 가져온데이............+Rstr");
		return rstr;
		
	}
}
