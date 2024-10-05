package org.example.db.service;

import lombok.RequiredArgsConstructor;
import org.example.db.dao.BoardMapper;
import org.example.db.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    @Autowired
    private final BoardMapper mapper;

    @Override
    public void insert(BoardDTO dto) {
        mapper.insert(dto);
    }
}
