package TP1.ContraseniaEJ8;

import java.util.ArrayList;

public class mainContra {
    public static void main(String[] args) {
        ArrayList<Contrasenia> contrasenias = new ArrayList<>();
        Contrasenia newContrasenia = new Contrasenia(8);
        Contrasenia newContrasenia2 = new Contrasenia(9);
        contrasenias.add(newContrasenia);
        contrasenias.add(newContrasenia2);
        System.out.print("la contraseña es: "+ contrasenias.get(0).getContrasenia() );
        System.out.println(newContrasenia.contraIsSecurity() ? "(segura)" : "(Insegura)");
        System.out.print("la contraseña es: "+ contrasenias.get(1).getContrasenia() );
        System.out.println(newContrasenia2.contraIsSecurity() ? "(segura)" : "(Insegura)");
    }
}
