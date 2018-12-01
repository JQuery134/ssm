package ssmDemo.bean;

public class Student {
	
	private int sid;
	private String sname;
	private int sgid;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, int sgid) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sgid = sgid;
	}
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
	public int getSgid() {
		return sgid;
	}
	public void setSgid(int sgid) {
		this.sgid = sgid;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sgid=" + sgid
				+ "]";
	}
	

}
