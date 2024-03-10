import java.util.Arrays;
import java.util.Comparator;

/*
 Comparator Interface
 -it is an functional interface which is present in java.util package
 -it contains an abstract method ,compare method which will accept two arguments as parameter
 -compare method should be overriden in any class except same class. the comparison will ha
 happen in between given two objects.
 -If it will return positive value if the first object is greater tha the second object 
 -It will return negative value if first object is smaller than secind object
 -it will return 0 if both the objects are equal
 -by using comparator interface we can provide  multiple implementations
 
 */
public class Demo5Comparator {
   public static void main(String[] args) {
	Student1[] s= {
			new Student1(101,"shyam",100),
			new Student1(105,"ram",120),
			new Student1(103,"amith",80)
	};
	Arrays.sort(s,new ComStuId());
	//Arrays.sort(s,new ComStuName());
	System.out.println(Arrays.toString(s));
}
}
class Student1{
	int stuId;
	String stuname;
	double marks;
	public Student1(int stuId, String stuname, double marks) {
		super();
		this.stuId = stuId;
		this.stuname = stuname;
		this.marks = marks;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student1 [stuId=" + stuId + ", stuname=" + stuname + ", marks=" + marks + "]";
	}
    
}

//class ComStuId implements Comparator{
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		Student1 s1=(Student1)o1;
//		Student1 s2=(Student1)o2;
//		return s1.stuId-s2.stuId;
//	}
//	
//}
//when we specify specific type we dont need to do downcasting
class ComStuId implements Comparator<Student1>{

	@Override
	public int compare(Student1 s1,Student1 s2) {
		// TODO Auto-generated method stub
		return s1.stuId-s2.stuId;
	}
	
}
class ComStuName implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student1 s1=(Student1)o1;
		Student1 s2=(Student1)o2;
		return s1.stuname.compareTo(s2.stuname);
	}
	
}
