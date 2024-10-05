package org.example.db.service;

import org.example.db.dto.BoardDTO;
import org.example.db.dto.BoardDTO;
import org.springframework.stereotype.Service;

@Service
public interface BoardService {
    public void insert(BoardDTO dto);
    public BoardDTO select(int id);
}
