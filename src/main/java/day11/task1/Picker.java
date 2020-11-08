package day11.task1;

public class Picker implements Worker {
    private int salary;
    private Warehouse w;
    private boolean bonus;

    public Picker(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary+=80;
        w.incrementPickedOrders();
    }

    @Override
    public void bonus() {
        if (w.getCountPickedOrders() < 10_000) {
            System.out.println("Бонус не доступен");
            return;
        }
        if (bonus) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
            salary +=70_000;
            bonus = true;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
