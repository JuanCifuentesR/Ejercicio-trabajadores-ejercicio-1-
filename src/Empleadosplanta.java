class Empleadosplanta extends Empleados {
    protected int salarioFijo;

    public Empleadosplanta() {
    }

    public Empleadosplanta(String nombre, int edad, int salarioFijo) {
        super(nombre, edad);
        this.salarioFijo = salarioFijo;
    }

    public int getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(int salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    @Override
    public String toString() {
        return super.toString() + " Empleado de Planta {" +
                "Salario fijo=" + salarioFijo +
                '}';
    }


}
