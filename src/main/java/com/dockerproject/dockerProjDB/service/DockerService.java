package com.dockerproject.dockerProjDB.service;

import org.springframework.stereotype.Service;

import com.dockerproject.dockerProjDB.dto.DockerDto;
import com.dockerproject.dockerProjDB.entity.DockerEntity;
import com.dockerproject.dockerProjDB.repository.Dockerrepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DockerService {
	
	private final Dockerrepository dockerrepository;
	
	public DockerEntity create(DockerDto dto) {
		
		DockerEntity entity = DockerEntity.builder()
				.name(dto.getName())
				.gender(dto.getGender())
				.address(dto.getAddress())
				.build();
		
		return dockerrepository.save(entity);
		}
	

}
