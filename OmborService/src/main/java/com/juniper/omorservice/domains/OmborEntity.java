package com.juniper.omorservice.domains;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
public class OmborEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;

    private String shtrix;

    private BigDecimal tannarx;

    private double amount;

    @ManyToOne
    private MeasurementEntity measurementEntity;

    @ManyToOne
    private KategoryEntity kategoryEntity;

}
