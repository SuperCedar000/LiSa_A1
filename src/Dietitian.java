public class Dietitian extends HealthProfessional {
    // 额外的实例变量
    private String certification;

    // 默认构造函数
    public Dietitian() {}

    // 参数化构造函数
    public Dietitian(int id, String name, String specialization, String certification) {
        super(id, name, specialization);
        this.certification = certification;
    }

    // 获取器和设置器
    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    // 打印详情的方法
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Certification: " + certification);
    }
}