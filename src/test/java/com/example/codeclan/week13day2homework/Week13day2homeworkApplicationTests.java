package com.example.codeclan.week13day2homework;

import com.example.codeclan.week13day2homework.models.File;
import com.example.codeclan.week13day2homework.repositories.FileRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Week13day2homeworkApplicationTests {


	@Autowired
	private FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSaveFile(){
		File file = new File("test","txt",4);
		fileRepository.save(file);
	}

}
