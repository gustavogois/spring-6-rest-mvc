package goisstudy.springframework.spring6restmvc.repositories;

import goisstudy.springframework.spring6restmvc.entities.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface BeerRepository extends JpaRepository<Beer, UUID> {
}
