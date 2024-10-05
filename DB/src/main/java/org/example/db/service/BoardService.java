package org.example.db.service;

import org.example.db.dao.BoardMapper;
import org.example.db.dto.BoardDTO;
import org.example.db.dto.BoardDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {
    public void insert(BoardDTO dto);
    public BoardDTO select(int id);
    public List<BoardDTO> listAll();
    public void delete(int id);
}
