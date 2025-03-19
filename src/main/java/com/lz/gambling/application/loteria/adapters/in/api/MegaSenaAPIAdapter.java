package com.lz.gambling.application.loteria.adapters.in.api;

import com.lz.gambling.application.loteria.adapters.in.api.dtos.request.MegaSenaRequest;
import com.lz.gambling.application.loteria.adapters.in.api.dtos.response.MegaSenaResponse;
import com.lz.gambling.domain.loteriascaixa.model.MegaSenaDrawsUpdateHistory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public interface MegaSenaAPIAdapter {

    ResponseEntity<MegaSenaResponse> createMegaSenaDraws(@RequestParam final MegaSenaRequest megaSena);

    @PostMapping(path = "/update-all-draws", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    ResponseEntity<MegaSenaDrawsUpdateHistory> importAllMegaSenaDraws
            (@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes);
}
