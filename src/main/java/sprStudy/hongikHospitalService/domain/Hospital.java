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
public class Hospital {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String address;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="department_id")
    private List<Department> departments =new ArrayList<>();
}
