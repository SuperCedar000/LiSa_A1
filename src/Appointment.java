package com.example.assignmentone;

/**
 * 表示一个预约的类。
 */
public class Appointment {
    // 实例变量
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional doctor;

    /**
     * 默认构造函数。
     */
    public Appointment() {
        // 初始化一些默认值，防止空指针异常
        this.patientName = "";
        this.patientMobile = "";
        this.timeSlot = "";
        this.doctor = null;
    }

    /**
     * 参数化构造函数。
     *
     * @param patientName 患者姓名
     * @param patientMobile 患者手机号
     * @param timeSlot 预约时间
     * @param doctor 负责的健康专业人士
     */
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        setPatientName(patientName);
        setPatientMobile(patientMobile);
        setTimeSlot(timeSlot);
        this.doctor = doctor;
    }

    /**
     * 获取患者姓名。
     *
     * @return 患者姓名
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * 设置患者姓名。
     *
     * @param patientName 患者姓名
     */
    public void setPatientName(String patientName) {
        if (patientName != null && !patientName.trim().isEmpty()) {
            this.patientName = patientName.trim();
        } else {
            throw new IllegalArgumentException("Patient name cannot be null or empty.");
        }
    }

    /**
     * 获取患者手机号。
     *
     * @return 患者手机号
     */
    public String getPatientMobile() {
        return patientMobile;
    }

    /**
     * 设置患者手机号。
     *
     * @param patientMobile 患者手机号
     */
    public void setPatientMobile(String patientMobile) {
        if (patientMobile != null && !patientMobile.trim().isEmpty()) {
            this.patientMobile = patientMobile.trim();
        } else {
            throw new IllegalArgumentException("Patient mobile cannot be null or empty.");
        }
    }

    /**
     * 获取预约时间。
     *
     * @return 预约时间
     */
    public String getTimeSlot() {
        return timeSlot;
    }

    /**
     * 设置预约时间。
     *
     * @param timeSlot 预约时间
     */
    public void setTimeSlot(String timeSlot) {
        if (timeSlot != null && !timeSlot.trim().isEmpty()) {
            this.timeSlot = timeSlot.trim();
        } else {
            throw new IllegalArgumentException("Time slot cannot be null or empty.");
        }
    }

    /**
     * 获取负责的健康专业人士。
     *
     * @return 负责的健康专业人士
     */
    public HealthProfessional getDoctor() {
        return doctor;
    }

    /**
     * 设置负责的健康专业人士。
     *
     * @param doctor 负责的健康专业人士
     */
    public void setDoctor(HealthProfessional doctor) {
        this.doctor = doctor;
    }

    /**
     * 打印预约详情。
     */
    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Doctor Details:");
        if (doctor != null) {
            doctor.printDetails();
        } else {
            System.out.println("No doctor assigned.");
        }
    }

    /**
     * 返回对象的字符串表示形式。
     *
     * @return 对象的字符串表示形式
     */
    @Override
    public String toString() {
        return "Appointment{" +
                "patientName='" + patientName + '\'' +
                ", patientMobile='" + patientMobile + '\'' +
                ", timeSlot='" + timeSlot + '\'' +
                ", doctor=" + (doctor != null ? doctor.getName() : "null") +
                '}';
    }
}