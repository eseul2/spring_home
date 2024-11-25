package com.myaws.myapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping(value="/member/")
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	

	@RequestMapping(value="memberJoin.aws", method=RequestMethod.GET)
	public String memberJoin() {
			
		return "WEB-INF/member/memberJoin";	
	}
	
	
	@RequestMapping(value="memberLogin.aws", method=RequestMethod.GET)
	public String memberLogin() {
		
		return "WEB-INF/member/memberLogin";
	}
	
	
	@RequestMapping(value="main.aws", method=RequestMethod.GET)
	public String main() {
		
		return "WEB-INF/member/main";
	}
	

}
