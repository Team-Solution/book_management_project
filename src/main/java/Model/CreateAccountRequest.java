package Model;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAccountRequest {
	@NotNull(message = "ten khong duoc de trong")
	@NotEmpty(message = "ten khong duoc de trong")
	@Column(name = "name", nullable = false)
	private String name;
	
	@NotNull(message = "mat khau khong trong")
	@NotEmpty(message = "mat khau khong duoc trong")
	@Column(name = "password",nullable = false)
	private String password;
	
	

}
