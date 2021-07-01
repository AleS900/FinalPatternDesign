package ParcialFinal.Ejercicio_1_Visitor;

public class Cochabamba implements IDepartamento {
    private String nombre = "Cochabamba" ;
    private Integer numProvincias = 15;
    private Integer numHabitantes = 1520242;
    private String clima = "templado";
    private double dineroPorTurismo = 100000 ;

    public Cochabamba() {
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
