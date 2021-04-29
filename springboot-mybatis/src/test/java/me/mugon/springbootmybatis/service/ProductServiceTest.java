package me.mugon.springbootmybatis.service;

import me.mugon.springbootmybatis.model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ProductServiceTest {

    @Autowired
    ProductService productService;

    @BeforeEach
    void setUp() {
        Product product1 = new Product("베베숲 물티슈", 2700);
        Product product2 = new Product("여름 토퍼", 25000);
        Product product3 = new Product("페이크 삭스", 1000);
        Product product4 = new Product("우산", 13000);

        productService.insertProduct(product1);
        productService.insertProduct(product2);
        productService.insertProduct(product3);
        productService.insertProduct(product4);
    }

    @Test
    void ID로_PRODUCT_찾기() {
        Product findProduct = productService.getProductById(1L);
        assertNotNull(findProduct);
        assertEquals(findProduct.getProdName(), "베베숲 물티슈");
    }

    @Test
    void 전체_PRODUCT_찾기() {
        List<Product> allProducts = productService.getAllProducts();
        assertEquals(allProducts.size(), 4);
    }

    @Test
    void insertProduct() {
        Product newProduct = new Product("시계", 4000);
        productService.insertProduct(newProduct);

        List<Product> allProducts = productService.getAllProducts();
        assertEquals(allProducts.size(), 5);
    } 
}