package Ex41;

import Ex33.ContaBancaria;

public class ContaCorrente extends ContaBancaria {

    public void limiteDeSaque(){
        double limitedesaque = 100;
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }

    @Override
    public void sacar() {
        super.sacar();
    }

    @Override
    public void depositar() {
        super.depositar();
    }
}
