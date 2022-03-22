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

        int respuesta;
        do {

            System.out.println("\nBienvenido, digite el numero de la operacion que desea hacer: " +
                    "\n1.- agregar un ingrediente nuevo " +
                    "\n2.- Agregrar una receta nueva " +
                    "\n3.- Ver mi recetario" +
                    "\n4.- Eliminar Ingredientes" +
                    "\n5.- Eliminar Receta" +
                    "\n0.- Salir");
            Scanner in = new Scanner(System.in);
            respuesta = in.nextInt();

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
                in.nextLine();
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
                int respu;
                do {
                    respu = in.nextInt();
                    if(respu !=0){
                    ingredientesReceta.add(ingredientesDisponibles.get(respu-1));}
                }while(respu !=0);
                nuevaReceta.setIngredientes(ingredientesReceta);

                ArrayList<String> pasosReceta = new ArrayList<>();
                System.out.println("Digite los pasos de uno en uno " +
                        "\nSi ya no quiere agregar mas pasos digite 0");
                String res = "";
                do {
                    res = in.nextLine();
                    if(!res.equals("0")){
                        pasosReceta.add(res);}
                }while(!res.equals("0"));
                    nuevaReceta.setPasos(pasosReceta);
                    juan.getRecetas().add(nuevaReceta);
                break;

            case 3:
                juan.mostrarRecetario();
                break;

            case 4:
                System.out.println("Ingredientes disponibles: ");
                for (int i = 0; i < ingredientesDisponibles.size(); i++) {
                    System.out.println((i+1) + ".- " + ingredientesDisponibles.get(i));
                }

                System.out.println("Que ingredientes desea retirar?\n" +
                        "Presione 0 si ya no quiere retirar mas ingredientes\n");
                int retirar;
                do {
                    if(ingredientesDisponibles.size() == 0){
                        System.out.println("Ya no hay mas ingredientes.");
                        break;
                    } else {
                        retirar = in.nextInt();
                        ingredientesDisponibles.remove(retirar - 1);
                        System.out.println("Ingredente retirado");
                    }
                }while(retirar!=0);
                break;

            case 5:
                System.out.println("Recetas Disponibles: \n");
                juan.mostrarRecetas();

                System.out.println("Que recetas desea retirar?\n" +
                        "Presione 0 si ya no quiere retirar mas recetas\n");
                int retirarReceta;
                do {
                    if(ingredientesDisponibles.size() == 0){
                        System.out.println("Ya no hay mas Recetas.");
                        break;
                    } else {
                        retirarReceta = in.nextInt();
                        juan.getRecetas().remove(retirarReceta-1);
                        System.out.println("Receta retirada");
                    }
                }while(retirarReceta !=0);
                break;
        }

        }while (respuesta != 0);
    }
}
