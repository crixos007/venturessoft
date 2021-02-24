package mx.com.venturessoft.empls.service.impl;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import mx.com.venturessoft.empls.dto.HuEmplDto;
import mx.com.venturessoft.empls.dto.IHuEmplDto;
import mx.com.venturessoft.empls.entity.HuEmpl;
import mx.com.venturessoft.empls.entity.HuEmplPK;
import mx.com.venturessoft.empls.entity.HuEmplsMex;
import mx.com.venturessoft.empls.entity.HuEmplsMexPK;
import mx.com.venturessoft.empls.repository.HuEmplMexRepository;
import mx.com.venturessoft.empls.repository.HuEmplRepository;
import mx.com.venturessoft.empls.service.HuEmplService;

@Service("HuEmplService")
public class HuEmplServiceImpl implements HuEmplService{
	@Autowired		
	HuEmplRepository repository;
	
	@Autowired		
	HuEmplMexRepository repositoryMex;
	
	@PersistenceContext	
	EntityManager entityManager;
	
	@Autowired
	private ModelMapper modelMapper;

	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	@Override
	public List<IHuEmplDto> findAllEmpls(long numCia, long numEmp) {
		// TODO Auto-generated method stub	
		return repository.findAllEmpls(numCia, numEmp);
	}

	@Override
	public List<IHuEmplDto> findAllEmplsByCia(long numCia) {
		// TODO Auto-generated method stub
		return repository.findAllEmplsByNumCia(numCia);
	}

	@Override
	public List<IHuEmplDto> findAllEmplsByEmp(long numEmp) {
		// TODO Auto-generated method stub
		return repository.findAllEmplsByNumEmp(numEmp);
	}

	@Override
	@Transactional
	public String saveEmpleado(HuEmplDto empNew) {
		// TODO Auto-generated method stub
		if (empNew != null) {
			List<IHuEmplDto> empleadeos = repository.findAllEmpls(empNew.getNumCia(), empNew.getNumEmp())
											     	 .stream()
													 .filter(p->p.getNumCia()
													            == empNew.getNumCia() &&
													            p.getNumEmp()
																 == empNew.getNumEmp())
													 .collect(Collectors.toList());
			if(empleadeos.size() > 0) {
				return "Registro existente";
			}else {
				HuEmpl huEmp       = new HuEmpl();
				HuEmplsMex huEmpMx = new HuEmplsMex();
				HuEmplPK pkEmp     = new HuEmplPK();
				HuEmplsMexPK pkMx  = new HuEmplsMexPK();
				
				pkEmp.setNumCia(empNew.getNumCia());
				pkEmp.setNumEmp(empNew.getNumEmp());
				pkMx.setNumCia(empNew.getNumCia());
				pkMx.setNumEmp(empNew.getNumEmp());
				huEmp   = modelMapper.map(empNew, HuEmpl.class);
				huEmpMx = modelMapper.map(empNew, HuEmplsMex.class);
				
				huEmp.setId(pkEmp);
				huEmpMx.setId(pkMx);
				
				repository.save(huEmp);
				repositoryMex.save(huEmpMx);
				return "Registro creado";
			}
		}
		return "Error al crear el Registro";
	}

	@Override
	public String updateEmpleado(HuEmplDto emp) {
		// TODO Auto-generated method stub
		if (emp != null) {
			List<IHuEmplDto> empleadeos = repository.findAllEmpls(emp.getNumCia(), emp.getNumEmp())
											     	 .stream()
													 .filter(p->p.getNumCia()
													            == emp.getNumCia() &&
													            p.getNumEmp()
																== emp.getNumEmp())
													 .collect(Collectors.toList());
			if(empleadeos.size() > 0) {
				HuEmpl huEmp       = new HuEmpl();
				HuEmplsMex huEmpMx = new HuEmplsMex();
				HuEmplPK pkEmp     = new HuEmplPK();
				HuEmplsMexPK pkMx  = new HuEmplsMexPK();
				
				pkEmp.setNumCia(emp.getNumCia());
				pkEmp.setNumEmp(emp.getNumEmp());
				pkMx.setNumCia(emp.getNumCia());
				pkMx.setNumEmp(emp.getNumEmp());
				huEmp   = modelMapper.map(emp, HuEmpl.class);
				huEmpMx = modelMapper.map(emp, HuEmplsMex.class);
				
				huEmp.setId(pkEmp);
				huEmpMx.setId(pkMx);
				
				repository.save(huEmp);
				repositoryMex.save(huEmpMx);			
				return "Registro modificado";
			}else {
				return "Registro no Existe";
			}
		}
		return "Error al modificar el Registro";
	}

	@Override
	public String deleteEmpleado(long numCia, long numEmp) {
		// TODO Auto-generated method stub
		HuEmpl huEmp       = new HuEmpl();
		HuEmplsMex huEmpMx = new HuEmplsMex();
		HuEmplPK pkEmp     = new HuEmplPK();
		HuEmplsMexPK pkMx  = new HuEmplsMexPK();
		
		pkEmp.setNumCia(numCia);
		pkEmp.setNumEmp(numEmp);
		pkMx.setNumCia(numCia);
		pkMx.setNumEmp(numEmp);
		
		huEmp.setId(pkEmp);
		huEmpMx.setId(pkMx);
		repository.delete(huEmp);
		repositoryMex.delete(huEmpMx);
		return "Registro eliminado";
	}

	@Override
	public ByteArrayOutputStream getPDF(long numCia) {
		// TODO Auto-generated method stub
		final Font chapterFont = FontFactory.getFont(FontFactory.HELVETICA, 26, Font.BOLDITALIC);
		List<IHuEmplDto> empleados = new ArrayList<IHuEmplDto>();
        empleados.addAll(repository.findAllEmplsByNumCia(numCia));
        
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            Document document = new Document(PageSize.A4);
            Chunk chunk = new Chunk("Empleados", chapterFont);
            Chapter chapter = new Chapter(new Paragraph(chunk), 1);
            PdfPTable tabla = new PdfPTable(6);

            for(IHuEmplDto x : empleados) {	
	            tabla.addCell(String.valueOf(x.getNumCia()));
	            tabla.addCell(String.valueOf(x.getNumEmp()));
	            tabla.addCell(x.getNombre());
	            tabla.addCell(x.getApellPat());
	            tabla.addCell(x.getApellMat());
	            tabla.addCell(x.getAfilImss());
            }
            PdfWriter.getInstance(document, bos);
            document.open();
            document.add(chapter);
            document.add(tabla);
            document.close();
            return bos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}

	
}