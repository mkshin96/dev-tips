package me.mugon.practicequerydsl.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter @NoArgsConstructor @Builder @AllArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamId;

    @Column(length = 20)
    private String teamName;

    @Column
    private Long awardCount;


}
