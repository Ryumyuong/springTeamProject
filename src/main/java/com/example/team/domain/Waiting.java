package com.example.team.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Waiting{
	private int w_id;
    private String w_username;
    private String w_image;
    private String w_title;
    private String w_item;
    private String w_waiting;
    private String w_date;
    private String w_time;
    private String w_people;
    private String w_waiting_confirm;
}