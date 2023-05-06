package KabbadiRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import project1.KabbadiModel;

public interface kabbadiRepo extends JpaRepository<KabbadiModel,Integer> {
@Query(value="select*from kabbadimatch",nativeQuery=true)
public List<kabbadimatch>byhouse(@Param("id")int kid);

}
