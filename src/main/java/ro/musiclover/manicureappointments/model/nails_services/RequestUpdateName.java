package ro.musiclover.manicureappointments.model.nails_services;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Data
public class RequestUpdateName {

    private Integer id;

    @NotBlank
    private String serviceName;

}
