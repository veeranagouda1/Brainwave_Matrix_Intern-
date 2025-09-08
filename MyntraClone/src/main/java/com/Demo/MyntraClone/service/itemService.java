package com.Demo.MyntraClone.service;

import com.Demo.MyntraClone.model.item;
import com.Demo.MyntraClone.repo.itemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class itemService {
    @Autowired
    private itemRepo itemrepo;
    public List<item> getAllItems() {
        return itemrepo.findAll();
    }
}
