package me.nimkoes.ltoplz.entity;

import lombok.Data;
import me.nimkoes.ltoplz.model.DrwModel;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "DRW_MASTER")
public class DrwMasterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "DRW_NO")
    private Long drwNo;

    @Column(name = "ISSUE_DT")
    private LocalDate issueDt;

    @Column(name = "DRWT_NO_1")
    private Integer drwtNo1;

    @Column(name = "DRWT_NO_2")
    private Integer drwtNo2;

    @Column(name = "DRWT_NO_3")
    private Integer drwtNo3;

    @Column(name = "DRWT_NO_4")
    private Integer drwtNo4;

    @Column(name = "DRWT_NO_5")
    private Integer drwtNo5;

    @Column(name = "DRWT_NO_6")
    private Integer drwtNo6;

    @Column(name = "BONUS_NO")
    private Integer bnusNo;

    public static DrwMasterEntity byDrwModel(DrwModel drwModel) {
        DrwMasterEntity entity = new DrwMasterEntity();

        entity.setDrwNo(drwModel.getDrwNo());
        entity.setIssueDt(drwModel.getDrwNoDate());
        entity.setDrwtNo1(drwModel.getDrwtNo1());
        entity.setDrwtNo2(drwModel.getDrwtNo2());
        entity.setDrwtNo3(drwModel.getDrwtNo3());
        entity.setDrwtNo4(drwModel.getDrwtNo4());
        entity.setDrwtNo5(drwModel.getDrwtNo5());
        entity.setDrwtNo6(drwModel.getDrwtNo6());
        entity.setBnusNo(drwModel.getBnusNo());

        return entity;
    }
}
