package salud;
public class DemoArrayIterator {
    public static void main(String[] args) {
        Agregado coleccion = new ColeccionMedicamentos();
        Iterator iterator = coleccion.createIterator();
        System.out.println("Alertas Medicamentos:");
        while (iterator.hasNext()) {
            Medicamento m = (Medicamento) iterator.next();
            System.out.println(m.getHora() + " - " + m.getNombre() + " - " + m.getDosis());
        }
    }
}