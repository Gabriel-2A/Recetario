public class Ingrediente {
    private String nombre;
    private boolean esSalado;
    private double peso;

    public Ingrediente(String nombre, boolean esSalado, double peso) {
        this.nombre = nombre;
        this.esSalado = esSalado;
        this.peso = peso;
        System.out.println("Ingrediente creado");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsSalado() {
        return esSalado;
    }

    public void setEsSalado(boolean esSalado) {
        this.esSalado = esSalado;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


}
