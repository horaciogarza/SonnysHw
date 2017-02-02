/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviesmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author horaciogarza
 */
public class MoviesManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lec = new Scanner(System.in);
        
         System.out.print("Cuantas películas deseas agregar al Sistema? ");
         
         int veces = lec.nextInt();
         List<Pelicula> peliculas = new ArrayList<Pelicula>();
         
         
         for (int i = 0; i < veces; i++) {
            Pelicula pel = new Pelicula();
            lec.nextLine();
             System.out.println("Nombre: ");
             String Nombre = lec.nextLine();
             pel.setNombre(Nombre);
             
             System.out.println("Cantidad a pagar por renta: ");
             pel.setCantidadAPagarPorRenta(lec.nextDouble());
             
             System.out.println("Dias a prestar: ");
             pel.setDiasAPrestar(lec.nextInt());
             
             System.out.println("Esta Disponible: \n1. SI 2. NO ");
             pel.setEstaDisponible((lec.nextInt() == 1 ? true : false));
             
             System.out.println("Ano de Produccion: ");
             pel.setAnoDeProduccion(lec.nextInt());
             
             
             System.out.println("Genero: \n1. Accion\n2. Fantasia\n3. Drama\n4. Comedia\n5. Aventura \n\n");
             
             int type = lec.nextInt();
             
             switch(type){
                 case 1:
                     pel.setGeneroDePelicula(Genero.ACCION);
                     break;
                     
                     case 2:
                     pel.setGeneroDePelicula(Genero.FANTASIA);
                     break;
                     
                     case 3:
                     pel.setGeneroDePelicula(Genero.DRAMA);
                     break;
                     
                     case 4:
                     pel.setGeneroDePelicula(Genero.COMEDIA);
                     break;
                     
                     case 5:
                        pel.setGeneroDePelicula(Genero.AVENTURA);
                     break;
             }
             peliculas.add(pel);
            
        }
         
         
         //Juegos
         System.out.print("\n\n\n¿Cuantos juegos deseas agregar al Sistema? ");
         
         veces = lec.nextInt();
         List<Juego> juegos = new ArrayList<Juego>();
         
         
         for (int i = 0; i < veces; i++) {
            Juego game = new Juego();
            lec.nextLine();
             System.out.println("Nombre: ");
             game.setNombre(lec.nextLine());
             
             System.out.println("Cantidad a pagar por renta: ");
             game.setCantidadAPagarPorRenta(lec.nextDouble());
             
             System.out.println("Dias a prestar: ");
             game.setDiasAPrestar(lec.nextInt());
             
             System.out.println("Esta Disponible: \n1. SI 2. NO ");
             game.setEstaDisponible((lec.nextInt() == 1 ? true : false));
             
             
             
             
             System.out.println("Estilo: \n1. Accion\n2. Deportes\n3. Aventuras\n\n");
             
             int type = lec.nextInt();
             
             switch(type){
                 case 1:
                     game.setEstilo(GeneroDeJuego.ACCION);
                     break;
                     
                     case 2:
                     game.setEstilo(GeneroDeJuego.DEPORTES);
                     break;
                     
                     case 3:
                     game.setEstilo(GeneroDeJuego.AVENTURAS);
                     break;
                     
             }
             
             System.out.println("Estilo: \n1. XBOX\n2. PLAYSTATION\n3. WII\n\n");
             
             type = lec.nextInt();
             
             switch(type){
                 case 1:
                     game.setPlataforma(Plataforma.XBOX );
                     break;
                     
                     case 2:
                     game.setPlataforma(Plataforma.PLAYSTATION );
                     break;
                     
                     case 3:
                     game.setPlataforma(Plataforma.WII );
                     break;
                     
             }
             juegos.add(game);
            
        }
         
         boolean flag = true;
         
         
         do{
             System.out.println("\n\nMENU\n\n"
                     + ""
                     + ""
                     + "T/t: Despliega todos los productos. Desplegar tanto peliculas como videojuegos. \n" +
"P/p: Despliega todas las peliculas.\n" +
"V/v: Despliega todos los videojuegos.\n" +
"S/s: Checar si una pelicula esta rentada. \n"+
"J/j: Checar si esta rentado algun producto “S/s”.\n" +
"C/c: Cantidad de peliculas que están rentadas.\n" +
"X/x: Cantidad de videojuegos cuya plataforma es Xbox One.\n" +
"U/u: Salir.\n");
             
             lec.nextLine();
             String opcion = lec.next();
             
             
             switch(opcion){
                 case "T":
                 case "t":
                     showMovies(peliculas);
                     showJuegos(juegos);
                     break;
                     
                 case "P":
                 case "p":
                     showMovies(peliculas);
                     break;
                     
                 case "v":
                 case "V":
                     showJuegos(juegos);
                     break;
                     
                 case "s":
                 case "S":
                     lec.nextLine();
                     String a = lec.nextLine();
                     checkAvailabilityMovie(a, peliculas);
                     break;
                     
                     case "j":
                 case "J":
                     lec.nextLine();
                     String b = lec.nextLine();
                     checkAvailabilityGame(b, juegos);
                     break;
                     
                 case "C":
                 case "c":
                     checkIfAvailable(peliculas);
                     break;
                     
                     case "X":
                 case "x":
                     checkIfXbox(juegos);
                     break;
                     
                 case "u":
                     case "U":
                         flag = false;
                         break;
             }
         }while(flag);
         
         
         
         
    }

    private static void showMovies(List<Pelicula> peliculas) {
        System.out.println("\n\nPeliculas:\n");
        
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getNombre() + "\n");
        }
    }

    private static void showJuegos(List<Juego> juegos) {
        System.out.println("\n\nJuegos:\n");
        
        for (Juego pelicula : juegos) {
            System.out.println(pelicula.getNombre() + "\n");
        }
    }

    private static void checkAvailability(String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void checkAvailabilityMovie(String a, List<Pelicula> pel) {
        for (Pelicula pelicula : pel) {
            if (pelicula.getNombre() == "a") {
                
                if (pelicula.isEstaDisponible()) {
                    System.out.println(a + " esta disponible");
                    return;
                }else{
                    System.out.println(a + " no esta disponible");
                    return;
                }
                
            }
            
            System.out.println(a + " no existe");
            
        }
   
    }
    
    private static void checkAvailabilityGame(String a, List<Juego> pel) {
        for (Juego juego : pel) {
            if (juego.getNombre() == a) {
                
                if (juego.isEstaDisponible()) {
                    System.out.println(a + " esta disponible");
                    return;
                }else{
                    System.out.println(a + " no esta disponible");
                    return;
                }
                
            }
            
            System.out.println(a + " no existe");
            
        }
   
    }

    private static void checkIfAvailable(List<Pelicula> peliculas) {
        int i = 0;
         for (Pelicula pelicula : peliculas) {
             if (!pelicula.isEstaDisponible()) {
                 i++;
             }
        }
         
         System.out.println(i + " peliculas rentadas.\n");
    }
    
    private static void checkIfXbox(List<Juego> juegos){
        System.out.println("\n\nVideojuegos de XBOX: \n");
        for (Juego juego : juegos) {
            if (juego.getPlataforma() == Plataforma.XBOX) {
                System.out.println(juego.getNombre());
            }
        }
    }
    
}
