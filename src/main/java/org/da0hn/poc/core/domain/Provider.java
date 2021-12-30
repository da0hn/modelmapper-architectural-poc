package org.da0hn.poc.core.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Provider {
  private Identity id;
  private String corporateName;
  private Set<Product> products;
}
