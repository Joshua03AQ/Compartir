import java.util.ArrayList;
import java.util.Scanner;
public class App {
    
    public static Scanner sc = new Scanner(System.in);

    public static String CodProd;
    public static String name;
    public static int precio;
    private static int costo;
    public static String descripcion;

    public static Producto newProduct;
    public static ArrayList<Producto> productos = new ArrayList<Producto>();
    public static void main(String[] args) throws Exception {
        

        System.out.println("Bienvenido a la tienda de egresados");

        boolean repetir = true;

        
                        
            CodProd = "0123";
            name = "Computadora";
            precio = 1200;
            costo = 900;
            descripcion = "Lenovo";

            for (int i = 0; i < 5; i++) {
                newProduct = new Producto(null, null, i, i, null);
                productos.add(newProduct);
            }

            for (Producto producto : productos) {
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
            }


            do {
                try {
                    System.out.println("Que accion desea realizar");
                    System.out.println("1. Mostrar catalogo");
                    System.out.println("2. Ingresar");
                    System.out.println("3. Eliminar");
                    System.out.println("4. Buscar");
                    System.out.println("5. Modificar");
                    System.out.println("0. Salir");
    
                int respuesta = 0;
                respuesta = sc.nextInt();
    
                switch (respuesta) {
                    case 1:
                         
                        break;
                    case 2:
                        ;
                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:
                        
                        break;
                    case 6:
                        repetir = false;
                        break;
                
                    default:
                        break;
                }
                } catch (Exception e) {
                    System.out.println(e);
                    sc.nextLine();
                }
    
            } while (repetir);
        

    }

    
}
