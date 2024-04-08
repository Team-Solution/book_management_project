package Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {
@NotNull(message = "ten san pham dang trong")
@NotEmpty(message = "ten san pham dang trong")
@Schema(description = "ten san pham",example = "product1",required = true)
@Size(min = 5, max = 50, message = "ten san pham tu 3-50 ky tu")
private String name;

@NotNull(message = "mo ta khong duoc rong")
@NotEmpty(message = "mo ta khong duoc rong")
@Size(min = 10, max=1000, message = "mo ta tu 10-1000 ky tu")
@Column(name = "description", columnDefinition = "TEXT")
private String description;

@NotNull(message = "Gia sach khong duoc trong")
@Column(name = "price", nullable = false)
private double price;

/*
 * @ManyToOne(fetch = "FetchType.LAZY")
 * 
 * @JoinColumn(name = "category_id", nullable = false) private Categories
 * categories;
 */
@NotNull(message = "tac gia khong duoc trong")
@NotEmpty(message = "tac gia khong duoc trong")
@JoinColumn(name = "author", nullable = false)
private String auString;

@NotNull(message = "the loai khong duoc trong")
@NotEmpty(message = "the loai khong duoc trong")
@JoinColumn(name = "Type", nullable = false)
private String typeString;

@NotNull(message = "nha cung cap khong duco rong")
@NotEmpty(message = "nha cung cap khong duoc rong")
@JoinColumn(name = "Supplier_id", nullable = false)
private Integer supplier_id;

@NotNull(message = "nha xuat ban khong duoc trong")
@NotEmpty(message = " nha xuat ban khong duoc trong")
@JoinColumn(name = "Publisher", nullable = false)
 private String publisher;

@JoinColumn(name = "Publication_date", nullable = false)
private Date publication_date;

@JoinColumn(name = "Categories_id", nullable = false )
private Integer categories_id;
}

