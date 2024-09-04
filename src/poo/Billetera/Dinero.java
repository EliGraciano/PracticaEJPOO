package Billetera;

public class Dinero {
    private final double monto;
    private final Moneda moneda;

    public Dinero(double monto, Moneda moneda) {
        this.monto = monto;
        this.moneda = moneda;
    }

    public double getMonto() {
        return monto;
    }

    public Moneda getMoneda() {
        return moneda;
    }

}
