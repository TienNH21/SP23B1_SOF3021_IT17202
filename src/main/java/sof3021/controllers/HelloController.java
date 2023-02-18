package sof3021.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sof3021.beans.Company;
import sof3021.entity.Account;
import sof3021.repositories.AccountRepository;

@Controller
public class HelloController {
	@Autowired
	@Qualifier("HCM")
	private Company company;
	
	@Autowired
	private AccountRepository accRepo;
	
	@GetMapping("hello")
	public String hello(
		// C1: default value
		@RequestParam(name="ho_ten", defaultValue="FPT Polytechnic") String hoTen
//		C2: Optional<T>: @RequestParam("ho_ten") Optional<String> hoTen
	) {
//		if (hoTen.isPresent()) {
//			System.out.println(hoTen);
//		} else {
//			//
//		}
		
		Account a = this.accRepo.findByUsername("TienNH24");
		System.out.println(a.getFullname());
		System.out.println("HelloController@hello");
		System.out.println(this.company.getName());
		return "hello";
	}
}
