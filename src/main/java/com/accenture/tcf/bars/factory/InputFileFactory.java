package com.accenture.tcf.bars.factory;

import org.springframework.beans.factory.annotation.Autowired;

import com.accenture.tcf.bars.file.CSVInputFileImpl;
import com.accenture.tcf.bars.file.TextInputFileImpl;

public class InputFileFactory {
	
	@Autowired
	private TextInputFileImpl textInputFile;
	
	@Autowired
	private CSVInputFileImpl csvInputfile;
	
	private InputFileFactory getInstance() {
		return null;
	}
	
	public InputFileFactory GetInstance() {
		return null;
		
	}
}
