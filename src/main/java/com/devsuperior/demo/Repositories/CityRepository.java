package com.devsuperior.demo.Repositories;

import com.devsuperior.demo.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository <City, Long>{

}
