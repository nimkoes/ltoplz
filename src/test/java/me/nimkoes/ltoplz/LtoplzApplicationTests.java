package me.nimkoes.ltoplz;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LtoplzApplicationTests {

    @Autowired
    private JPAQueryFactory queryFactory;


    @Test
    public void test() {
        System.out.println("queryFactory = " + queryFactory);
    }
}
