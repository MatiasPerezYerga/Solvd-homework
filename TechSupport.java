import java.math.BigDecimal;

public class TechSupport extends  Employee{

    private  int softSkills;
    private int techskills;


    public TechSupport(int age, String name, String lastName, String languageContact, Integer id, Integer employeeId, double salary, int softSkills, int techskills) {
        super(age, name, lastName, languageContact, id, employeeId, salary);
        this.softSkills = softSkills;
        this.techskills = techskills;
    }

    public int getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(int softSkills) {
        this.softSkills = softSkills;
    }

    public int getTechskills() {
        return techskills;
    }

    public void setTechskills(int techskills) {
        this.techskills = techskills;
    }


}
