package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.thoughtworks.xstream.XStream;


public class fileReader {
	public static List<String> getTestData(String fileName) throws IOException {
		List<String> records = new ArrayList<String>();
		String record;

		try (BufferedReader buffer = new BufferedReader(new FileReader(fileName))) {
			while ((record = buffer.readLine()) != null) {
				records.add(record);
			}
		}
		return records;
	}

	
}
