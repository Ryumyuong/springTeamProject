package com.example.team.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.team.domain.Blank;
import com.example.team.service.BlankService;	

@RestController
@RequestMapping("/main/myDining/")
public class BlankController {
	@Autowired
	BlankService blankService;
	
	@GetMapping("myBlank")
	public Blank getMyBlank(@RequestParam("w_username") String w_username) {
		Blank blank = blankService.getMyBlank(w_username);
		System.out.println("myBlank=====getMyBlank==============="+blank);
		return blank;
	}
	
	@GetMapping("blank")
	public Map<String,List<Blank>> getBlank() {
		Map<String,List<Blank>> blank = new HashMap<String,List<Blank>>();
		blank.put("blankItems", blankService.getBlank());
		System.out.println("Blank=====getBlank==============="+blankService.getBlank());
		return blank;
	}

	
	@PostMapping("blank/delete/{b_title}")
	public void deleteBlankList(@PathVariable("b_title") String b_title) {
		System.out.println("===============삭제 성공================");
		blankService.deleteBlankList(b_title);
	}
}

