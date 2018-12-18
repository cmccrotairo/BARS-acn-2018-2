package com.accenture.tcf.bars.exception;

public class BarsException {
	public String INVALID_START_DATE_FORMAT;
	public String INVALID_END_DATE_FORMAT;
	public String BILLING_CYCLE_NOT_ON_RANGE;
	public String PATH_DOES_NOT_EXIST;
	public String NO_SUPPORTED_FILE;
	public String NO_RECORDS_TO_READ;
	public String NO_RECORDS_TO_WRITE;
	
	public BarsException(String message) {
		
	}
	
	public BarsException(String message, Throwable cause) {
		
	}
}
 