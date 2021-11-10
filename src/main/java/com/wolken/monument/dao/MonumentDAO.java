package com.wolken.monument.dao;

import java.util.List;

import com.wolken.monument.entity.MonumentEntity;

public interface MonumentDAO {

	void save(MonumentEntity entity);
    List getAll();
	
}