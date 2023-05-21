package sprStudy.hongikHospitalService.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "doctor")
public class Doctor {

    @Id
    private Long id;

    private String name;
    private Long career;

}
