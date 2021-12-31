package org.da0hn.poc.application.configs;

import lombok.AllArgsConstructor;
import org.da0hn.poc.core.domain.Identity;
import org.modelmapper.AbstractConverter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Configuration
@AllArgsConstructor
public class IdentityConverterConfiguration {

  private final ModelMapper modelMapper;

  @PostConstruct
  public void mapIdentity() {
    final var identityConverter = new AbstractConverter<Identity, String>() {
      @Override protected String convert(final Identity source) {
        if(source == null) return null;
        return source.uuid();
      }
    };
    this.modelMapper.addConverter(identityConverter);
  }

}
