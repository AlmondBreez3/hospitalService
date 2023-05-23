package sprStudy.hongikHospitalService.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue
    @Column(name="DEPARTMENT_ID")
    private Long id;

    private Integer number;


    @ManyToOne
    @JoinColumn(name = "HOSPITAL_ID")
    private Hospital hospital;

    @ManyToOne(fetch = FetchType.LAZY)
    private Doctor doctor;

}
