package me.mugon.practicequerydsl.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import me.mugon.practicequerydsl.domain.Academy;

import java.util.List;

import static me.mugon.practicequerydsl.domain.QAcademy.academy;

@RequiredArgsConstructor
public class AcademyRepositoryImpl implements AcademyRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Academy> findByName(String name) {
        return jpaQueryFactory
                .selectFrom(academy)
                .where(academy.name.eq(name))
                .fetch();
    }
}
