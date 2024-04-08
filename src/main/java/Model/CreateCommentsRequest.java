package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateCommentsRequest {

	private Integer Comments_id;
	
	private Integer user_id;
	
	private Integer Product_id;
	
	private String Content;
}
