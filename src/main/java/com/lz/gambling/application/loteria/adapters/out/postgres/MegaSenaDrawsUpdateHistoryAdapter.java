package com.lz.gambling.application.loteria.adapters.out.postgres;

import com.lz.gambling.application.loteria.adapters.out.postgres.entities.MegaSenaDrawsUpdateHistoryEntity;
import com.lz.gambling.application.loteria.adapters.out.postgres.repositories.MegaSenaDrawsUpdateHistorJPARepository;
import com.lz.gambling.domain.loteriascaixa.model.MegaSenaDrawsUpdateHistory;
import com.lz.gambling.domain.loteriascaixa.port.MegaSenaDrawsUpdateHistorPort;
import org.springframework.stereotype.Service;

@Service
public class MegaSenaDrawsUpdateHistoryAdapter implements MegaSenaDrawsUpdateHistorPort {

    private final MegaSenaDrawsUpdateHistorJPARepository megaSenaDrawsUpdateHistorJPARepository;

    public MegaSenaDrawsUpdateHistoryAdapter(MegaSenaDrawsUpdateHistorJPARepository megaSenaDrawsUpdateHistorJPARepository) {
        this.megaSenaDrawsUpdateHistorJPARepository = megaSenaDrawsUpdateHistorJPARepository;
    }

    @Override
    public MegaSenaDrawsUpdateHistory execute(MegaSenaDrawsUpdateHistoryEntity entity) {
        return MegaSenaDrawsUpdateHistory.fromEntity(megaSenaDrawsUpdateHistorJPARepository.save(entity));
    }
}
