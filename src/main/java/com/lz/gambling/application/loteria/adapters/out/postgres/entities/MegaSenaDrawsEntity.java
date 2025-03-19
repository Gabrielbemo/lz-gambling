package com.lz.gambling.application.loteria.adapters.out.postgres.entities;

import com.lz.gambling.domain.loteriascaixa.model.MegaSena;
import com.lz.gambling.domain.loteriascaixa.model.MegaSenaDrawsUpdateHistory;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Entity(name = "MEGASENA_DRAWS")
@Table(name = "MEGASENA_DRAWS")
public class MegaSenaDrawsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int concurso;
    private LocalDate dataSorteio;
    private int bola1, bola2, bola3, bola4, bola5, bola6;
    private int ganhadores6;
    private String cidadeUF;
    private double rateio6;
    private int ganhadores5;
    private double rateio5;
    private int ganhadores4;
    private double rateio4;
    private double acumulado6;
    private double arrecadacaoTotal;
    private double estimativaPremio;
    private double acumuladoEspecial;
    private String observacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEGASENA_DRAWS_UPDATE_HISTORY_ID")
    private MegaSenaDrawsUpdateHistoryEntity megaSenaDrawsUpdateHistoryEntity;

    public MegaSenaDrawsEntity() {
    }

    public MegaSenaDrawsEntity(Long id, int concurso, LocalDate dataSorteio, int bola1, int bola2, int bola3, int bola4
            , int bola5, int bola6, int ganhadores6, String cidadeUF, double rateio6, int ganhadores5, double rateio5
            , int ganhadores4, double rateio4, double acumulado6, double arrecadacaoTotal, double estimativaPremio
            , double acumuladoEspecial, String observacao, MegaSenaDrawsUpdateHistoryEntity megaSenaDrawsUpdateHistoryEntity) {
        this.id = id;
        this.concurso = concurso;
        this.dataSorteio = dataSorteio;
        this.bola1 = bola1;
        this.bola2 = bola2;
        this.bola3 = bola3;
        this.bola4 = bola4;
        this.bola5 = bola5;
        this.bola6 = bola6;
        this.ganhadores6 = ganhadores6;
        this.cidadeUF = cidadeUF;
        this.rateio6 = rateio6;
        this.ganhadores5 = ganhadores5;
        this.rateio5 = rateio5;
        this.ganhadores4 = ganhadores4;
        this.rateio4 = rateio4;
        this.acumulado6 = acumulado6;
        this.arrecadacaoTotal = arrecadacaoTotal;
        this.estimativaPremio = estimativaPremio;
        this.acumuladoEspecial = acumuladoEspecial;
        this.observacao = observacao;
        this.megaSenaDrawsUpdateHistoryEntity = megaSenaDrawsUpdateHistoryEntity;
    }

    public static List<MegaSenaDrawsEntity> fromDomain(List<MegaSena> listMegaSenaDraws) {
        return listMegaSenaDraws.stream()
                .map(MegaSenaDrawsEntity::fromDomain)
                .collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getConcurso() {
        return concurso;
    }

    public void setConcurso(int concurso) {
        this.concurso = concurso;
    }

    public LocalDate getDataSorteio() {
        return dataSorteio;
    }

    public void setDataSorteio(LocalDate dataSorteio) {
        this.dataSorteio = dataSorteio;
    }

    public int getBola1() {
        return bola1;
    }

    public void setBola1(int bola1) {
        this.bola1 = bola1;
    }

    public int getBola2() {
        return bola2;
    }

    public void setBola2(int bola2) {
        this.bola2 = bola2;
    }

    public int getBola3() {
        return bola3;
    }

    public void setBola3(int bola3) {
        this.bola3 = bola3;
    }

    public int getBola4() {
        return bola4;
    }

    public void setBola4(int bola4) {
        this.bola4 = bola4;
    }

    public int getBola5() {
        return bola5;
    }

    public void setBola5(int bola5) {
        this.bola5 = bola5;
    }

    public int getBola6() {
        return bola6;
    }

    public void setBola6(int bola6) {
        this.bola6 = bola6;
    }

    public int getGanhadores6() {
        return ganhadores6;
    }

    public void setGanhadores6(int ganhadores6) {
        this.ganhadores6 = ganhadores6;
    }

    public String getCidadeUF() {
        return cidadeUF;
    }

    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }

    public double getRateio6() {
        return rateio6;
    }

    public void setRateio6(double rateio6) {
        this.rateio6 = rateio6;
    }

    public int getGanhadores5() {
        return ganhadores5;
    }

    public void setGanhadores5(int ganhadores5) {
        this.ganhadores5 = ganhadores5;
    }

    public double getRateio5() {
        return rateio5;
    }

    public void setRateio5(double rateio5) {
        this.rateio5 = rateio5;
    }

    public int getGanhadores4() {
        return ganhadores4;
    }

    public void setGanhadores4(int ganhadores4) {
        this.ganhadores4 = ganhadores4;
    }

    public double getRateio4() {
        return rateio4;
    }

    public void setRateio4(double rateio4) {
        this.rateio4 = rateio4;
    }

    public double getAcumulado6() {
        return acumulado6;
    }

    public void setAcumulado6(double acumulado6) {
        this.acumulado6 = acumulado6;
    }

    public double getArrecadacaoTotal() {
        return arrecadacaoTotal;
    }

    public void setArrecadacaoTotal(double arrecadacaoTotal) {
        this.arrecadacaoTotal = arrecadacaoTotal;
    }

    public double getEstimativaPremio() {
        return estimativaPremio;
    }

    public void setEstimativaPremio(double estimativaPremio) {
        this.estimativaPremio = estimativaPremio;
    }

    public double getAcumuladoEspecial() {
        return acumuladoEspecial;
    }

    public void setAcumuladoEspecial(double acumuladoEspecial) {
        this.acumuladoEspecial = acumuladoEspecial;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public MegaSenaDrawsUpdateHistoryEntity getMegaSenaDrawsUpdateHistoryEntity() {
        return megaSenaDrawsUpdateHistoryEntity;
    }

    public void setMegaSenaDrawsUpdateHistoryEntity(MegaSenaDrawsUpdateHistoryEntity megaSenaDrawsUpdateHistoryEntity) {
        this.megaSenaDrawsUpdateHistoryEntity = megaSenaDrawsUpdateHistoryEntity;
    }

    public static MegaSenaDrawsEntity fromDomain(MegaSena megaSena) {
        return new MegaSenaDrawsEntity(
                megaSena.id(),
                megaSena.concurso(),
                megaSena.dataSorteio(),
                megaSena.bola1(),
                megaSena.bola2(),
                megaSena.bola3(),
                megaSena.bola4(),
                megaSena.bola5(),
                megaSena.bola6(),
                megaSena.ganhadores6(),
                megaSena.cidadeUF(),
                megaSena.rateio6(),
                megaSena.ganhadores5(),
                megaSena.rateio5(),
                megaSena.ganhadores4(),
                megaSena.rateio4(),
                megaSena.acumulado6(),
                megaSena.arrecadacaoTotal(),
                megaSena.estimativaPremio(),
                megaSena.acumuladoEspecial(),
                megaSena.observacao(),
                MegaSenaDrawsUpdateHistoryEntity.fromDomain(megaSena.megaSenaDrawsUpdateHistory())
        );
    }

    public MegaSena toDomain() {
        return new MegaSena(
                getId(),
                getConcurso(),
                getDataSorteio(),
                getBola1(),
                getBola2(),
                getBola3(),
                getBola4(),
                getBola5(),
                getBola6(),
                getGanhadores6(),
                getCidadeUF(),
                getRateio6(),
                getGanhadores5(),
                getRateio5(),
                getGanhadores4(),
                getRateio4(),
                getAcumulado6(),
                getArrecadacaoTotal(),
                getEstimativaPremio(),
                getAcumuladoEspecial(),
                getObservacao(),
                MegaSenaDrawsUpdateHistory.fromEntity(getMegaSenaDrawsUpdateHistoryEntity())
        );
    }
}
