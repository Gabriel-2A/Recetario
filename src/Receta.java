import java.util.ArrayList;

public class Receta {

    private ArrayList<Ingrediente> Ingredientes;
    private ArrayList<String> pasos;
    private double tiempoPreparacion;

    public Receta(ArrayList<Ingrediente> ingredientes, ArrayList<String> pasos, double tiempoPreparacion) {
        Ingredientes = ingredientes;
        this.pasos = pasos;
        this.tiempoPreparacion = tiempoPreparacion;
        System.out.println("Receta creada");
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        Ingredientes = ingredientes;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }

    public double getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(double tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    private void mostrarIngredientes(){
        for(Ingrediente ingrediente : Ingredientes){
            System.out.println(ingrediente);
        }

        for(int i = 0; i < Ingredientes.size(); i++){
            System.out.println(i + " - " + Ingredientes.get(i));
        }
    }
}
