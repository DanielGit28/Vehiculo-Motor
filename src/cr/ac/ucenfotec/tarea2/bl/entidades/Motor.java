package cr.ac.ucenfotec.tarea2.bl.entidades;

/**
 * @author Daniel Zúñiga Rojas
 * @version 1.0
 */
public class Motor {
    private String serie;
    private int cilindros;

    /**
     *
     * @return serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     *
     * @param serie
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     *
     * @return cilindros
     */
    public int getCilindros() {
        return cilindros;
    }

    /**
     *
     * @param cilindros
     */
    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }
    public Motor(){}

    /**
     * constructor
     * @param serie
     * @param cilindros
     */
    public Motor(String serie, int cilindros) {
        this.serie = serie;
        this.cilindros = cilindros;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "serie='" + serie + '\'' +
                ", cilindros=" + cilindros +
                '}';
    }
}
