package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.model.Garbage;

@CrossOrigin("*")
public interface GarbageRepository extends JpaRepository <Garbage, Integer> {

}
