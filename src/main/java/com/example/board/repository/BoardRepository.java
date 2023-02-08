package com.example.board.repository;

import com.example.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// JpaRepository<Entity, PrimaryType> 작성 방법, 상속을 받아서 사용한다.
public interface BoardRepository extends JpaRepository<Board, Integer> {

}
