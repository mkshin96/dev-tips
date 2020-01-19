package me.mugon.practicequerydsl.repository;

import me.mugon.practicequerydsl.domain.Academy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class BasicTest {

    @Autowired
    AcademyRepository academyRepository;

    @Autowired
    AcademyRepositorySupport academyRepositorySupport;

    @BeforeEach
    void setUp() {
        academyRepository.deleteAllInBatch();
    }

    @Test
    @DisplayName("query dsl 기본 기능 확인")
    void querydsl_test() {
        String name = "mugon";
        String address = "mugon@gmail.com";

        academyRepository.save(new Academy(name, address));

        List<Academy> byName = academyRepositorySupport.findByName(name);

        assertEquals(byName.size(), 1);
        assertEquals(byName.get(0).getAddress(), address);
    }

    @Test
    @DisplayName("query dsl custom 확인")
    void querydsl_test2() {
        String name = "mugon";
        String address = "mugon@gmail.com";

        academyRepository.save(new Academy(name, address));

        List<Academy> byName = academyRepository.findByName(name);

        assertEquals(byName.size(), 1);
        assertEquals(byName.get(0).getAddress(), address);
    }
}