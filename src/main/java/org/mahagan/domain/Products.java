/**
 * Created By VijayKumar Moohite
 * Date : 7/6/2023
 * Time : 12:24 PM
 * Project : ManyToOneRelationshipApplicationHB5
 **/

package org.mahagan.domain;

import jakarta.persistence.*;
//This is my Fifth ManyToOne Mapping Relationship application in Hibernate.
@Entity
@Table(name = "productsList")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String productName;
    private String productDescription;
    private int price;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "supplierId")
    private Supplier supplier;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}