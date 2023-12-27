package com.grandpaweather.aggregator.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "triggers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Trigger {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "trigger")
    private String trigger;


    @ManyToMany(mappedBy = "triggers")
    private List<Mediator> mediators = new ArrayList<>();

}
