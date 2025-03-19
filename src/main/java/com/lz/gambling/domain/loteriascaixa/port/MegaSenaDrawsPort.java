package com.lz.gambling.domain.loteriascaixa.port;

import com.lz.gambling.domain.loteriascaixa.model.MegaSena;

import java.util.List;

public interface MegaSenaDrawsPort {

    MegaSena save(final MegaSena megaSenaDraws);
    List<MegaSena> saveAll(List<MegaSena> listMegaSenaDraws);
    List<MegaSena> list();
    MegaSena find(final Long id);
    MegaSena update(final MegaSena megasena);
    MegaSena delete(final Long id);
}
