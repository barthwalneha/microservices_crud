package com.product.microservices.crudoperations.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="Name ")
    private String deviceName;
    @Column(name="Processor")
    private String processor;
    @Column(name="RAM")
    private String ram;
    @Column(name="Screen_Size")
    private int screenSize;
    @Column(name="Memory")
    private String memory;
}
