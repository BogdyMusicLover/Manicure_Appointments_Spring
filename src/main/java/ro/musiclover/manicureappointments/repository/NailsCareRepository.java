package ro.musiclover.manicureappointments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.musiclover.manicureappointments.entity.NailsCare;

public interface NailsCareRepository extends JpaRepository<NailsCare, Integer> {
}
