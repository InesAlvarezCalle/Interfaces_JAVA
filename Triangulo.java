public class Triangulo implements iFigura2D{
    private double base, altura;

    @Override
    public double perimetro(){
        double h;
        h = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return base + altura + h;
    }

    @Override
    public double area(){
        return 2 / (base * altura);
    }

    @Override
    public void escalar(double escala){
        base += altura;
        altura *= base;
    }
}
