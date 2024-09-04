package Billetera;

public class Conversor {
    private  Moneda monedaRef = //dolar hiria aca;

    public Dinero convertir(Dinero dinero,Billetera destino){
        double montoConvertido = dinero.getMoneda().getCotiz() * monedaRef.getCotiz(); //del dinero que me pasan,saco la cotizacion y multiplico por la cotizacion comun
        double montoARetornar = montoConvertido * destino.getSaldo().getMoneda().getCotiz();
        Dinero dineroConvertido = new Dinero(montoARetornar,destino.getSaldo().getMoneda());
        return dineroConvertido;
    }

}
