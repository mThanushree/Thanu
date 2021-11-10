package com.wolken.monument.service;

import java.util.List;

import com.wolken.monument.dto.MonumentDTO;

public interface MonumentService {

	void validateandsave(MonumentDTO dto);
    List getAll();

}