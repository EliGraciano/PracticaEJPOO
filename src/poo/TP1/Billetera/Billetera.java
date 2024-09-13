package TP1.Billetera;

public class Billetera {
    private final String DNI_usuario;
    private Dinero saldo;

    public Billetera(String DNI,Moneda moneda,double dineroComienzo){
        this.DNI_usuario = DNI;
        Dinero newMonto = new Dinero(dineroComienzo,moneda);
        this.saldo = newMonto;
    }

    public Dinero getSaldo() {
        return saldo;
    }

    public String getDNI_usuario() {
        return DNI_usuario;
    }

    public void debitarDinero(Dinero dineroDebitar ){
        Dinero dineroconvertido = Conversor.convertir(dineroDebitar,this.saldo.getMoneda());
        double nuevosaldo = this.saldo.getMonto() - dineroconvertido.getMonto();
        this.saldo = new Dinero(nuevosaldo,this.saldo.getMoneda());
    }

    public void acreditarDinero(Dinero dineroAcreditar){
        Dinero dineroconvertido = Conversor.convertir(dineroAcreditar,this.saldo.getMoneda());
        double nuevosaldo = this.saldo.getMonto() + dineroconvertido.getMonto();
        this.saldo = new Dinero(nuevosaldo,this.saldo.getMoneda());
    }

    public boolean aceptTrans(Dinero dineroDebitar){
        if (this.saldo.getMoneda().equals(dineroDebitar.getMoneda())){
            return dineroDebitar.getMonto() <= this.saldo.getMonto();
        }
        Conversor.convertir(dineroDebitar,this.saldo.getMoneda());
        return dineroDebitar.getMonto() <= this.saldo.getMonto();
    }
}
