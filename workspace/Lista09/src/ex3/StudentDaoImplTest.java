package ex3;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentDaoImplTest {
	StudentDaoImpl a = new StudentDaoImpl("studentsTest.csv");
	StudentDaoImpl b = new StudentDaoImpl();
	
	@After
	public void undoChanges() {
		a.read(b.fileName);
		a.saveChanges();
	}
	@Before
	public void readFile(){
		a.read();
	}
	@BeforeClass
	public static void makeTestFile(){
		StudentDaoImpl a = new StudentDaoImpl("studentsTest.csv");
		a.read("students.csv");
		a.saveChanges();
	}

	@Test
	public void testRead() {
		assertTrue(a.getAllStudents().size() == 6);
		assertTrue(a.getStudent(0).getName().equals("Michael"));
		assertTrue(a.getStudent(1).getName().equals("John"));
		assertTrue(a.getStudent(2).getName().equals("Benjamin"));
		assertTrue(a.getStudent(3).getName().equals("Daniel"));
		assertTrue(a.getStudent(4).getName().equals("Jack"));
		assertTrue(a.getStudent(5).getName().equals("Rose"));

	}

	@Test
	public void testDeleteStudent() {
		Student michael = new Student("Michael", 0);
		a.deleteStudent(michael);
		assertFalse(a.getAllStudents().contains(michael));
		a.read();
		assertFalse(a.getAllStudents().contains(michael));
	}

	@Test
	public void testGetAllStudents() {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(a.fileName));

		} catch (FileNotFoundException e) {
			System.out.println("File not found or could not be opened");
			fail();
			return;
		}

		try {
			String s;
			do {
				s = br.readLine();
				if (s != null && !s.isEmpty() && !s.equals("sep=,"))
					assertTrue(a.getAllStudents().contains(a.identifyStudent(s)));

			} while (s != null && !s.isEmpty());
			
		} catch (IOException e) {
			System.out.println("IO error");
			fail();

		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("File could not be closed");
				fail();
			}
		}
	}

	@Test
	public void testGetStudent() {
		Student s = a.getStudent(3);
		assertTrue(a.getAllStudents().get(s.getRollNo()).equals(s));
	}

	@Test
	public void testUpdateStudent() {
		Student old = new Student (a.getStudent(3).getName(), 3);
		Student newS = new Student ("Frank Underwood", 3);
		a.updateStudent(newS);
		assertFalse(a.getAllStudents().contains(old));
		a.read();
		assertFalse(a.getAllStudents().contains(old));
		assertTrue(a.getAllStudents().contains(newS));
	}

	@Test
	public void testSaveChanges() {
		a.deleteStudent(a.getStudent(3));
		a.updateStudent(new Student ("Harvey Specter", 1));
		a.read();
		assertFalse(a.getAllStudents().equals(b.getAllStudents()));
	}

	@Test
	public void testIdentifyStudent() {
		assertTrue(a.getStudent(4).equals(a.identifyStudent("Jack,4")));
		Student s = a.identifyStudent("Jessica Pearson,6");
		a.getAllStudents().add(s);
		assertTrue(a.getStudent(6).equals(s));
	}

}
