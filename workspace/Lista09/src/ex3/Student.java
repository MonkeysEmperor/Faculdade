package ex3;

public class Student {
	private String name;
	private int rollNo;

	Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public boolean equals(Object o){
		if (o != null && o instanceof Student){
			if (((Student)o).getName().equals(this.name) && ((Student)o).getRollNo() == this.getRollNo())
				return true;
		}
		return false;
	}
}