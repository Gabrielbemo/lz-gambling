package com.lz.gambling.domain.loteriascaixa.port;

import com.lz.gambling.application.loteria.adapters.out.postgres.entities.MegaSenaDrawsUpdateHistoryEntity;
import com.lz.gambling.domain.loteriascaixa.model.MegaSenaDrawsUpdateHistory;

public interface MegaSenaDrawsUpdateHistorPort {
    MegaSenaDrawsUpdateHistory execute(MegaSenaDrawsUpdateHistoryEntity megaSenaDrawsUpdateHistoryEntity);
}
