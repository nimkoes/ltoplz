package me.nimkoes.ltoplz.adapter.out;

import me.nimkoes.ltoplz.adapter.out.persistence.repository.DrwMasterIRepository;
import me.nimkoes.ltoplz.application.port.out.CreateLtoPort;

public class CreateLtoAdapter implements CreateLtoPort {

    private final LottoQueryClient lottoQueryClient;
    private final DrwMasterIRepository drwMasterIRepository;

    public getLottoNumber() {
        this.lottoQueryClient.getLottoNumber();
    }

    public saveDrwMaster() {
        this.drwMasterIRepository.save();
    }
}
