package org.example.db.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
// ->@Data 로 대체 가능
public class BoardDTO {
    private int id;
    private String writer;
    private String contents;
    private Timestamp regDate;
}