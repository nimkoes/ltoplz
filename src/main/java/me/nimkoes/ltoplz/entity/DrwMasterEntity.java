package me.nimkoes.ltoplz.entity;

import javax.persistence.*;
import java.time.LocalDate;

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

}
