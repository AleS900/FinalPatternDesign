package ParcialFinal.Ejercicio_4_Proxy;

import java.util.ArrayList;
import java.util.List;

public class Servidor1 implements ICluster {
    private String ip;
    private String host_name;
    private List<UsuarioRegistrado> user_list1;

    public Servidor1() {
    }

    public Servidor1(String ip, String host_name) {
        this.ip = ip;
        this.host_name = host_name;
        this.user_list1 = new ArrayList<>();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }

    public List<UsuarioRegistrado> getUser_list1() {
        return user_list1;
    }

    public void setUser_list1(List<UsuarioRegistrado> user_list1) {
        this.user_list1 = user_list1;
    }

    @Override
    public void guardar(UsuarioRegistrado user) {
        System.out.println("Usuario guardado Correctamente");
        user_list1.add(user);
        user.showInfo();
    }
}
