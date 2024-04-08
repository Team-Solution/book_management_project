package Entity;

import java.sql.Date;
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
@Table(name = "Payment")
public class Payment {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer Payment_id;
Integer Order_id;
Double Amount;
Date Payment_date;
Integer Status;

@ManyToOne
@JoinColumn(name = "Order_id", referencedColumnName = "Order")
private List<Order> orders;
}
