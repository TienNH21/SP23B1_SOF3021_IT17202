package sof3021.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import sof3021.form_beans.DangKyBean;

@Controller
public class DangKyController {
	@GetMapping("form-dang-ky")
	public String getForm()
	{
		return "dangky";
	}
	
	@PostMapping("dang-ky")
	public String dangKy(Model model, DangKyBean bean) {
		model.addAttribute("data", bean);
		return "dangky";
	}
}
