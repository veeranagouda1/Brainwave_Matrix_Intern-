package com.Demo.MyntraClone.repo;

import com.Demo.MyntraClone.model.item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itemRepo extends JpaRepository<item,Integer> {

}
