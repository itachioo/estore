package dao;

import entity.Product;

import java.util.List;

public interface ProductDao {
    void add(Product product);
    Product find(String id);
    public List<Product> getPageData(int startindex, int pagesize);

}
