package codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class A implements Comparable<A>{
	private String name;
	private int rollNo;
	private double marks;
	
	
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A(int rollNo, String name, double marks) {
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	public void setrollNo(int rollNo){
		this.rollNo=rollNo;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setmarks(double marks) {
		this.marks=marks;
	}
	public int getrollNo() {
		return rollNo;
	}
	public String getname() {
		return name;
	}
	public double getmarks() {
		return marks;
	}
	@Override
	public int compareTo(A o) {
		// TODO Auto-generated method stub
		return this.rollNo - o.rollNo;
		
		 
	}
	@Override
	public String toString() {
		return "A [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	
}

public class SortedObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<A> student= new ArrayList<>();
		student.add(new A(1, "Aniket", 34));
		student.add(new A(2, "Anil", 24));
		Collections.sort(student);
		System.out.println(student.toString());
	}

}
