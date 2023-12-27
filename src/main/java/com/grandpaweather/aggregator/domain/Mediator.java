package com.grandpaweather.aggregator.domain;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "mediators")
public class Mediator {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "mediator")
    private String mediator;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "mediators_triggers",
            joinColumns = @JoinColumn(name = "mediator_id"),
            inverseJoinColumns = @JoinColumn(name = "trigger_id")
    )
    private List<Trigger> triggers = new ArrayList<>();


    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "mediators_products",
            joinColumns = @JoinColumn(name = "mediator_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products = new ArrayList<>();

}
