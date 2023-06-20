package springmvc.controller;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

//requeat mapping annotation use on class level
@RequestMapping("/first")
public class HomeController
{
	@RequestMapping(path="/home" ,method=RequestMethod.GET)
	public String home(Model model)
	{
		model.addAttribute("name", "prachi raut");
		model.addAttribute("id", 1);
		
		List<String> friends=new ArrayList<String>();
		friends.add("jyoti");
		friends.add("suvi");
		model.addAttribute("f",friends);
		System.out.println("hello home");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is about controller");
		return "about";
	}
	
	//service
	//help
	@RequestMapping("/help")
	public ModelAndView getHelp()
	{
		System.out.println("this is help");
		
		//creating object of modelandview
		ModelAndView modelandview =new ModelAndView();
		
		//setting the data
		modelandview.addObject("name", "prachi");
		modelandview.addObject("roll", 11);
		//to set date now
		LocalDateTime now =LocalDateTime.now();
		modelandview.addObject("time" ,now);
		//setting the view name
		modelandview.setViewName("help");
		
		//marks
		List<Integer> mark=new ArrayList<Integer>();
		mark.add(123);
		mark.add(254);
		mark.add(586);
		modelandview.addObject("marks", mark);
		return  modelandview;
	}
	

}
