package com.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Student.Entity.Student;
import com.Student.Repository.StudentRepository;
import com.Student.Services.StudentService;

@Controller
public class StudentController {
	
	
	@Autowired
	private StudentService stdService;

	
 
	@RequestMapping("/showStd")
	public String showStd() {
		return "showStd";
	}
	
	@RequestMapping("/saveStd")
	public String saveStudent(@ModelAttribute("student")Student student , ModelMap modelMap) {
		stdService.saveStudent(student);
		modelMap.addAttribute( "msg", "save student details");
		return "showStd";
	}
	
	@RequestMapping("/getStd")
	public String getStudent(ModelMap modelMap) {
		 List<Student> student=stdService.getStudent();
		 modelMap.addAttribute("student", student);
		return "getStd";
	}
	
	@RequestMapping("/delete")
	public String deleteStd(@RequestParam("id")long id, ModelMap modelMap) {
		 stdService.deleteById(id);
		 List<Student> student=stdService.getStudent();
		 modelMap.addAttribute("student", student);
		return "getStd";
	}
	
	@RequestMapping("/update")
	public String updateStd(@RequestParam("id")long id, ModelMap modelMap) {
		Student  student = stdService.getById(id);
		modelMap.addAttribute( "student", student);
		return "updateStd";
	}
	
}
