package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.bean.dataBean;

@Controller
public class testController {

	private dataBean studentRecords;

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	@ResponseBody
	public String test() {
		return "TEST";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/student/allstudent")
	@ResponseBody
	public dataBean getAllStudents() {
		studentRecords = new dataBean();
		studentRecords.setName("Ray");
		studentRecords.setAge(30);

		return studentRecords;
	}
}