package Ex41;

import Ex33.ContaBancaria;

public abstract class ContaPoupanca extends ContaBancaria {

    double rendimentomensal = 10/100;

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }

    @Override
    public void depositar() {
        super.depositar();
    }

    @Override
    public void sacar() {
        super.sacar();
    }
}
