package ejecutarentradas;
import java.util.ArrayList;
import java.util.Scanner;
public class EjecutarEntradas {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);    
    int opc;
    boolean ingresar;
    int almacenar;
    ArrayList <DatosPrincipal> DP = new ArrayList <>();
    ArrayList <DatosPalcoB> DB = new ArrayList <>();
    ArrayList <DatosCentral> DC = new ArrayList <>();
    ArrayList <DatosLateral> DL = new ArrayList <>();
    

    ingresar = true;

     
     while(ingresar){
             
     System.out.println("Vender entradas    [1]");
     System.out.println("Consulta entradas  [2]");
     opc = entrada.nextInt();
     if(opc == 1){
         int z,t;
         String nom,ape,dni;
         System.out.println("-----");
         System.out.println("Zona");
         System.out.println("-----");
         System.out.println("Zona Principal [1]");
         System.out.println("Zona PalcoB    [2]");
         System.out.println("Zona Central   [3]");
         System.out.println("Zona Lateral   [4]");
         System.out.print("Ingrese el numero de la zona : ");
         z = entrada.nextInt();
         System.out.println("-----");
         System.out.println("Tipo");
         System.out.println("-----");
         System.out.println("Normal                     [1]");
         System.out.println("Abonado                    [2]");
         System.out.println("Estudiante o pensionista   [3]");
         System.out.print("Ingrese el tipo de cliente : ");
         t = entrada.nextInt();
         
         if(z == 1 ){
                entrada.nextLine();
                System.out.print("Ingrese el nombre: ");
                nom = entrada.nextLine();
                System.out.print("Ingrese el apellido: ");
                ape = entrada.nextLine();
                System.out.print("Ingrese el dni: ");
                dni = entrada.nextLine();        
                DatosPrincipal dp = new DatosPrincipal (nom,ape,dni,t);
                dp.calcularprecio();
                System.out.println("--------------");
                System.out.println("Zona Principal");
                System.out.println("--------------");
                System.out.println("El cliente "+dp.getNombres()+" "+dp.getApellidos()+" con el dni: "+dp.getDni());
                System.out.println("El valor de la entrada es de "+dp.getcalcularprecio()  );
                DP.add(dp);
         }if(z == 2 ){
                entrada.nextLine();
                System.out.print("Ingrese el nombre: ");
                nom = entrada.nextLine();
                System.out.print("Ingrese el apellido: ");
                ape = entrada.nextLine();
                System.out.print("Ingrese el dni: ");
                dni = entrada.nextLine();  
                DatosPalcoB db = new DatosPalcoB(nom,ape,dni,t);
                db.calcularprecio();
                System.out.println("--------------");
                System.out.println("Zona Palco B");
                System.out.println("--------------");
                System.out.println("El cliente "+db.getNombres()+" "+db.getApellidos()+" con el dni: "+db.getDni());
                System.out.println("El valor de la entrada es de "+db.getcalcularprecio()  );
                DB.add(db);
         
         }if(z == 3 ){
                entrada.nextLine();
                System.out.print("Ingrese el nombre: ");
                nom = entrada.nextLine();
                System.out.print("Ingrese el apellido: ");
                ape = entrada.nextLine();
                System.out.print("Ingrese el dni: ");
                dni = entrada.nextLine();  
                DatosCentral dc = new DatosCentral(nom,ape,dni,t);
                dc.calcularprecio();
                System.out.println("--------------");
                System.out.println("Zona Central");
                System.out.println("--------------");
                System.out.println("El cliente "+dc.getNombres()+" "+dc.getApellidos()+" con el dni: "+dc.getDni());
                System.out.println("El valor de la entrada es de "+dc.getCalcularprecio() );
                DC.add(dc);
         
         }if(z == 4 ){
                entrada.nextLine();
                System.out.print("Ingrese el nombre: ");
                nom = entrada.nextLine();
                System.out.print("Ingrese el apellido: ");
                ape = entrada.nextLine();
                System.out.print("Ingrese el dni: ");
                dni = entrada.nextLine();  
                DatosLateral dl = new DatosLateral(nom,ape,dni,t);
                dl.calcularprecio();
                System.out.println("--------------");
                System.out.println("Zona Lateral");
                System.out.println("--------------");
                System.out.println("El cliente "+dl.getNombres()+" "+dl.getApellidos()+" con el dni: "+dl.getDni());
                System.out.println("El valor de la entrada es de "+dl.getCalcularprecio() );
                DL.add(dl);
         } 
         
     }
  
     
     if(opc == 2){
        
        String no ;
        int c = 0;
        entrada.nextLine();
         System.out.println("Ingrese a que nombre hiso la entrada: ");
         no = entrada.nextLine();
         
        for(int i1 = 0; i1 < DP.size(); i1++){
            
            if(no.equals(DP.get(i1).getNombres())){
                
                System.out.println("ZONA PRINCIPAL");
                System.out.println("Entrada del cliente: "+DP.get(i1).getNombres()+" "+DP.get(i1).getApellidos());
                c = c+1;
            } 

        }
        for(int i1 = 0; i1 < DB.size(); i1++){
            
            if(no.equals(DB.get(i1).getNombres())){
                
                System.out.println("ZONA PALCO B");
                System.out.println("Entrada del cliente: "+DB.get(i1).getNombres()+" "+DB.get(i1).getApellidos());
                c = c+1;
            }
             
         }
        for(int i1 = 0; i1 < DC.size(); i1++){
            
            if(no.equals(DC.get(i1).getNombres())){
                
                System.out.println("ZONA CENTRAL");
                System.out.println("Entrada del cliente: "+DC.get(i1).getNombres()+" "+DC.get(i1).getApellidos());
                c = c+1;
            }
             
         }
        for(int i1 = 0; i1 < DL.size(); i1++){
            if(no.equals(DL.get(i1).getNombres())){
                
                System.out.println("ZONA LATEREAL");
                System.out.println("Entrada del cliente: "+DL.get(i1).getNombres()+" "+DL.get(i1).getApellidos());
                c = c+1;
            }
             
        }
        
        if(c < 1){
            System.out.println("NO HAY DATOS");
        }
         
     }
     
            ingresar = false;
            System.out.print("\nDesea ingresa entradas [1]SI [2]NO:  ");
                almacenar = entrada.nextInt();
                
            if(almacenar == 1){
                ingresar = true;
            }
         
     }   
    } 
}
