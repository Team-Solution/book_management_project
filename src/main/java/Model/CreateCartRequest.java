package Model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCartRequest {

	 private Integer Cart_id;
	 
	 private Integer User_id;
	 
	 private Date Create_date;
}
