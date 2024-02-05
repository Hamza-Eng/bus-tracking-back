package akaza.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import akaza.com.entity.Adresse;
import akaza.com.entity.Bus;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Long> {

}
