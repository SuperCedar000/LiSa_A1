

    
public class GeneralPractitioner extends HealthProfessional {
    // 额外的实例变量
    private String clinic;

    // 默认构造函数
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

    // 打印健康专业人士详情的方法
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Clinic: " + getClinic());
    }
}