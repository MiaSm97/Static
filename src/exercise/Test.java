package exercise;

public class Test {
    public static void main(String[] args) {
        Employee worker1 = new Employee("John", "Doe", "Via Roma");
        Badge badgeWorker1 = new Badge(worker1);
        badgeWorker1.showBadgeDetails();
        Employee worker2 = new Employee("Jane", "Doe", "Via Milano");
        Badge badgeWorker2 = new Badge(worker2);
        badgeWorker2.showBadgeDetails();
    }
}
    /*define a tester class where you:
        create 2 new Employee objects
        create their new 2 Badge
        show to the user the 2 employees' badge details*/