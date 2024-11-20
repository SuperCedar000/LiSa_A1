import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {

        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Linn", "General Practice", "Southport Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Joon", "General Practice", "Gold Coast Clinic");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Brrow", "General Practice", "Brisbane Clinic");

        Dietitian dt1 = new Dietitian(4, "Ms. Wyute", "Dietetics", "RD");
        Dietitian dt2 = new Dietitian(5, "Mr. Grken", "Dietetics", "CDC");

        // 打印所有用户的详细信息
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        dt1.printDetails();
        dt2.printDetails();

        ArrayList<Appointment> appointments = new ArrayList<>();

        // 创建新的预约
        createAppointment(appointments, "Joon Doo", "13107073321", "08:30", gp1);
        createAppointment(appointments, "Lane Mith", "18605056789", "10:10", dt1);
        createAppointment(appointments, "Miim Biyn", "15050323210", "14:20", gp2);
        createAppointment(appointments, "Sopah Gobn", "13876531221", "16:55", dt2);

        // 打印预约
        printExistingAppointments(appointments);

        // 取消一个预约
        cancelBooking(appointments, "18605056789");

        // 再次打印现有预约
        printExistingAppointments(appointments);
    }

    // 创建新的预约
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        Appointment appointment = new Appointment(patientName, mobilePhone, timeSlot, doctor);
        appointments.add(appointment);
    }

    // 打印现有预约
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
            }
        }
    }

    public static void cancelBooking(ArrayList<Appointment> appointments, String mobilePhone) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientMobile().equals(mobilePhone)) {
                appointments.remove(i);
                System.out.println("Appointment with mobile " + mobilePhone + " has been canceled.");
                return;
            }
        }
        System.out.println("No appointment found with mobile " + mobilePhone);
    }
}