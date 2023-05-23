package sprStudy.hongikHospitalService.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Long age;

    private Gender gender;

    @OneToMany(mappedBy = "patient")
    private List<Reservation> reservations = new ArrayList<>();

    @OneToMany(mappedBy = "patient")
    private List<Diagnosis> diagnoses = new ArrayList<>();
}
