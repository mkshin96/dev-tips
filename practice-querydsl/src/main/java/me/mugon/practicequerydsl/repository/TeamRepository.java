package me.mugon.practicequerydsl.repository;

import me.mugon.practicequerydsl.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
