package com.myaws.myapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/board/")
public class BoardController {
	
	
	//�ΰ� 
	private static final Logger logger =LoggerFactory.getLogger(MemberController.class); 
	
	
	
	// �����Խ��� ȭ�鰡�� 
	@RequestMapping(value= "boardList.aws", method=RequestMethod.GET)
	public String boardList() {
		
		String path = "WEB-INF/board/boardList";
		return path;
	}
	
	// �۾��� ȭ�� ����
	@RequestMapping(value= "boardWrite.aws", method=RequestMethod.GET)
	public String boardWrite() {
		
		String path = "WEB-INF/board/boardWrite";
		return path;
	}
	
	
	// �����Խ��� �� ���� ȭ�� ���� 
	@RequestMapping(value= "boardContents.aws", method=RequestMethod.GET)
	public String boardContents() {
		
		String path = "WEB-INF/board/boardContents";
		return path;
	}

}