package org.da0hn.poc.data.db.impl;

import org.da0hn.poc.core.domain.Identity;
import org.da0hn.poc.core.domain.Product;
import org.da0hn.poc.data.db.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {

  private final Map<Identity, Product> products = new HashMap<>();

  public ProductRepository() {
    final var product = new Product();
    final var id = new Identity("6406ad3c-f6f0-4004-ad50-8904fe6624fa");
    product.setId(id);
    product.setName("Product 1");
    product.setSalePrice(30.5);
    this.products.put(id, product);
    final var product2 = new Product();
    final var id2 = Identity.newIdentity();
    product2.setId(id2);
    product2.setName("Product 2");
    product2.setSalePrice(20.25);
    this.products.put(id2, product2);
    System.out.println(this.products);
  }

  @Override public Product get(final Identity id) {
    return this.products.getOrDefault(id, null);
  }
}
