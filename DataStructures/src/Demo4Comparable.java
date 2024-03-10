import java.util.Arrays;

public class Demo4Comparable {
	//Comparable interface
	/*
	 -It is an functional interface present in java.lang  package
	 -It contains abstract method public int compareTo(Object O);
	 -It is a parameterized method'
	 -It will return positive value if first object is bigger than second object
	 -It will return the negative value if first object is smaller than second object 
	 -It will return  when both objects are equal or same
	 -compareTo() of comparable interface should be overridden in same class at which properities 
	 has to be compared
	 -we can provide only one comparison implementation by using compreTo() of comparable interface
 	 */
	
   public static void main(String[] args) {
	Student[] s= {
			new Student(101,"shyam",100),
			new Student(105,"ram",120),
			new Student(103,"amith",80)
			
			
	};
	Arrays.sort(s);
	System.out.println(Arrays.toString(s));
}
}
class Student implements Comparable{
	int studentid;
	String stuname;
	double marks;

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", stuname=" + stuname + ", marks=" + marks + "]";
	}

	public Student(int studentid, String stuname, double marks) {
		super();
		this.studentid = studentid;
		this.stuname = stuname;
		this.marks = marks;
	}
//based on the names
	//In string class compareTo method is already overrided
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student s=(Student)o;
		
		return this.stuname.compareTo(s.stuname);
	}

//	@Override
	//based on marks comparison 
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		Student s=(Student)o;
//		return -((int)this.marks-(int)s.marks);
//	}

//	@Override
	//comparison based on the student id
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		Student s=(Student)o;
////		if(this.studentid>s.studentid) return 1;
////		if(this.studentid<s.studentid) return -1;
////		return 0;
//		return this.studentid-s.studentid;
//	}
	
	
	
}
