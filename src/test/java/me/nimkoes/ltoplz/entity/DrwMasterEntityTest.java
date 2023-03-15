package me.nimkoes.ltoplz.entity;

import me.nimkoes.ltoplz.domain.entity.DrwMasterEntity;
import me.nimkoes.ltoplz.model.DrwModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class DrwMasterEntityTest {

    @Test
    @DisplayName("엔티티 생성 테스트")
    public void 엔티티_생성_테스트() {
        DrwModel drwModel = new DrwModel(
                1L, LocalDate.now(),
                12, 21, 34, 3, 5, 6, 27);

        DrwMasterEntity entity_first = DrwMasterEntity.byDrwModel(drwModel);
        DrwMasterEntity entity_second = DrwMasterEntity.byDrwModel(drwModel);

        assertThat(entity_first).isEqualTo(entity_second);
    }
}
