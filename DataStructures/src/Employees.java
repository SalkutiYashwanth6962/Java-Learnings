
public class Employees {
 int empid;
 String empname;
 double sal;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Employees [empid=" + empid + ", empname=" + empname + ", sal=" + sal + "]";
}
public Employees(int empid, String empname, double sal) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.sal = sal;
}
//@Override
//public int compareTo(Mobile m) {
//	return this.emp 
//}
 
}
