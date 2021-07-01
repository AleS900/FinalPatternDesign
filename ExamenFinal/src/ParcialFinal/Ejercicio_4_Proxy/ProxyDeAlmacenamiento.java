package ParcialFinal.Ejercicio_4_Proxy;

public class ProxyDeAlmacenamiento implements ICluster{
    private int id;
    private Servidor1 server_1 = new Servidor1("192.168.16.2","SERV-1A");
    private Servidor1 server_2 = new Servidor1("172.168.10.8","SERV-1B");
    private Map<Integer, UsuarioRegistrado>


    public ProxyDeAlmacenamiento() {
    }
}
