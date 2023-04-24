package KabbadiRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import project1.KabbadiModel;

public interface kabbadiRepo extends JpaRepository<KabbadiModel,Integer> {
	

}
