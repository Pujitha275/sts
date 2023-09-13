package withdb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name ="Employee.findByename", query ="select e from Employee e where e.ename=:ename")
@NamedQuery(name ="Employee.findByid", query ="select e from Employee e where e.id=:id")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private int id;
 private String ename;
 private int esalary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEsalary() {
	return esalary;
}
public void setEsalary(int esalary) {
	this.esalary = esalary;
}
public Employee(int id, String ename, int esalary) {
	super();
	this.id = id;
	this.ename = ename;
	this.esalary = esalary;
}
public Employee() {
	super();
}
 
 
}
