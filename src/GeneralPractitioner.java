public class GeneralPractitioner extends HealthProfessional {
    // 额外的实例变量
    private String clinic;

    // 默认构造函数
    public GeneralPractitioner() {
        // 如果需要，默认构造函数可以初始化一些默认值
    }

    // 参数化构造函数
    public GeneralPractitioner(int id, String name, String specialization, String clinic) {
        super(id, name, specialization);
        this.clinic = clinic;
    }

    // 获取器和设置器
    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    // 打印详情的方法
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Clinic: " + getClinic());
    }
}