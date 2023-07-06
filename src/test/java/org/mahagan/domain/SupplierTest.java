package org.mahagan.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SupplierTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Supplier}
     *   <li>{@link Supplier#setSupplierAddress(String)}
     *   <li>{@link Supplier#setSupplierEmail(String)}
     *   <li>{@link Supplier#setSupplierId(int)}
     *   <li>{@link Supplier#setSupplierMobile(long)}
     *   <li>{@link Supplier#setSupplierName(String)}
     *   <li>{@link Supplier#getSupplierAddress()}
     *   <li>{@link Supplier#getSupplierEmail()}
     *   <li>{@link Supplier#getSupplierId()}
     *   <li>{@link Supplier#getSupplierMobile()}
     *   <li>{@link Supplier#getSupplierName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Supplier actualSupplier = new Supplier();
        actualSupplier.setSupplierAddress("42 Main St");
        actualSupplier.setSupplierEmail("jane.doe@example.org");
        actualSupplier.setSupplierId(1);
        actualSupplier.setSupplierMobile(1L);
        actualSupplier.setSupplierName("Supplier Name");
        assertEquals("42 Main St", actualSupplier.getSupplierAddress());
        assertEquals("jane.doe@example.org", actualSupplier.getSupplierEmail());
        assertEquals(1, actualSupplier.getSupplierId());
        assertEquals(1L, actualSupplier.getSupplierMobile());
        assertEquals("Supplier Name", actualSupplier.getSupplierName());
    }
}

