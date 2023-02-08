package com.example.board.service;

import com.example.board.entity.Board;
import com.example.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class BoardService {

    @Autowired //Dependency Injection 의존성 주입
    private BoardRepository boardRepository;
    public void write(Board board) {

        //글 작성 처리
        boardRepository.save(board);
    }

    public List<Board> boardList() {

        // 게시물 리스트 처리
        return boardRepository.findAll();
    }

    // 특정 게시글 불러오기 처리
    public Board boardView(Integer id) {

        return boardRepository.findById(id).get();
    }

    // 특정 게시글 삭제 처리
    public void boardDelete(Integer id) {

        boardRepository.deleteById(id);
    }


}
