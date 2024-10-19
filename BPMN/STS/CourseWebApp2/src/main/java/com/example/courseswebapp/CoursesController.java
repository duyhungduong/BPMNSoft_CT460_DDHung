package com.example.courseswebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class CoursesController {
@RequestMapping("courses")
//	public String courses(HttpServletRequest req) {
	public ModelAndView courses(@RequestParam("cname")String coursename) {
//		HttpSession session = req.getSession();
//		String cname = req.getParameter("cname");
//		System.out.println("The course name is:" + cname);
//		session.setAttribute("cname", cname);
//		return "course";
	
	
		ModelAndView mv = new ModelAndView();
		mv.addObject("cname", coursename);
		mv.setViewName("course");

		return mv;
	}
}
