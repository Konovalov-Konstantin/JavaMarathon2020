package day11.task1;

public class Courier implements Worker {

    private int salary;
    private Warehouse w;
    private boolean bonus;

    public Courier(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary+=100;
        w.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (w.getCountDeliveredOrders() < 10_000) {
            System.out.println("Бонус не доступен");
            return;
        }
        if (bonus) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary +=50_000;
        bonus = true;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
