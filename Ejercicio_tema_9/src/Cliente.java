public class Cliente extends Persona{
    public float credito;
    public Cliente(String nombre, int edad, String telefono, float credito){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.credito = credito;
    }
    public void getPresentacion(){
        System.out.println("Soy " + nombre + ", tengo " + edad + " años. Me puedes contactar al número " + telefono + ". Tengo un crédito aprovado por un valor de " + credito);
    }
    public void getDatos(){
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(telefono);
        System.out.println(credito);
    }
}
