package br.com.catolica.veiculo.Model;

public abstract class Automovel {
    protected String marca;
    protected String modelo;
    protected boolean estaLigado;

    public Automovel(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void ligarMotor() {
        if (this.estaLigado) {
            System.out.println("Veículo já está ligado.");
        }
        else {
            this.estaLigado = true;
            System.out.println("Ligando veículo.");
        }
    }

    @Override
    public String toString() {
        return String.format("<Automovel: marca=%s, modelo=%s, estaLigado=%b>", this.marca, this.modelo, this.estaLigado);
    }
}
