package com.itwillbs.controller;

import java.io.OutputStream;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwillbs.domain.BoardDTO;
import com.itwillbs.service.BoardService;

@Controller
public class BoardController {
	
	//멤버변수
	private BoardService boardService;
	
	//set메서드
	@Inject
	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}	

	// 가상주소 시작점 http://localhost:8080/myweb/board/write
//	=> /board/write	=> board/writeForm.jsp 이동
	@RequestMapping(value = "/board/write", method = RequestMethod.GET)
	public String write() {
		//주소 변경 없이 이동
		// WEB-INF/views/board/writeForm.jsp 이동
		return "board/writeForm";
	}


	@RequestMapping(value = "/board/writePro", method = RequestMethod.POST)
	public String writePro(BoardDTO boardDTO) {
		System.out.println("BoardController writePro()");
		// 부모인터페이스 BoardService 자식클래스 BoardServiceImpl
		// void insertBoard(BoardDTO boardDTO)
		// 부모인터페이스 BoardDAO 자식클래스 BoardDAOImpl
		// void insertBoard(BoardDTO boardDTO) 메서드 정의
		
		// BoardService = BoardServiceImpl 객체생성
		// 메서드 호출
		
		return "redirect:/board/list";
	}
}
