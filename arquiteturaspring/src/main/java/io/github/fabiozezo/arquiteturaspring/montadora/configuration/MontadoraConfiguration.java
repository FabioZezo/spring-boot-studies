package io.github.fabiozezo.arquiteturaspring.montadora.configuration;

import io.github.fabiozezo.arquiteturaspring.montadora.Motor;
import io.github.fabiozezo.arquiteturaspring.montadora.enuns.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {
    @Bean(name = "motorAspirado")
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(144);
        motor.setCilindros(4);
        motor.setModelo("XYZ");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }
    @Bean(name = "motorEletrico")
    @Primary
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(90);
        motor.setCilindros(3);
        motor.setModelo("TH-10");
        motor.setLitragem(1.6);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }
    @Bean("motorTurbo")
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(190);
        motor.setCilindros(4);
        motor.setModelo("TTT");
        motor.setLitragem(2.2);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }

}
