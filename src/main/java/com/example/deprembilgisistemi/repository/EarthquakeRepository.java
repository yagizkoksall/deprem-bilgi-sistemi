package com.example.deprembilgisistemi.repository;


import com.example.deprembilgisistemi.entities.eq;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface EarthquakeRepository extends JpaRepository<eq,Integer> {
    @Query("select e from eq e where e.city like %:city% order by e.date desc")
    List<eq> findAllByCityIsLike(String city);



}
