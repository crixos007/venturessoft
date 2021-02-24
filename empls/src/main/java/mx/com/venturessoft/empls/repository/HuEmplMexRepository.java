package mx.com.venturessoft.empls.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.com.venturessoft.empls.entity.HuEmplPK;
import mx.com.venturessoft.empls.entity.HuEmplsMex;

public interface HuEmplMexRepository extends JpaRepository<HuEmplsMex, HuEmplPK> {

}
