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
public class CreateRoleRequest {

	@NotNull(message = "ten khong duoc trong")
	@NotEmpty(message = " ten khong duoc trong")
	@Column(name = "Name")
	private String name;
}
