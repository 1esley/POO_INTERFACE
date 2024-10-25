package br.com.catolica.veiculo.Model;

import br.com.catolica.veiculo.Contrato.IComportamento;

public class Moto extends Automovel implements IComportamento{
    private boolean fazRamDamDam;

    public Moto(String marca, String modelo, boolean fazRamDamDam) {
        super(marca, modelo);
        this.fazRamDamDam = fazRamDamDam;
    }

    @Override
    public void acelerar(int velocidade) {
        if (this.estaLigado) {
            System.out.printf("Acelerando a %d km/h.\n", velocidade);
            if (this.fazRamDamDam && velocidade > 100) {
                System.out.println("RAAAAAM DAAAAM DAAAM PÁ");
            }
        } else {
            System.out.println("Não foi possível acelerar, a moto está delsigada.");
        }
    }

    @Override
    public void frear() {
        System.out.println("Freando.");
    }
}
