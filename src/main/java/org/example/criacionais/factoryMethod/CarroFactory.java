package org.example.criacionais.factoryMethod;

public class CarroFactory extends VeiculoFactory {
    @Override
    public Veiculo criarVeiculo() {
        return new Carro();
    }
}