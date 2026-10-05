package Exercise2;

public class bmiTest {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Ali", 24, 145, 70);
        System.out.println("Name: " + bmi1.getName() + " | Age: " + bmi1.getAge());
        System.out.println("BMI: " + bmi1.getBMI() + " | Status: " + bmi1.getStatus());

        System.out.println();

        BMI bmi2 = new BMI("Aisha", 215, 70); // Uses default age (20)
        System.out.println("Name: " + bmi2.getName() + " | Age: " + bmi2.getAge());
        System.out.println("BMI: " + bmi2.getBMI() + " | Status: " + bmi2.getStatus());
    }
}