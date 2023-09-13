package onetoonemapping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO )
	private int tid;
	private String tname;
	private String tdept;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTdept() {
		return tdept;
	}
	public void setTdept(String tdept) {
		this.tdept = tdept;
	}
	
	@Override
	public String toString() {
		return "Trainer [tid=" + tid + ", tname=" + tname + ", tdept=" + tdept + "]";
	}
	public Trainer(int tid, String tname, String tdept) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tdept = tdept;
	}
	public Trainer() {
		super();
	
	}	
}
