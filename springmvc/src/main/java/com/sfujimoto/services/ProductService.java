package com.sfujimoto.services;
/* sfujimoto: 2017/03/21 11:05 */

import com.sfujimoto.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveOrUpdateProduct(Product product);

    void deleteProduct(Integer id);
}
