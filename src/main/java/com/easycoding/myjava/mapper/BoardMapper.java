package com.easycoding.myjava.mapper;

import com.easycoding.myjava.entity.board.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    public List<BoardVo> selectBoardList(BoardVo boardVo);

    public void createBoard(BoardVo boardVo);

    public void deleteBoards(BoardVo boardVo);
}
