public class Trabajador extends Persona {
    public Trabajador(String nombre, int edad, String telefono, float salario){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.salario = salario;
    }
    public float salario;
    public void getPresentacion(){
        System.out.println("Soy " + nombre + ", tengo " + edad + " años. Me puedes contactar al número " + telefono + ". Devengo un salario de $" + salario);
    }
    public void getDatos(){
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(telefono);
        System.out.println(salario);
    }
}
