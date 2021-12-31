package org.da0hn.poc.application.resources.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProviderDetail {
  private String id;
  private String name;
  private Set<ProductDetail> products;
}
