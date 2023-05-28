package sprStudy.hongikHospitalService.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy="DEPARTMENT_ID")
    private List<Doctor> doctorList =new ArrayList<>();

}
