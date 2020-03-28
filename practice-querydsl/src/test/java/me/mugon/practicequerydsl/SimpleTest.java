package me.mugon.practicequerydsl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.extern.slf4j.Slf4j;
import me.mugon.practicequerydsl.domain.Member;
import me.mugon.practicequerydsl.domain.QMember;
import me.mugon.practicequerydsl.domain.QTeam;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@Slf4j
public class SimpleTest {

    @Autowired
    JPAQueryFactory query;

    @Test
    void simpleQueryDSL() {
        QMember qMember = QMember.member;

        Member member = query.selectFrom(qMember)
                                .where(qMember.memberId.eq(1L))
                                .fetchOne();

        assertEquals(member.getMemberId(), 1L);
    }

    @Test
    void simpleQueryDSL2() {
        QMember member = QMember.member;
        QTeam team = QTeam.team;

        List<Member> members = query.selectFrom(member)
                .innerJoin(member.team, team).fetchJoin()
                .where(member.age.goe(30L).and(member.age.loe(35L)))
                .orderBy(member.age.asc())
                .fetch();

        for (int i = 0; i < members.size(); i++) {
            Member member1 = members.get(i);
            log.info("name : " + member1.getName());
            log.info("age : " + member1.getAge());
        }
    }
}
