class Empleados {
    protected String nombre;
    protected int edad;


    public Empleados() {
    }

    public Empleados(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalarioFijo() {
        return 0;  // Por defecto, 0 para empleados que no son de planta
    }

    public int getPagoHoras() {
        return 0;  // Por defecto, 0 para empleados que no son por horas
    }

    public int getHorasTrabajadas() {
        return 0;  // Por defecto, 0 para empleados de planta
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre='" + nombre + '\'' +
                ", Edad=" + edad +
                '}';
    }

    public void calcularSueldoHoras (int pagoHoras, int horasTrabajadas) {
        int salario = pagoHoras * horasTrabajadas;
        System.out.println("el pago final sera de");
    }

    public void calcularSueldoPlanta (int salarioFijo, int meses) {
        int sueldo = salarioFijo * meses;
        System.out.println("El sueldo total es de: " + sueldo + "$");
    }
}