package com.example.mapper;

import java.util.List;

import com.example.domain.BoardVO;


public interface BoardMapper {
    public void boardInsert(BoardVO board) throws Exception;
    
    public List<BoardVO>boardList()throws Exception;

}
