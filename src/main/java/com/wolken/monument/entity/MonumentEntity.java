package com.wolken.monument.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@NamedQueries ({
	@NamedQuery(name = "getAll", query = "from MonumentEntity")
})

public class MonumentEntity {
	
	@Id
	private int id;
	private String name;
	private String location;
	private int year;

}
