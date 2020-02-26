package com.parma.batch.batchdemo.batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.parma.batch.batchdemo.model.User;

@Component
public class Processor implements ItemProcessor<User, User> {

	private static final Map<String, String> DEPT_NAMES= new HashMap<>();
	
	public Processor() {
		DEPT_NAMES.put("1", "Technology");
		DEPT_NAMES.put("2", "operation");
		DEPT_NAMES.put("3", "Accounts");
	}
	
	@Override
	public User process(User item) throws Exception {		
		item.setDept(DEPT_NAMES.get(item.getDept()));
		return item;
	}

}
