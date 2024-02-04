package com.annb.ecommerapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "product_category")
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "category",orphanRemoval = true)
    private Set<Product> products;

}
