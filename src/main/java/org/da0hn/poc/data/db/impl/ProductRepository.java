package org.da0hn.poc.data.db.impl;

import org.da0hn.poc.core.domain.Identity;
import org.da0hn.poc.core.domain.Product;
import org.da0hn.poc.core.domain.ProductGroup;
import org.da0hn.poc.core.domain.Provider;
import org.da0hn.poc.data.db.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Repository
public class ProductRepository implements IProductRepository {

  private final Map<Identity, Product> products = new HashMap<>();

  public ProductRepository() {
    final var group = new ProductGroup();
    group.setId(Identity.newIdentity());
    group.setName("Group 1");

    final var provider = new Provider();
    provider.setId(Identity.newIdentity());
    provider.setCorporateName("Provider 0");

    final var product1 = new Product();
    final var id = new Identity("6406ad3c-f6f0-4004-ad50-8904fe6624fa");
    product1.setId(id);
    product1.setName("Product 1");
    product1.setSalePrice(30.5);
    product1.setGroup(group);
    this.products.put(id, product1);

    final var product2 = new Product();
    final var id2 = Identity.newIdentity();
    product2.setId(id2);
    product2.setName("Product 2");
    product2.setSalePrice(20.25);
    product2.setGroup(group);
    this.products.put(id2, product2);

    product1.setProviders(Set.of(provider));
    product2.setProviders(Set.of(provider));
    provider.setProducts(Set.of(product1, product2));

    System.out.println(this.products);
  }

  @Override public Product get(final Identity id) {
    return this.products.getOrDefault(id, null);
  }
}
