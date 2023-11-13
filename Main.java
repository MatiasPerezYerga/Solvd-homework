import org.apache.log4j.Logger;


public class Main {
    public static void main(String[] args) throws AccessDeniedException {

        Logger logger = Logger.getLogger(Main.class);
        logger.info("LOGEANDO UN MENSAJE DE INFO;");
        logger.error("Este es un mensaje de ERROR");
        logger.warn("This is a warning message ");

        System.out.println("Welcome to the software company!");
        logger.info("WELCOME TO THE SOFTWARE COMPANY");

        QAEngineer qaEngineer = new QAEngineer(44, "Matias", "Perez Yerga", "Spanish", 34917579, 465454321, 900.00, "La solucion depende del problema");


        //System.out.println(qaEngineer);
        logger.info("El QA Engineer instanciado es:");
        logger.info(qaEngineer);

        String[]programmingLanguages = {"Java", "Python", "JavaScript"};

        Employee backendDev  = new BackendDev (34, "Leo", "Messi", "Spanish",  564653245,  31658978,  4000.00,programmingLanguages  ) ;

        String[]programmingLanguagesFE = {"JavaScript","Typescript"};
        Employee frontendDev = new FrontendDev(21, "Juan", "Perez","Spanish" , 45235421, 6598446, 700.00, programmingLanguagesFE);


        Consultant consultant = new Consultant(24,"Carmen","Prime","French",46785432,1234567,600.00,10,9);

        Junior junior = new Junior(19,"Julian","Terminator","Spanish",45456465,455645646,200.00 ,"I dont'have experience.");

        backendDev.code();
        frontendDev.code();



        // Creating an Employee object but referencing it as a Person
        Person person = new Employee(30, "John", "Doe", "English", 123, 456, 50000.0);

        // Accessing the overridden method in the Employee class
        //System.out.println("Employee ID: " + ((Employee) person).getEmployeeId());
        logger.info("Employee ID: " + ((Employee) person).getEmployeeId());
        // Accessing a method from the Person class
        //System.out.println("Person's name: " + person.getName());
        logger.info("Person's name: " + person.getName());
        // Using a method from the superclass (Person) on the object of the subclass (Employee)
        //System.out.println("Employee's age: " + person.getAge());
        logger.info("Employee's age: " + person.getAge());


        // Creating an Employee object but referencing it as a Person
        Person qaEngineer2 = new QAEngineer(44, "Matias", "Perez Yerga", "Spanish", 34917579, 465454321, 900.00, "La solucion depende del problema");

        // Accessing the overridden method in the Employee class
        System.out.println("Employee ID: " + ((Employee) qaEngineer2).getEmployeeId());

        // Accessing a method from the Person class
        System.out.println("Person's name: " + qaEngineer2.getName());

        // Using a method from the superclass (Person) on the object of the subclass (Employee)
        System.out.println("Employee's age: " + qaEngineer2.getAge());

        System.out.println("The solution from the class QAEngineer is " + ((QAEngineer) qaEngineer2).getSolution());
        //An Employee object is created and referenced by a Person type.
        //Despite being referenced as a Person, because Employee extends Person, it can be treated as a Person.
        //The Employee object can still access the overridden methods of the Employee class (e.g., getEmployeeId()).
        //It can also access the methods inherited from the Person class (e.g., getName(), getAge()).
        //Polymorphism here allows an Employee object to be referenced as a Person and treated as both an Employee and a Person, enabling flexibility in how it's utilized.


        //FINAL METHOD. NO se puede OVERRIDE

        logger.info("Please,  QA Engineer 2 and Junior, lets introduce and code:");

        Employee[] employees = new Employee[2];

        employees[1] = (Employee) qaEngineer2;
        employees[0] = (Employee) junior;
        for (Employee employee: employees){
            employee.introduce();
            employee.code();

        }


    qaEngineer2.introduce();
        ((QAEngineer) qaEngineer2).giveAccess();


        junior.code();
        ((QAEngineer) qaEngineer2).code();

                junior.introduce();
        junior.giveAccess();
        //IMPRIMIR AL JUNIOR
       // System.out.println(junior);

        junior.buscarCafe();


        ((QAEngineer) qaEngineer2).testing1();




        try {
            // Code that might throw TestFailedException
            ((QAEngineer) qaEngineer2).testExampleScenario();
        } catch (TestFailedException e) {
            // Handle the exception (e.g., log it, mark the test as failed)
            logger.error("Test Failed: " + e.getMessage());
            //System.err.println("Test Failed: " + e.getMessage());
            //System.out.println("This a message from the block catch");
        }

        //TRY CATCH ALLOWING THE PROGRAM TO CONTINUE EXECUTING!
        junior.buscarCafe();

        ((QAEngineer) qaEngineer2).testing1();



        /*try {

            ((QAEngineer) qaEngineer2).enterWrongAccessCode(465);
        } catch (AccessDeniedException e) {

            System.err.println("Test Failed: " + e.getMessage());

        }*/


        ((QAEngineer) qaEngineer2).enterWrongAccessCode(15463);
       // ((QAEngineer) qaEngineer2).enterWrongAccessCode(4563);
      // AFTER THE EXCEPTIONS, THE EMPLOYEES PERFORMED BOTH METHOD INTRODUCE AND CODE AND PROGRAM FINISHED IN A CONTROLED WAY.

        for (Employee employee: employees){
            employee.introduce();
            employee.code();

        }


        ((QAEngineer) qaEngineer2).checkAccessCode();


    }


    }


