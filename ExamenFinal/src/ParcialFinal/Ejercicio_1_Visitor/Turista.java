package ParcialFinal.Ejercicio_1_Visitor;

public class Turista implements IVisitante{
    private String id;
    private Integer money;
    private String name;
    private String estacion;

    public Turista(String ID, Integer money, String name) {
        this.id = ID;
        this.money = money;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
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
            int t = (int)Math.random()*10+money-2;
            System.out.println("-- Monto Actual  : " + t);
            System.out.println("VISITA COMPLETA");
        }else {

        }
    }

    @Override
    public void visitar(Cochabamba cochabamba) {

    }

    @Override
    public void visitar(SantaCruz santa_cruz) {

    }
}
