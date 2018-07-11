package com.spring;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView add(@Valid @ModelAttribute("student1") Student student1, BindingResult result)
	{	
		if(result.hasErrors())
		{
		ModelAndView mv = new ModelAndView("index");
		return mv;
		}
		ModelAndView mv = new ModelAndView("display");
			
		mv.addObject("Result"," thiz iz the mzg " );		
	//	mv.addObject("student1");
	
		return mv;
	}
	
	@RequestMapping("/index")
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("index");
		
		return mv;
	}
}
