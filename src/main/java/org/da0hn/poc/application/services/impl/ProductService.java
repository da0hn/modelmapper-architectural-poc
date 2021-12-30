package org.da0hn.poc.application.services.impl;

import lombok.AllArgsConstructor;
import org.da0hn.poc.application.resources.responses.ProductSimpleView;
import org.da0hn.poc.application.services.IProductService;
import org.da0hn.poc.core.domain.Identity;
import org.da0hn.poc.data.db.IProductRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService implements IProductService {

  private final IProductRepository repository;

  @Override public ProductSimpleView get(final Identity id) {
    //    return this.repository.get(id);
    return null;
  }
}
