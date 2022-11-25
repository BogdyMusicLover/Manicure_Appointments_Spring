package ro.musiclover.manicureappointments.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ro.musiclover.manicureappointments.entity.NailsService;
import ro.musiclover.manicureappointments.model.nails_services.NailsServiceRequest;
import ro.musiclover.manicureappointments.model.nails_services.RequestUpdateName;
import ro.musiclover.manicureappointments.model.nails_services.NailsServiceResponse;
import ro.musiclover.manicureappointments.model.nails_services.RequestUpdatePrice;
import ro.musiclover.manicureappointments.service.implementation.NailsServiceService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("nails-service")
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
@Validated
public class NailsServiceController {
    private final NailsServiceService nailsServiceService;

    @PostMapping("create")
    public NailsServiceResponse createNailsService(@RequestBody @Valid NailsServiceRequest nailsServiceRequest) {
        return nailsServiceService.createService(nailsServiceRequest);
    }

    @GetMapping("list")
    public List<NailsServiceResponse> showAllServices() {
        return nailsServiceService.allServices();
    }

    @GetMapping("find/{id}")
    public NailsServiceResponse findById(@PathVariable Integer id) {
        return nailsServiceService.findServiceByID(id);
    }

    @GetMapping("search/{name}")
    public List<NailsServiceResponse> findByServiceName(@PathVariable String name){
        return nailsServiceService.findByServiceName(name);
    }
    @PatchMapping("update-price/{id}")
    public void updateServicePrice(@PathVariable Integer id, @RequestBody @Valid RequestUpdatePrice requestUpdatePrice) {
        nailsServiceService.updateServicePrice(id, requestUpdatePrice);
    }

    @PatchMapping("update-name/{id}")
    public void updateServiceName(@PathVariable Integer id, @RequestBody @Valid RequestUpdateName requestUpdateName) {
        nailsServiceService.updateServiceName(id, requestUpdateName);
    }

    @DeleteMapping("delete/{id}")
    public void deleteService(@PathVariable Integer id) {
        nailsServiceService.deleteService(id);
    }


}
