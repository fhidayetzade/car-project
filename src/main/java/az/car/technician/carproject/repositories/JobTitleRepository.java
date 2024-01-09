package az.car.technician.carproject.repositories;
import az.car.technician.carproject.models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
