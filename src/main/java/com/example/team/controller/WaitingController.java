package com.example.team.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.team.domain.Waiting;
import com.example.team.service.WaitingService;	

@RestController
@RequestMapping("/main/myDining/")
public class WaitingController {
	@Autowired
	WaitingService waitingService;
	
	@GetMapping("myWaiting")
	public Waiting getMyWaiting(@RequestParam("w_username") String w_username) {
		Waiting waiting = waitingService.getMyWaiting(w_username);
		System.out.println("myReserve=====getMyReserve==============="+waiting);
		return waiting;
	}
	
	@GetMapping("waitingAll")
	public Map<String,List<Waiting>> getWaitingAll() {
		Map<String,List<Waiting>> waiting = new HashMap<String,List<Waiting>>();
		waiting.put("items", waitingService.getWaitingAll());
		System.out.println("Waiting=====getWaitingAll==============="+waitingService.getWaitingAll());
		return waiting;
	}
	
	@PostMapping("delete/{w_title}")
	public void deleteWaitingList(@PathVariable("w_title") String w_title) {
		System.out.println("===============삭제 성공================");
		waitingService.deleteWaitingList(w_title);
	}
	
	@PostMapping("insert")
	public Waiting doInsertReserve(@RequestBody Waiting waiting) {
		if(!waiting.getW_title().equals("")) {
			System.out.println("===============입력 성공================");
			waitingService.doInsertReserve(waiting);
		}
		
		return waiting;
	}
}

