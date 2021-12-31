package org.da0hn.poc.application.configs;

import lombok.AllArgsConstructor;
import org.da0hn.poc.application.resources.responses.ProductGroupDetail;
import org.da0hn.poc.core.domain.ProductGroup;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@AllArgsConstructor
public class ProductGroupConverterConfiguration {

  private final ModelMapper modelMapper;

  @PostConstruct
  public void addMappings() {
    final var asDetailTypeMap = this.modelMapper.createTypeMap(ProductGroup.class, ProductGroupDetail.class);
    asDetailTypeMap.addMappings(mapper -> {
      mapper.map(ProductGroup::getId, ProductGroupDetail::setId);
      mapper.map(ProductGroup::getName, ProductGroupDetail::setName);
    });
  }


}
