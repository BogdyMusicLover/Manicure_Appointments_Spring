package ro.musiclover.manicureappointments.entity;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.ArrayList;
import java.util.List;

@Entity
@Audited
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class NailsCare {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String serviceName;
    @NotNull
    @Positive
    private Integer price;

    @ManyToMany(mappedBy = "nailsCares")
    private List<Appointment> appointments = new ArrayList<>();
}
