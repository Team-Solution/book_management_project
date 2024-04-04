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
@Table(name = "Cart_Item")
public class Cart_Item {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer Item_id;
Integer Cart_id;
Integer Product_id;
Integer Quantity;
Double Price;

@ManyToOne
@JoinColumn(name = "Cart_id", referencedColumnName = "Cart_id")//// referencedColumnName: chỉ định tên của cột chính trong bảng Cart mà cột Cart_id sẽ tham chiếu đến.
private List<Cart> carts;

@ManyToOne
@JoinColumn(name = "Product_id", referencedColumnName = "Product_id")
private List<Product> products;	
}
