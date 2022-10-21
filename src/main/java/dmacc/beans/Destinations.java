package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author alexismeis - aameis
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */

@Entity
public class Destinations {
	@Id
	@GeneratedValue
	private long id;
	private String country;
	private String state;
	private String city;
	@Autowired
	private Traveler traveler;
	
	public Destinations() {
		super();
		this.city = "Des Moines";
	}
	
	public Destinations(String country) {
		super();
		this.country = country;
	}
	
	public Destinations(String country, String state, String city) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
	}
	
	public Destinations(int id, String country, String state, String city) {
		super();
		this.id = id;
		this.country = country;
		this.state = state;
		this.city = city;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Traveler getTraveler() {
		return traveler;
	}

	public void setTraveler(Traveler traveler) {
		this.traveler = traveler;
	}

	@Override
	public String toString() {
		return "Destinations [id=" + id + ", country=" + country + ", state=" + state + ", city=" + city + ", traveler="
				+ traveler + "]";
	}
	

}
