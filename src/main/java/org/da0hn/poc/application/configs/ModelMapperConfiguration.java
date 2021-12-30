package org.da0hn.poc.application.configs;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Supplier;

@Configuration
public class ModelMapperConfiguration {

  @Bean
  public ModelMapper modelMapper() {
    return apply(new ModelMapper(), ModelMapperConfiguration::configure).get();
  }

  private static void configure(final ModelMapper modelMapper) {
    modelMapper.getConfiguration()
      .setMatchingStrategy(MatchingStrategies.STRICT)
      .setPreferNestedProperties(false);
  }

  private static <T> Supplier<T> apply(final T data, final Consumer<? super T> action) {
    action.accept(data);
    return () -> data;
  }

}
