package ParcialFinal.Ejercicio_4_Proxy;

import java.util.ArrayList;
import java.util.List;

public class Servidor2 implements ICluster {
    private String ip;
    private String host_name;
    private List<UsuarioRegistrado> user_list2;

    public Servidor2() {
    }

    public Servidor2(String ip, String host_name) {
        this.ip = ip;
        this.host_name = host_name;
        this.user_list2 = new ArrayList<>();
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

    public List<UsuarioRegistrado> getUser_list2() {
        return user_list2;
    }

    public void setUser_list2(List<UsuarioRegistrado> user_list2) {
        this.user_list2 = user_list2;
    }

    @Override
    public void guardar(UsuarioRegistrado user) {
        System.out.println("Usuario guardado Correctamente");
        user_list2.add(user);
        user.showInfo();
    }
}
