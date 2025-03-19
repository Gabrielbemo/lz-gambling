package com.lz.gambling.application.loteria.adapters.out.postgres.entities;

import com.lz.gambling.domain.loteriascaixa.model.MegaSenaDrawsUpdateHistory;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity(name = "MEGASENA_DRAWS_UPDATE_HISTORY")
@Table(name =  "MEGASENA_DRAWS_UPDATE_HISTORY")
public class MegaSenaDrawsUpdateHistoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String method;
    private LocalDateTime createAt;
    private String fileName;

    public MegaSenaDrawsUpdateHistoryEntity() {
    }

    public MegaSenaDrawsUpdateHistoryEntity(Long id, String method, LocalDateTime createAt, String fileName) {
        this.id = id;
        this.method = method;
        this.createAt = createAt;
        this.fileName = fileName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public static MegaSenaDrawsUpdateHistoryEntity fromDomain(MegaSenaDrawsUpdateHistory domain) {
        if (domain == null) {
            return null;
        }
        MegaSenaDrawsUpdateHistoryEntity entity = new MegaSenaDrawsUpdateHistoryEntity();
        entity.setId(domain.getId());
        entity.setMethod(domain.getMethod());
        entity.setCreateAt(domain.getCreateAt());
        entity.setFileName(domain.getFileName());
        return entity;
    }
}
