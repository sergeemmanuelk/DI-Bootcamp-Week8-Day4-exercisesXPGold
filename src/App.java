import exercise1.Exercise1;
import exercise2.Exercise2;

public class App {
    public static void main(String[] args) throws Exception {
        // Exercice 1
        System.out.println("Affected rows for update: " + Exercise1.updateSalary());

        // Exercice 2
        System.out.println("Affected rows for delete: " + Exercise2.deleteData());
    }
}
