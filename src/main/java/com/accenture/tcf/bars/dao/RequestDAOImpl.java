package com.accenture.tcf.bars.dao;

import java.sql.Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.accenture.tcf.bars.domain.Request;
import com.accenture.tcf.bars.domain.RequestRepository;

@Component
public class RequestDAOImpl implements IRequestDAO {
	Connection conn;
	
	@Autowired
	RequestRepository requestRepo;
	
	@Override
	public void insertRequest(Request request) {
		requestRepo.save(request);
	}
	
	@Override
	public void deleteRequest() {
		requestRepo.deleteAll();
	}
	
}
