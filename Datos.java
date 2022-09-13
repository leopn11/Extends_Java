public class Datos {
    public static void main(String[] args) {
         Cliente cliente = new Cliente();
         Trabajador trabajador = new Trabajador();

        cliente.edad = 25;
        cliente.telefono = 30453163;
        cliente.nombre = "leo pinto";
        cliente.credito = "Aprobado";

        trabajador.edad = 24;
        trabajador.telefono = 314515180;
        trabajador.nombre = "maria zapata";
        trabajador.salario = 1000;

        System.out.println(cliente.edad  + cliente.credito + cliente.telefono + cliente.nombre );
        System.out.println(trabajador.telefono + trabajador.nombre);
        System.out.println(trabajador.salario);
        System.out.println(trabajador.edad);
    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    String credito;
}

class Trabajador extends  Persona {
    int salario;

}