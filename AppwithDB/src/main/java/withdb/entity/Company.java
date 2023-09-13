package withdb.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Company {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
 private int cid;
private String cname;

 @OneToOne
 @JoinColumn(name="id")
private Employee employee;

 
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}

public Company(int cid, String cname, Employee employee) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.employee = employee;
}

public Company() {
	super();
	// TODO Auto-generated constructor stub
}

 


	
}