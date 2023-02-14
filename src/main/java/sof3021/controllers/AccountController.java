package sof3021.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		a.setFullname("Ng Van B");
		a.setEmail("nguyenvanb@gmail.com");
		a.setUsername("nguyenvanb");
		a.setPassword("123123");

		this.accRepo.save(a);
		return "hello";
	}

	@GetMapping("index")
	public String index(Model model)
	{
		List<Account> ds = this.accRepo.findAll();
		model.addAttribute("ds", ds);
		return "admin/account/index";
	}
}
