package com.dockerproject.dockerProjDB.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.dockerproject.dockerProjDB.dto.DockerDto;
import com.dockerproject.dockerProjDB.entity.DockerEntity;
import com.dockerproject.dockerProjDB.service.DockerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DockerController {
	
	
	private final DockerService service;
	
	@PostMapping("/create")
	public DockerEntity createTo(@RequestBody DockerDto dto) {
		
		return service.create(dto);
	}
	

}
