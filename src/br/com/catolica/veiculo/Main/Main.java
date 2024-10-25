package br.com.catolica.veiculo.Main;

import br.com.catolica.veiculo.Model.Carro;
import br.com.catolica.veiculo.Model.Moto;

public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto("Honda", "CG 150", true);
        Carro carro = new Carro("Fiat", "Palio", 4);

        System.out.println(moto.getMarca());
        System.out.println(carro.getMarca());

        System.out.println(moto.getModelo());
        System.out.println(carro.getModelo());

        System.out.println(carro.getQuantiPortas());

        moto.acelerar(150);
        carro.acelerar(180);
        
        moto.ligarMotor();
        carro.ligarMotor();
        
        moto.acelerar(150);
        carro.acelerar(180);
        
        System.out.println(carro.getQuantiPortas());

        moto.frear();
        carro.frear();
    }
}
