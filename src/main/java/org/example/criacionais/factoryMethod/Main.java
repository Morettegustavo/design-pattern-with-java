package org.example.criacionais.factoryMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Iniciando teste do Factory Method...");
        VeiculoFactory fabricaCarro = new CarroFactory();
        VeiculoFactory fabricaMoto = new MotoFactory();

        fabricaCarro.testarVeiculo();
        fabricaMoto.testarVeiculo();
        logger.info("Teste finalizado com sucesso ✅");
    }
}