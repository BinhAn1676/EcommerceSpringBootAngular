package com.annb.ecommerapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sku;
    private String name;
    private String description;
    @Column(name = "unit_price")
    private BigDecimal unitPrice;
    @Column(name = "image_url")
    private String imageUrl;
    private Boolean active;
    @Column(name = "units_in_stock")
    private Integer unitsInStock;
    @Column(name = "date_created")
    private Date dateCreated;
    @Column(name = "last_updated")
    private Date lastUpdated;

    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private ProductCategory category;
}
