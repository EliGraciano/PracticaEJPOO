package Billetera;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    public App newapp;
    @BeforeEach
    void setUp(){
        this.newapp = new App();
        newapp.addMoneda("Peso",0.001);
        newapp.addMoneda("Dolar",1);
        newapp.addWallet("46186146","Dolar",1400.50);
        newapp.addWallet("46186020","Peso",140000.50);
    }
    @Test
    void agregarBilleteraApp(){
        String billeteras = newapp.Mostrarbilleteras();
        assertEquals("46186146\n" + "46186020\n",billeteras);
    }

    @Test
    void realizarTransferencia(){
        newapp.transferirDinero("46186020","46186146",50.00,"Dolar");

    }

}