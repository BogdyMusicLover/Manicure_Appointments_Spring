package ro.musiclover.manicureappointments.model.customer;

import lombok.Data;


@Data
public class CustomerResponseForAppointment {

    private Integer id;
    private String firstName;
    private String lastName;

}