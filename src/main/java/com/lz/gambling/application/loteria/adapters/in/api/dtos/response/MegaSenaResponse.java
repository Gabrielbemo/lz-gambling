package com.lz.gambling.application.loteria.adapters.in.api.dtos.response;

import com.lz.gambling.domain.loteriascaixa.model.MegaSena;

import java.time.LocalDate;

public record MegaSenaResponse(
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

    static final class MegaSenaResponseBuilder {
        private Long id;
        private int concurso;
        private LocalDate dataSorteio;
        private int bola1;
        private int bola2;
        private int bola3;
        private int bola4;
        private int bola5;
        private int bola6;
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

        MegaSenaResponseBuilder() {
        }

        public static MegaSenaResponseBuilder builder() {
            return new MegaSenaResponseBuilder();
        }

        public MegaSenaResponseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public MegaSenaResponseBuilder concurso(int concurso) {
            this.concurso = concurso;
            return this;
        }

        public MegaSenaResponseBuilder dataSorteio(LocalDate dataSorteio) {
            this.dataSorteio = dataSorteio;
            return this;
        }

        public MegaSenaResponseBuilder bola1(int bola1) {
            this.bola1 = bola1;
            return this;
        }

        public MegaSenaResponseBuilder bola2(int bola2) {
            this.bola2 = bola2;
            return this;
        }

        public MegaSenaResponseBuilder bola3(int bola3) {
            this.bola3 = bola3;
            return this;
        }

        public MegaSenaResponseBuilder bola4(int bola4) {
            this.bola4 = bola4;
            return this;
        }

        public MegaSenaResponseBuilder bola5(int bola5) {
            this.bola5 = bola5;
            return this;
        }

        public MegaSenaResponseBuilder bola6(int bola6) {
            this.bola6 = bola6;
            return this;
        }

        public MegaSenaResponseBuilder ganhadores6(int ganhadores6) {
            this.ganhadores6 = ganhadores6;
            return this;
        }

        public MegaSenaResponseBuilder cidadeUF(String cidadeUF) {
            this.cidadeUF = cidadeUF;
            return this;
        }

        public MegaSenaResponseBuilder rateio6(double rateio6) {
            this.rateio6 = rateio6;
            return this;
        }

        public MegaSenaResponseBuilder ganhadores5(int ganhadores5) {
            this.ganhadores5 = ganhadores5;
            return this;
        }

        public MegaSenaResponseBuilder rateio5(double rateio5) {
            this.rateio5 = rateio5;
            return this;
        }

        public MegaSenaResponseBuilder ganhadores4(int ganhadores4) {
            this.ganhadores4 = ganhadores4;
            return this;
        }

        public MegaSenaResponseBuilder rateio4(double rateio4) {
            this.rateio4 = rateio4;
            return this;
        }

        public MegaSenaResponseBuilder acumulado6(double acumulado6) {
            this.acumulado6 = acumulado6;
            return this;
        }

        public MegaSenaResponseBuilder arrecadacaoTotal(double arrecadacaoTotal) {
            this.arrecadacaoTotal = arrecadacaoTotal;
            return this;
        }

        public MegaSenaResponseBuilder estimativaPremio(double estimativaPremio) {
            this.estimativaPremio = estimativaPremio;
            return this;
        }

        public MegaSenaResponseBuilder acumuladoEspecial(double acumuladoEspecial) {
            this.acumuladoEspecial = acumuladoEspecial;
            return this;
        }

        public MegaSenaResponseBuilder observacao(String observacao) {
            this.observacao = observacao;
            return this;
        }

        public MegaSenaResponse build() {
            return new MegaSenaResponse(
                    id,
                    concurso,
                    dataSorteio,
                    bola1,
                    bola2,
                    bola3,
                    bola4,
                    bola5,
                    bola6,
                    ganhadores6,
                    cidadeUF,
                    rateio6,
                    ganhadores5,
                    rateio5,
                    ganhadores4,
                    rateio4,
                    acumulado6,
                    arrecadacaoTotal,
                    estimativaPremio,
                    acumuladoEspecial,
                    observacao
            );
        }

        public String toString() {
            return "MegaSenaResponse.MegaSenaResponseBuilder(id="
                    + this.id + ", concurso=" + this.concurso + ", dataSorteio=" + this.dataSorteio + ", bola1="
                    + this.bola1 + ", bola2=" + this.bola2 + ", bola3=" + this.bola3 + ", bola4=" + this.bola4
                    + ", bola5=" + this.bola5 + ", bola6=" + this.bola6 + ", ganhadores6=" + this.ganhadores6
                    + ", cidadeUF=" + this.cidadeUF + ", rateio6=" + this.rateio6 + ", ganhadores5="
                    + this.ganhadores5 + ", rateio5=" + this.rateio5 + ", ganhadores4=" + this.ganhadores4
                    + ", rateio4=" + this.rateio4 + ", acumulado6=" + this.acumulado6 + ", arrecadacaoTotal="
                    + this.arrecadacaoTotal + ", estimativaPremio=" + this.estimativaPremio + ", acumuladoEspecial="
                    + this.acumuladoEspecial + ", observacao=" + this.observacao + ")";
        }
    }

    public static MegaSenaResponse fromDomain(MegaSena megaSena) {
        return MegaSenaResponseBuilder.builder()
                .id(megaSena.id())
                .concurso(megaSena.concurso())
                .dataSorteio(megaSena.dataSorteio())
                .bola1(megaSena.bola1())
                .bola2(megaSena.bola2())
                .bola3(megaSena.bola3())
                .bola4(megaSena.bola4())
                .bola5(megaSena.bola5())
                .bola6(megaSena.bola6())
                .ganhadores6(megaSena.ganhadores6())
                .cidadeUF(megaSena.cidadeUF())
                .rateio6(megaSena.rateio6())
                .ganhadores5(megaSena.ganhadores5())
                .rateio5(megaSena.rateio5())
                .ganhadores4(megaSena.ganhadores4())
                .rateio4(megaSena.rateio4())
                .acumulado6(megaSena.acumulado6())
                .arrecadacaoTotal(megaSena.arrecadacaoTotal())
                .estimativaPremio(megaSena.estimativaPremio())
                .acumuladoEspecial(megaSena.acumuladoEspecial())
                .observacao(megaSena.observacao())
                .build();
    }
}
