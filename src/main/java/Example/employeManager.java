package Example;

/**
 * cette classe represente le gestionnaire d'employes.
 */
public class employeManager {

    /**
     * @param employe l'employe pour lequel calculer le salaire
     * @return le salaire prévisionnel de l'employé
     */
    public double calculateSalary(employe employe) {
        double baseSalary;

        switch (employe.getLevel()) {
            case "Junior":
                baseSalary = 20000.0;
                break;
            case "Intermediate":
                baseSalary = 40000.0;
                break;
            case "Senior":
                baseSalary = 60000.0;
                break;
            default:
                throw new IllegalArgumentException("Niveau d'expérience invalide : " + employe.getLevel());
        }

        double experienceMultiplier = calculateExperienceMultiplier(employe.getExperienceYears());

        return baseSalary + (baseSalary * experienceMultiplier);
    }

    /**
     * @param experienceYears le nombre d'annees d'expérience
     * @return le coefficient d'anciennete calculée
     */
    public double calculateExperienceMultiplier(int experienceYears) {
        double percentIncreasePerYear = 0.05;
        double experienceMultiplier = 1.0 + (percentIncreasePerYear * experienceYears);
        return experienceMultiplier;
    }
}
