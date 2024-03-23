import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDoubleEstadistica implements Estadisticas{
    ArrayList <Double> doubles;

    public ArrayListDoubleEstadistica(ArrayList<Double> doubles) {
        this.doubles = doubles;
    }
    public ArrayListDoubleEstadistica(){
        doubles = new ArrayList<>();
    }

    @Override
    public double minimo() {
        return Collections.min(doubles);
    }
    @Override
    public double maximo() {
        return Collections.max(doubles);
    }
    @Override
    public double media() {
        return (suma()/cuantos());
    }
    @Override
    public double suma() {
        double sum = 0;
        for(int i = 0; i < doubles.size();i++){
            sum += doubles.get(i);
        };
        return sum;
    }
    @Override
    public int cuantos() {
        return doubles.size();
    }
}
