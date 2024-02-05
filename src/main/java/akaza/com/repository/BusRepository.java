package akaza.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import akaza.com.entity.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {

}
