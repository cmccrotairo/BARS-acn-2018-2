package com.accenture.tcf.bars.file;

import java.io.File;
import java.util.List;

import com.accenture.tcf.bars.domain.Record;

public interface IOutputFile {
	
	public abstract void writeFile(List<Record> records);
	public abstract void setFile(File file);
	public abstract void getFile();

}
