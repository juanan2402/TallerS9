import java.io.*;

public class Main{
    public static void main(String[] args)  throws IOException{

    Parqueadero parqueadero = new Parqueadero();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    boolean abierto=true;
    int opcion;
    while (abierto){
        System.out.println("Bienvenido al sistema de Parqueadero, Seleccione el numero para realizar una accion:");
        System.out.println("1. Ingresar Carro");
        System.out.println("2. Sacar Carro");
        System.out.println("3. Detalle de ingresos");
        System.out.println("4. Puestos vacios");
        System.out.println("5. Avanzar reloj");
        System.out.println("6. Ajustar tarifa");
        System.out.println("7. Cerrar Parqueadero");
        opcion= Integer.parseInt(br.readLine());
        switch (opcion){
            case 1:
                System.out.println("Ingresar la placa del carro a entrar, se le asignará un puesto");
                System.out.println(parqueadero.entrarCarro(br.readLine()));
                break;
            case 2:
                System.out.println("Ingresar la placa del carro a salir, se reflejara el monto a pagar");
                System.out.println(parqueadero.sacarCarro(br.readLine()));
                break;
            case 3:
                System.out.println("Ingresos totales del dia: "+parqueadero.darMontoCaja());

                break;
            case 4:
                System.out.println("Puestos Libres: "+ parqueadero.calcularPuestosLibres());
                break;
            case 5:
                parqueadero.avanzarHora();
                break;
            case 6:
                System.out.println("Ingresar la nueva tarifa:");
                parqueadero.cambiarTarifa(Integer.parseInt(br.readLine()));
                break;
            case 7:
                abierto=false;
                break;
        }


    }
    }
}