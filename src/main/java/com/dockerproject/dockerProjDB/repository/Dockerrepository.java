package com.dockerproject.dockerProjDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dockerproject.dockerProjDB.entity.DockerEntity;

@Repository
public interface Dockerrepository extends JpaRepository<DockerEntity, Long>{

}
