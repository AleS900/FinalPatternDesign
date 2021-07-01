package ParcialFinal.Ejercicio_2_Adapter;

public class CuadratrackDiesel implements  IMotosEmpresa1{
    private int gaslevel;
    private String id;

    public CuadratrackDiesel(int gaslevel, String id) {
        this.gaslevel = gaslevel;
        this.id = id;
    }

    public int getGaslevel() {
        return gaslevel;
    }

    public void setGaslevel(int gaslevel) {
        this.gaslevel = gaslevel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void llenarGasolina(int gasolina) {
        setGaslevel(gasolina);
        System.out.println("Gasolina en :" +gasolina + gaslevel);
    }

    @Override
    public void estadoCombustible() {
        int t = (int)(Math.random() * 50-1);
        System.out.println("Estado : " +t);
    }
}
