package ro.musiclover.manicureappointments.model.nails_services;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@Setter
public class NailsServiceForCustomerDetail {

    private String serviceName;


}