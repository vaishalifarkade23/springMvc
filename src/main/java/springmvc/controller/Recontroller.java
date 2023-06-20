package springmvc.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Recontroller
{
//	@RequestMapping("/one")
//	public String  one()
//	{
//		System.out.println("this is one");
	//redirect prifix
//		return "redirect:/enjoy";
//	}
	
	@RequestMapping("/one")
	public RedirectView one()
	{
	System.out.println("this is one");
		
		//redirectViwe to redirect on another page
		RedirectView redirectView = new RedirectView();
	    redirectView.setUrl("https://www.google.com");
	    return redirectView ;
		
		//httpservletResponce to redirct on next page
//	    @RequestMapping("/one")
//		public String  one()
//		{
//			System.out.println("this is one");
//			return "redirect:/enjoy";
//		}
//		try
//		{
//			response.sendRedirect("enjoy");
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		return "";
	}
	
	
	@RequestMapping("/enjoy")
	public String two()
	{
		System.out.println("this is twoenjoy");
		return "contact";
	}

}
