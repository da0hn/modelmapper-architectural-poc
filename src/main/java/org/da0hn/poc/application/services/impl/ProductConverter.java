package org.da0hn.poc.application.services.impl;

import lombok.AllArgsConstructor;
import org.da0hn.poc.application.resources.responses.ProductDetail;
import org.da0hn.poc.application.resources.responses.ProductSimpleView;
import org.da0hn.poc.application.services.IProductConverter;
import org.da0hn.poc.core.domain.Product;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ProductConverter implements IProductConverter {

  private final ModelMapper mapper;

  @Override public ProductSimpleView asSimpleView(final Product product) {
    return this.mapper.map(product, ProductSimpleView.class);
  }

  @Override public ProductDetail asDetail(final Product product) {
    return this.mapper.map(product, ProductDetail.class);
  }
}
