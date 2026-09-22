package in.ashokit.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Passport;
import in.ashokit.entity.Person;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonPassportService {
	
	
	@Autowired
	private PersonRepo personRepo;
	
	public void savePersonWithPassport() {
		
		Passport passport = new Passport();
		passport.setPassportNum("VBJPATIL14");
		passport.setIssuedDate(LocalDate.now());
		passport.setExpDate(LocalDate.now().plusYears(10));
		
		Person person = new Person();
		person.setName("Vishal");
		person.setDob(LocalDate.now().minusYears(20));
		person.setGender("Male");
		
		passport.setPerson(person);
		person.setPassport(passport);
		personRepo.save(person);
	
		
	}
	

}
