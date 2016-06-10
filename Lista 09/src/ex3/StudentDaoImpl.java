package ex3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;


public class StudentDaoImpl implements StudentDao {
	
	// list is working as a temporary database, since the external file is permanent
	String fileName;
	List<Student> allStudents;
	public StudentDaoImpl() {
		fileName = "students.csv";
		read();
	}
	public StudentDaoImpl(String inputFile) {
		fileName = inputFile;
		read();
	}

	@Override
	public void deleteStudent(Student student) {
		allStudents.remove(student);
		saveChanges();//Just write (i.e. apply any changes made in the list to the file)
		System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
	}

	// retrieve list of students from the database
	@Override
	public List<Student> getAllStudents() {
		return allStudents;
	}

	@Override
	public Student getStudent(int rollNo) {
		return allStudents.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		allStudents.get(student.getRollNo()).setName(student.getName());
		saveChanges();
		System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	}
	
	
	public void saveChanges() {
		PrintWriter writer;
		try {
			writer = new PrintWriter(fileName, "UTF-8");
			writer.println("sep=,");//So Excel can interpret the file correctly

		} catch (FileNotFoundException e) {
			System.out
					.println("File not found for editing or could not be created");
			return;
		} catch (UnsupportedEncodingException e) {
			System.out.println("Encoding not supported");
			return;
		} 
		if (allStudents != null){
			for (int j = 0; j < allStudents.size(); j++) {
				writer.print(allStudents.get(j).getName());
				writer.print(',');
				writer.println(allStudents.get(j).getRollNo());
			}
		}
		writer.close();
		
	}
	public void read() {

		allStudents = new LinkedList<Student>();
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(fileName));

		} catch (FileNotFoundException e) {
			System.out.println("File not found or could not be opened");
			return;
		}

		try {
			String s;
			do {
				s = br.readLine();
				if (s != null && !s.isEmpty() && !s.equals("sep=,"))
					allStudents.add(identifyStudent(s));

			} while (s != null && !s.isEmpty());
			
		} catch (IOException e) {
			System.out.println("IO error");
			return;

		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("File could not be closed");
				return;
			}
		}
	}
	
	void read(String file) {

		allStudents = new LinkedList<Student>();
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));

		} catch (FileNotFoundException e) {
			System.out.println("File not found or could not be opened");
			return;
		}

		try {
			String s;
			do {
				s = br.readLine();
				if (s != null && !s.isEmpty() && !s.equals("sep=,"))
					allStudents.add(identifyStudent(s));

			} while (s != null && !s.isEmpty());
			
		} catch (IOException e) {
			System.out.println("IO error");
			return;

		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("File could not be closed");
				return;
			}
		}
	}
	
	public Student identifyStudent (String s){
		String name;
		try {
			name = s.substring(0, s.indexOf(','));
		}catch (ArrayIndexOutOfBoundsException e){
			System.err.println("This line doesn't contain a Student: " + s);
			return null;
		}
		int number = Integer.parseInt(s.substring(s.indexOf(',') + 1, s.length()));
		return new Student (name, number);
	}
}