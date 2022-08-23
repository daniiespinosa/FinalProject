package com.finalproject;





import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/blog")
public class BlogController {

		
		
		      @GetMapping("/")
		      public String getHomePage() {
		          return "home";
		      }

		      @GetMapping("/secure")
		      public String getSecurePage() {
		          return "secure";
		      }

		      @GetMapping("/login")
		      public String getLoginPage() {
		          return "login";
		      }
		      
		      @GetMapping("/register")
		      public String getRegisterPage() {
		      	return "register";
		      } }

