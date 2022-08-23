package com.itwillbs.service;

import java.util.List;

import com.itwillbs.dao.PageDTO;
import com.itwillbs.domain.BoardDTO;

public interface BoardService {

	//추상메서드
	void insertBoard(BoardDTO boardDTO);

	List<BoardDTO> getBoardList(PageDTO pageDTO);

	int getBoardCount();

	
	
}
