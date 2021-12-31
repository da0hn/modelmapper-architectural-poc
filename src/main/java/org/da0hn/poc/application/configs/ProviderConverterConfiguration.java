package org.da0hn.poc.application.configs;

import lombok.AllArgsConstructor;
import org.da0hn.poc.application.resources.responses.ProviderDetail;
import org.da0hn.poc.core.domain.Provider;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@AllArgsConstructor
public class ProviderConverterConfiguration {

  private final ModelMapper modelMapper;

  @PostConstruct
  public void addMappings() {
    final var asDetailTypeMap = this.modelMapper.createTypeMap(Provider.class, ProviderDetail.class);
    asDetailTypeMap.addMappings(mapper -> {
      mapper.map(Provider::getId, ProviderDetail::setId);
      mapper.map(Provider::getCorporateName, ProviderDetail::setName);
      mapper.map(Provider::getProducts, ProviderDetail::setProducts);
    });
  }


}
