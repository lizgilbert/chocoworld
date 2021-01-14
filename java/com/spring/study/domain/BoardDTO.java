package com.spring.study.domain;

import java.util.Date;
import java.util.List;

import com.spring.study.board.domain.BoardAttachDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class BoardDTO {
    private Integer bno;
    private String title;
    private String content;
    private String writer;
    private Date regdate;
    private int viewcnt;
    
    private int replycnt;
    private List<BoardAttachDTO> attachList;
}











