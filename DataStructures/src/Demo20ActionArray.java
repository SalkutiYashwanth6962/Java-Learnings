import java.util.Arrays;
import java.util.List;

public class Demo20ActionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Integer[] arr= {1,2,3,4,5};
     Integer[] res=new Integer[arr.length];
     int k=0;
     for(int i=0;i<arr.length;i++) {
    	 res[k++]=arr[i];
     }
     
     new ActionArray().forEach(res,(n)->System.out.println(n));
     
     List<Integer> list=Arrays.asList(arr);
     list.forEach((n)->System.out.println(n));
     System.out.println("**************");
     
     //list.stream().map((n)->n+n)).forEach((n)
     
     ActionArray<Integer> actionArray = new ActionArray<Integer>();
     
     actionArray.forEach(arr, (n)->System.out.println(n));
     
     Employee10[] emp= {
    		 new Employee10("Adhi",104),
    		 new Employee10("yashwanth",103)
     };
     
     ActionArray<Employee10> actionarray=new ActionArray<Employee10>();
     actionarray.forEach(emp, (n)->System.out.println(n));
     
	}

}

class Employee10{
	private String name;
	private int empid;
	@Override
	public String toString() {
		return "Employee10 [name=" + name + ", empid=" + empid + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public Employee10(String name, int empid) {
		super();
		this.name = name;
		this.empid = empid;
	}
	
}