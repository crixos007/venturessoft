package mx.com.venturessoft.empls.service;

import java.io.ByteArrayOutputStream;
import java.util.List;

import mx.com.venturessoft.empls.dto.HuEmplDto;
import mx.com.venturessoft.empls.dto.IHuEmplDto;

public interface HuEmplService {
	public List<IHuEmplDto> findAllEmpls(long numCia, long numEmp);
	public List<IHuEmplDto> findAllEmplsByCia(long numCia);
	public List<IHuEmplDto> findAllEmplsByEmp(long numEmp);
	public String saveEmpleado(HuEmplDto empNew);
	public String updateEmpleado(HuEmplDto emp);
	public String deleteEmpleado(long numCia, long numEmp);
	public ByteArrayOutputStream getPDF(long numCia);
}