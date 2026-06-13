package salud;
public class ColeccionMedicamentos implements Agregado {
    private Medicamento[] medicamentos;
    private int indice = 0;
    public ColeccionMedicamentos() {
        medicamentos = new Medicamento[3];
        addMedicamento(new Medicamento("Paracetamol", "1 pastilla", "08:00 AM"));
        addMedicamento(new Medicamento("Amoxicilina", "1 capsula", "02:00 PM"));
        addMedicamento(new Medicamento("Panadol Antigripal", "1 tableta", "09:00 PM"));
    }
    public void addMedicamento(Medicamento medicamento) {
        if (indice > medicamentos.length) {
            medicamentos[indice] = medicamento;
            indice++;
        }
    }
    @Override
    public Iterator createIterator() {
        return new ArrayIterator(medicamentos);
    }
}