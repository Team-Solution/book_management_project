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
public class CreateSupplierRequest {

@NotNull(message = " nha cung cap khong duoc trong")
@NotEmpty(message = "nha cung cap khong duoc trong ")
@Column(name = "ten nha cung cap", nullable = false)
private String name;

@NotNull(message = "dia chi khong duoc trong")
@NotEmpty(message = "dia chi khong duoc trong")
@Column(name = "dia chi nha cung cap", nullable = false)
private String address;

@NotNull(message = "email khong duoc trong")
@NotEmpty(message = "email khong duoc trong")
@Column(name = "email nha cung cap",nullable = false)
private String email;


}
