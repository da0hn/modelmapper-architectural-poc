package org.da0hn.poc.application.configs;

import lombok.AllArgsConstructor;
import org.da0hn.poc.application.resources.responses.ProductDetail;
import org.da0hn.poc.application.resources.responses.ProductSimpleView;
import org.da0hn.poc.core.domain.Product;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Configuration
@AllArgsConstructor
public class ProductConverterConfiguration {

  private final ModelMapper modelMapper;


  @PostConstruct
  public void mapProduct() {
    final var asSimpleViewTypeMap = this.modelMapper.createTypeMap(
      Product.class,
      ProductSimpleView.class
    );
    asSimpleViewTypeMap.addMappings(mapper -> {
      mapper.map(Product::getSalePrice, ProductSimpleView::setPrice);
      mapper.map(Product::getName, ProductSimpleView::setName);
      mapper.map(Product::getId, ProductSimpleView::setId);
    });

    final var asDetailTypeMap = this.modelMapper.createTypeMap(Product.class, ProductDetail.class);
    asDetailTypeMap.addMappings(mapper -> {
      mapper.map(Product::getId, ProductDetail::setId);
      mapper.map(Product::getName, ProductDetail::setName);
      mapper.map(Product::getSalePrice, ProductDetail::setPrice);
      mapper.map(Product::getGroup, ProductDetail::setGroup);
      mapper.map(Product::getProviders, ProductDetail::setProviders);
    });

  }


}
