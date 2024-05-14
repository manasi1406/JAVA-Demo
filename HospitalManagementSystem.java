import java.util.ArrayList;
import java.util.Scanner;

class Patient {
     String name;
     int age;
     String condition;

    public Patient(String name, int age, String condition) {
        this.name = name;
        this.age = age;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }
}

class Doctor {
    String name;
    String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
    public String getName() {
        return name;
    }
}

class Appointment {
    Doctor doctor;
    Patient patient;
    String date;

    public Appointment(Doctor doctor, Patient patient, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public Patient getPatient() {
        return patient;
    }
    public String getDate() {
        return date;
    }
}

public class HospitalManagementSystem {
     ArrayList<Doctor> doctors;
     ArrayList<Patient> patients;
     ArrayList<Appointment> appointments;

    public HospitalManagementSystem() {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void scheduleAppointment(Doctor doctor, Patient patient, String date) {
        Appointment appointment = new Appointment(doctor, patient, date);
        appointments.add(appointment);
    }

    public Doctor findDoctorByName(String name) {
        for (Doctor doctor : doctors) {
            if (doctor.getName().equalsIgnoreCase(name)) {
                return doctor;
            }
        }
        return null; // Doctor not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HospitalManagementSystem hospital = new HospitalManagementSystem();

        System.out.println("Enter doctor details:");
        System.out.println("Name: ");
        String doctorName = scanner.nextLine();
        System.out.println("Specialization: ");
        String doctorSpecialization = scanner.nextLine();
        Doctor doctor = new Doctor(doctorName, doctorSpecialization);
        hospital.addDoctor(doctor);

        System.out.println("\nEnter patient details:");
        System.out.println("Name: ");
        String patientName = scanner.nextLine();
        System.out.println("Age: ");
        int patientAge = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Condition: ");
        String patientCondition = scanner.nextLine();
        Patient patient = new Patient(patientName, patientAge, patientCondition);
        hospital.addPatient(patient);

        System.out.println("\nEnter appointment details:");
        System.out.println("Doctor name: ");
        String doctorNameInput = scanner.nextLine();
        System.out.print("Patient name: ");
        String patientNameInput = scanner.nextLine();
        System.out.println("Date (YYYY-MM-DD): ");
        String appointmentDate = scanner.nextLine();

        Doctor appointmentDoctor = hospital.findDoctorByName(doctorNameInput);
        Patient appointmentPatient = hospital.findPatientByName(patientNameInput);

        if (appointmentDoctor != null && appointmentPatient != null) {
            hospital.scheduleAppointment(appointmentDoctor, appointmentPatient, appointmentDate);
            System.out.println("Appointment scheduled successfully.");
        } else {
            System.out.println("Doctor or patient not found.");
        }


    }

    public Patient findPatientByName(String patientNameInput) {
        for (Patient patient : patients) {
            if(patient.getName().equalsIgnoreCase(patientNameInput)) {
                return patient;
            }
        }

        return null;
    }
}