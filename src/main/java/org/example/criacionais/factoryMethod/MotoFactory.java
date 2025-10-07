package org.example.criacionais.factoryMethod;

public class MotoFactory extends VeiculoFactory {
    @Override
    public Veiculo criarVeiculo() {
        return new Moto();
    }
}
