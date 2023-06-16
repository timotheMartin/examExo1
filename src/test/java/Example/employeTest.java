package Example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class employeTest {
    private employeManager employeManager = new employeManager();

    @Test
    public void testJunior1A() {
        employe employe = new employe("John", "Doe", 1, "Junior");
        double salaireAttendu = 20000.0;

        double salaireEffectif = employeManager.calculateSalary(employe);

        Assertions.assertEquals(salaireAttendu, salaireEffectif);
    }

    @Test
    public void testIntermediaireAvec5A() {
        employe employe = new employe("Alice", "Johnson", 5, "Intermédiaire");
        double salaireAttendu = 40000.0 + (40000.0 * 0.05 * 5);

        double salaireEffectif = employeManager.calculateSalary(employe);

        Assertions.assertEquals(salaireAttendu, salaireEffectif);
    }

    @Test
    public void testSeniorAvec10A() {
        employe employe = new employe("Robert", "Williams", 10, "Senior");
        double salaireAttendu = 60000.0 + (60000.0 * 0.05 * 10);

        double salaireEffectif = employeManager.calculateSalary(employe);

        Assertions.assertEquals(salaireAttendu, salaireEffectif);
    }

    @Test
    public void testSeniorAvec20A() {
        employe employe = new employe("Sarah", "Smith", 20, "Senior");
        double salaireAttendu = 60000.0 + (60000.0 * 0.05 * 20);

        double salaireEffectif = employeManager.calculateSalary(employe);

        Assertions.assertEquals(salaireAttendu, salaireEffectif);
    }

    @Test
    public void testScenarioPersonnalise() {
        employe employe = new employe("Jane", "Doe", 3, "Junior");
        double salaireAttendu = 20000.0 + (20000.0 * 0.05 * 3);

        double salaireEffectif = employeManager.calculateSalary(employe);

        Assertions.assertEquals(salaireAttendu, salaireEffectif);
    }

}
