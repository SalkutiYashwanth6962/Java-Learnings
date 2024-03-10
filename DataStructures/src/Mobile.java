
public class Mobile implements Comparable<Mobile> {
  private String brand;
  private double price;

public Mobile(String brand, double price) {
	super();
	this.brand = brand;
	this.price = price;
}
public String getBrand() {
	return brand;
	
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Mobile [brand=" + brand + ", price=" + price + "]";
}
   @Override
   public int compareTo(Mobile m) {
	   return (int)(this.price-m.price);
   }
}

//asdf ;lkj asdf ;lkj asdf ;lkj asdf ;lkkj asdf ;lkj asdf ;lkj asdf ;lkj asdf ;lkj asdf ;lkj asdf ;lkj asdf ';lkj asdfg ;












