package org.da0hn.poc.application.services;

import org.da0hn.poc.application.resources.responses.ProductSimpleView;
import org.da0hn.poc.core.domain.Identity;

public interface IProductService {

  ProductSimpleView getProductAsSimpleView(Identity id);

}
