package Example;

/**
 * Cette classe représente le gestionnaire d'employés.
 */
public class employeManager {

    /**
     * @param employe l'employé pour lequel calculer le salaire
     * @return le salaire prévisionnel de l'employé
     */
    public double calculerSalaire(employe employe) {
        double salaireDeBase;

        switch (employe.getNiveau()) {
            case "Junior":
                salaireDeBase = 20000.0;
                break;
            case "Intermédiaire":
                salaireDeBase = 40000.0;
                break;
            case "Senior":
                salaireDeBase = 60000.0;
                break;
            default:
                throw new IllegalArgumentException("Niveau d'experience invalide : " + employe.getNiveau());
        }

        double multiplicateurExperience = calculerMultiplicateurExperience(employe.getAnneesExperience());

        return salaireDeBase + (salaireDeBase * multiplicateurExperience);
    }

    /**
     * @param anneesExperience le nombre d'annes d'experience
     * @return le coefficient d'anciennete calculee
     */
    public double calculerMultiplicateurExperience(int anneesExperience) {
        double augmentationPourcentageParAnnee = 0.05;
        double multiplicateurExperience = 1.0 + (augmentationPourcentageParAnnee * anneesExperience);
        return multiplicateurExperience;
    }
}

