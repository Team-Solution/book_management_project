package Model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePaymentRequest {

	private Integer Payment_id;
	
	private Integer Order_id;
	
	private Float Amount;
	
	private Date Payment_Date;
	
	private String Payment_method;
	
	private Float Total_amount;
}
