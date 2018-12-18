package com.accenture.tcf.bars.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.text.ParseException;

import com.accenture.tcf.bars.dao.IRecordDAO;
import com.accenture.tcf.bars.dao.IRequestDAO;
import com.accenture.tcf.bars.file.IInputFile;
import com.accenture.tcf.bars.file.IOutputFile;

public class FileProcessor {

	
	IInputFile inputFile;
	IOutputFile outputFile;
	
	@Autowired
	IRequestDAO requestDAO;
	
	@Autowired
	IRecordDAO recordDAO;
	
	public void execute(File file) throws NumberFormatException, IOException, ParseException {
		inputFile.setFile(file);
		inputFile.readFile();
	}
	 
	public List<Record> retrieveRecordfromDB() {
		return null;
	}
	
	public void writeOutput(List<Record> list) {
		
	}
	
}
