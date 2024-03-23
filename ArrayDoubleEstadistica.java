public class ArrayDoubleEstadistica implements Estadisticas{
    int tope;
    double [] array;
    int cuantos;

    public ArrayDoubleEstadistica(int tope, double[] array, int cuantos) {
        this.tope = tope;
        this.array = array;
        this.cuantos = cuantos;
    }
    public ArrayDoubleEstadistica(){
        array = new double[tope];
    }

    @Override
    public double minimo() {
        double min= array[0];
        for(int i = 0; i<array.length;i++){
            if (min > array[i]){
                min = array [i];
            }
        }
        return min;
    }
    @Override
    public double maximo() {
        double max= array[0];
        for(int i = 0; i<array.length;i++){
            if (max < array[i]){
                max = array [i];
            }
        }
        return max;
    }
    @Override
    public double media() {
        return suma()/cuantos();
    }

    @Override
    public double suma() {
        double sum = 0;
        for(int i = 0; i<array.length;i++){
            sum += array[i];
        }
        return sum;
    }

    @Override
    public int cuantos() {
        int count=0;
        for(int i = 0; array[i]!=0;i++){
            count++;
        }
        return count;
    }
}
