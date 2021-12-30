package org.da0hn.poc.core;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Product {
  private Long id;
  private String name;
  private Double salePrice;
  private ProductGroup group;
  private Set<Provider> providers;
}
