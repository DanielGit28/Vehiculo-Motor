package cr.ac.ucenfotec.tarea2.controlador;

import cr.ac.ucenfotec.tarea2.bl.entidades.Carro;
import cr.ac.ucenfotec.tarea2.bl.entidades.Motor;
import cr.ac.ucenfotec.tarea2.bl.logica.Gestor;
import cr.ac.ucenfotec.tarea2.iu.IU;

import java.util.ArrayList;

/**
 * @author Daniel Zúñiga Rojas
* @version 1.0
 */
public class Controlador {
    private IU interfaz = new IU();
    private Gestor gestor = new Gestor();

    public void ejecutarPrograma() {
        int opcion = 0;
        do {
            interfaz.mostrarMenu();
            opcion = interfaz.leerOpcion();
            procesarOpcion(opcion);
        } while (opcion!=5);
    }

    /**
    * @param opcion el entero que procesa el switch con diferentes opciones
     */
    private void procesarOpcion(int opcion) {
        switch(opcion) {
            case 1:
                crearCarro();
                break;
            case 2:
                crearMotor();
                break;
            case 3:
                listarCarros();
                break;
            case 4:
                listarMotores();
            case 5:
                break;
            default:
                interfaz.imprimirMensaje("Opcion desconocida");
        }
    }

    private void crearCarro() {
        interfaz.imprimirMensaje("Introduzca la placa del carro: ");
        String placa = interfaz.leerTexto();
        interfaz.imprimirMensaje("Introduzca la marca del carro: ");
        String marca = interfaz.leerTexto();
        interfaz.imprimirMensaje("Introduzca el año del carro: ");
        int anio = interfaz.leerEnteros();
        interfaz.imprimirMensaje("Introduzca el color del carro: ");
        String color = interfaz.leerTexto();
        interfaz.imprimirMensaje("Introduzca el número de serie del motor: ");
        String serieM = interfaz.leerTexto();
        gestor.agregarCarro(placa, marca, anio, color, serieM);
        interfaz.imprimirMensaje("Carro creado");
    }
    private void crearMotor() {
        interfaz.imprimirMensaje("Introduzca el número de serie del motor: ");
        String numSerie = interfaz.leerTexto();
        interfaz.imprimirMensaje("Introduzca el numero de cilindros del motor: ");
        int cilindros = interfaz.leerEnteros();
        gestor.agregarMotor(numSerie, cilindros);
        interfaz.imprimirMensaje("Motor creado con éxito");
    }

    private void listarCarros() {
        ArrayList<Carro> carros = gestor.listarCarros();
        interfaz.imprimirMensaje("Lista de carros");
        for (int i = 0; i < carros.size(); i++) {
            interfaz.imprimirMensaje(carros.get(i).toString());
        }
    }
    private void listarMotores() {
        ArrayList<Motor> motores = gestor.listarMotores();
        interfaz.imprimirMensaje("Lista de motores");
        for (int i = 0; i < motores.size(); i++) {
            interfaz.imprimirMensaje(motores.get(i).toString());
        }
    }
}
