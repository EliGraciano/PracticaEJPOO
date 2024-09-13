package TP1.Billetera;

import java.util.ArrayList;

public class App {
    ArrayList<Moneda> monedas;// como solo hay 2 monedas,es medio troll jasjjas
    ArrayList<Billetera> billeteras;

    public App() {
        this.monedas = new ArrayList<>();
        this.billeteras = new ArrayList<>();
    }

    public void addWallet(String DNI, String nombreMoneda, double montocomienzo){
        Moneda monedaEsta =this.searchMoneda(nombreMoneda);
        if (monedaEsta != null) {
            Billetera newBilletera = new Billetera(DNI, monedaEsta,montocomienzo);
            this.billeteras.add(newBilletera);
        }
    }

    public void addMoneda(String nombremoneda,double cotizacion){
        Moneda nueva_moneda = new Moneda(nombremoneda, cotizacion);
        this.monedas.add(nueva_moneda);
    }

    public void transferirDinero(String DNI_destino,String DNI_salida,double monto,String nombreMoneda){
        Billetera bille_destino = searchBilletera(DNI_destino);
        Billetera bille_salida = searchBilletera(DNI_salida);
        Moneda monedaEncontrada = searchMoneda(nombreMoneda);
        if (monedaEncontrada != null && bille_destino != null && bille_salida != null){
            Dinero dinero_transferir = new Dinero(monto,monedaEncontrada);
            if (bille_salida.aceptTrans(dinero_transferir)) {
                bille_salida.debitarDinero(dinero_transferir);
                bille_destino.acreditarDinero(dinero_transferir);
            }
        }
    }

    private Moneda searchMoneda(String nombremoneda){
        for (Moneda moneda : monedas){
            if (moneda.getNombre().equals(nombremoneda)){
                return moneda;
            }
        }
        return null;
    }

    private Billetera searchBilletera(String DNI_buscar){
        for (Billetera billeActual : this.billeteras){
            if (billeActual.getDNI_usuario().equals(DNI_buscar)){
                return billeActual;
            }
        }
        return null;
    }

    public String Mostrarbilleteras(){
        StringBuilder stringresult = new StringBuilder();
        for (Billetera bille : this.billeteras){
            stringresult.append(bille.getDNI_usuario());
            stringresult.append('\n');
        }
        return stringresult.toString();
    }

    public double ConsultarSaldo(String DNI){
        double result = 0;
        for (Billetera bille : this.billeteras){
            if (bille.getDNI_usuario().equals(DNI)) {
                result+= bille.getSaldo().getMonto();
            }
        }
        return result;
    }


}
