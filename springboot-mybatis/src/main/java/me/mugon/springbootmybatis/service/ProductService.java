package me.mugon.springbootmybatis.service;

import lombok.RequiredArgsConstructor;
import me.mugon.springbootmybatis.model.Product;
import me.mugon.springbootmybatis.repository.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductMapper productMapper;

    public Product getProductById(Long id) {
        return productMapper.selectProductById(id);
    }

    public List<Product> getAllProducts() {
        return productMapper.selectAllProducts();
    }

    public void insertProduct(Product product) {
        productMapper.insertProduct(product);
    }
}
