public class HealthProfessional {
    // 实例变量
    private int id;
    private String name;
    private String specialization;

    // 默认构造函数
    public HealthProfessional() {}

    // 参数化构造函数
    public HealthProfessional(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    // 获取器和设置器
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("Health Professional ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }
}