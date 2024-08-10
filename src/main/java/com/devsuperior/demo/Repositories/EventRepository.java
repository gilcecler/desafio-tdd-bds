package com.devsuperior.demo.Repositories;

import com.devsuperior.demo.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository <Event, Long>{

}
