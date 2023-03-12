package me.nimkoes.ltoplz.model;

import com.querydsl.core.annotations.QueryProjection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.nimkoes.ltoplz.entity.DrwMasterEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DrwModel {
    private Long drwNo;
    private @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate drwNoDate;
    private Integer drwtNo1;
    private Integer drwtNo2;
    private Integer drwtNo3;
    private Integer drwtNo4;
    private Integer drwtNo5;
    private Integer drwtNo6;
    private Integer bnusNo;

    @QueryProjection
    public DrwModel(DrwMasterEntity drwMasterEntity) {
        this.drwNo = drwMasterEntity.getDrwNo();
        this.drwNoDate = drwMasterEntity.getIssueDt();
        this.drwtNo1 = drwMasterEntity.getDrwtNo1();
        this.drwtNo2 = drwMasterEntity.getDrwtNo2();
        this.drwtNo3 = drwMasterEntity.getDrwtNo3();
        this.drwtNo4 = drwMasterEntity.getDrwtNo4();
        this.drwtNo5 = drwMasterEntity.getDrwtNo5();
        this.drwtNo6 = drwMasterEntity.getDrwtNo6();
        this.bnusNo = drwMasterEntity.getBnusNo();
    }
}
