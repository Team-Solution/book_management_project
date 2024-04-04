package Model;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderRequest {

	@NotNull(message = "user khong dc trong")
	@NotEmpty(message = "user khong duoc trong")
	@Column(name = "User_id",nullable = false)
	private Integer User_id;
	
	@NotNull(message = "ngay khong duoc trong")
	@NotEmpty(message = "ngay khong duoc trong")
	@Column(name = "Order_date")
	private Date order_date;
	
	@NotNull(message = "gia khong duoc rong")
	@NotEmpty(message = "gia khong duoc rong")
	@Column(name = "Total_amount",nullable = false)
	private Double Total_amount;
	
	@NotNull(message = "trang thai khong rong")
	@NotEmpty(message = "trang thai khong rong")
	@Column(name = "status_id")
	private Integer status_id;
	
	@NotNull(message = "dia chi khong duoc rong")
	@NotEmpty(message = "dia chi khong duoc rong")
	@Column(name = "shipping_address", nullable = false)
	private String shipping_addres;
	
	@NotNull(message = "hinh thuc thanh toan khong trong")
	@NotEmpty(message = " hinh thuc thanh toan khong trong")
	@Column(name = "payment_method",nullable = false)
	private String Payment_method;
	
	@NotNull(message = "ngay khong duoc trong")
	@NotEmpty(message = "ngay khong duoc trong")
	@Column(name = "createDate",nullable = false)
	private Date CreateDate;
}
