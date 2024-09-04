package Billetera;

import java.util.ArrayList;

public class Billetera {
    private  Usuario  user;
    private Dinero saldo;

    public Billetera(String nombre,String apellido,int DNI,String nombreMoneda){
        Usuario newUser = new Usuario(nombre,apellido,DNI);
        this.user = user;
        Moneda monedaCuenta = new Moneda(nombreMoneda,);
        Dinero newMonto = new Dinero(0,monedaCuenta);
        this.saldo = newMonto;
    }

    public Dinero getSaldo() {
        return saldo;
    }
}
