package com.mustafa.july15CustomException;

import java.util.Objects;

class Student{
	private int id;
	private String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
}

public class EqualsMethod {

	public static void main(String[] args) {
		Student s1=new Student(111, "harry");
		Employe e1=new Employe(111, "harry");
		System.out.println(s1.equals(e1));
		System.out.println("--------------");
		Student s2=new Student(111, "harry");
		System.out.println(s2.equals(s1));
		

	}

}
class Employe{
	private int empid;
	private String empname;
	public Employe(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	
}
