package com.mindgate.pojo;

import java.util.List;

public class ArrayListDemo {
	private int arrayListId;
	private List<String> nameList;

	public ArrayListDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayListDemo(int arrayListId, List<String> nameList) {
		super();
		this.arrayListId = arrayListId;
		this.nameList = nameList;
	}

	public int getArrayListId() {
		return arrayListId;
	}

	public void setArrayListId(int arrayListId) {
		this.arrayListId = arrayListId;
	}

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	@Override
	public String toString() {
		return "ArrayListDemo [arrayListId=" + arrayListId + ", nameList=" + nameList + "]";
	}

}
