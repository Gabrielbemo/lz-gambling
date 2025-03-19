package com.lz.gambling.domain.loteriascaixa.usecase;

import com.lz.gambling.domain.loteriascaixa.model.MegaSenaDrawsUpdateHistory;
import org.springframework.web.multipart.MultipartFile;

public interface ImportAllMegaSenaDraws {
    MegaSenaDrawsUpdateHistory execute(MultipartFile file);
}
