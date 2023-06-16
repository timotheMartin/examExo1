package Example;

/**
 * La classe represente un employe.
 */
public class employe {
    private String firstName;
    private String lastName;
    private int experienceYears;
    private String level;

    /**
     * @param firstName      le prenom de l'employe
     * @param lastName       le nom de famille de l'employe
     * @param experienceYears le nombre d'années d'expérience de l'employe
     * @param level          le niveau de l'employe
     */
    public employe(String firstName, String lastName, int experienceYears, String level) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experienceYears = experienceYears;
        this.level = level;
    }

    /**
     * @return le prenom de l'employe
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return le nom de famille de l'employe
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return le nombre d'annes d'experience de l'employe
     */
    public int getExperienceYears() {
        return experienceYears;
    }

    /**
     * @return le niveau de l'employe
     */
    public String getLevel() {
        return level;
    }
}

