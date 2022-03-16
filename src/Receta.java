import java.util.ArrayList;

public class Receta {

    private String nombre;
    private ArrayList<Ingrediente> Ingredientes;
    private ArrayList<String> pasos;
    private double tiempoPreparacion;

    public Receta(String nombre, ArrayList<Ingrediente> ingredientes, ArrayList<String> pasos, double tiempoPreparacion) {
        this.nombre = nombre;
        Ingredientes = ingredientes;
        this.pasos = pasos;
        this.tiempoPreparacion = tiempoPreparacion;
       // System.out.println("Receta creada");
    }

    public Receta(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void mostrarIngredientes(){
        for(Ingrediente ingrediente : Ingredientes){
            System.out.println(ingrediente);
        }

        for(int i = 0; i < Ingredientes.size(); i++){
            System.out.println(i + " - " + Ingredientes.get(i));
        }
    }

    public void mostrarPasos(){
        for(int i = 0; i < pasos.size(); i++){
            System.out.println((i+1) + ". " + pasos.get(i));
        }
    }

    public void mostrarReceta(){
        System.out.println(nombre);
        System.out.println(tiempoPreparacion);
        mostrarIngredientes();
        mostrarPasos();
    }
}
