/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.ups.practica1.pkg2_quizhpiguerreromario;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Practica12_QuizhpiGuerreroMario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numeroSubordinado;
        String j;
        int numeroDirectivo;
        int numeroEmpleado;
        int numeroCliente;
        int a = 0;
        int i = 0;
        int m = 0;
        int n = 0;
        int op = 0; //Opcion del Menu
        String z; //Variable de ingreso de datos
        int y; //Variable de ingreso de datos
        Empresa em1 = new Empresa();
        Empleado e1 = new Empleado();
        // TODO code application logic here
        System.out.println("Bienvenido");
        while (op != 4) {
            System.out.println("Menu:");
            System.out.println("1-Registrar Empresa");
            System.out.println("2-Registrar Empleado");
            System.out.println("3-Registrar Cliente");
            System.out.println("4/Salir");
            System.out.print("Opcion:");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Empresa");
                    System.out.print("RUC: ");
                    y = leer.nextInt();
                    System.out.print("Razon Social: ");
                    z = leer.next();
                    Empresa emp = new Empresa(y, z, e1);
                    System.out.println("--Creada con exito--");
                    System.out.println(emp.toString());
                    break;
                case 2:
                    System.out.println("Ingrese el numero de directivos: ");
                    numeroDirectivo = leer.nextInt();
                    int[] cedulaD = new int[numeroDirectivo];
                    String[] nombreD = new String[numeroDirectivo];
                    String[] direccionD = new String[numeroDirectivo];
                    String[] correoD = new String[numeroDirectivo];
                    int[] sueldoD = new int[numeroDirectivo];
                    for (i = 0; i < numeroDirectivo; i++) {
                        leer.nextLine();
                        System.out.println("Ingrese la cedula del Directivo" + (i + 1));
                        cedulaD[i] = leer.nextInt();
                        System.out.println("Ingrese el nombre del Directivo"+(i+1));
                        nombreD[i] = leer.next();
                        System.out.println("Ingrese la direccion del Directivo" + (i + 1));
                        Direccion direccionUno = new Direccion();
                        System.out.println("Ingrese la calle uno");
                        direccionD[i] = leer.next();
                        direccionUno.getCalle1();
                        System.out.println("Ingrese la calle dos");
                        direccionD[i] = leer.next();
                        direccionUno.getCalle2();
                        System.out.println("Ingrese el numero de casa");
                        direccionD[i] = leer.next();
                        direccionUno.getNumero();

                        System.out.println("Ingrese el correo del Directivo" + (i + 1));
                        correoD[i] = leer.next();
                        System.out.println("Ingrese el sueldo del Directivo" + (i + 1));
                        sueldoD[i] = leer.nextInt();
                        System.out.println("Ingrese el numero de empleados a cargo del directivo: ");
                        numeroSubordinado = leer.nextInt();
                        int[] cedulaS = new int[numeroDirectivo];
                        String[] nombreS = new String[numeroDirectivo];
                        String[] direccionS = new String[numeroDirectivo];
                        String[] correoS = new String[numeroDirectivo];
                        int[] sueldoS = new int[numeroDirectivo];
                        for (m = 0; m < numeroSubordinado; m++) {

                            leer.nextLine();
                            System.out.println("Ingrese la cedula del Empleado" + (m + 1));
                            cedulaS[m] = leer.nextInt();
                            System.out.println("Ingrese el nombre del Empleado" + (m + 1));
                            nombreS[m] = leer.next();
                            System.out.println("Ingrese la direccion del Empleado" + (m + 1));
                            System.out.println("Ingrese la calle uno");
                            direccionD[m] = leer.next();
                            direccionUno.getCalle1();
                            System.out.println("Ingrese la calle dos");
                            direccionD[m] = leer.next();
                            direccionUno.getCalle2();
                            System.out.println("Ingrese e; numero de casa");
                            direccionD[m] = leer.next();
                            direccionUno.getNumero();

                            System.out.println("Ingrese el correo del Empleado" + (m + 1));
                            correoS[m] = leer.next();
                            System.out.println("Ingrese el sueldo del Empleado" + (m + 1));
                            sueldoS[m] = leer.nextInt();
                        }
                        System.out.println("Los datos de sus Directivos son: ");
                        for (n = 0; n < numeroDirectivo; n++) {
                            System.out.println("Cedula: " + cedulaD[n]);
                            System.out.println("nombre: " + nombreD[n]);
                            System.out.println("Direccion: " + direccionD[n]);
                            System.out.println("Correo: " + correoD[n]);
                            System.out.println("Sueldo: " + sueldoD[n]);
                            System.out.println("Los nombres de los subordinados son: ");
                            for (n = 0; n < numeroSubordinado; n++) {
                                System.out.println(nombreS[n]);
                            }

                        }

                    }

                    break;
                case 3:
                    System.out.println("Cliente");
                    System.out.println("Ingrese el numero de clientes: ");
                    numeroCliente = leer.nextInt();
                    int[] cedulaC = new int[numeroCliente];
                    String[] nombreC = new String[numeroCliente];
                    String[] direccionC = new String[numeroCliente];
                    String[] correoC = new String[numeroCliente];
                    String[] telefonoC= new String[numeroCliente];
                    for (a = 0; a < numeroCliente; a++) {
                        leer.nextLine();
                        System.out.println("Ingrese la cedula del Cliente" + (a + 1));
                        cedulaC[a] = leer.nextInt();
                        System.out.println("Ingrese el nombre del Cliente" + (a + 1));
                        nombreC[a] = leer.next();
                        System.out.println("Ingrese la direccion del Cliente" + (a + 1));
                        Direccion direccionCl= new Direccion();
                        System.out.println("Ingrese la calle uno");
                        direccionC[a] = leer.next();
                        direccionCl.getCalle1();
                            System.out.println("Ingrese la calle dos");
                            direccionC[a] = leer.next();
                            direccionCl.getCalle2();
                            System.out.println("Ingrese e; numero de casa");
                            direccionC[a] = leer.next();
                            direccionCl.getNumero();
                        System.out.println("Ingrese el telefono del Cliente: ");
                        telefonoC[a]=leer.next();
                    }
                    System.out.println("Los datos de sus Clientes son: ");
                    for (a = 0; a < numeroCliente; a++) {
                        System.out.println("Cedula: " + cedulaC[a]);
                        System.out.println("nombre: " + nombreC[a]);
                        System.out.println("Direccion: " + direccionC[a]);
                        System.out.println("Correo: " + correoC[a]);
                        System.out.println("Telefono: "+ telefonoC[a]);
                    }

                    break;
                case 4:
                    System.out.println("Gracias");
                    break;
                default:
                    System.out.println("No existe la opcion, vuelva a elegir...");
            }

        }

    }

}
