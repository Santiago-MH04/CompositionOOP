public class Jugador extends Persona{

    public Jugador() {
        super();
        System.out.println("Haz creado una instancia de jugador");
    }
    public Jugador(String nombre) {
        this();
        this.nombre = nombre;
    }
    public Jugador(String nombre, Equipo equipo) {
        this(nombre);
        this.equipo = equipo;
    }
    public Jugador(String nombre, Equipo equipo, int edad) {
        this(nombre, equipo);
        this.edad = edad;
    }


    @Override
    public String gritarGol() {
        return super.gritarGol().concat(" de").concat(this.getEquipo().getNombre());
    }

    @Override
    public String toString() {
        return "Jugador{nombre:" + this.nombre + ". Equipo: " + equipo.getNombre() + '}';
    }

    @Override
    public boolean equals(Object obj) {
        Jugador jugador = (Jugador) obj;
        return this == obj || this.nombre.equals(jugador.getNombre());
    }
}
