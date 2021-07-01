package ParcialFinal.Ejercicio_2_Adapter;

public class CuadatrackElectrica  implements  IMotosEmpresa2 {
    private int eleclevel;
    private String id;

    public CuadatrackElectrica(int eleclevel, String id) {
        this.eleclevel = eleclevel;
        this.id = id;
    }

    public int getEleclevel() {
        return eleclevel;
    }

    public void setEleclevel(int eleclevel) {
        this.eleclevel = eleclevel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public void cargarBateria(int bateria) {
        setEleclevel(bateria);
        System.out.println("Bateria en :" + bateria + eleclevel);
    }

    @Override
    public void estadoElectricidad() {
        int t = (int) (Math.random() * 10 - 1);
        System.out.println("Estado : " + t);
    }
}

