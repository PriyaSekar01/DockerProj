package com.dockerproject.dockerProjDB.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DockerDto {
	
	private Long id;
	
	private String name;
	
	private String gender;
	
	private String address;

}
