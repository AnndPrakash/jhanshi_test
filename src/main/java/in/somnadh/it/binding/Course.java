package in.somnadh.it.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data    //can use getter and setter
@Entity  // spring boot creates a table automatically
@AllArgsConstructor  // Automatically generates constructor with one parameter for each field in a class
@NoArgsConstructor
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer cid;
	private String cname;
	private Double price;
	
	// getter and setter methods
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	//to string() method 
	
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", price=" + price + "]";
	}
	
}