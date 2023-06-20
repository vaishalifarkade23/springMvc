package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model1.User;
import springmvc.service.UserService;

@Controller
public class ContactController 
{
	@Autowired
	private UserService userService;
	@ModelAttribute
	public void commonDataModel(Model m)
	{
		m.addAttribute("Header", "prachi raut");
		m.addAttribute("Decs", "home for programmer");
		System.out.println("adding");
	}
	@RequestMapping("/contact")
	public String showForm(Model m)
	{
		System.out.println("creating");
		//m.addAttribute("header", "prachi raut");
		//m.addAttribute("Decs", "home for programmer");
		return "contact";
	}
	
//	@RequestMapping(path="/processform", method=RequestMethod.POST)
//	public String handleForm(HttpServletRequest request)
//	{
//		String email = request.getParameter("email"); //old technique to get data
//		System.out.println("email is:" +email);
//		return "";
//	}
	
	/*@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(@RequestParam(name="email", required=false) String useremail, 
			@RequestParam("user") String username
			,@RequestParam("password") String userpassword,Model model)
	{
		
//		System.out.println("email is:" +useremail);
//		System.out.println("user name is:" +username);
//		System.out.println("password is:" +userpassword);
//		
//		//success 
//		model.addAttribute("name", username);
//		model.addAttribute("email",useremail);
//		model.addAttribute("pass", userpassword);
		
		User user= new User();
		user.setEmail(useremail);
		user.setUser(username);
		user.setPassword(userpassword);
		System.out.println(user);
		
		model.addAttribute("user", user);
		return "success";
	}*/
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model)
	{
		System.out.println(user);
		
		//to check if we remain blanck any field and submit then we get again redirect to form
//		if(user.getUser().isBlank())
//		{
//			return "redirect:/contact";
//		}
		int createuser=this.userService.createUser(user);
		//model.addAttribute("header", "prachi raut");
		//model.addAttribute("Decs", "home for programmer");
		model.addAttribute("msg", "user created with id: "+createuser);
		return "success";
	}


}
