package com.example.codeclan.week13day2homework;

import com.example.codeclan.week13day2homework.models.File;
import com.example.codeclan.week13day2homework.models.Folder;
import com.example.codeclan.week13day2homework.models.User;
import com.example.codeclan.week13day2homework.repositories.FileRepository;
import com.example.codeclan.week13day2homework.repositories.FolderRepository;
import com.example.codeclan.week13day2homework.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Week13day2homeworkApplicationTests {


	@Autowired
	private FileRepository fileRepository;
	@Autowired
	private FolderRepository folderRepository;
	@Autowired
	private UserRepository userRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSaveFile(){
		User user = new User("john");
		Folder folder = new Folder("mr folder",user);
		File file = new File("test","txt",4,folder);
		userRepository.save(user);
		folderRepository.save(folder);
		fileRepository.save(file);
	}

}
