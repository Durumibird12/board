package com.example.board.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "board")
public class Board {
    @Id //PK 키
    @Column(name = "board_id")
    @GeneratedValue(strategy = GenerationType.AUTO) //자동으로 1씩 증가
}
