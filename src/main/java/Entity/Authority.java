package Entity;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Authorities")
public class Authority {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer author_id;
String Username;
String Password;
Integer Role_id;

@OneToMany
@JoinColumn(name = "Role_id")
private List<Account> accounts;

@ManyToMany
@JoinTable(
    name = "authority_account",
    joinColumns = @JoinColumn(name = "author_id"),
    inverseJoinColumns = @JoinColumn(name = "account_id")
)
private List<Account> accounts1;

}
