package com.dockerproject.dockerProjDB.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="dockerclass")
public class DockerEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="gender")
	private String gender;
	
	
	@Column(name="address")
	private String address;
	
	
	
	

}
