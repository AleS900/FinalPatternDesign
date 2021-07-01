package ParcialFinal.Ejercicio_4_Proxy;

public class UsuarioRegistrado {
    private Integer user_id;
    private String user_name;
    private String user_pwd;
    private boolean is_correct;

    public UsuarioRegistrado() {
    }

    public UsuarioRegistrado(Integer user_id, String user_name, String user_pwd, boolean is_correct) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_pwd = user_pwd;
        this.is_correct = is_correct;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public boolean isIs_correct() {
        return is_correct;
    }

    public void setIs_correct(boolean is_correct) {
        this.is_correct = is_correct;
    }

    public void showInfo(){
        System.out.println("---------INFORMACION DE USUARIO---------");
        if(is_correct){
            System.out.println("-- Contraseña CORRECTA");
            System.out.println("-- Usuario   : " + user_name);
            System.out.println("-- Contraseña: ********* (" + user_pwd + ")\n\n");
        }else{
            System.out.println("-- Contraseña o Usuario Incorrecta");
            System.out.println("INTENTE OTRA VEZ\n\n");
        }
    }
}
