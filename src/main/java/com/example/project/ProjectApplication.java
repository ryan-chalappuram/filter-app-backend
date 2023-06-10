package com.example.project;

import com.example.project.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.project.repository.UserRepository;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new Patient("John DA", "Heart Surgery","25%","Discharge","pending",25000,"Apollo"));
		this.userRepository.save(new Patient("TOM Cruise", " Surgery","25%","Initial Authorization","pending",25000,"Apollo"));
		this.userRepository.save(new Patient("JACK s", "TEST","25%","Enhancement","TPA QUERY",45000,"Apollo"));
		this.userRepository.save(new Patient("JACK s", "TEST","25%","Final Authorization","TPA QUERY",45000,"Apollo"));
		this.userRepository.save(new Patient("TOsgg", " Surgery","25%","Initial Authorization","test",25000,"Apollo"));

	}
}


