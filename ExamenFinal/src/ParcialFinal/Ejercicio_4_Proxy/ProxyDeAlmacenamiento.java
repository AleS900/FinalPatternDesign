package ParcialFinal.Ejercicio_4_Proxy;

import java.util.*;

public class ProxyDeAlmacenamiento implements ICluster{
    private int id;
    private Servidor1 server_1 = new Servidor1("192.168.16.2","SERV-1A");
    private Servidor1 server_2 = new Servidor1("172.168.10.8","SERV-1B");

    public ProxyDeAlmacenamiento() {
    }

    public ProxyDeAlmacenamiento(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void guardar(UsuarioRegistrado user) {
        id = user.getUser_id();
        if(user.isIs_correct()){
            if(isPrime(id)){
                System.out.println("Guardando en servidor 1....");
                server_1.guardar(user);
            }else{
                System.out.println("Guardando en servidor 2....");
                server_2.guardar(user);
            }
        }else{
            user.showInfo();
        }
    }

    public boolean isPrime(Integer num){
        if(num%2 == 0){
            return false;
        }else if(num < 2){
            return false;
        } else{
            for(int i = 3; i * i < num ; i++){
                i++;
                if (num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
