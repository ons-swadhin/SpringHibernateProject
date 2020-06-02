package com.cg.model.student.test;

import java.util.List;

public class StudentImpl implements Student {

	private String name;
	private String rollNum;
	private List<String> colors;

	public StudentImpl() {
		super();
		
	}

	public StudentImpl(String name, String rollNum,List<String> colors) {
		super();
		this.name = name;
		this.rollNum = rollNum;
		this.colors = colors;
	}

	

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public String getRollNum() {

		return rollNum;
	}

	@Override
	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;

	}

	@Override
	public List<String> getColors() {

		return colors;
	}

	@Override
	public void setColors(List<String> colors) {
		this.colors = colors;

	}

	@Override
	public String getRank() {

		return "A";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((rollNum == null) ? 0 : rollNum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentImpl other = (StudentImpl) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNum == null) {
			if (other.rollNum != null)
				return false;
		} else if (!rollNum.equals(other.rollNum))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nStudent [name=" + name + ", rollNum=" + rollNum + ", colors=" + colors + "]";
	}
}
