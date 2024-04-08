package Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "Orders")
public class Order {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer Order_id;
Integer User_id;
Date Order_date;
Double Total_amount;
Integer status_id;
String shipping_addres;
String Payment_method;
@DateTimeFormat(pattern = "MM/dd/yyyy")
@Temporal(TemporalType.DATE)
@Column(name = "Createdate")
Date creatDate = new Date();
@ManyToOne
@JoinColumn(name = "User_id")
List<OrderDetail> orderDetails;

@ManyToOne
@JoinColumn(name = "status_id", referencedColumnName = "Status_id")
private List<Order_status> status;
}
