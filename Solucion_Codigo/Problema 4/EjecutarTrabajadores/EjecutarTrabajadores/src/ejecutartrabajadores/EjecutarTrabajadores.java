package ejecutartrabajadores;
import java.util.ArrayList;
import java.util.Scanner;
public class EjecutarTrabajadores {
    public static void main(String[] args) {
        
        String nombres, apellidos,direccion,dni;
        int opc;
        ArrayList <trabajadoresFijos> Tfj = new ArrayList <>();
        ArrayList <trabajadoresComisionistas> Tc = new ArrayList <>();
        ArrayList <trabajadoresPorhoras> Tph = new ArrayList <>();
         ArrayList<Double> s = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("INGRESO DE TRABAJADORES");
        System.out.println("-----------------------");
        
        do{
            System.out.println("Ingresar Trabajadores (Fijo Mensuales) [1]");
            System.out.println("Ingresar Trabajadores (Comisionistas)  [2]");
            System.out.println("Ingresar Trabajadores (Por Horas)      [3]");
            System.out.println("Salir                                  [0]");
            opc = entrada.nextInt();
            
            switch(opc){
                
                case 1: 
                entrada.nextLine()  ; 
                System.out.println("Ingrese el nombre: ");
                nombres = entrada.nextLine();
                System.out.println("Ingrese el apellido: ");
                apellidos = entrada.nextLine();
                System.out.println("Ingrese la direccion: ");
                direccion = entrada.nextLine();
                System.out.println("Ingrese el dni: ");
                dni = entrada.nextLine();
                
                trabajadoresFijos tf = new trabajadoresFijos(nombres,apellidos,direccion,dni);
                System.out.println("Sueldo de: "+tf.getCalcularSueldo());
                Tfj.add(tf);
                
                break;  
                case 2:
                int ventas;
                double porcentaje;
                entrada.nextLine();
                System.out.println("Ingrese el nombre: ");
                nombres = entrada.nextLine();
                System.out.println("Ingrese el apellido: ");
                apellidos = entrada.nextLine();
                System.out.println("Ingrese la direccion: ");
                direccion = entrada.nextLine();
                System.out.println("Ingrese el dni: ");
                dni = entrada.nextLine();   
                System.out.println("Ingrese el numero de ventas realizaas: ");
                ventas = entrada.nextInt();
                System.out.println("Ingrese el porcentaje de ventas: ");
                porcentaje = entrada.nextDouble();
                trabajadoresComisionistas tc = new trabajadoresComisionistas(nombres,apellidos,direccion,dni,ventas,porcentaje);    
                Tc.add(tc);
                
            
                System.out.println("Sueldo de: "+tc.getCalcularsueldo());
                
                break;
                
                case 3:
                int horasT = 0;
                double precioH = 0;
                entrada.nextLine();
                System.out.println("Ingrese el nombre: ");
                nombres = entrada.nextLine();
                System.out.println("Ingrese el apellido: ");
                apellidos = entrada.nextLine();
                System.out.println("Ingrese la direccion: ");
                direccion = entrada.nextLine();
                System.out.println("Ingrese el dni: ");
                dni = entrada.nextLine();   
                System.out.println("Ingrese el numero de horas Trabajadas: ");
                horasT = entrada.nextInt();
                System.out.println("Ingrese el precio de las horas: ");
                precioH = entrada.nextDouble();
                trabajadoresPorhoras tpr = new trabajadoresPorhoras(nombres,apellidos,direccion,dni,precioH,horasT);  
                Tph.add(tpr);
                
            
                System.out.println("Sueldo de: "+tpr.getCalcularsueldo());
                  
                break;
            }

        }while(opc !=0);   
        
        
        System.out.println("\nTrabajadores Fijos: ");
        for(int i1 = 0; i1 < Tfj.size(); i1++){
            
        System.out.println("El trabajador "+Tfj.get(i1).nombres+" "+Tfj.get(i1).apellidos);
        System.out.println(" Con la cedula "+Tfj.get(i1).dni);

        }
        
        System.out.println("\nTrabajadores Comisionistas: ");
        for(int i1 = 0; i1 < Tc.size(); i1++){
            
        System.out.println("El trabajador "+Tc.get(i1).nombres+" "+Tc.get(i1).apellidos);
        System.out.println(" Con la cedula "+Tc.get(i1).dni);
        } 
        
        System.out.println("\nTrabajadores Por horas: ");
        for(int i1 = 0; i1 < Tph.size(); i1++){
            
        System.out.println("El trabajador "+Tph.get(i1).nombres+" "+Tph.get(i1).apellidos);
        System.out.println(" Con la cedula "+Tph.get(i1).dni);
        } 
        
        System.out.println("\nJefe: ");
        trabajadorJefe tf = new trabajadorJefe ("Carlos","Espinoza","SAN JOSE ","1150708467");
        System.out.println("El jefe : "+tf.nombres+" "+tf.apellidos);
        System.out.println("Sueldo de: "+tf.getSueldo());
        
        
    }
}
