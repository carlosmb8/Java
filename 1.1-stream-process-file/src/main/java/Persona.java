import java.util.Optional;

public class Persona {
    //Propiedades
    private String nombre;
    private String poblacion;
    private Integer edad;

    public Persona (String nombre, String poblacion, Integer edad){
        this.nombre=nombre;
        this.poblacion=poblacion;
        this.edad=edad;
    }

    public String getNombre(){
        Optional<String> name = Optional.ofNullable(nombre);
        return name.orElse("Desconocido");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        Optional<String> town = Optional.ofNullable(poblacion);
        return town.orElse("Desconocida");
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public Integer getEdad() {
        Optional<Integer> age = Optional.ofNullable(edad);
        return age.orElse(0);
    }

    public void setEdad(Integer edad){
        this.edad = edad;
    }
}
