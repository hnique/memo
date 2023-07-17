package com.memo.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("/sign_up_view")
	public String singUpView(Model model) {
		model.addAttribute("view", "user/signUp");
		return "template/layout";
	}
}
