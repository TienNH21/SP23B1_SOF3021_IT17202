package sof3021.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
import sof3021.form_beans.DangKyBean;

@Controller
public class DangKyController {
	@GetMapping("form-dang-ky")
	public String getForm(Model m)
	{
		m.addAttribute("data", new DangKyBean());
		return "dangky";
	}
	
//	@PostMapping("dang-ky")
//	public String dangKy(Model model, DangKyBean bean) {
//		model.addAttribute("data", bean);
//		return "dangky";
//	}
	
	@PostMapping("dang-ky")
	public String dangKy(
		Model m,
		@Valid @ModelAttribute("data") DangKyBean bean,
		BindingResult results
	) {
//		String msg = "Validate OK";
//		if (results.hasErrors()) {
//			msg = "Form is not valid";
//		}
//		
//		m.addAttribute("msg", msg);
		return "dangky";
	}
}
