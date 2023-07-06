package org.mahagan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.mahagan.domain.Products;
import org.mahagan.domain.Supplier;

public class ManyToOneRelationshipApplicationHB5 {
    public static void main(String[] args) {
        StandardServiceRegistry ssr =new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction tsx = session.beginTransaction();

        //Products List of Supplier1
        Supplier supplier = new Supplier();
        supplier.setSupplierName("Vijay");
        supplier.setSupplierAddress("Pune");
        supplier.setSupplierEmail("vijay@gmail.com");
        supplier.setSupplierMobile(232430);

        Products products = new Products();
        products.setProductName("IPhone");
        products.setProductDescription("It is a Mobile");
        products.setPrice(100000);

        Products products1 = new Products();
        products1.setProductName("Samsung");
        products1.setProductDescription("It is a Mobile");
        products1.setPrice(80000);

        Products products2 = new Products();
        products2.setProductName("OnePlus");
        products2.setProductDescription("It is a Mobile");
        products2.setPrice(50000);

        products.setSupplier(supplier);
        products1.setSupplier(supplier);
        products2.setSupplier(supplier);

        session.persist(products);
        session.persist(products1);
        session.persist(products2);

        //Products List of Supplier2
        Supplier supplier2 = new Supplier();
        supplier2.setSupplierName("Ajay");
        supplier2.setSupplierAddress("Sangli");
        supplier2.setSupplierEmail("ajay@gmail.com");
        supplier2.setSupplierMobile(23243023);

        Products products3 = new Products();
        products3.setProductName("HP");
        products3.setProductDescription("It is a Laptop");
        products3.setPrice(60000);

        Products products4 = new Products();
        products4.setProductName("Dell");
        products4.setProductDescription("It is a Laptop");
        products4.setPrice(40000);

        Products products5 = new Products();
        products5.setProductName("Apple");
        products5.setProductDescription("It is a Laptop");
        products5.setPrice(125000);

        products3.setSupplier(supplier2);
        products4.setSupplier(supplier2);
        products5.setSupplier(supplier2);

        session.persist(products3);
        session.persist(products4);
        session.persist(products5);

        tsx.commit();
        session.close();
        System.out.println("Data Inserted In Table Successsfully Done!");
    }
}