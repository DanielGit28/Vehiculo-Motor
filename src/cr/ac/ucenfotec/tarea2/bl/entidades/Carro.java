package cr.ac.ucenfotec.tarea2.bl.entidades;

/**
 * @author Daniel Zúñiga Rojas
 * @version 1.0
 */
public class Carro {
    private String placa;
    private String marca;
    private int anio;
    private String color;
    private Motor motor;

    /**
     *
     * @return placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     *
     * @param placa
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     *
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     *
     * @param anio
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     *
     * @param motor
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public Carro(){}

    /**
     * constructor
     * @param placa
     * @param marca
     * @param anio
     * @param color
     * @param motor
     */
    public Carro(String placa, String marca, int anio, String color, Motor motor) {
        this.placa = placa;
        this.marca = marca;
        this.anio = anio;
        this.color = color;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", anio=" + anio +
                ", color='" + color + '\'' +
                ", motor=" + motor +
                '}';
    }
}
