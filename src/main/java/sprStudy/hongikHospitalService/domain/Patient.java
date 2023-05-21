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
@Table(name = "patient")
public class Patient {

    @Id
    private Long id;

    private String name;

    private Long age;

    private Gender gender;

}
