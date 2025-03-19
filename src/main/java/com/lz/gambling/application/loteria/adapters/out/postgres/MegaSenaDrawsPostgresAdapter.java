package com.lz.gambling.application.loteria.adapters.out.postgres;

import com.lz.gambling.application.loteria.adapters.out.postgres.entities.MegaSenaDrawsEntity;
import com.lz.gambling.application.loteria.adapters.out.postgres.repositories.MegaSenaJPARepository;
import com.lz.gambling.domain.loteriascaixa.model.MegaSena;
import com.lz.gambling.domain.loteriascaixa.port.MegaSenaDrawsPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MegaSenaDrawsPostgresAdapter implements MegaSenaDrawsPort {

    private MegaSenaJPARepository megaSenaJPARepository;

    @Autowired
    public MegaSenaDrawsPostgresAdapter(final MegaSenaJPARepository megaSenaJPARepository) {
        this.megaSenaJPARepository = megaSenaJPARepository;
    }

    @Override
    public MegaSena save(final MegaSena megaSena) {
        return megaSenaJPARepository.save(MegaSenaDrawsEntity.fromDomain(megaSena)).toDomain();
    }

    @Override
    public List<MegaSena> saveAll(List<MegaSena> listMegaSenaDraws) {

         List<MegaSenaDrawsEntity> megaSenaDrawsEntity = megaSenaJPARepository
                 .saveAll(MegaSenaDrawsEntity.fromDomain(listMegaSenaDraws));

         return MegaSena.toDomain(megaSenaDrawsEntity);
    }

    @Override
    public List<MegaSena> list() {
        return MegaSena.toDomain(megaSenaJPARepository.findAll());
    }

    @Override
    public MegaSena find(final Long id) {
        return null;
    }

    @Override
    public MegaSena update(final MegaSena megasena) {
        return null;
    }

    @Override
    public MegaSena delete(final Long id) {
        return null;
    }
}
