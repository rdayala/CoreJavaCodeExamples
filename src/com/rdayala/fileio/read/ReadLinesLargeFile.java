package com.rdayala.fileio.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

// this method is helpful, if the file lines have EOL markers. 
// Not suitable for reading binary files or XML files.
// For binary files, you need to read chunks of bytes. For XML files, use STaX parsers.
// http://www.baeldung.com/java-read-lines-large-file

public class ReadLinesLargeFile {

	public static void main(String[] args) {

	}

	public static void readLargeFileLineByLine(String path) {
		FileInputStream inputStream = null;
		Scanner sc = null;
		try {
			inputStream = new FileInputStream(path);
			sc = new Scanner(inputStream, "UTF-8");
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				// System.out.println(line);
			}
			// note that Scanner suppresses exceptions
			if (sc.ioException() != null) {
				throw sc.ioException();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (sc != null) {
				sc.close();
			}
		}
	}
}
