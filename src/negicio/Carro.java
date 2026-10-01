package negicio;

public class Carro {
    public int potencia;
     public double velocida;

    public void acelerar(){
        velocida += potencia;
    }

    void frenar(){
        velocida /= 2;
    }
}
