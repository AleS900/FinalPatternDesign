package ParcialFinal.Ejercicio_1_Visitor;

public class Client {
    public static void main (String[] args){
        LaPaz laPaz = new LaPaz();
        Cochabamba cochabamba =  new Cochabamba();
        SantaCruz santaCruz = new SantaCruz();

        Turista turist = new Turista("13252626 OR", 48000, "Pablito","verano");
        laPaz.accept(turist);
        cochabamba.accept(turist);
        santaCruz.accept(turist);
    }
}
