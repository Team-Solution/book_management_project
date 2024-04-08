package Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.Categories;
import Model.CreateCategoryRequest;
import Model.MessageResponse;
import Service.CategoryService;

@CrossOrigin("*")
@RestController
@Controller
@RequestMapping("/api/v1/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	@GetMapping("api/categories")///lay danh sach danh muc
	public ResponseEntity<?> getListCategory(){
        List<Categories> categories = categoryService.findAll();
        return ResponseEntity.ok(categories);
	}
	
	@GetMapping("/enabled")
	  public ResponseEntity<List<Categories>> getListEnabled(){
        List<Categories> categories = categoryService.getListEnabledCategories();
        return ResponseEntity.ok(categories);
	}
	
	@PostMapping("/api/categories/create")
	public ResponseEntity<?> createCategory(@Valid @RequestBody CreateCategoryRequest request){
        Categories category = categoryService.createCategory(request);

        return ResponseEntity.ok(category);
	}
	@PutMapping("/api/categories/update/{id}")
	public ResponseEntity<?> updateCategory(@PathVariable Integer id, @Valid @RequestBody CreateCategoryRequest request){
        Categories category = categoryService.updateCategory(id, request);
        return ResponseEntity.ok(category);
}
	@PutMapping("/api/categories/enable/{id}")
	 public ResponseEntity<?> enabled(@PathVariable Integer id){
        categoryService.enableCategory(id);
        return ResponseEntity.ok(new MessageResponse("Cập nhật thành công"));
}
	@DeleteMapping("/api/categories/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id){
        categoryService.deleteCategory(id);
        return ResponseEntity.ok(new MessageResponse("Xóa thành công"));
}
}