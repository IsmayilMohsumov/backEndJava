package com.example.worldsensing.assignment.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "world_config")
@Getter
@Setter
@ToString
public class Configurations {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "config_seq")
    @SequenceGenerator(sequenceName = "config_sequence", allocationSize = 1, name = "config_seq")
    private Integer sensor_id;
    private String model;
    private String payload;

}

