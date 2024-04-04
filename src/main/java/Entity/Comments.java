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
@Table(name = "Comments")
public class Comments {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer Comments_id;
Integer user_id;
Integer Product_id;
String Content;

@ManyToOne
@JoinColumn(name = "Product_id", referencedColumnName = "Product_id")
private List<Product> products;
}
