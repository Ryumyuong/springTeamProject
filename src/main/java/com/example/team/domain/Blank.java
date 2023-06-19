package com.example.team.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blank {
	private int b_id;
	private String b_username;
	private String b_image;
	private String b_title;
	private String b_date;
	private String b_people;
	private String b_time;
	private String b_blank_confirm;
}
