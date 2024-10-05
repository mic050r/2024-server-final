package org.example.db.controller;

import org.example.db.dto.BoardDTO;
import org.example.db.service.BoardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private final BoardServiceImpl boardService;

    public BoardController(BoardServiceImpl boardService) {
        this.boardService = boardService;
    }

    @GetMapping
    public String board() {
        return "board";
    }

    @PostMapping
    public String CreateBoard(@ModelAttribute BoardDTO dto, Model model) {
        boardService.insert(dto);
        model.addAttribute("result", dto);
        return "board";
    }
}
