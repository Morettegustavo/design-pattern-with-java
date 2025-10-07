package org.example.criacionais.factoryMethod;

public abstract class VeiculoFactory {
    public abstract Veiculo criarVeiculo();

    public void testarVeiculo() {
        Veiculo v = criarVeiculo();
        v.dirigir();
    }
}