package me.nimkoes.ltoplz.application.serivce;

import me.nimkoes.ltoplz.application.port.in.CreateLtoUseCase;
import me.nimkoes.ltoplz.application.port.out.CreateLtoPort;

public class CreateLtoService implements CreateLtoUseCase {
    private final CreateLtoPort port;

    void create() {
        port.get();
        port.save();
    }
}
