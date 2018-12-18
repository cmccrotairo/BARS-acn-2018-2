package com.accenture.tcf.bars.file;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import com.accenture.tcf.bars.domain.Request;

public interface IInputFile {

	public abstract List<Request> readFile() throws IOException, NumberFormatException, ParseException;
	public abstract void setFile(File file);
	public abstract File getFile();
}
