package Example;

/**
 * La classe représente un employé.
 */
public class employe {
    private String prenom;
    private String nom;
    private int anneesExperience;
    private String niveau;

    /**
     * @param prenom           le prénom de l'employé
     * @param nom              le nom de famille de l'employé
     * @param anneesExperience le nombre d'années d'expérience de l'employé
     * @param niveau           le niveau de l'employé
     */
    public employe(String prenom, String nom, int anneesExperience, String niveau) {
        this.prenom = prenom;
        this.nom = nom;
        this.anneesExperience = anneesExperience;
        this.niveau = niveau;
    }

    /**
     * @return le prénom de l'employé
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @return le nom de famille de l'employé
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return le nombre d'années d'expérience de l'employé
     */
    public int getAnneesExperience() {
        return anneesExperience;
    }

    /**
     * @return le niveau de l'employé
     */
    public String getNiveau() {
        return niveau;
    }
}
