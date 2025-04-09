package day06.it.ac.list;

import java.util.Comparator;

public class StudentCompare implements Comparator<Student2>{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		// TODO Auto-generated method stub
		return o1.getScore() <= o2.getScore() ? 1 : -1;
	}

}
