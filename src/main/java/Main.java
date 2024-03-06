import java.io.*;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

    }
    public static void saveEmpleados(Set<Empleado> empleados){
        try (ObjectOutputStream ous=new ObjectOutputStream(new FileOutputStream("Empleados.dat"))){
            for (Empleado e:empleados){
                ous.writeObject(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void loadEmpleados(){
        Set<Empleado> empleados=new TreeSet<>();
        try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Empleados.dat"))){

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
