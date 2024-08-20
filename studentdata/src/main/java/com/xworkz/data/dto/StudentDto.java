package com.xworkz.data.dto;

public class StudentDto {
	
	private String sname;
	private String qualification;
	private String stream;
	private String phNo;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	@Override
	public String toString() {
		return "StudentDto [sname=" + sname + ", qualification=" + qualification + ", stream=" + stream + ", phNo="
				+ phNo + "]";
	}
	


}
