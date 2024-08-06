package ra.ecommnerce.service.imp;

import ra.ecommnerce.entity.Categories;
import ra.ecommnerce.repository.CategoriesRepository;
import ra.ecommnerce.repository.imp.CategoriesRepositoryImp;
import ra.ecommnerce.service.CategoriesService;

import java.util.List;

public class CategoriesServiceImp implements CategoriesService {
    private final CategoriesRepository categoriesRepository;

    public CategoriesServiceImp() {
        categoriesRepository = new CategoriesRepositoryImp();
    }

    @Override
    public List<Categories> findAll() {
        return categoriesRepository.findAll();
    }
}
