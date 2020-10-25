package cr.ac.ucenfotec.tarea2.bl.logica;

import cr.ac.ucenfotec.tarea2.bl.entidades.Carro;
import cr.ac.ucenfotec.tarea2.bl.entidades.Motor;

/**
 * @author Daniel Zúñiga Rojas
 * @version 1.0
 */
import java.util.ArrayList;

public class Gestor {
    ArrayList<Carro> carros = new ArrayList<> ();
    ArrayList<Motor> motores = new ArrayList<> ();

    /**
     *
     * @param placa cadena de caracteres de la placa del carro
     * @param marca cadena de caracteres de la marca del carro
     * @param anio el entero del año del carro
     * @param color cadena de caracteres del color del carro
     * @param serieMotor cadena de caracteres para determinar el motor del carro
     */
    public void agregarCarro(String placa, String marca, int anio, String color, String serieMotor) {
        for (int i = 0; i < motores.size(); i++) {
            Motor temp = motores.get(i);
            if(temp.getSerie().equals(serieMotor)) {
                Carro carro = new Carro(placa, marca, anio, color, temp);
                carros.add(carro);
                break;
            }
        }

    }

    /**
     *
     * @param serie cadena de caracteres de la serie del motor
     * @param cilindros el entero que determina la cantidad de cilindros del motor
     */
    public void agregarMotor(String serie, int cilindros) {
        Motor motor = new Motor(serie, cilindros);
        motores.add(motor);
    }

    /**
     *
     * @return motores arreglo de objetos de tipo Motor
     */
    public ArrayList<Motor> listarMotores() {
        return this.motores;
    }

    /**
     *
     * @return carros arreglo de objetos de tipo Carro
     */
    public ArrayList<Carro> listarCarros() {
        return this.carros;
    }
}
