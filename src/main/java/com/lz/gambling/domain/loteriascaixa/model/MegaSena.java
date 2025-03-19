package com.lz.gambling.domain.loteriascaixa.model;

import com.lz.gambling.application.loteria.adapters.out.postgres.entities.MegaSenaDrawsEntity;
import com.lz.gambling.application.loteria.adapters.out.postgres.entities.MegaSenaDrawsUpdateHistoryEntity;

import java.time.LocalDate;
import java.util.List;

public record MegaSena(
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
        String observacao,
        MegaSenaDrawsUpdateHistory megaSenaDrawsUpdateHistory) {

    public static List<MegaSena> toDomain(List<MegaSenaDrawsEntity> listMegaSenaDraws) {
        return listMegaSenaDraws.stream().map(MegaSena::fromEntity).toList();
    }

    public static MegaSena fromEntity(MegaSenaDrawsEntity entity) {
        return new MegaSena(
                entity.getId(),
                entity.getConcurso(),
                entity.getDataSorteio(),
                entity.getBola1(),
                entity.getBola2(),
                entity.getBola3(),
                entity.getBola4(),
                entity.getBola5(),
                entity.getBola6(),
                entity.getGanhadores6(),
                entity.getCidadeUF(),
                entity.getRateio6(),
                entity.getGanhadores5(),
                entity.getRateio5(),
                entity.getGanhadores4(),
                entity.getRateio4(),
                entity.getAcumulado6(),
                entity.getArrecadacaoTotal(),
                entity.getEstimativaPremio(),
                entity.getAcumuladoEspecial(),
                entity.getObservacao(),
                MegaSenaDrawsUpdateHistory.fromEntity(entity.getMegaSenaDrawsUpdateHistoryEntity())
        );
    }

    public static class MegaSenaBuilder {
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
        private MegaSenaDrawsUpdateHistory megaSenaDrawsUpdateHistory;

        MegaSenaBuilder() {
        }

        public MegaSenaBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public MegaSenaBuilder concurso(int concurso) {
            this.concurso = concurso;
            return this;
        }

        public MegaSenaBuilder dataSorteio(LocalDate dataSorteio) {
            this.dataSorteio = dataSorteio;
            return this;
        }

        public MegaSenaBuilder bola1(int bola1) {
            this.bola1 = bola1;
            return this;
        }

        public MegaSenaBuilder bola2(int bola2) {
            this.bola2 = bola2;
            return this;
        }

        public MegaSenaBuilder bola3(int bola3) {
            this.bola3 = bola3;
            return this;
        }

        public MegaSenaBuilder bola4(int bola4) {
            this.bola4 = bola4;
            return this;
        }

        public MegaSenaBuilder bola5(int bola5) {
            this.bola5 = bola5;
            return this;
        }

        public MegaSenaBuilder bola6(int bola6) {
            this.bola6 = bola6;
            return this;
        }

        public MegaSenaBuilder ganhadores6(int ganhadores6) {
            this.ganhadores6 = ganhadores6;
            return this;
        }

        public MegaSenaBuilder cidadeUF(String cidadeUF) {
            this.cidadeUF = cidadeUF;
            return this;
        }

        public MegaSenaBuilder rateio6(double rateio6) {
            this.rateio6 = rateio6;
            return this;
        }

        public MegaSenaBuilder ganhadores5(int ganhadores5) {
            this.ganhadores5 = ganhadores5;
            return this;
        }

        public MegaSenaBuilder rateio5(double rateio5) {
            this.rateio5 = rateio5;
            return this;
        }

        public MegaSenaBuilder ganhadores4(int ganhadores4) {
            this.ganhadores4 = ganhadores4;
            return this;
        }

        public MegaSenaBuilder rateio4(double rateio4) {
            this.rateio4 = rateio4;
            return this;
        }

        public MegaSenaBuilder acumulado6(double acumulado6) {
            this.acumulado6 = acumulado6;
            return this;
        }

        public MegaSenaBuilder arrecadacaoTotal(double arrecadacaoTotal) {
            this.arrecadacaoTotal = arrecadacaoTotal;
            return this;
        }

        public MegaSenaBuilder estimativaPremio(double estimativaPremio) {
            this.estimativaPremio = estimativaPremio;
            return this;
        }

        public MegaSenaBuilder acumuladoEspecial(double acumuladoEspecial) {
            this.acumuladoEspecial = acumuladoEspecial;
            return this;
        }

        public MegaSenaBuilder observacao(String observacao) {
            this.observacao = observacao;
            return this;
        }

        public MegaSenaBuilder megaSenaDrawsUpdateHistory(MegaSenaDrawsUpdateHistory megaSenaDrawsUpdateHistory) {
            this.megaSenaDrawsUpdateHistory = megaSenaDrawsUpdateHistory;
            return this;
        }

        public MegaSena build() {
            return new MegaSena(id, concurso, dataSorteio, bola1, bola2, bola3, bola4, bola5, bola6, ganhadores6
                    , cidadeUF, rateio6, ganhadores5, rateio5, ganhadores4, rateio4, acumulado6, arrecadacaoTotal
                    , estimativaPremio, acumuladoEspecial, observacao, megaSenaDrawsUpdateHistory
            );
        }

        @Override
        public String toString() {
            return "MegaSena.MegaSenaBuilder(id=" + this.id + ", concurso=" + this.concurso + ", dataSorteio=" +
                    this.dataSorteio + ", bola1=" + this.bola1 + ", bola2=" + this.bola2 + ", bola3=" + this.bola3 +
                    ", bola4=" + this.bola4 + ", bola5=" + this.bola5 + ", bola6=" + this.bola6 + ", ganhadores6=" +
                    this.ganhadores6 + ", cidadeUF=" + this.cidadeUF + ", rateio6=" + this.rateio6 + ", ganhadores5=" +
                    this.ganhadores5 + ", rateio5=" + this.rateio5 + ", ganhadores4=" + this.ganhadores4 +
                    ", rateio4=" + this.rateio4 + ", acumulado6=" + this.acumulado6 + ", arrecadacaoTotal=" +
                    this.arrecadacaoTotal + ", estimativaPremio=" + this.estimativaPremio + ", acumuladoEspecial=" +
                    this.acumuladoEspecial + ", observacao=" + this.observacao + ", megaSenaDrawsUpdateHistoryId=" +
                    this.megaSenaDrawsUpdateHistory.getId() + ")";
        }
    }
}
