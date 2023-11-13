
import java.util.Scanner;
import org.apache.log4j.Logger;
public class QAEngineer extends Employee implements Debugger, Developer {

    Logger logger= Logger.getLogger(Main.class);

    private String solution;

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }



    public QAEngineer(int age, String name, String lastName, String languageContact, Integer id, Integer employeeId, double salary, String solution) {
        super(age, name, lastName, languageContact, id, employeeId, salary);
        this.solution = solution;
    }

    @Override
    public String toString() {
        return " The solution is " +  solution + '.' ;
    }

    @Override
    public void introduce() {
        super.introduce();
        logger.info("I'm QA ENGINEER and the solution is " + getSolution());
       // System.out.println("I'm QA ENGINEER and the solution is " + getSolution());
    }

    @Override
    public void code() {
        super.code();
        logger.info("I can code frontend and backend side in order to debug it");
       // System.out.println("I can code frontend and backend side in order to debug it");
    }

    @Override
    public void debug() {
        logger.info("First I will check de Frontend, and then...Backend");
       // System.out.println("First I will check de Frontend, and then...Backend");
    }



    public void testExampleScenario() throws TestFailedException{

        boolean condition = testing1();

        if (!condition) {
            throw new TestFailedException("The result of test was FAILED");
        }
    }


    public  boolean testing1(){
        logger.info("Performing QA testing 1.");
        //System.out.println("Performing QA testing 1.");
        return false;
    }

    public void enterWrongAccessCode(int key) throws AccessDeniedException {

        if (key != 15463) {
           // System.out.println("WRONG KEY!");
            throw new AccessDeniedException("Wrong from the QAEnginnerClass");
        }

    }


    public void checkAccessCode() {
        try (Scanner scanner = new Scanner(System.in)) {
           logger.info("Enter access code: ");
            System.out.print("Enter access code: ");
            int userEnteredCode = scanner.nextInt();
            logger.info("The given code was:" + userEnteredCode);
            enterWrongAccessCode(userEnteredCode);

            logger.info("Access granted!");
           System.out.println("Access granted!"); // This will be printed if the access code is correct
        } catch (AccessDeniedException e) {
            logger.info("Access denied: " + e.getMessage());
            System.err.println("Access denied: " + e.getMessage());

        } catch (Exception e) {
            logger.info("An unexpected error occurred: " + e.getMessage());
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
