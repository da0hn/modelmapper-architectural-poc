package org.da0hn.poc.application.services;

import org.da0hn.poc.application.resources.responses.ProductDetail;
import org.da0hn.poc.application.resources.responses.ProductSimpleView;
import org.da0hn.poc.core.domain.Product;

public interface IProductConverter {
  ProductSimpleView asSimpleView(Product product);
  ProductDetail asDetail(Product product);
}
