package me.mugon.practicequerydsl.repository;

import me.mugon.practicequerydsl.domain.Academy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcademyRepository extends JpaRepository<Academy, Long>, AcademyRepositoryCustom {
}
