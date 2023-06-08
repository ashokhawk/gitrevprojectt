package com.Laptop;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LaptopRepo extends JpaRepository<Laptop,Integer> {

	
@Query (value="Select * from laps_details where brand like ?",nativeQuery=true)
	List<Laptop> findByName(String name);
@Query (value="Select * from laps_details where price >= ? and price <= ?",nativeQuery=true)
	List<Laptop> getLapsByRange(int a, int b);
@Query (value="Select max(price) from laps_details  ",nativeQuery=true)
int getMax();



}
