package com.grandpaweather.aggregator.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "category")
    private String category;

    @Column(name = "name")
    private double name;

    private String imageURI;

    @ManyToMany(mappedBy = "products")
    private List<Mediator> mediators = new ArrayList<>();


}
