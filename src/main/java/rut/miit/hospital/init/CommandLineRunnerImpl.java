package rut.miit.hospital.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rut.miit.hospital.dtos.*;
import rut.miit.hospital.services.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    private PersonService personService;
    private ContactService contactService;
    private DoctorService doctorService;
    private PatientService patientService;
    private VisitService visitService;

    public CommandLineRunnerImpl(PersonService personService, ContactService contactService, DoctorService doctorService, PatientService patientService, VisitService visitService) {
        this.personService = personService;
        this.contactService = contactService;
        this.doctorService = doctorService;
        this.patientService = patientService;
        this.visitService = visitService;
    }




    @Override
    public void run(String... args) throws Exception {
        seedData();

    }

    private void seedData() throws IOException {
        ContactDto doctorContact1 = new ContactDto(0, "+1256789", "Baker Street 221B, London");
        ContactDto doctorContact2 = new ContactDto(0, "+1856789", "Oxford Street 32, London");
        ContactDto doctorContact3 = new ContactDto(0, "+2056789", "King's Road 145, London");
        ContactDto doctorContact4 = new ContactDto(0, "+3056789", "Abbey Road 10, London");
        ContactDto doctorContact5 = new ContactDto(0, "+4056789", "Regent Street 50, London");

        ContactDto patientContact1 = new ContactDto(0, "+5012345", "Piccadilly 25, London");
        ContactDto patientContact2 = new ContactDto(0, "+6012345", "Shoreditch High Street 44, London");
        ContactDto patientContact3 = new ContactDto(0, "+7012345", "Oxford Circus 33, London");
        ContactDto patientContact4 = new ContactDto(0, "+8012345", "Knightsbridge 78, London");
        ContactDto patientContact5 = new ContactDto(0, "+9012345", "Greenwich 86, London");
        ContactDto patientContact6 = new ContactDto(0, "+10012345", "Covent Garden 72, London");
        ContactDto patientContact7 = new ContactDto(0, "+11012345", "Tower Bridge Road 18, London");
        ContactDto patientContact8 = new ContactDto(0, "+12012345", "King's Cross 91, London");
        ContactDto patientContact9 = new ContactDto(0, "+13012345", "Whitechapel 56, London");
        ContactDto patientContact10 = new ContactDto(0, "+14012345", "Leicester Square 28, London");
        ContactDto patientContact11 = new ContactDto(0, "+15012345", "Carnaby Street 45, London");
        ContactDto patientContact12 = new ContactDto(0, "+16012345", "Portobello Road 66, London");
        ContactDto patientContact13 = new ContactDto(0, "+17012345", "Notting Hill 77, London");
        ContactDto patientContact14 = new ContactDto(0, "+18012345", "Paddington 88, London");
        ContactDto patientContact15 = new ContactDto(0, "+19012345", "Chelsea 99, London");


        PersonDto doctorPerson1 = new PersonDto(0, "John", "Smith", "m", new Date(80, 4, 15), doctorContact1);
        PersonDto doctorPerson2 = new PersonDto(0, "Robert", "Johnson", "m", new Date(78, 6, 30), doctorContact2);
        PersonDto doctorPerson3 = new PersonDto(0, "James", "Brown", "m", new Date(82, 3, 2), doctorContact3);
        PersonDto doctorPerson4 = new PersonDto(0, "David", "Williams", "m", new Date(75, 11, 12), doctorContact4);
        PersonDto doctorPerson5 = new PersonDto(0, "William", "Miller", "m", new Date(81, 9, 22), doctorContact5);

        PersonDto patientPerson1 = new PersonDto(0, "Emily", "Smith", "f", new Date(90, 5, 15), patientContact1);
        PersonDto patientPerson2 = new PersonDto(0, "Olivia", "Johnson", "f", new Date(88, 4, 7), patientContact2);
        PersonDto patientPerson3 = new PersonDto(0, "Sophia", "Brown", "f", new Date(92, 1, 25), patientContact3);
        PersonDto patientPerson4 = new PersonDto(0, "Mia", "Williams", "f", new Date(87, 7, 30), patientContact4);
        PersonDto patientPerson5 = new PersonDto(0, "Isabella", "Miller", "f", new Date(89, 10, 10), patientContact5);
        PersonDto patientPerson6 = new PersonDto(0, "Ava", "Davis", "f", new Date(93, 2, 17), patientContact6);
        PersonDto patientPerson7 = new PersonDto(0, "Charlotte", "Wilson", "f", new Date(86, 8, 5), patientContact7);
        PersonDto patientPerson8 = new PersonDto(0, "Amelia", "Taylor", "f", new Date(91, 0, 12), patientContact8);
        PersonDto patientPerson9 = new PersonDto(0, "Harper", "Anderson", "f", new Date(90, 6, 20), patientContact9);
        PersonDto patientPerson10 = new PersonDto(0, "Ella", "Thomas", "f", new Date(88, 3, 28), patientContact10);
        PersonDto patientPerson11 = new PersonDto(0, "Lily", "Jackson", "f", new Date(92, 5, 6), patientContact11);
        PersonDto patientPerson12 = new PersonDto(0, "Chloe", "White", "f", new Date(87, 10, 15), patientContact12);
        PersonDto patientPerson13 = new PersonDto(0, "Madison", "Harris", "f", new Date(91, 1, 22), patientContact13);
        PersonDto patientPerson14 = new PersonDto(0, "Emma", "Martin", "f", new Date(93, 4, 30), patientContact14);
        PersonDto patientPerson15 = new PersonDto(0, "Grace", "Thompson", "f", new Date(90, 11, 1), patientContact15);

        DoctorDetailsDto doctor1 = new DoctorDetailsDto(0, doctorPerson1, "LIC00001", new BigDecimal(1000), "Pediatrician");
        DoctorDetailsDto doctor2 = new DoctorDetailsDto(0, doctorPerson2, "LIC00002", new BigDecimal(1200), "Cardiologist");
        DoctorDetailsDto doctor3 = new DoctorDetailsDto(0, doctorPerson3, "LIC00003", new BigDecimal(1100), "Neurologist");
        DoctorDetailsDto doctor4 = new DoctorDetailsDto(0, doctorPerson4, "LIC00004", new BigDecimal(1500), "Orthopedist");
        DoctorDetailsDto doctor5 = new DoctorDetailsDto(0, doctorPerson5, "LIC00005", new BigDecimal(900), "Oncologist");

        PatientDetailsDto patient1 = new PatientDetailsDto(0, patientPerson1, "INS123456789");
        PatientDetailsDto patient2 = new PatientDetailsDto(0, patientPerson2, "INS987654321");
        PatientDetailsDto patient3 = new PatientDetailsDto(0, patientPerson3, "INS456789123");
        PatientDetailsDto patient4 = new PatientDetailsDto(0, patientPerson4, "INS321987654");
        PatientDetailsDto patient5 = new PatientDetailsDto(0, patientPerson5, "INS789123456");
        PatientDetailsDto patient6 = new PatientDetailsDto(0, patientPerson6, "INS654321987");
        PatientDetailsDto patient7 = new PatientDetailsDto(0, patientPerson7, "INS147258369");
        PatientDetailsDto patient8 = new PatientDetailsDto(0, patientPerson8, "INS369258147");
        PatientDetailsDto patient9 = new PatientDetailsDto(0, patientPerson9, "INS258369147");
        PatientDetailsDto patient10 = new PatientDetailsDto(0, patientPerson10, "INS741852963");
        PatientDetailsDto patient11 = new PatientDetailsDto(0, patientPerson11, "INS963852741");
        PatientDetailsDto patient12 = new PatientDetailsDto(0, patientPerson12, "INS852741963");
        PatientDetailsDto patient13 = new PatientDetailsDto(0, patientPerson13, "INS159263847");
        PatientDetailsDto patient14 = new PatientDetailsDto(0, patientPerson14, "INS753159862");
        PatientDetailsDto patient15 = new PatientDetailsDto(0, patientPerson15, "INS864159273");

        visitService.addNewVisit(new VisitDto(0, "Common Cold", new Date(2023, 01, 02), "Fever, Cough", doctor1, patient1));
        visitService.addNewVisit(new VisitDto(0, "Common Cold", new Date(2023, 01, 05), "Fever, Cough, Sneezing", doctor1, patient2));
        visitService.addNewVisit(new VisitDto(0, "Asthma", new Date(2023, 01, 07), "Difficulty Breathing", doctor1, patient3));
        visitService.addNewVisit(new VisitDto(0, "Heart Arrhythmia", new Date(2023, 01, 10), "Palpitations", doctor2, patient4));
        visitService.addNewVisit(new VisitDto(0, "Coronary Artery Disease", new Date(2023, 01, 12), "Chest Pain", doctor2, patient5));
        visitService.addNewVisit(new VisitDto(0, "Heart Failure", new Date(2023, 01, 14), "Fatigue, Shortness of Breath", doctor2, patient6));
        visitService.addNewVisit(new VisitDto(0, "Epilepsy", new Date(2023, 01, 16), "Seizures", doctor3, patient7));
        visitService.addNewVisit(new VisitDto(0, "Stroke", new Date(2023, 01, 18), "Sudden numbness, Confusion", doctor3, patient8));
        visitService.addNewVisit(new VisitDto(0, "Arthritis", new Date(2023, 01, 20), "Joint Pain", doctor4, patient9));
        visitService.addNewVisit(new VisitDto(0, "Arthritis", new Date(2023, 01, 21), "Joint Pain, Swelling", doctor4, patient10));
        visitService.addNewVisit(new VisitDto(0, "Lung Cancer", new Date(2023, 01, 24), "Persistent cough, Chest pain", doctor5, patient11));
        visitService.addNewVisit(new VisitDto(0, "Breast Cancer", new Date(2023, 01, 25), "Lump in the breast, Change in breast shape", doctor5, patient12));
        visitService.addNewVisit(new VisitDto(0, "Common Cold", new Date(2023, 01, 27), "Fever, Cough, Sore throat", doctor1, patient1));
        visitService.addNewVisit(new VisitDto(0, "Heart Arrhythmia", new Date(2023, 01, 28), "Dizziness, Shortness of Breath", doctor2, patient4));
        visitService.addNewVisit(new VisitDto(0, "Stroke", new Date(2023, 01, 29), "Sudden numbness, Difficulty walking", doctor3, patient8));
        visitService.addNewVisit(new VisitDto(0, "Arthritis", new Date(2023, 01, 30), "Joint Pain, Stiffness", doctor4, patient10));
        visitService.addNewVisit(new VisitDto(0, "Lung Cancer", new Date(2023, 02, 02), "Weight loss, Shortness of breath", doctor5, patient11));
        visitService.addNewVisit(new VisitDto(0, "Flu", new Date(2023, 02, 05), "Fever, Cough, Body Aches", doctor1, patient13));
        visitService.addNewVisit(new VisitDto(0, "Asthma", new Date(2023, 02, 06), "Shortness of Breath, Chest Tightness", doctor1, patient14));
        visitService.addNewVisit(new VisitDto(0, "Asthma", new Date(2023, 02, 02), "Wheezing, Coughing", doctor1, patient15));
        visitService.addNewVisit(new VisitDto(0, "Hypertension", new Date(2023, 02, 10), "Headache, Shortness of Breath", doctor2, patient6));
        visitService.addNewVisit(new VisitDto(0, "Coronary Artery Disease", new Date(2023, 02, 12), "Chest Pain, Nausea", doctor2, patient7));
        visitService.addNewVisit(new VisitDto(0, "Heart Arrhythmia", new Date(2023, 02, 14), "Fainting, Rapid Heartbeat", doctor2, patient8));
        visitService.addNewVisit(new VisitDto(0, "Migraine", new Date(2023, 02, 16), "Severe Headache, Nausea", doctor3, patient9));
        visitService.addNewVisit(new VisitDto(0, "Alzheimer's Disease", new Date(2023, 02, 18), "Memory Loss, Confusion", doctor3, patient10));
        visitService.addNewVisit(new VisitDto(0, "Parkinson's Disease", new Date(2023, 02, 20), "Tremor, Slowed Movement", doctor3, patient11));
        visitService.addNewVisit(new VisitDto(0, "Prostate Cancer", new Date(2023, 03, 01), "Frequent Urination, Blood in Semen", doctor5, patient15));
        visitService.addNewVisit(new VisitDto(0, "Lung Cancer", new Date(2023, 03, 03), "Chest Pain, Hoarseness", doctor5, patient1));
        visitService.addNewVisit(new VisitDto(0, "Colon Cancer", new Date(2023, 03, 05), "Changes in Bowel Habits, Rectal Bleeding", doctor5, patient2));
        visitService.addNewVisit(new VisitDto(0, "Osteoporosis", new Date(2023, 02, 22), "Back Pain, Loss of Height", doctor4, patient12));
        visitService.addNewVisit(new VisitDto(0, "Fracture", new Date(2023, 02, 24), "Severe Pain, Swelling", doctor4, patient13));
        visitService.addNewVisit(new VisitDto(0, "Fracture", new Date(2023, 02, 26), "Inability to Move the Limb, Deformity", doctor4, patient14));



//        ContactDto cdDoctor = new ContactDto(0,"+8925","ул.Пушкина 8к3");
//        ContactDto cdPatient = new ContactDto(0,"+278112","ул.Дубровка 87к4");
//
//        PersonDto pdDoctor = new PersonDto(0,"Антон","Иванов","m",new Date(1980,05,15),cdDoctor);
//        PersonDto pdPatient = new PersonDto(0,"Галина","Сергеевна","w",new Date(1976,01,01),cdPatient);
//
//
//        PatientDetailsDto patientDetailsDto = new PatientDetailsDto(0,pdPatient,"abc123");
//        DoctorDetailsDto doctorDetailsDto = new DoctorDetailsDto(0,pdDoctor,"00000",new BigDecimal(1000),"pediatrician");
////
//        VisitDto visitDto = new VisitDto(0,"amnesia",new Date(2023,01,02),"нарушения ориентации",doctorDetailsDto,patientDetailsDto);
//
//        visitService.addNewVisit(visitDto);
//
//
//        VisitDto visitDto2 = new VisitDto(0,"головная боль",new Date(1900,01,02),"дичайший мега понос",doctorService.getDoctorById(1),patientService.getPatientById(1));
//
//        visitService.addNewVisit(visitDto2);
    }

}
