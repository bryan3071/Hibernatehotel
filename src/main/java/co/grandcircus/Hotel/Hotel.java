package co.grandcircus.Hotel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="hotel_listing")

public class Hotel {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="hotel_id") // name of SQL column
	
	private Long id;
	private String name;
	private String city;
	private int pricepernight;
	public Hotel(Long id, String name, String city, int pricepernight) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.pricepernight = pricepernight;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPricepernight() {
		return pricepernight;
	}
	public void setPricepernight(int pricepernight) {
		this.pricepernight = pricepernight;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", city=" + city + ", pricepernight=" + pricepernight + "]";
	}
	
	
	
}
