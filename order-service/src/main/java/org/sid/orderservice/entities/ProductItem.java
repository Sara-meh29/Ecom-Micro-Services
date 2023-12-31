package org.sid.orderservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.orderservice.model.Product;

@Entity

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class ProductItem {

    @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productid;
    @Transient
    private Product product;
    private double price;
    private int quantity;
    private double discount;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private Order order;


}