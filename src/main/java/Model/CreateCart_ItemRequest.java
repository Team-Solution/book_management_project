package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateCart_ItemRequest {
	
private Integer Item_id;

private Integer cart_id;

private Integer Product_id;

private Integer Quantity;

private Float Price;
}
