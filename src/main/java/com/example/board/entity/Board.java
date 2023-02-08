package com.example.board.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // DB를 의미 (JPA가 읽어 들임)
@Data // Getter and Setter가 없을 때  사용하면 get() 사용가능
public class Board {

    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //IDENTITY(MYSQL,MARIADB), SEQUENCE(ORACLE)
    private int id;
    private String title;
    private String content;

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
}
