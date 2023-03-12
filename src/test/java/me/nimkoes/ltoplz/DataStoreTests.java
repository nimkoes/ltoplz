package me.nimkoes.ltoplz;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import javax.transaction.Transactional;

@Transactional
@SpringBootTest
@ActiveProfiles("local")
class DataStoreTests {
    @Autowired
    private JPAQueryFactory queryFactory;

    @Test
    @DisplayName("데이터를 파일에 저장")
    public void test() {

    }
}
