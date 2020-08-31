public class Main {
    private static Object ControlCalidad;

    public static void main(String[] args) {
        //controlCalidad
        ControlCalidad laboratorio = new ControlCalidad(123,"aceptado","valido");
        //ensayo
        Ensayo quimicos = new Ensayo("556","c-14","hidrogeno","litio","sodio");
        //lote
        Lote hidrogeno = new Lote("ab","bc","cd");
        //muestra
        Muestra ab = new Muestra(014,"totales");
        //producto
        Producto cerocatorce =new Producto(987);


    }
}
