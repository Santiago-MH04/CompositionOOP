public class Persona {
    protected String nombre;
    protected int edad;
    protected Equipo equipo;

    public Persona() {
    }
    public Persona(String nombre, int edad) {
        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }
        public int getEdad() {
        return this.edad;
    }
            public Equipo getEquipo() {
                return this.equipo;
            }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        public void setEdad(int edad) {
        this.edad = edad;
    }
            public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String gritarGol(){
        return "Golazo";
    }
}
