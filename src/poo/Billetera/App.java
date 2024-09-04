package Billetera;

import java.util.ArrayList;

public class App {
    //String[] monedas;// como solo hay 2 monedas,es medio troll jasjjas
    ArrayList<Billetera> billeteras;

    public App() {
        //this.monedas = new String[]{"Peso", "Dolar"};
        this.billeteras = new ArrayList<Billetera>();
    }

    public boolean addWallet(String nombre,String apellido,int DNI,String nombreMoneda){
        Billetera = new Billetera(nombre,apellido,DNI,nombreMoneda);

    }

//    public boolean addMoneda(){
//
//
//    }
}
