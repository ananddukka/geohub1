package com.example.geohub.repository;

import com.example.geohub.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class countryJpaRepository extends JpaRepository<Country, Integer> {

}
