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
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Long career;

    //진료과 다대1
    @OneToMany(mappedBy = "doctor")
    private List<Department> departments= new ArrayList<>();

}
