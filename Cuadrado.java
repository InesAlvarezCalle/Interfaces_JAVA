public class Cuadrado implements iFigura2D{
    private int lado;

    public double perimetro(){
        return lado * 4;
    }

    public double area(){
        return lado * lado;
    }

    public void escalar(double escala){
        lado = (int) (lado * escala);
    }
}
