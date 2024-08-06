package ra.ecommnerce.repository;

import ra.ecommnerce.entity.Categories;

import java.util.List;

public interface CategoriesRepository {
    List<Categories> findAll();
}
