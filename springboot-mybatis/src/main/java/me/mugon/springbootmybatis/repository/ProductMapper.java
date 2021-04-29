package me.mugon.springbootmybatis.repository;

import me.mugon.springbootmybatis.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface ProductMapper {
    Product selectProductById(Long id);

    List<Product> selectAllProducts();

    void insertProduct(Product product);
}
