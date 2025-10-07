package org.example.criacionais.factoryMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Carro implements Veiculo {
    private static final Logger logger = LoggerFactory.getLogger(Carro.class);

    @Override
    public void dirigir() {
        logger.info("Dirigindo um carro 🚗");
    }
}