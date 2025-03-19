package com.lz.gambling.application.loteria.adapters.in.api.dtos.request;

import com.lz.gambling.domain.loteriascaixa.model.MegaSena;

import java.time.LocalDate;

public record MegaSenaRequest(
        Long id,
        int concurso,
        LocalDate dataSorteio,
        int bola1,
        int bola2,
        int bola3,
        int bola4,
        int bola5,
        int bola6,
        int ganhadores6,
        String cidadeUF,
        double rateio6,
        int ganhadores5,
        double rateio5,
        int ganhadores4,
        double rateio4,
        double acumulado6,
        double arrecadacaoTotal,
        double estimativaPremio,
        double acumuladoEspecial,
        String observacao
) {

    @Override
    public String toString() {
        return "MegaSenaRequest{" +
                "id=" + id +
                ", concurso=" + concurso +
                ", dataSorteio=" + dataSorteio +
                ", bola1=" + bola1 +
                ", bola2=" + bola2 +
                ", bola3=" + bola3 +
                ", bola4=" + bola4 +
                ", bola5=" + bola5 +
                ", bola6=" + bola6 +
                ", ganhadores6=" + ganhadores6 +
                ", cidadeUF='" + cidadeUF + '\'' +
                ", rateio6=" + rateio6 +
                ", ganhadores5=" + ganhadores5 +
                ", rateio5=" + rateio5 +
                ", ganhadores4=" + ganhadores4 +
                ", rateio4=" + rateio4 +
                ", acumulado6=" + acumulado6 +
                ", arrecadacaoTotal=" + arrecadacaoTotal +
                ", estimativaPremio=" + estimativaPremio +
                ", acumuladoEspecial=" + acumuladoEspecial +
                ", observacao='" + observacao +
                '}';
    }

    public MegaSena toDomain() {
        return new MegaSena(
                this.id,
                this.concurso,
                this.dataSorteio,
                this.bola1,
                this.bola2,
                this.bola3,
                this.bola4,
                this.bola5,
                this.bola6,
                this.ganhadores6,
                this.cidadeUF,
                this.rateio6,
                this.ganhadores5,
                this.rateio5,
                this.ganhadores4,
                this.rateio4,
                this.acumulado6,
                this.arrecadacaoTotal,
                this.estimativaPremio,
                this.acumuladoEspecial,
                this.observacao,
                null
        );
    }
}
