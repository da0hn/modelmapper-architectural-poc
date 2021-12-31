package org.da0hn.poc.application.services.impl;

import lombok.AllArgsConstructor;
import org.da0hn.poc.application.resources.responses.ProductDetail;
import org.da0hn.poc.application.resources.responses.ProductSimpleView;
import org.da0hn.poc.application.services.IProductConverter;
import org.da0hn.poc.application.services.IProductService;
import org.da0hn.poc.core.domain.Identity;
import org.da0hn.poc.data.db.IProductRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService implements IProductService {

  private final IProductRepository repository;
  private final IProductConverter productConverter;

  @Override public ProductSimpleView getProductAsSimpleView(final Identity id) {
    final var product = this.repository.get(id);
    return this.productConverter.asSimpleView(product);
  }

  @Override public ProductDetail getProductAsDetail(final Identity id) {
    final var product = this.repository.get(id);
    return this.productConverter.asDetail(product);
  }
}
