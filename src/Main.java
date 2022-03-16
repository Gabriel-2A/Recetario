import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public  static void main(String[] args){

        //Ingredientes
        Ingrediente sal = new Ingrediente("Sal", true, 200);
        Ingrediente jitomate = new Ingrediente("Jitomate", false, 250);
        Ingrediente pasta = new Ingrediente("Pasta", false, 1000);
        Ingrediente agua = new Ingrediente("Agua", false, 1000);

        ArrayList<Ingrediente> ingredientesDisponibles = new ArrayList<>(Arrays.asList(
                sal, jitomate, agua ));

        //recetas
        Receta salsa = new Receta(
                "Salsa",
                new ArrayList<>(Arrays.asList(sal, jitomate, agua)),
                new ArrayList<>(Arrays.asList("Lavar los Ingredientes",
                        "cocer el jitomate",
                        "Moler el jitomate con chile, ajo y cebolla y  agua")
                        ),
                15.50f
        );

        //Recetario
        Recetario juan = new Recetario(
                new ArrayList<>(Arrays.asList(salsa)),
                "Juan",
                "Recetas Juan"
        );

        /*TODO*/
        System.out.println("Inredientes disponibles: " +
                "\n1.- agregar un ingrediente nuevo " +
                "\n2.- Agregrar una receta nueva " +
                "\n3.- Ver mi recetario");
        Scanner in = new Scanner(System.in);
        int respuesta = in.nextInt();

        switch (respuesta){

            case 1:
                Ingrediente nuevoIngrediente = new Ingrediente();
                System.out.println("Digite el nombre del ingrediente: ");
                nuevoIngrediente.setNombre(in.next());
                System.out.println("Digite la cantidad: ");
                nuevoIngrediente.setPeso(in.nextDouble());
                System.out.println("¿su ingrediente es salado? \n1.- Si\t2.-No");
                if(in.nextInt() == 1){
                    nuevoIngrediente.setEsSalado(true);
                } else {
                    nuevoIngrediente.setEsSalado(false);
                }
                System.out.println("Ingrediente creado");
                ingredientesDisponibles.add(nuevoIngrediente);
                break;

            case 2:
                Receta nuevaReceta = new Receta();
                System.out.println("Digite el nombre de la receta: ");
                nuevaReceta.setNombre(in.next());
                System.out.println("Digite el tiempo de preparacion: ");
                nuevaReceta.setTiempoPreparacion(in.nextDouble());
                System.out.println("Ingredientes disponibles: ");
                for (int i = 0; i < ingredientesDisponibles.size(); i++) {
                    System.out.println((i+1) + ".- " + ingredientesDisponibles.get(i));
                }
                ArrayList<Ingrediente> ingredientesReceta = new ArrayList<>();
                System.out.println("Digite el numero del ingrediente correspondiente " +
                        "\nSi ya no quiere agregar mas ingredientes digite 0");
                do {
                    if(respuesta !=0){
                    ingredientesReceta.add(ingredientesDisponibles.get(respuesta-1));}
                }while(respuesta!=0);
                nuevaReceta.getIngredientes(ingredientesReceta);
                break;

            case 3:
                break;
        }
    }
}
