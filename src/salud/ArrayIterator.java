package salud;
public class ArrayIterator implements Iterator {
    private Medicamento[] medicamentos;
    private int posicion = 0;
    public ArrayIterator(Medicamento[] medicamentos) {
        this.medicamentos = medicamentos;
    }
    @Override
    public boolean hasNext() {
        return posicion < medicamentos.length && medicamentos[posicion] != null;
    }
    @Override
    public Object next() {
        Medicamento medicamento = medicamentos[posicion];
        posicion++;
        return medicamento;
    }
}