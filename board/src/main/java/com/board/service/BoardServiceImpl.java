package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.dao.BoardDAO;
import com.board.domain.BoardVO;

@Repository
public class BoardServiceImpl implements BoardService {

 @Inject
 private BoardDAO dao;
 
 private static String namespace = "com.board.mappers.board";

 // 게시물 목록
 @Override
 public List<BoardVO> list() throws Exception { 
  
	 return dao.list();
 }
 
 // 게시물 작성
 @Override
 public void write(BoardVO vo) throws Exception {
	// TODO Auto-generated method stub
	dao.write(vo);
}
 
 //게시물 조회
 @Override
 public BoardVO view(int bno) throws Exception {

	  return dao.view(bno);
}
 
 //게시물 수정
 @Override
 public void modify(BoardVO vo) throws Exception {

	 dao.modify(vo);
}

}