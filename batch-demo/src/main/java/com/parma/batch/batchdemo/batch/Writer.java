package com.parma.batch.batchdemo.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.parma.batch.batchdemo.model.User;
import com.parma.batch.batchdemo.repository.UserRepository;

@Component
public class Writer implements ItemWriter<User> {

	@Autowired
	private UserRepository userRepository;
	
	public void write(List<? extends User> users) throws Exception {
		System.out.println("Data Saved for Users:"+users);
		userRepository.saveAll(users);
		
	}

	

}
 