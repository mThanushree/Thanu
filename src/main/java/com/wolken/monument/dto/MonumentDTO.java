package com.wolken.monument.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class MonumentDTO {
	
	private int id;
	private String name;
	private String location;
	private int year;


}
