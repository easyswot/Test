package com.itwillbs.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.itwillbs.domain.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	//마이바티스 객체생성
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.itwillbs.mappers.boardMapper";
	
	@Override
	public void insertBoard(BoardDTO boardDTO) {
		sqlSession.insert(namespace + ".insertBoard", boardDTO);
	}

	@Override
	public Integer getMaxNum() {
		return sqlSession.selectOne(namespace + ".getMaxNum");
	}

	@Override
	public List<BoardDTO> getBoardList(PageDTO pageDTO) {
		return sqlSession.selectList(namespace + ".getBoardList", pageDTO);
		
	}

	@Override
	public int getBoardCount() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".getBoardCount");
	}
	
}
