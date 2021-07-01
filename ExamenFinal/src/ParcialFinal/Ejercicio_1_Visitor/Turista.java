package ParcialFinal.Ejercicio_1_Visitor;

public class Turista implements IVisitante{
    private String id;
    private double money;
    private String name;
    private String estacion;

    public Turista(String id, double money, String name, String estacion) {
        this.id = id;
        this.money = money;
        this.name = name;
        this.estacion = estacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void visitar(LaPaz la_paz) {
        if(estacion.toLowerCase().equals("verano") || estacion.toLowerCase().equals("primavera")){
            System.out.println("\n-- Turista: " + name);
            System.out.println("-- ID     : " + id);
            System.out.println("-- Monto Original: " + money);
            double t = money - (Math.random() * 100000);
            System.out.println("-- Monto Actual  : " + t);
            System.out.println("VISITA COMPLETA");
        }else {
            System.out.println("VISITA NO COMPLETADA hace mucho frio.");
        }
    }

    @Override
    public void visitar(Cochabamba cochabamba) {
        if(estacion.toLowerCase().equals("otoño") || estacion.toLowerCase().equals("invierno")){
            System.out.println("\n-- Turista: " + name);
            System.out.println("-- ID     : " + id);
            System.out.println("-- Monto Original: " + money);
            double t = money - (cochabamba.getNumHabitantes()*0.1);
            System.out.println("-- Monto Actual  : " + t);
            System.out.println("VISITA COMPLETA");
        }else {
            System.out.println("\nVISITA NO COMPLETADA hay mucha gente.\n");
        }
    }

    @Override
    public void visitar(SantaCruz santa_cruz) {
        if(!estacion.toLowerCase().equals("verano")){
            System.out.println("\n-- Turista: " + name);
            System.out.println("-- ID     : " + id);
            System.out.println("-- Monto Original: " + money);
            double t = money - (santa_cruz.getNumProvincias()*0.5);
            System.out.println("-- Monto Actual  : " + t);
            System.out.println("VISITA COMPLETA");
        }else {
            System.out.println("\nVISITA NO COMPLETADA hace mucho calor.\n");
        }
    }
}
