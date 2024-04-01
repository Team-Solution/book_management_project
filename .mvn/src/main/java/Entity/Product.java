package Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "Products")
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer product_id;
String name;
String author;
Integer Supplier_id;
String Publisher;
@Temporal(TemporalType.DATE)
@Column(name ="Publication date")
Date PublicationDate = new Date();
Double Price;
String image;
String Type;
Integer categories_id;

@ManyToOne
@JoinColumn(name = "Categories_id")
List<OrderDetail> orderDetails;
}
