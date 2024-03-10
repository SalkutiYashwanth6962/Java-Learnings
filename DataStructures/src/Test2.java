import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		List<Employees> al=new ArrayList<>();
		al.add(new Employees(105,"yash",60000));
	    al.add(new Employees(108,"yashwanth",30000));
		al.add(new Employees(104,"yashwanth reddy",20000));
		Employees e3=minSal(al);
		System.out.println("The First minimum salary person:");
		System.out.println(e3);
		Employees e4=secMinSal(al);
		System.out.println("The Second minimum salary person:");
		System.out.println(e3);
	}
  public static Employees minSal(List<Employees> al) {
	  Employees e=al.get(0);
	  double minSal=e.getSal();
	  for(int i=0;i<al.size();i++) {
		  Employees e1=al.get(i);
		  double empSal=e1.getSal();
		  if(empSal<minSal) {
			  e=e1;
		  }
	  }
	  
	  return e ;
  }
  public static Employees secMinSal(List<Employees> al) {
	  Employees e2=null;
	  Employees e=al.get(0);
	  double minSal=e.getSal();
	  double secminSal=e.getSal();
	  for(int i=0;i<al.size();i++) {
		  Employees e1=al.get(i);
		  double empSal=e1.getSal();
		  if(empSal<minSal) {
			  secminSal=minSal;
			  minSal=empSal;
			  e2=e1;
			  e1=e;
		  }else if(empSal<secminSal||minSal==secminSal) {
			  if(empSal!=minSal) {
				  secminSal=minSal;
				  e2=e;
				  
			  }
		  }
		  
	  }
	  
	  return e2 ;
  }
 
}














