class EmpleadosHoras extends Empleados {
    protected int pagoHoras;
    protected int horasTrabajadas;

    public EmpleadosHoras() {
    }

    public EmpleadosHoras(String nombre, int edad, int pagoHoras, int horasTrabajadas) {
        super(nombre, edad);
        this.pagoHoras = pagoHoras;
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getPagoHoras() {
        return pagoHoras;
    }

    public void setPagoHoras(int pagoHoras) {
        this.pagoHoras = pagoHoras;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String toString() {
        return super.toString() + " Empleado por Horas {" +
                "Pago por hora=" + pagoHoras +
                ", Horas trabajadas=" + horasTrabajadas +
                '}';
    }


}