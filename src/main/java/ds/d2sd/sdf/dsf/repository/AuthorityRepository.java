package ds.d2sd.sdf.dsf.repository;

import ds.d2sd.sdf.dsf.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {

}
