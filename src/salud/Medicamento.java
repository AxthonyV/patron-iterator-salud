package salud;
public class Medicamento {
    private String nombre;
    private String dosis;
    private String hora;

    public Medicamento(String nombre, String dosis, String hora) {
        this.nombre = nombre;
        this.dosis = dosis;
        this.hora = hora;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDosis() {
        return dosis;
    }
    public String getHora() {
        return hora;
    }
}