package org.da0hn.poc.application.resources.impl;

import lombok.AllArgsConstructor;
import org.da0hn.poc.application.resources.IProductController;
import org.da0hn.poc.application.resources.responses.ProductDetail;
import org.da0hn.poc.application.resources.responses.ProductSimpleView;
import org.da0hn.poc.application.resources.responses.Response;
import org.da0hn.poc.application.services.IProductService;
import org.da0hn.poc.core.domain.Identity;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class ProductController implements IProductController {

  private final IProductService service;

  @Override public Response<ProductSimpleView> getProductAsSimpleView(final String idProduct) {
    final var productSimpleView = this.service.getProductAsSimpleView(new Identity(idProduct));
    return Response.success(productSimpleView);
  }

  @Override public Response<ProductDetail> getProductAsDetail(final String idProduct) {
    final var productDetail = this.service.getProductAsDetail(new Identity(idProduct));
    return Response.success(productDetail);
  }


}
