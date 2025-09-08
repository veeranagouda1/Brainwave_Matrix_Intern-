package com.Demo.MyntraClone.Controller;

import com.Demo.MyntraClone.model.item;
import com.Demo.MyntraClone.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController   // ✅ instead of @Controller
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4173")
public class itemController {

    @Autowired
    private itemService itemservice;

    @GetMapping("/")
    public ResponseEntity<List<item>> getItems() {
        return new ResponseEntity<>(itemservice.getAllItems(), HttpStatus.OK);
    }
}
