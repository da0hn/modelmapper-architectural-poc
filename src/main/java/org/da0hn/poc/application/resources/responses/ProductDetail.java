package org.da0hn.poc.application.resources.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetail {


  private String id;
  private String name;
  private Double price;
  private ProductGroupDetail group;
  @JsonIgnoreProperties("products")
  private Set<ProviderDetail> providers;


}
