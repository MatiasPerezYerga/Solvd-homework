//

public class SalesEngineer  extends  Employee implements ClientNegotiator, ProductPresenter {

    private int salesSkills;
    private int engineerSkills;

    public SalesEngineer(int age, String name, String lastName, String languageContact, Integer id, Integer employeeId, double salary, int salesSkills, int engineerSkills) {
        super(age, name, lastName, languageContact, id, employeeId, salary);
        this.salesSkills = salesSkills;
        this.engineerSkills = engineerSkills;
    }

    public int getSalesSkills() {
        return salesSkills;
    }

    public void setSalesSkills(int salesSkills) {
        this.salesSkills = salesSkills;
    }

    public int getEngineerSkills() {
        return engineerSkills;
    }

    public void setEngineerSkills(int engineerSkills) {
        this.engineerSkills = engineerSkills;
    }

    @Override
    public void negotiate() {

        System.out.println("Ok,  Help me to understand what you need, in order to can choose the best solution for you.");

    }

    @Override
    public void presentProduct() {
        System.out.println("The integration support JSON type, the methods: GET , POST, PUT, DELETE with an exposed endpoint.");

    }
}
