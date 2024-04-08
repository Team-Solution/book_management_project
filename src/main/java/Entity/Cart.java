package Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Cart")
public class Cart {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer Cart_id;
Integer user_id;
Date Create_date;

@ManyToMany
@JoinColumn(name = "user_id", referencedColumnName = "User_id")
private List<Users> users;
}
