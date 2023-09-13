package onetoonemapping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class StudentEntity {
@Id
@GeneratedValue(strategy=GenerationType.AUTO )
private  int sid;
private String sname;
private String sdept;

@OneToOne
@JoinColumn(name="tname")
public Trainer trainer;


public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public String getSdept() {
	return sdept;
}

public void setSdept(String sdept) {
	this.sdept = sdept;
}

public Trainer getTrainer() {
	return trainer;
}

public void setTrainer(Trainer trainer) {
	this.trainer = trainer;
}

public StudentEntity(int sid, String sname, String sdept, Trainer trainer) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.sdept = sdept;
	this.trainer = trainer;
}

public StudentEntity() {
	super();
	// TODO Auto-generated constructor stub
}


}



