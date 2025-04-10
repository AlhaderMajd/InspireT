package com.example.cruddemo;

import com.example.cruddemo.dao.AppDAO;
import com.example.cruddemo.entity.Course;
import com.example.cruddemo.entity.Instructor;
import com.example.cruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO){
		return runner -> {
			//creatInstructor(appDAO);

			//findInstructor(appDAO);
			
			//deleteInstructor(appDAO);

			//findInstructorDetail(appDAO);

			//deleteInstructorDetail(appDAO);

			creatInstructorWithCourse(appDAO);
		};
	}

	private void creatInstructorWithCourse(AppDAO appDAO) {
		Instructor tempInstructor =
				new Instructor("ahmad", "alhader","a@gmail.com");
		InstructorDetail tempInstructorDetail =
				new InstructorDetail("http/ahmad", "FB");

		tempInstructor.setInstructorDetail(tempInstructorDetail);

		Course tempcourse1 = new Course("web-1");
		Course tempcourse2 = new Course("fund");

		tempInstructor.add(tempcourse1);
		tempInstructor.add(tempcourse2);

		System.out.println("Saving instructor: "+tempInstructor);
		System.out.println("The courses: "+tempInstructor.getCourses());
		appDAO.save(tempInstructor);

		System.out.println("Done");
	}

	private void deleteInstructorDetail(AppDAO appDAO) {
		int theId = 3;
		System.out.println("Deleting instructor detail id: "+theId);
		appDAO.deleteInstructorDetailById(theId);
		System.out.println("Done!");
	}

	private void findInstructorDetail(AppDAO appDAO) {
		int theId = 2;
		InstructorDetail tempInstructorDetail = appDAO.findInstructorDetailById(theId);
		System.out.println("tempInstructorDetail: "+tempInstructorDetail);
		System.out.println("the associated instructor: "+tempInstructorDetail.getInstructor());
		System.out.println("Done!");
	}

	private void deleteInstructor(AppDAO appDAO) {
		int theId = 1;
		System.out.println("Deleting instructor id: "+theId);
		appDAO.deleteInstructorById(theId);
		System.out.println("Done");
	}

	private void findInstructor(AppDAO appDAO) {
		int theId = 1;
		System.out.println("Finding instructor id: "+theId);
		Instructor tempInstructor = appDAO.findInstructorById(theId);
		System.out.println("tempInstructor: "+tempInstructor);
		System.out.println("the associate instructorDetail only: "+tempInstructor.getInstructorDetail());
	}

	private void creatInstructor(AppDAO appDAO) {

		Instructor tempInstructor =
				new Instructor("zaid", "alhader","z@gmail.com");
		InstructorDetail tempInstructorDetail =
				new InstructorDetail("http/m", "FB");

		tempInstructor.setInstructorDetail(tempInstructorDetail);

		System.out.println("Saving instructor: "+tempInstructor);
		appDAO.save(tempInstructor);

		System.out.println("Done");
	}
}
