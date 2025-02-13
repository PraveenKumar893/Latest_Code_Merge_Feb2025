package com.Algorithms.Algoriths;

public class sStudentsVo {
	
	private int stdId;
	private String name;
	private String department;
	private String grade;
	private int rank;
	
	public sStudentsVo(int stdId, String name, String department, String grade, int rank) {
		this.stdId = stdId;
		this.name = name;
		this.department = department;
		this.grade = grade;
		this.rank = rank;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	@Override
	public String toString() {
		return "sStudentsVo [stdId=" + stdId + ", name=" + name + ", department=" + department + ", grade=" + grade
				+ ", rank=" + rank + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}


}
