package io.github.fabiozezo.arquiteturaspring.montadora;

import io.github.fabiozezo.arquiteturaspring.montadora.enuns.Montadora;

import java.awt.*;

public class HondaHRV extends Carro{
    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HRV");
        setCor(Color.BLACK);
        setMontadora(Montadora.HONDA);
    }
}
