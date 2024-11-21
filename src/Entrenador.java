public class Entrenador extends Jugador {
    private int experiencia;

    public Entrenador() {
        super();
    }

    public Entrenador(String nombre) {
        this();
        this.nombre = nombre;
    }

    public Entrenador(String nombre, Equipo equipo, int experiencia) {
        super(nombre, equipo);
        this.experiencia = experiencia;
    }

    public Entrenador(String nombre, Equipo equipo, int edad, int experiencia) {
        super(nombre, equipo, edad);
        this.experiencia = experiencia;
    }

    @Override
    public String gritarGol() {
        return super.gritarGol()
                .concat(" de")
                .concat(this.getEquipo().getNombre())
                .concat(". Ese es mi equipo, carajo");
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "Nombre: " + this.nombre +
                ". Edad=" + this.edad +
                ". Equipo=" + this.equipo +
                '}';
    }


}
