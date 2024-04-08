package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderDeatilRequest {

	 private Integer Detail_id;
	 
	 private Integer Order_id;
	 
	 private Integer Product_id;
	 
	 private Integer Quantity;
	 
	 private Float Price;
	 
	 private Float Total_amount;
	 
}
