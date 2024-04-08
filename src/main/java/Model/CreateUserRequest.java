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
public class CreateUserRequest {

	@NotNull(message = "username khong duoc trong")
	@NotEmpty(message = "username khong dc trong")
	@Column(name = "username", nullable = false)
	private String username;
	
	@NotNull(message = "emsil khong duoc trong")
	@NotEmpty(message =  "email khong duco trong")
	@Column(name = "email",nullable = false)
private String email;
	
	@NotNull(message = "ten day du khong trong")
	@NotEmpty(message = "ten day du khong trong ")
	@Column(name = "Full_name", nullable = false)
	private String Full_name;
}

