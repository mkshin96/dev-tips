package me.mugon.practicequerydsl.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter @NoArgsConstructor @Builder @AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(length = 10)
    private String name;

    @Column
    private Long age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teamId", updatable = false)
    private Team team;
}
