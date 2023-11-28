package com.example.crud.domain.product;


import jakarta.persistence.*;
import lombok.*;

@Table(name = "product")
@Entity(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    private String id;
    private String name;
    private Integer price_in_cents;

    private Boolean active;

    public Product(RequestProduct requestProduct) {
        this.name = requestProduct.name();
        this.price_in_cents = requestProduct.price_in_cents();
        this.active = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice_in_cents() {
        return price_in_cents;
    }

    public void setPrice_in_cents(Integer price_in_cents) {
        this.price_in_cents = price_in_cents;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
