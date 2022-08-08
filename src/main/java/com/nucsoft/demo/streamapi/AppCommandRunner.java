package com.nucsoft.demo.streamapi;

import com.nucsoft.demo.streamapi.Exercise.Exercise;
import com.nucsoft.demo.streamapi.repos.CustomerRepo;
import com.nucsoft.demo.streamapi.repos.OrderRepo;
import com.nucsoft.demo.streamapi.repos.ProductRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Slf4j
@Component
public class AppCommandRunner implements CommandLineRunner {

	@Autowired
	Exercise exercise;

	@Override
	public void run(String... args) throws Exception {

		exercise.exercise1();
		exercise.exercise2();
		exercise.exercise3();
		exercise.exercise4();
		exercise.exercise5();
		exercise.exercise6();
		exercise.exercise7();
		exercise.exercise8();
		exercise.exercise9();
		exercise.exercise10();
		exercise.exercise11();
		exercise.exercise12();
		exercise.exercise13();
		exercise.exercise14();
		exercise.exercise15();
		exercise.exercise15a();

	}

}
