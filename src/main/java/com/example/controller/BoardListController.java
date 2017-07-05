package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.BoardVO;
import com.example.mapper.BoardMapper;
 
@Controller
public class BoardListController {
 
    @Autowired
    private BoardMapper boardMapper;
    
    @RequestMapping("/board")
    public String board(Model model) throws Exception{
        List<BoardVO> board = boardMapper.boardList();
        model.addAttribute("list", board);
        return "test.html";
    }
    
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String homepage() {
    	return "index.html";
    }
}