
import java.util.Scanner;
public class Cola {

    // Realizar un programa que contenga Colas y nodos, y dentro de eso, el programa muestre las horas trabajadas de un empleado, el nombre, el numero de cedula y el sueldo que obtenga el trabajador
    // En el siguiente programa se insertan 2 nodos, para un total de 2 trabajadores
    Nodo a;
    Nodo b;
    Scanner teclado = new Scanner(System.in);

    public Cola(){
        a=null;
        b=null;
    }
    // Nombre,apellido, C.C, Horas trabajadas,sueldo
    public void insertarNodo(){
        final Nodo nuevo= new Nodo();
        System.out.print("Ingrese el nombre del trabajador ");
        nuevo.nomb=teclado.next();
        System.out.println();
        System.out.print("Ingrese el apellido del trabajador: ");
        nuevo.apellido=teclado.next();
        System.out.println();
        System.out.print("Ingrese la cedula del trabajador: ");
        nuevo.ced=teclado.nextInt();
        System.out.println();
        System.out.print("Ingrese las horas trabajadas: ");
        nuevo.horasTrabajadas=teclado.nextInt();
        System.out.println();
        System.out.print("Ingrese el sueldo del trabajador: ");
        nuevo.sueldo=teclado.nextInt();
        System.out.println();
       if(a == null){

            a=nuevo;
            a.siguiente=null;
            b=nuevo;
        } else{
            b.siguiente=nuevo;
            nuevo.siguiente=null;
            b=nuevo;
        }
        System.out.println("Nodo ingresado con exito");
    }
    public void buscarNodo(){
        Nodo c = new Nodo();
        c = a;
        boolean encontrado = false;
        System.out.print("Ingrese la cedula a buscar: ");
        final int nodoBuscado = teclado.nextInt();
        if (a != null) {
            while (c != null && encontrado != true) {
                if (c.ced == nodoBuscado) {
                    System.out.println("\n Nodo con las horas trabajadas(" + c.ced + ") \n");
                    encontrado = true;

                }
                c=c.siguiente;
            }
            if(!encontrado){
                System.out.println("\n Nodo no encontrado \n");
            }
        }else{
            System.out.println("\n La cola se encuentra vacia \n");

        }
            
        }
    
    public void desplegarCola(){
        Nodo c=new Nodo();
        c=a;
        if(a !=null){       
            while(c.siguiente !=null){
                System.out.println(c.nomb+"\n"+c.apellido+"\n"+c.ced+"\n"+c.horasTrabajadas+"\n"+c.sueldo);
                c=c.siguiente;
            }
        } else{
            System.out.println("La cola se encuentra vacia");
        }

    }
}
