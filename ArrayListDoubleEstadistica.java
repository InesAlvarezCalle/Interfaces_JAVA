import  java.util.ArrayList;

public class ArrayListDoubleEstadistica implements Estadisticas{
    private ArrayList<Double> datos;

    public ArrayListDoubleEstadistica(){
        this.datos = new ArrayList<>();
    }

    public void agregar(double valor){
        datos.add(valor);
    }

    @Override
    public double minimo(){
        double min = datos.get(0);

        for (double num : datos){
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    @Override
    public double maximo(){
        double max = datos.get(0);

        for (double num : datos){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

     @Override
    public double media(){
        return suma() / cuantos();
    }

    @Override
    public double suma(){
        double sum = 0;
        for (double num : datos){
            sum += num;
        }
        return sum;
    }

    @Override
    public double resta(){
        double res = datos.get(0);
        for (int i = 1; i < datos.size(); i++) {
            res -= datos.get(i);
        }
        return res;
    }

    @Override
    public int cuantos(){
        return datos.size();
    }
}
