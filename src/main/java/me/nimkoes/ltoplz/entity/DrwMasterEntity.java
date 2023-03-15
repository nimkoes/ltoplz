package me.nimkoes.ltoplz.entity;

import lombok.Getter;
import me.nimkoes.ltoplz.model.DrwModel;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Entity
@Table(name = "DRW_MASTER")
public class DrwMasterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @NotNull
    @Column(name = "DRW_NO")
    private Long drwNo;

    @NotNull
    @Column(name = "ISSUE_DT", columnDefinition = "DATE")
    private LocalDate issueDt;

    @NotNull
    @Column(name = "DRWT_NO_1")
    private Integer drwtNo1;

    @NotNull
    @Column(name = "DRWT_NO_2")
    private Integer drwtNo2;

    @NotNull
    @Column(name = "DRWT_NO_3")
    private Integer drwtNo3;

    @NotNull
    @Column(name = "DRWT_NO_4")
    private Integer drwtNo4;

    @NotNull
    @Column(name = "DRWT_NO_5")
    private Integer drwtNo5;

    @NotNull
    @Column(name = "DRWT_NO_6")
    private Integer drwtNo6;

    @NotNull
    @Column(name = "BONUS_NO")
    private Integer bnusNo;

    private DrwMasterEntity(Long id, Long drwNo, LocalDate issueDt, Integer drwtNo1, Integer drwtNo2, Integer drwtNo3, Integer drwtNo4, Integer drwtNo5, Integer drwtNo6, Integer bnusNo) {
        this.id = id;
        this.drwNo = drwNo;
        this.issueDt = issueDt;
        this.drwtNo1 = drwtNo1;
        this.drwtNo2 = drwtNo2;
        this.drwtNo3 = drwtNo3;
        this.drwtNo4 = drwtNo4;
        this.drwtNo5 = drwtNo5;
        this.drwtNo6 = drwtNo6;
        this.bnusNo = bnusNo;
    }

    public static DrwMasterEntity byDrwModel(DrwModel drwModel) {
        return new DrwMasterEntity(
                null
                , drwModel.getDrwNo()
                , drwModel.getDrwNoDate()
                , drwModel.getDrwtNo1()
                , drwModel.getDrwtNo2()
                , drwModel.getDrwtNo3()
                , drwModel.getDrwtNo4()
                , drwModel.getDrwtNo5()
                , drwModel.getDrwtNo6()
                , drwModel.getBnusNo()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrwMasterEntity that = (DrwMasterEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(drwNo, that.drwNo) && Objects.equals(issueDt, that.issueDt) && Objects.equals(drwtNo1, that.drwtNo1) && Objects.equals(drwtNo2, that.drwtNo2) && Objects.equals(drwtNo3, that.drwtNo3) && Objects.equals(drwtNo4, that.drwtNo4) && Objects.equals(drwtNo5, that.drwtNo5) && Objects.equals(drwtNo6, that.drwtNo6) && Objects.equals(bnusNo, that.bnusNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, drwNo, issueDt, drwtNo1, drwtNo2, drwtNo3, drwtNo4, drwtNo5, drwtNo6, bnusNo);
    }
}
