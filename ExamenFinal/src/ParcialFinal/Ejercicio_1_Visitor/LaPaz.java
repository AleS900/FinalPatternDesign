package ParcialFinal.Ejercicio_1_Visitor;

public class LaPaz implements IDepartamento {
    private String nombre = "La Paz" ;
    private Integer numProvincias = 14;
    private Integer numHabitantes = 2030242;
    private String clima = "frio";
    private double dineroPorTurismo = 150000 ;

    public LaPaz() {
    }

    @Override
    public void accept(IVisitante visitante) {
        visitante.visitar(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumProvincias() {
        return numProvincias;
    }

    public void setNumProvincias(Integer numProvincias) {
        this.numProvincias = numProvincias;
    }

    public Integer getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(Integer numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public double getDineroPorTurismo() {
        return dineroPorTurismo;
    }

    public void setDineroPorTurismo(double dineroPorTurismo) {
        this.dineroPorTurismo = dineroPorTurismo;
    }
}
