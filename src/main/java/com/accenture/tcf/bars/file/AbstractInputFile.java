package com.accenture.tcf.bars.file;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.accenture.tcf.bars.domain.Request;

public abstract class AbstractInputFile implements IInputFile {
	private File file;
	
	@Override
	public List<Request> readFile() throws IOException, NumberFormatException, ParseException {
		List<Request> requestList = new ArrayList<Request>();
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String line;
		while ((line = br.readLine()) !=null) {
			String[] entries = line.split(",");
			
			Request request = new Request(Integer.parseInt(entries[0]), new SimpleDateFormat("MMddyyyy").parse(entries[1]), new SimpleDateFormat("MMddyyyy").parse(entries[2]));
			requestList.add(request);
		}
		
		return null;
	}
	
	@Override
	public void setFile(File file) {
		this.file = file;
	}
	
	@Override
	public File getFile() {
		return file;
	}
}
