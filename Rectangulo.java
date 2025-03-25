public class Rectangulo implements iFigura2D{
    private int lado1, lado2;

    public double perimetro(){
        return 2 * (lado1 + lado2);
    }

    public double area(){
        return lado1 * lado2;
    }

    public void escalar(double escala){
        lado1 = (int) (lado1 * escala);
        lado2 = (int) (lado2 * escala);
    }
}
