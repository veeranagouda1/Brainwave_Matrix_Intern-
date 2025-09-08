package com.Demo.MyntraClone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class item {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String image;
    private float stars;
    private int count;
    private String company;
    private String item_name;
    private int current_price;
    private int original_price;
    private int iscount_percentage;

}
