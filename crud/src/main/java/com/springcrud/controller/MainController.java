package com.springcrud.controller;

import java.util.List;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.springcrud.dao.UserDao;
import com.springcrud.entities.User;
@Controller
public class MainController {

	@Autowired
    private UserDao userDao;
    
	@GetMapping("/")
	public String home(Model m) {
		List<User> user= userDao.getAll();
		m.addAttribute("user",user);
		return "index";
	}
	
	@GetMapping("/add")
	public String addUser() {
		return "add";
	}
	
	@PostMapping("/adduser")
	public RedirectView adduser(@ModelAttribute() User user, HttpServletRequest request) {
//		file.getBytes();
		this.userDao.insert(user);
		RedirectView view= new RedirectView();
		view.setUrl(request.getContextPath()+"/");
		return view;				
	}
	
	@GetMapping("/delete/{id}")
	public RedirectView deleteUser(@PathVariable("id") int id, HttpServletRequest request) {
		this.userDao.deleteData(id);
		RedirectView view= new RedirectView();
		view.setUrl(request.getContextPath()+"/");
		return view;				
	}
	
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable("id") int id, Model m) {
		User user= this.userDao.get(id);
		m.addAttribute("user",user);
		return "update";
	}
	
	

}
