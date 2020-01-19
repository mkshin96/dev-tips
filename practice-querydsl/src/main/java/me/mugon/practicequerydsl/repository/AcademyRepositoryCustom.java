package me.mugon.practicequerydsl.repository;

import me.mugon.practicequerydsl.domain.Academy;

import java.util.List;

public interface AcademyRepositoryCustom {
    List<Academy> findByName(String name);
}
