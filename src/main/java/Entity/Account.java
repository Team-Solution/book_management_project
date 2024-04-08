package Entity;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Account")
public class Account {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer account_id;
String name;
String password;
String Email;
String Full_name;
Integer User_id;
String reset_Token;

@OneToMany
@JoinColumn(name = "User_id")
private List<Users> users;
}
