package org.example.db.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.db.dto.BoardDTO;

import java.util.List;

@Mapper
public interface BoardMapper {
    public void insert(BoardDTO dto);
    public BoardDTO select(int id);
    public List<BoardDTO> listAll();
}
