package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Destinations;

/**
 * @author alexismeis - aameis
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */

@Repository
public interface DestinationsRepository extends JpaRepository<Destinations, Long>{

}
