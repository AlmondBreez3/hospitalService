package sprStudy.hongikHospitalService.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Reservation {

    @ManyToOne
    @JoinColumn(name="PATIENT_ID")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name="DOCTOR_ID")
    private Doctor doctor;

    @Id
    private LocalDateTime time;
}
