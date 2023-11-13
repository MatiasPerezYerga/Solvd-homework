public class Computer {
    private boolean  laptop;
    private String proccesor;


    public Computer(boolean laptop, String proccesor){
        this.laptop=laptop;
        this.proccesor=proccesor;

    }


    public void setLaptop(boolean laptop){
        this.laptop=laptop;
            }

    public boolean getLaptop(){

        return laptop;
    }


    public String getProccesor() {
        return proccesor;
    }

    public void setProccesor(String proccesor) {
        this.proccesor = proccesor;
    }






}
