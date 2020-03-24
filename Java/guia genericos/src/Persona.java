public class Persona implements Comparable {
    public String nombre;
    public int edad;

    public Persona(String nombre,int edad) {
        this.nombre = nombre;
        if(edad<0)
            this.edad=0;
        else
        this.edad=edad;
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
        if(edad<0)
            this.edad=0;
        else
            this.edad=edad;
    }

    public String toString() {

        return "Nombre: "+ this.nombre + "  Edad: "+this.edad;
    }




    /*
    Devuelve 1 si el valor de la clase es mayor al recibido, 0 si son iguales, -1 si es menor, -2 en caso de error (preguntar por esta funcion bien hecha)
     */
    public int compareTo(Object o){

        if(o instanceof Persona) {
            Persona p = (Persona) o;
            if (this.edad > p.edad)
                return 1;
            if (this.edad == p.edad)
                return 0;
            else
                return -1;
        }
        else return 2;
    }



}
