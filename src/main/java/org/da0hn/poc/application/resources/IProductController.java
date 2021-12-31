package org.da0hn.poc.application.resources;

import org.da0hn.poc.application.resources.responses.ProductDetail;
import org.da0hn.poc.application.resources.responses.ProductSimpleView;
import org.da0hn.poc.application.resources.responses.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/products")
public interface IProductController {


  @GetMapping("/simple-view/{idProduct}")
  Response<ProductSimpleView> getProductAsSimpleView(@PathVariable String idProduct);

  @GetMapping("/detail/{idProduct}")
  Response<ProductDetail> getProductAsDetail(@PathVariable String idProduct);

}
