package ex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;



public class EditTxt {

	private String oldFileName;
	private List<String> fileContent;

	public EditTxt(String fileToBeEdited) {
		this.oldFileName = fileToBeEdited;
		fileContent = null;
	}
	public EditTxt() {
		this.oldFileName = null;
		fileContent = null;
	}

	public void read() {

		fileContent = new LinkedList<String>();
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(oldFileName));

		} catch (FileNotFoundException e) {
			System.out.println("File not found or could not be opened");
			return;
		}

		try {

			do {
				fileContent.add(br.readLine());
			} while (((LinkedList<String>) fileContent).getLast() != null);
			
			((LinkedList<String>) fileContent).removeLast();
			
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

	public void write(String newFileName, LinkedList<String> stringLines) {
		PrintWriter writer;
		try {
			writer = new PrintWriter(newFileName, "UTF-8");

		} catch (FileNotFoundException e) {
			System.out
					.println("File not found for editing or could not be created");
			return;
		} catch (UnsupportedEncodingException e) {
			System.out.println("Encoding not supported");
			return;
		} 
		
		
		for (int j = 0; j < stringLines.size(); j++) {
			writer.println(stringLines.get(j));
		}
		writer.close();
	}
	
	public void write(String newFileName, String string) {
		PrintWriter writer;
		try {
			writer = new PrintWriter(newFileName, "UTF-8");

		} catch (FileNotFoundException e) {
			System.out
					.println("File not found for editing or could not be created");
			return;
		} catch (UnsupportedEncodingException e) {
			System.out.println("Encoding not supported");
			return;
		} 
		
		writer.println(string);
		writer.close();
	}
	
	public void write(LinkedList<String> stringLines) {
		PrintWriter writer;
		try {
			writer = new PrintWriter(oldFileName, "UTF-8");

		} catch (FileNotFoundException e) {
			System.out
					.println("File not found for editing or could not be created");
			return;
		} catch (UnsupportedEncodingException e) {
			System.out.println("Encoding not supported");
			return;
		} 
		
		
		for (int j = 0; j < stringLines.size(); j++) {
			writer.println(stringLines.get(j));
		}
		writer.close();
	}
	
	public void write(String string) {
		PrintWriter writer;
		try {
			writer = new PrintWriter(oldFileName, "UTF-8");

		} catch (FileNotFoundException e) {
			System.out
					.println("File not found for editing or could not be created");
			return;
		} catch (UnsupportedEncodingException e) {
			System.out.println("Encoding not supported");
			return;
		} 
		
		writer.println(string);
		writer.close();
	}
	
	public void write(String string, int n) {
		PrintWriter writer;
		try {
			writer = new PrintWriter(oldFileName, "UTF-8");

		} catch (FileNotFoundException e) {
			System.out
					.println("File not found for editing or could not be created");
			return;
		} catch (UnsupportedEncodingException e) {
			System.out.println("Encoding not supported");
			return;
		} 
		
		writer.print(string);
		writer.print(',');
		writer.println(n);
		writer.close();
	}
	
	
	public static void main (String args[]){
		EditTxt file = new EditTxt("nomes.txt");
		LinkedList<String> newFile = new LinkedList<>();
		newFile.add("Olá mundo!");
		if (file.fileContent == null){
			file.read();
		}
		newFile.addAll(file.fileContent);
		file.write("OlaNomes.txt", newFile);
	}
	public List<String> getFileContent() {
		return fileContent;
	}
	public void setFileContent(LinkedList<String> fileContent) {
		this.fileContent = fileContent;
	}

}
