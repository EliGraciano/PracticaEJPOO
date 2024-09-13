package TP1.Billetera;
public class Conversor {
    public static Dinero convertir(Dinero dinero,Moneda destino){
        double montoConvertido = (dinero.getMoneda().getCotiz() / destino.getCotiz() ) * dinero.getMonto();
        return new Dinero(montoConvertido,destino);
    }
}
