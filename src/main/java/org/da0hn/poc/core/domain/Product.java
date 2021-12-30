package org.da0hn.poc.core.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString
public class Product {
  private Identity id;
  private String name;
  private Double salePrice;
  private ProductGroup group;
  private Set<Provider> providers;
}
