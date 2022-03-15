import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public  static void main(String[] args){
        //Ingredientes
        Ingrediente sal = new Ingrediente("Sal", true, 200);
        Ingrediente jitomate = new Ingrediente("Jitomate", false, 250);
        Ingrediente pasta = new Ingrediente("Pasta", false, 1000);
        Ingrediente agua = new Ingrediente("Agua", false, 1000);

        ArrayList<Ingrediente> ingredientesDisponibles = new ArrayList<>(Arrays.asList(
                sal, jitomate, agua ));

        Receta salsa = new Receta(
                "Salsa",
                new ArrayList<>(Arrays.asList(sal, jitomate, agua)),
                new ArrayList<>(Arrays.asList("Lavar los Ingredientes",
                        "cocer el jitomate",
                        "Moler el jitomate con chile y ajo y cebolla")
                        ),
                15.50f
        );
    }
}
