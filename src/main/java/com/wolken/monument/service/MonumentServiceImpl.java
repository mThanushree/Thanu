package com.wolken.monument.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.monument.dao.MonumentDAO;
import com.wolken.monument.dto.MonumentDTO;
import com.wolken.monument.entity.MonumentEntity;

@Component
public class MonumentServiceImpl implements MonumentService {
	@Autowired
	MonumentDAO dao;
	public void validateandsave(MonumentDTO dto) {
		if(!dto.getName().equals(null)&& !dto.getName().equals("")) {
			if(!dto.getLocation().equals(null)&& !dto.getLocation().equals("")) {
				if(dto.getYear()>0) {
							MonumentEntity entity=new MonumentEntity();
							BeanUtils.copyProperties(dto, entity);
							dao.save(entity);
						}else {
							System.out.println("Invalid Year");
						}
					}else {
						System.out.println("Invalid Location");
					}
				}else {
					System.out.println("Invalid Name");
			}
	}
	
	public List getAll() {
		
		MonumentEntity entity=new MonumentEntity();
		List list=dao.getAll();
		return list;
	}
}