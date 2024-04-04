package Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Supplier")
public class Supplier {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer supplier_id;
String name;
String address;
String email;


}
