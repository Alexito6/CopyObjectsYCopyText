import java.io.Serializable;
import java.util.Set;

public abstract class Empleado implements Comparable<Empleado>, Serializable {
    private String nombre;
    private int edad;
    private int salario;
    Set<Skills> habilidades;
    public Empleado(String nombre,int edad,int salario,Set<Skills> habilidades){
        this.nombre=nombre;
        this.edad=edad;
        this.salario=salario;
    }
    public int getSalario(){
        return salario;
    }
    public int getEdad(){
        return edad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setSalario(int salario){
        this.salario=salario;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setHabilidades(Set<Skills> sus){
        habilidades=sus;
    }
    public Set<Skills> getHabilidades(){
        return habilidades;
    }
    @Override
    public String toString(){
        return "Nombre :"+nombre+" edad: "+edad+" salario: "+salario+" habilidades: "+habilidades;
    }
    @Override
    public boolean equals(Object object){
        if (object==null){
            return false;
        }
        if (!(object instanceof Empleado)){
            return false;
        }
        Empleado p=(Empleado) object;
        return this.nombre.equals(p.getNombre()) && this.edad==p.getEdad();
    }
    @Override
    public int compareTo(Empleado p){
        if (nombre.compareTo(p.getNombre())>0){
            return 1;
        }
        if (nombre.compareTo(p.getNombre())<0){
            return -1;
        }
        return 0;
    }
}
