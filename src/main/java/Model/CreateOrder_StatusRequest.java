package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrder_StatusRequest {

	private Integer Status_id;
	
	private String Name;
	
	private String Description;
	
}
