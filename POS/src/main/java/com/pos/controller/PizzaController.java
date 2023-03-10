package com.pos.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pos.entity.Customer;

@Controller
public class PizzaController {
	
	// Get all pizza
		@GetMapping("/pizza/all")
		public String getAllCustomers(Model model) {
//			List<Customer> custList = custServ.getAllCustomers();
//			
//			model.addAttribute("custList", custList );
			
			return "pizza";
		}
		
		@GetMapping("/dominosmenu")
		public String getMenu(Model model) {

			
			return "dominosmenu";

}
		@GetMapping("/cart")
		public String getCart(Model model) {

			
			return "cart";

}
		@GetMapping("/admin-view")
		public String getAdminview(Model model) {

			
			return "admin-view";

}
//		@PostMapping("/Sizes")
//		public String validateLogin(@ModelAttribute("sizes") Model model) {
//			Sizes lg = Sizes.validateLogin(login);
//			if(lg!=null) {
//				return "redirect:/customer/all";
//			} else {
//				return "redirect:/login/form";
//			}
//		}
}
