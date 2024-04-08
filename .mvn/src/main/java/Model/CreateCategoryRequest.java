package Model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCategoryRequest {

	@NotNull(message = "danh muc trong")
	@NotEmpty(message = "danh muc trong")
	@Size(min=5, max=50, message="Độ dài danh mục từ 5-50 ký tự")
	private String name;
}
