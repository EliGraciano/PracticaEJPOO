package ContraseniaEJ8;
import java.util.Random;

public class Contrasenia {
    private static final char[] caracteres = (
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
            "abcdefghijklmnopqrstuvwxyz" +
            "0123456789"
    ).toCharArray();
    private String contrasenia;
    private final int tamanioContra;
    private static final Random random = new Random();


    public Contrasenia(int tamaniocontra) {
        this.contrasenia = generateContrasenia();
        if (tamaniocontra < 8 || tamaniocontra > 12) {
            this.tamanioContra = 8;
        }else {
            this.tamanioContra = tamaniocontra;
        }
    }

    public String getContrasenia() {
        return this.contrasenia;
    }

    private static int randomGenerate(){
        return random.nextInt(62);
    }

    private  String generateContrasenia(){
        StringBuilder newContra = new StringBuilder(this.tamanioContra);
        for (int i = 0 ; i < this.tamanioContra ; i++){
            newContra.append(caracteres[randomGenerate()]);
        }
        return newContra.toString();
    }

    private boolean contraCheckSecurity(String contra){
        char[] contraArray = contra.toCharArray();
        int contMayus = 0;
        int contMinus = 0;
        int contNums = 0;
        for (char c : contraArray ) {
            if (Character.isUpperCase(c)) {
                contMayus++;
            } else if (Character.isLowerCase(c)) {
                contMinus++;
            } else if (Character.isDigit(c)) {
                contNums++;
            }
        }
        return contMayus >= 2 && contMinus >=1 && contNums >= 2;
    }

    public String contraEsSegura(String contrasenia){
        if (contraCheckSecurity(contrasenia)){
            return null;
        }
        else{
            this.contrasenia = generateContrasenia();
            return this.contrasenia;
        }
    }

}
