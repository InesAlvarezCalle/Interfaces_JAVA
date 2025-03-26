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
        if(!datos.isEmpty()){
            double min = datos.get(0);
            for (double num : datos){
                if(num < min){
                    min = num;
                }
            }
            return min;
        }else{
            return 9999;
        }
    }

    @Override
    public double maximo(){
        if (!datos.isEmpty()){
            double max = datos.get(0);

            for (double num : datos){
                if(num > max){
                    max = num;
                }
            }
            return max;
        } else {
            return 0;
        }
    }

     @Override
    public double media(){
        return suma() / cuantos();
    }

    @Override
    public double suma(){
        if(!datos.isEmpty()){
            double sum = 0;
            for (double num : datos){
                sum += num;
            }
            return sum;
        } else {
            return 0;
        }
    }

    @Override
    public double resta(){
        if (!datos.isEmpty()){
            double res = datos.get(0);
            for (int i = 1; i < datos.size(); i++) {
                res -= datos.get(i);
            }
            return res;
        } else {
            return 0;
        }
    }

    @Override
    public int cuantos(){
        if(!datos.isEmpty()){
            return datos.size();
        } else {
            return 0;
        }
    }
}
