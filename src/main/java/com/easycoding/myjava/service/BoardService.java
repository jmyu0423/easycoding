package com.easycoding.myjava.service;

import com.easycoding.myjava.common.json.JsonResult;
import com.easycoding.myjava.entity.board.BoardVo;
import com.easycoding.myjava.mapper.BoardMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    public BoardMapper boardMapper;
    @Autowired
    public MessageSourceAccessor messageSourceAccessor;

    public List<BoardVo> selectBoardList(BoardVo boardVo){
        List<BoardVo> boardList = boardMapper.selectBoardList(boardVo);
        return boardList;
    }

    public JsonResult createBoard(BoardVo boardVo, HttpServletRequest request) throws Exception{
        try{
            boardMapper.createBoard(boardVo);
            return new JsonResult(JsonResult.RESULT.SUCCESS, messageSourceAccessor.getMessage("common.message.success"));
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return new JsonResult(JsonResult.RESULT.FAIL, e.getMessage());
        }
    }

    public JsonResult deleteBoards(BoardVo boardVo, HttpServletRequest request) throws Exception{
        try{
            boardMapper.deleteBoards(boardVo);
            return new JsonResult(JsonResult.RESULT.SUCCESS, messageSourceAccessor.getMessage("common.message.success"));
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return new JsonResult(JsonResult.RESULT.FAIL, e.getMessage());
        }
    }

    public JsonResult updateBoards(BoardVo boardVo, HttpServletRequest request) throws Exception{
        try{
            boardMapper.updateBoards(boardVo);
            return new JsonResult(JsonResult.RESULT.SUCCESS, messageSourceAccessor.getMessage("common.message.success"));
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return new JsonResult(JsonResult.RESULT.FAIL, e.getMessage());
        }
    }
}
