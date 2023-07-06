/**
 * Created By VijayKumar Moohite
 * Date : 7/6/2023
 * Time : 12:25 PM
 * Project : ManyToOneRelationshipApplicationHB5
 **/

package org.mahagan.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int supplierId;
    private String supplierName;
    private String supplierAddress;
    private String supplierEmail;
    private long supplierMobile;

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

    public long getSupplierMobile() {
        return supplierMobile;
    }

    public void setSupplierMobile(long supplierMobile) {
        this.supplierMobile = supplierMobile;
    }
}
