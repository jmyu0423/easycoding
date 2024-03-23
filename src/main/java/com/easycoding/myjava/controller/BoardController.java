package com.easycoding.myjava.controller;

import com.easycoding.myjava.common.json.JsonResult;
import com.easycoding.myjava.entity.board.BoardVo;
import com.easycoding.myjava.service.BoardService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class BoardController {

    @Autowired
    BoardService boardService;

    @RequestMapping(value="/selectBoardList")
    public List<BoardVo> selectBoardList(BoardVo boardVo, HttpServletRequest request) throws Exception{
        List<BoardVo> boardList = boardService.selectBoardList(boardVo);

        return boardList;
    }

    @RequestMapping(value="/createBoard")
    public JsonResult createBoard(@RequestBody BoardVo boardVo, HttpServletRequest request) throws Exception{
        return boardService.createBoard(boardVo, request);
    }

    @RequestMapping(value="/deleteBoards")
    public JsonResult deleteBoards(@RequestBody BoardVo boardVo, HttpServletRequest request) throws Exception{
        return boardService.deleteBoards(boardVo, request);
    }

    @RequestMapping(value="/updateBoards")
    public JsonResult updateBoards(@RequestBody BoardVo boardVo, HttpServletRequest request) throws Exception{
        return boardService.updateBoards(boardVo, request);
    }
}
