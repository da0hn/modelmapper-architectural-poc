package org.da0hn.poc.core;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Provider {
  private Long id;
  private String corporateName;
  private Set<Product> products;
}
