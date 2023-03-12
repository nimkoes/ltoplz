package me.nimkoes.ltoplz;

import com.querydsl.jpa.impl.JPAQueryFactory;
import me.nimkoes.ltoplz.entity.DrwMasterEntity;
import me.nimkoes.ltoplz.model.DrwModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ActiveProfiles;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.time.LocalDate;

import static me.nimkoes.ltoplz.entity.QDrwMasterEntity.drwMasterEntity;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("local")
class LtoplzApplicationTests {
    @PersistenceContext
    EntityManager em;
    @Autowired
    private JPAQueryFactory queryFactory;

    @BeforeEach
    public void before() {
        queryFactory = new JPAQueryFactory(em);

        DrwModel drwModel = new DrwModel(
                1L, LocalDate.now(),
                12, 21, 34, 3, 5, 6, 27,
                null, null, null, null, null);

        DrwMasterEntity drwMasterEntity = DrwMasterEntity.byDrwModel(drwModel);

        em.persist(drwMasterEntity);
    }

    @Test
    @Transactional
    @Commit
    public void test() {
        DrwMasterEntity result = queryFactory
                .selectFrom(drwMasterEntity)
                .where(drwMasterEntity.drwNo.eq(1L))
                .fetchOne();

        assertThat(result.getDrwNo()).isEqualTo(1L);
    }
}
