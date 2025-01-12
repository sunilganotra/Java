package com.demo;

import java.util.Comparator;
import com.com.bean.Student;

public class NameComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		//calling comparable implementation of String class
		return o1.getName().compareTo(o2.getName());
	}
}