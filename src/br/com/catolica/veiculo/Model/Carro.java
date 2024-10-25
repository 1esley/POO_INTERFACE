package br.com.catolica.veiculo.Model;

import br.com.catolica.veiculo.Contrato.IComportamento;

public class Carro extends Automovel implements IComportamento{
    private int quantiPortas;

    public Carro(String marca, String modelo, int quantiPortas) {
        super(marca, modelo);
        this.quantiPortas = quantiPortas;
    }

    public int getQuantiPortas() {
        return quantiPortas;
    }

    @Override
    public void acelerar(int velocidade) {
        if (this.estaLigado) {
            System.out.printf("Acelerando a %d km/h.\n", velocidade);
            if (velocidade > 150) {
                System.out.println("CAIU UMA PORTA PQP");
                this.quantiPortas--;
            }
        } else {
            System.out.println("Não foi possível acelarar, o carro está desligado.");
        }
    }

    @Override
    public void frear() {
        System.out.println("Freando.");
    }

}
