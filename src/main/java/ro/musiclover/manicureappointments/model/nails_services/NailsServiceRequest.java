package ro.musiclover.manicureappointments.model.nails_services;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NailsServiceRequest {

    private Integer id;

    @NotBlank
    private String serviceName;

    @NotNull
    @Positive
    private Integer price;

}
