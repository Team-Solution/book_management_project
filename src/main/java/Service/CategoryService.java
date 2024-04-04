package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Entity.Categories;
import Model.CreateCategoryRequest;

@Service
public interface CategoryService {
List<Categories> findAll();
List<Categories> getListEnabledCategories();
Categories createCategory(CreateCategoryRequest request);
Categories updateCategory(Integer id,CreateCategoryRequest request);

void enableCategory(Integer id);

void deleteCategory(Integer id);
}
	