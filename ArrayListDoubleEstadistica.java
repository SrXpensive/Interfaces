import java.util.ArrayList;
//import java.util.Collections;

public class ArrayListDoubleEstadistica implements Estadisticas{
    //He modificat la privacitat de l'atribut doubles (abans el tenía públic)
    private ArrayList <Double> doubles;

    public ArrayListDoubleEstadistica(ArrayList<Double> doubles) {
        this.doubles = doubles;
    }
    public ArrayListDoubleEstadistica(){
        doubles = new ArrayList<>();
    }

    /*
    He canviat els mètodes que feien us de la llibrería Collections
    @Override
    public double minimo() {
        return Collections.min(doubles);
    }*/
    @Override
    public double minimo(){
        double min = doubles.get(0);
        for(int i = 0; i < doubles.size(); i++){
            if(doubles.get(i)<min){
                min = doubles.get(i);
            }
        }
        return min;
    }
    /*
    He canviat els mètodes que feien us de la llibrería Collections
    @Override
    public double maximo() {
        return Collections.max(doubles);
    }*/
    @Override
    public double maximo(){
        double max = doubles.getFirst();
        for(int i = 0 ; i < doubles.size(); i++){
            if (doubles.get(i)> max){
                max = doubles.get(i);
            }
        }
        return max;
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
        }
        return sum;
    }
    @Override
    public int cuantos() {
        return doubles.size();
    }

    //He afegit un mètode per afegir números al arraylist, per tal de que no s'haja d'accedir directament a l'atribut
    public void add(double num){
        doubles.add(num);
    }

}
