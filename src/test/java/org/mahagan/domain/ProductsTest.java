package org.mahagan.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class ProductsTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Products}
     *   <li>{@link Products#setPrice(int)}
     *   <li>{@link Products#setProductDescription(String)}
     *   <li>{@link Products#setProductId(int)}
     *   <li>{@link Products#setProductName(String)}
     *   <li>{@link Products#setSupplier(Supplier)}
     *   <li>{@link Products#getPrice()}
     *   <li>{@link Products#getProductDescription()}
     *   <li>{@link Products#getProductId()}
     *   <li>{@link Products#getProductName()}
     *   <li>{@link Products#getSupplier()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Products actualProducts = new Products();
        actualProducts.setPrice(1);
        actualProducts.setProductDescription("Product Description");
        actualProducts.setProductId(1);
        actualProducts.setProductName("Product Name");
        Supplier supplier = new Supplier();
        supplier.setSupplierAddress("42 Main St");
        supplier.setSupplierEmail("jane.doe@example.org");
        supplier.setSupplierId(1);
        supplier.setSupplierMobile(1L);
        supplier.setSupplierName("Supplier Name");
        actualProducts.setSupplier(supplier);
        assertEquals(1, actualProducts.getPrice());
        assertEquals("Product Description", actualProducts.getProductDescription());
        assertEquals(1, actualProducts.getProductId());
        assertEquals("Product Name", actualProducts.getProductName());
        assertSame(supplier, actualProducts.getSupplier());
    }
}

