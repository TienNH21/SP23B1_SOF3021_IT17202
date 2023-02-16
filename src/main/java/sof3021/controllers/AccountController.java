package sof3021.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sof3021.entity.Account;
import sof3021.form_beans.accounts.AccountCreate;
import sof3021.form_beans.accounts.AccountUpdate;
import sof3021.repositories.AccountRepository;

@Controller
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountRepository accRepo;

	@GetMapping("index")
	public String index(Model model)
	{
		List<Account> ds = this.accRepo.findAll();
		model.addAttribute("ds", ds);
		return "admin/account/index";
	}
	
	@GetMapping("delete/{id}")
	public String delete(@PathVariable("id") Account account)
	{
		this.accRepo.delete(account);
		return "redirect:/account/index";
	}
	
	@GetMapping("/create")
	public String create(@ModelAttribute("data") AccountCreate acc) {
		return "admin/account/create";
	}
	
	@PostMapping("/store")
	public String store(@ModelAttribute("data") AccountCreate accBean) {
		// Bean -> Entity
		Account accEntity = new Account();
		accEntity.setFullname(accBean.getFullname());
		accEntity.setUsername(accBean.getUsername());
		accEntity.setEmail(accBean.getEmail());
		accEntity.setPassword(accBean.getPassword());
		accEntity.setPhoto(accBean.getPhoto());
		accEntity.setActivated(accBean.getActivated());
		accEntity.setAdmin(accBean.getAdmin());
		
		this.accRepo.save(accEntity);
		return "redirect:/account/index";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Account accEntity,
		Model model, AccountUpdate accBean) {
		// Entity -> Bean
		accBean.setId(accEntity.getId());
		accBean.setFullname(accEntity.getFullname());
		accBean.setUsername(accEntity.getUsername());
		accBean.setEmail(accEntity.getEmail());
		accBean.setPassword(accEntity.getPassword());
		accBean.setPhoto(accEntity.getPhoto());
		accBean.setActivated(accEntity.getActivated());
		accBean.setAdmin(accEntity.getAdmin());
		
		model.addAttribute("data", accBean);
		return "admin/account/edit";
	}
	
	@GetMapping("/update/{id}")
	public String update(@ModelAttribute("data") AccountUpdate accBean) {
		return "redirect:/account/index";
	}
}
