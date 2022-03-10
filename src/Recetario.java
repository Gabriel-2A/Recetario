import java.util.ArrayList;

public class Recetario {
    private ArrayList<Receta> recetas;
    private String autor;
    private String Titulo;

    public Recetario(ArrayList<Receta> recetas, String autor, String titulo) {
        this.recetas = recetas;
        this.autor = autor;
        Titulo = titulo;
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
}
