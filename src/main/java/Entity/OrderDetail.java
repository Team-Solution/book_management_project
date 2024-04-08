package Entity;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "OrderDetail")
public class OrderDetail {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer Detail_id;
Integer Order_id;
Integer Product_id;
Integer Quantity;
Double Price;
Double Total_amount;

@ManyToOne
@JoinColumn(name = "Order_id", referencedColumnName = "Order_id")
private List<Order> orders;

@ManyToOne
@JoinColumn(name = "Product_id", referencedColumnName = "Product_id")
private List<Product> products;
}
