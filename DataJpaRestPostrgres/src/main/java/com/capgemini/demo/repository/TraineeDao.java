package com.capgemini.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.demo.entity.Trainee;
@Repository
public interface TraineeDao  extends JpaRepository<Trainee, Integer>{
	List<Trainee>findByTraineeBatch(String batchName);
	List<Trainee>findByTraineeName(String traineeName);
}
