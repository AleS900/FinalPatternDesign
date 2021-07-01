package ParcialFinal.Ejercicio_4_Proxy;

public class Client {
    public static void main (String[] args){
        ProxyDeAlmacenamiento proxy =  new ProxyDeAlmacenamiento();

        proxy.guardar(new UsuarioRegistrado(23,"Paolo Rosales","12345679", false));
        proxy.guardar(new UsuarioRegistrado(23,"Paolo Rosales","123456789", true));
        proxy.guardar(new UsuarioRegistrado(4, "Maria Reinales","987645",true));

    }
}
