public class Accidente {

    String descripcion;
    int fecha;
    int id;

    public Accidente( int id,String descripcion,int fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.id = id;
    }
    //Setters
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Getters
    public String getDescripcion() {
        return descripcion;
    }

    public int getFecha() {
        return fecha;
    }

    public int getId() {
        return id;
    }


}