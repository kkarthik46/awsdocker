package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
@Autowired
	StudentDAO dao;

@RequestMapping("/")
public ModelAndView loadfrontpage(HttpServletRequest request,HttpServletResponse response) {
ModelAndView mv=new ModelAndView();
mv.setViewName("index.jsp");
return mv;
}

@RequestMapping("/insert")
public ModelAndView insert(HttpServletRequest request,HttpServletResponse response) {
ModelAndView mv=new ModelAndView();
Student s=new Student();
s.setName(request.getParameter("name"));
s.setEmail(request.getParameter("email"));
Student ss=dao.insert(s);
if(ss!=null) {
mv.setViewName("display.jsp");
}
else {
	mv.setViewName("fail.jsp");
}
return mv;
}


@RequestMapping("/getall")
public ModelAndView getall(HttpServletRequest request,HttpServletResponse response) {
ModelAndView mv=new ModelAndView();
List<Student> list=dao.getAll();
mv.setViewName("displaystudent.jsp");
mv.addObject("list", list);
return mv;
}
}