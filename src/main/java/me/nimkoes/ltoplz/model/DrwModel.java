package me.nimkoes.ltoplz.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
    private Long firstAccumamnt;
    private Long firstPrzwnerCo;
    private Long firstWinamnt;
    private String returnValue;
    private Long totSellamnt;
}
