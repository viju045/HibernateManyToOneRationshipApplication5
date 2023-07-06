/**
 * Created By VijayKumar Moohite
 * Date : 7/6/2023
 * Time : 12:22 PM
 * Project : ManyToOneRelationshipApplicationHB5
 **/

package org.mahagan;

import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.mahagan.domain.Products;
import org.mahagan.domain.Supplier;

import java.util.Iterator;
import java.util.List;

public class ManyToOneRelationshipApplicationFetchDataHB5 {
    public static void main(String[] args) {
        StandardServiceRegistry ssr =new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction tsx = session.beginTransaction();

        TypedQuery query = session.createQuery("from Products produts");
        List<Products>list = query.getResultList();
        Iterator<Products>iterator = list.listIterator();
        while(iterator.hasNext())
        {
            Products products = iterator.next();
            System.out.println("*************** Products details  ******************");
            System.out.println(products.getProductName()+"-"+products.getProductDescription()+"-"+products.getPrice());

            Supplier supplier = products.getSupplier();
            System.out.println("Supplier Details---->>>>"+supplier.getSupplierName()+"-"+supplier.getSupplierAddress()+"-"+supplier.getSupplierEmail()+"-"+supplier.getSupplierMobile());
        }
         session.close();
        System.out.println("Done!");
    }
}
