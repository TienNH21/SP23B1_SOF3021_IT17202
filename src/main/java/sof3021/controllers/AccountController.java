package sof3021.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sof3021.entity.Account;
import sof3021.repositories.AccountRepository;

@Controller
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountRepository accRepo;

	@GetMapping("/create")
	public String create() {
		Account a = new Account();
		a.setFullname("Ng Van A");
		a.setEmail("nguyenvana@gmail.com");
		a.setUsername("nguyenvana");
		a.setPassword("123123");

		this.accRepo.save(a);
		return "hello";
	}
}
