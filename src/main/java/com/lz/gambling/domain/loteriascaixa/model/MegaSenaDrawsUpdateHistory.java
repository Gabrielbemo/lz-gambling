package com.lz.gambling.domain.loteriascaixa.model;

import com.lz.gambling.application.loteria.adapters.out.postgres.entities.MegaSenaDrawsUpdateHistoryEntity;

import java.time.LocalDateTime;

public class MegaSenaDrawsUpdateHistory {
    private Long id;
    private String method;
    private LocalDateTime createAt;
    private String fileName;

    // Getter and Setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for method
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    // Getter and Setter for createAt
    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    // Getter and Setter for fileName
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public static MegaSenaDrawsUpdateHistory fromEntity(MegaSenaDrawsUpdateHistoryEntity entity) {
        if (entity == null) {
            return null;
        }
        MegaSenaDrawsUpdateHistory history = new MegaSenaDrawsUpdateHistory();
        history.setId(entity.getId());
        history.setMethod(entity.getMethod());
        history.setCreateAt(entity.getCreateAt());
        history.setFileName(entity.getFileName());
        return history;
    }
}
