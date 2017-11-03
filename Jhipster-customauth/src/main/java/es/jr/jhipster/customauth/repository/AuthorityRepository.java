package es.jr.jhipster.customauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.jr.jhipster.customauth.domain.Authority;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
