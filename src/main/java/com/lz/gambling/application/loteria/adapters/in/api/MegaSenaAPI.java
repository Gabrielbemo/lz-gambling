package com.lz.gambling.application.loteria.adapters.in.api;

import com.lz.gambling.application.loteria.adapters.in.api.dtos.request.MegaSenaRequest;
import com.lz.gambling.application.loteria.adapters.in.api.dtos.response.MegaSenaResponse;
import com.lz.gambling.domain.loteriascaixa.model.MegaSenaDrawsUpdateHistory;
import com.lz.gambling.domain.loteriascaixa.usecase.CreateMegaSena;
import com.lz.gambling.domain.loteriascaixa.usecase.ImportAllMegaSenaDraws;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@RequestMapping("/v1/mega-sena")
public class MegaSenaAPI implements MegaSenaAPIAdapter {

    private final CreateMegaSena createMegaSenaUseCase;
    private final ImportAllMegaSenaDraws importAllMegaSenaDrawsUseCase;

    @Autowired
    public MegaSenaAPI(final CreateMegaSena createMegaSenaUseCase
            , final ImportAllMegaSenaDraws importAllMegaSenaDrawsUseCase) {
        this.createMegaSenaUseCase = createMegaSenaUseCase;
        this.importAllMegaSenaDrawsUseCase = importAllMegaSenaDrawsUseCase;
    }

    @Override
    public ResponseEntity<MegaSenaResponse> createMegaSenaDraws(final MegaSenaRequest megaSena) {
        return ResponseEntity.ok(
                MegaSenaResponse.fromDomain(createMegaSenaUseCase.execute(megaSena.toDomain())));
    }

    @Override
    public ResponseEntity<MegaSenaDrawsUpdateHistory> importAllMegaSenaDraws
            (@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
        return ResponseEntity.ok(importAllMegaSenaDrawsUseCase.execute(file));
    }
}
