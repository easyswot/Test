package com.itwillbs.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwillbs.dao.PageDTO;
import com.itwillbs.domain.BoardDTO;
import com.itwillbs.service.BoardService;

@Controller
public class BoardController {
	
	//객체생성 부모인터페이스 = 자식클래스
	@Inject
	private BoardService boardService;
	
//	가상주소 시작점 http://localhost:8080/my_web_2/board/write 
	@RequestMapping(value = "/board/write", method = RequestMethod.GET)
	public String write() {
		// 주소변경없이 이동
		// WEB-INF/views/board/writeForm.jsp 이동
		return "/board/writeForm";
	}

	//	가상주소 시작점 http://localhost:8080/my_web_2/board/writePro 
	@RequestMapping(value = "/board/writePro", method = RequestMethod.POST)
	public String writePro(BoardDTO boardDTO) {
		
		boardService.insertBoard(boardDTO);
		
		// 주소변경하면서 이동	/board/list 이동
		return "redirect:/board/list";
	}
	
//	가상주소 시작점 http://localhost:8080/my_web_2/board/list
//	가상주소 시작점 http://localhost:8080/my_web_2/board/list?pageNum=2
	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public String list(HttpServletRequest request, Model model) {
		// 한 화면에 보여줄 글 개수
		int pageSize = 10;
		//현페이지 번호
		String pageNum = request.getParameter("pageNum");
		if(pageNum == null) {
			pageNum = "1";
		}
		//현재페이지 번호를 정수형으로 변경
		int currentPage = Integer.parseInt(pageNum);
		// PageDTO 객체생성
		PageDTO pageDTO = new PageDTO();
		pageDTO.setPageSize(pageSize);
		pageDTO.setPageNum(pageNum);
		pageDTO.setCurrentPage(currentPage);
		
		List<BoardDTO> boardList = boardService.getBoardList(pageDTO);
		
		// papgeBlock startPage endPage count pageCount
		int count = boardService.getBoardCount();
		pageDTO.setCount(count);
		int pageBlock = 10;
		int startPage = (currentPage - 1) / pageBlock * pageBlock + 1;
		int endPage = startPage + pageBlock - 1;
		int pageCount = count / pageSize + (count % pageSize == 0 ? 0 : 1);
		if(endPage > pageCount) {
			endPage = pageCount;
		}
		
		pageDTO.setCount(count);
		pageDTO.setPageBlock(pageBlock);
		pageDTO.setStartPage(endPage);
		pageDTO.setEndPage(endPage);
		pageDTO.setPageCount(pageCount);
		
		//데이터 담아서 list.jsp 이동
		model.addAttribute("boardList", boardList);
		model.addAttribute("pageDTO",pageDTO);
		
		// 주소변경없이 이동
		// WEB-INF/views/board/list.jsp 이동
		return "/board/list";
	}
}
