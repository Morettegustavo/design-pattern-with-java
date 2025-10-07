package org.example.criacionais.factoryMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Moto implements Veiculo {
    private static final Logger logger = LoggerFactory.getLogger(Carro.class);

    @Override
    public void dirigir() {
        logger.info("Pilotando uma moto 🏍️");
    }
}