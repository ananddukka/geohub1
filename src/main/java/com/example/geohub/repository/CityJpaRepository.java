package com.example.geohub.repository;

import com.example.geohub.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class cityJpaRepository extends JpaRepository<City, Integer> {

}
