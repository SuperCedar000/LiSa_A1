public class GeneralPractitioner extends HealthProfessio    private String clinic;


    public GeneralPractitioner() {
      
    }


    public GeneralPractitioner(int id, String name, String specialization, String clinic) {
        super(id, name, specialization);
        this.clinic = clinic;
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }


    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Clinic: " + getClinic());
    }
}