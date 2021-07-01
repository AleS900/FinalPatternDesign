package ParcialFinal.Ejercicio_2_Adapter;

public class Client {
    public static void main (String[] args){
        IMotosEmpresa1 gasolina =  new CuadratrackGasolina(20,"5252-ACD");
        IMotosEmpresa1 diesel =  new CuadratrackDiesel(30,"2314-GGG");
        IMotosEmpresa1 especial =  new CuadratrackGasolinaEspecial(40,"1511-AAA");
        IMotosEmpresa1 electrica =  new CuadratrackAdaptada(new CuadatrackElectrica(10,"5423-ACD"));

        //Cargando
        gasolina.llenarGasolina(10);
        diesel.llenarGasolina(16);
        especial.llenarGasolina(15);
        electrica.llenarGasolina(2);

        //Mostrando Estado
        gasolina.estadoCombustible();
        diesel.estadoCombustible();
        especial.estadoCombustible();
        electrica.estadoCombustible();
    }
}
