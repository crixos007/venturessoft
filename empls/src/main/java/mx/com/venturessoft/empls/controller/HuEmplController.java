package mx.com.venturessoft.empls.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mx.com.venturessoft.empls.dto.HuEmplDto;
import mx.com.venturessoft.empls.dto.IHuEmplDto;
import mx.com.venturessoft.empls.service.HuEmplService;

@CrossOrigin(origins = "*") 
@RestController()
@RequestMapping("/empleados")
public class HuEmplController {
	@Autowired
	HuEmplService service;
	
	@GetMapping(value="list/{numCia}/{numEmp}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<IHuEmplDto> recuperarEmpleados(@PathVariable("numCia") long numCia, @PathVariable("numEmp") long numEmp) {		
		return service.findAllEmpls(numCia, numEmp);
	}
	
	@GetMapping(value="listByCia/{numCia}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<IHuEmplDto> recuperarEmpleadosByCia(@PathVariable("numCia") long numCia) {		
		return service.findAllEmplsByCia(numCia);
	}
	
	@GetMapping(value="listByEmp/{numEmp}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<IHuEmplDto> recuperarEmpleadosByEmp(@PathVariable("numEmp") long numEmp) {		
		return service.findAllEmplsByEmp(numEmp);
	}
	
	@PostMapping(value="save",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> guardarEmpleado(@RequestBody HuEmplDto empNew) {		
		String response = service.saveEmpleado(empNew);
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
	
	@PutMapping(value="update",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> actualizarEmpleado(@RequestBody HuEmplDto emp) {		
		String response = service.updateEmpleado(emp);
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
	
	@DeleteMapping(value="delete/{numCia}/{numEmp}")	
	public ResponseEntity<String> eliminarEmpleado(@PathVariable("numCia") long numCia, @PathVariable("numEmp") long numEmp) {
		String response = service.deleteEmpleado(numCia, numEmp);
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
	
    @GetMapping("/download/{numCia}")
    public void downloadFile(@PathVariable("numCia") long numCia, HttpServletResponse response) throws IOException {
        byte[] pdfReport = service.getPDF(numCia).toByteArray();

        String mimeType =  "application/pdf";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\"", "reporte.pdf"));

        response.setContentLength(pdfReport.length);

        ByteArrayInputStream inStream = new ByteArrayInputStream( pdfReport);

        FileCopyUtils.copy(inStream, response.getOutputStream());
    }
}