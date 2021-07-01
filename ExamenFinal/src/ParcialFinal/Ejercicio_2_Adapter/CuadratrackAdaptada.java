package ParcialFinal.Ejercicio_2_Adapter;

public class CuadratrackAdaptada implements IMotosEmpresa1 {
    private IMotosEmpresa2 appliance;

    public CuadratrackAdaptada(IMotosEmpresa2 appliance) {
        this.appliance = appliance;
    }

    @Override
    public void llenarGasolina(int gasolina) {
        System.out.println("Adaptando Cargar Bateria A Llenar Gasolina");
        appliance.cargarBateria(gasolina);
    }

    @Override
    public void estadoCombustible() {
        System.out.println("Adaptando Estado Electricidad A Estado Gasolina");
        appliance.estadoElectricidad();
    }
}
