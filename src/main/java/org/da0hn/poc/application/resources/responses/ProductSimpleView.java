package org.da0hn.poc.application.resources.responses;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class ProductSimpleView {
  private String id;
  private Double price;
  private String name;
}
