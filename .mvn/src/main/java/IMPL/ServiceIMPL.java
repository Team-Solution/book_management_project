package IMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import Entity.Categories;
import Exception.NotFound;
import Model.CreateCategoryRequest;
import Repository.CategoryREPO;
import Service.CategoryService;
@Service
public class ServiceIMPL implements CategoryService{
@Autowired
private CategoryREPO categoryREPOs;

	@Override
	public List<Categories> findAll() {
		List<Categories> list = categoryREPOs.findAll(Sort.by("id").descending());
		return list;
	}

	@Override
	public List<Categories> getListEnabledCategories() {
		// TODO Auto-generated method stub
		List<Categories> list = categoryREPOs.findALLByEnabled();
		return list;
	}

	@Override
	public Categories createCategory(CreateCategoryRequest request) {
		// TODO Auto-generated method stub
		Categories category = new Categories();
        category.setName(request.getName());
        category.setEnable(false);
        categoryREPOs.save(category);
        return category;
	}

	@Override
	public Categories updateCategory(Integer id, CreateCategoryRequest request) {
		// TODO Auto-generated method stub
		Categories category = categoryREPOs.findById(id).orElseThrow(() -> new NotFound("Not Found Category With Id: " + id));
        category.setName(request.getName());
        categoryREPOs.save(category);
        return category;		
	}

	@Override
	public void enableCategory(Integer id) {
		// TODO Auto-generated method stub
		 Categories category = categoryREPOs.findById(id).orElseThrow(() -> new NotFound("Not Found Category With Id: " + id));
	        if(category.isEnable()){
	            category.setEnable(false);
	        } else{
	            category.setEnable(true);
	        }
	        categoryREPOs.save(category);
		
	}
	@Override
	public void deleteCategory(Integer id) {
		// TODO Auto-generated method stub
		 Categories category = categoryREPOs.findById(id).orElseThrow(() -> new NotFound("Not Found Category With Id: " + id));
	        categoryREPOs.delete(category);
		
	}

}
