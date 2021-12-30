package org.da0hn.poc.data.db;

import org.da0hn.poc.core.domain.Identity;
import org.da0hn.poc.core.domain.Product;

public interface IProductRepository {

  Product get(Identity id);

}
