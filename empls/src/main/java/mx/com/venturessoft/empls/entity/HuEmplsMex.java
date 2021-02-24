package mx.com.venturessoft.empls.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the HU_EMPLS_MEX database table.
 * 
 */
@Entity
@Table(name="HU_EMPLS_MEX")
@NamedQuery(name="HuEmplsMex.findAll", query="SELECT h FROM HuEmplsMex h")
public class HuEmplsMex implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HuEmplsMexPK id;

	@Column(name="AFIL_FONACOT")
	private String afilFonacot;

	@Column(name="AFIL_IMSS")
	private String afilImss;

	@Column(name="ASIMILADO_A_SALARIOS")
	private String asimiladoASalarios;

	@Column(name="BIMESTRE_SUSPENSION")
	private BigDecimal bimestreSuspension;

	@Column(name="CLAVE_ELECTOR")
	private String claveElector;

	@Column(name="CLAVE_PAIS_TEL")
	private BigDecimal clavePaisTel;

	@Column(name="CLAVE_POBLACION")
	private String clavePoblacion;

	private BigDecimal clinica;

	@Column(name="COD_AREA_TEL")
	private BigDecimal codAreaTel;

	@Column(name="COD_POS")
	private BigDecimal codPos;

	private String colonia;

	@Column(name="CONTRATO_SAR")
	private String contratoSar;

	@Column(name="CRED_IFVT")
	private String credIfvt;

	private String curp;

	@Column(name="DELEGACION_IMSS")
	private String delegacionImss;

	@Column(name="DIG_VER_RFC")
	private String digVerRfc;

	private String domicilio;

	@Column(name="EMAIL_1")
	private String email1;

	@Column(name="EMAIL_2")
	private String email2;

	private String estado;

	@Column(name="F_AVISO_LIBERACION")
	private LocalDateTime fAvisoLiberacion;

	@Column(name="F_INI_DESCUENTO")
	private LocalDateTime fIniDescuento;

	@Column(name="F_RECEPCION_CIA")
	private LocalDateTime fRecepcionCia;

	@Column(name="FECHA_ALTA_CONSAR")
	private LocalDateTime fechaAltaConsar;

	@Column(name="FECHA_ALTA_FONAC")
	private LocalDateTime fechaAltaFonac;

	@Column(name="FECHA_BAJA_CONSAR")
	private LocalDateTime fechaBajaConsar;

	@Column(name="FECHA_BAJA_FONAC")
	private LocalDateTime fechaBajaFonac;

	@Column(name="FECHA_MOD_IFVT")
	private LocalDateTime fechaModIfvt;

	@Column(name="FECHA_MOV")
	private LocalDateTime fechaMov;

	@Column(name="FECHA_RFC")
	private String fechaRfc;

	@Column(name="GRUPO_IMSS")
	private BigDecimal grupoImss;

	@Column(name="HOMO_RFC")
	private String homoRfc;

	@Column(name="LETRAS_RFC")
	private String letrasRfc;

	@Column(name="MOTIVO_BAJA_FONAC")
	private String motivoBajaFonac;

	@Column(name="MOV_SUA_IFVT")
	private BigDecimal movSuaIfvt;

	@Column(name="NUM_FOLIO")
	private String numFolio;

	@Column(name="NUMERO_EXT")
	private String numeroExt;

	@Column(name="NUMERO_INT")
	private String numeroInt;

	private String poblacion;

	@Column(name="POR_CRED_IFVT")
	private BigDecimal porCredIfvt;

	@Column(name="PORCEN_RFC_SUBCON_01")
	private BigDecimal porcenRfcSubcon01;

	@Column(name="PORCEN_RFC_SUBCON_02")
	private BigDecimal porcenRfcSubcon02;

	@Column(name="PORCEN_RFC_SUBCON_03")
	private BigDecimal porcenRfcSubcon03;

	@Column(name="PORCEN_RFC_SUBCON_04")
	private BigDecimal porcenRfcSubcon04;

	@Column(name="PORCEN_RFC_SUBCON_05")
	private BigDecimal porcenRfcSubcon05;

	@Column(name="PORCEN_RFC_SUBCON_06")
	private BigDecimal porcenRfcSubcon06;

	@Column(name="PORCEN_RFC_SUBCON_07")
	private BigDecimal porcenRfcSubcon07;

	@Column(name="RFC_SUBCONTRATO_01")
	private String rfcSubcontrato01;

	@Column(name="RFC_SUBCONTRATO_02")
	private String rfcSubcontrato02;

	@Column(name="RFC_SUBCONTRATO_03")
	private String rfcSubcontrato03;

	@Column(name="RFC_SUBCONTRATO_04")
	private String rfcSubcontrato04;

	@Column(name="RFC_SUBCONTRATO_05")
	private String rfcSubcontrato05;

	@Column(name="RFC_SUBCONTRATO_06")
	private String rfcSubcontrato06;

	@Column(name="RFC_SUBCONTRATO_07")
	private String rfcSubcontrato07;

	@Column(name="SAL_INT_EYM")
	private BigDecimal salIntEym;

	@Column(name="SAL_INT_IFVT")
	private BigDecimal salIntIfvt;

	@Column(name="SAL_INT_IVC")
	private BigDecimal salIntIvc;

	@Column(name="SAL_INT_SAR")
	private BigDecimal salIntSar;

	private String seccion;

	@Column(name="SEMANA_RED_IMSS")
	private BigDecimal semanaRedImss;

	private String sindicalizado;

	private String status;

	@Column(name="SUBDELEGACION_IMSS")
	private String subdelegacionImss;

	private String telefono;

	@Column(name="TELEFONO_CEL")
	private BigDecimal telefonoCel;

	@Column(name="TIPO_CRED_IFVT")
	private String tipoCredIfvt;

	@Column(name="TIPO_JORNADA")
	private String tipoJornada;

	@Column(name="TIPO_REGIMEN")
	private String tipoRegimen;

	@Column(name="TIPO_TRABAJADOR_IMSS")
	private String tipoTrabajadorImss;

	@Column(name="USER_ID")
	private String userId;

	public HuEmplsMex() {
	}

	public HuEmplsMexPK getId() {
		return this.id;
	}

	public void setId(HuEmplsMexPK id) {
		this.id = id;
	}

	public String getAfilFonacot() {
		return this.afilFonacot;
	}

	public void setAfilFonacot(String afilFonacot) {
		this.afilFonacot = afilFonacot;
	}

	public String getAfilImss() {
		return this.afilImss;
	}

	public void setAfilImss(String afilImss) {
		this.afilImss = afilImss;
	}

	public String getAsimiladoASalarios() {
		return this.asimiladoASalarios;
	}

	public void setAsimiladoASalarios(String asimiladoASalarios) {
		this.asimiladoASalarios = asimiladoASalarios;
	}

	public BigDecimal getBimestreSuspension() {
		return this.bimestreSuspension;
	}

	public void setBimestreSuspension(BigDecimal bimestreSuspension) {
		this.bimestreSuspension = bimestreSuspension;
	}

	public String getClaveElector() {
		return this.claveElector;
	}

	public void setClaveElector(String claveElector) {
		this.claveElector = claveElector;
	}

	public BigDecimal getClavePaisTel() {
		return this.clavePaisTel;
	}

	public void setClavePaisTel(BigDecimal clavePaisTel) {
		this.clavePaisTel = clavePaisTel;
	}

	public String getClavePoblacion() {
		return this.clavePoblacion;
	}

	public void setClavePoblacion(String clavePoblacion) {
		this.clavePoblacion = clavePoblacion;
	}

	public BigDecimal getClinica() {
		return this.clinica;
	}

	public void setClinica(BigDecimal clinica) {
		this.clinica = clinica;
	}

	public BigDecimal getCodAreaTel() {
		return this.codAreaTel;
	}

	public void setCodAreaTel(BigDecimal codAreaTel) {
		this.codAreaTel = codAreaTel;
	}

	public BigDecimal getCodPos() {
		return this.codPos;
	}

	public void setCodPos(BigDecimal codPos) {
		this.codPos = codPos;
	}

	public String getColonia() {
		return this.colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getContratoSar() {
		return this.contratoSar;
	}

	public void setContratoSar(String contratoSar) {
		this.contratoSar = contratoSar;
	}

	public String getCredIfvt() {
		return this.credIfvt;
	}

	public void setCredIfvt(String credIfvt) {
		this.credIfvt = credIfvt;
	}

	public String getCurp() {
		return this.curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getDelegacionImss() {
		return this.delegacionImss;
	}

	public void setDelegacionImss(String delegacionImss) {
		this.delegacionImss = delegacionImss;
	}

	public String getDigVerRfc() {
		return this.digVerRfc;
	}

	public void setDigVerRfc(String digVerRfc) {
		this.digVerRfc = digVerRfc;
	}

	public String getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getEmail1() {
		return this.email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return this.email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDateTime getFAvisoLiberacion() {
		return this.fAvisoLiberacion;
	}

	public void setFAvisoLiberacion(LocalDateTime fAvisoLiberacion) {
		this.fAvisoLiberacion = fAvisoLiberacion;
	}

	public LocalDateTime getFIniDescuento() {
		return this.fIniDescuento;
	}

	public void setFIniDescuento(LocalDateTime fIniDescuento) {
		this.fIniDescuento = fIniDescuento;
	}

	public LocalDateTime getFRecepcionCia() {
		return this.fRecepcionCia;
	}

	public void setFRecepcionCia(LocalDateTime fRecepcionCia) {
		this.fRecepcionCia = fRecepcionCia;
	}

	public LocalDateTime getFechaAltaConsar() {
		return this.fechaAltaConsar;
	}

	public void setFechaAltaConsar(LocalDateTime fechaAltaConsar) {
		this.fechaAltaConsar = fechaAltaConsar;
	}

	public LocalDateTime getFechaAltaFonac() {
		return this.fechaAltaFonac;
	}

	public void setFechaAltaFonac(LocalDateTime fechaAltaFonac) {
		this.fechaAltaFonac = fechaAltaFonac;
	}

	public LocalDateTime getFechaBajaConsar() {
		return this.fechaBajaConsar;
	}

	public void setFechaBajaConsar(LocalDateTime fechaBajaConsar) {
		this.fechaBajaConsar = fechaBajaConsar;
	}

	public LocalDateTime getFechaBajaFonac() {
		return this.fechaBajaFonac;
	}

	public void setFechaBajaFonac(LocalDateTime fechaBajaFonac) {
		this.fechaBajaFonac = fechaBajaFonac;
	}

	public LocalDateTime getFechaModIfvt() {
		return this.fechaModIfvt;
	}

	public void setFechaModIfvt(LocalDateTime fechaModIfvt) {
		this.fechaModIfvt = fechaModIfvt;
	}

	public LocalDateTime getFechaMov() {
		return this.fechaMov;
	}

	public void setFechaMov(LocalDateTime fechaMov) {
		this.fechaMov = fechaMov;
	}

	public String getFechaRfc() {
		return this.fechaRfc;
	}

	public void setFechaRfc(String fechaRfc) {
		this.fechaRfc = fechaRfc;
	}

	public BigDecimal getGrupoImss() {
		return this.grupoImss;
	}

	public void setGrupoImss(BigDecimal grupoImss) {
		this.grupoImss = grupoImss;
	}

	public String getHomoRfc() {
		return this.homoRfc;
	}

	public void setHomoRfc(String homoRfc) {
		this.homoRfc = homoRfc;
	}

	public String getLetrasRfc() {
		return this.letrasRfc;
	}

	public void setLetrasRfc(String letrasRfc) {
		this.letrasRfc = letrasRfc;
	}

	public String getMotivoBajaFonac() {
		return this.motivoBajaFonac;
	}

	public void setMotivoBajaFonac(String motivoBajaFonac) {
		this.motivoBajaFonac = motivoBajaFonac;
	}

	public BigDecimal getMovSuaIfvt() {
		return this.movSuaIfvt;
	}

	public void setMovSuaIfvt(BigDecimal movSuaIfvt) {
		this.movSuaIfvt = movSuaIfvt;
	}

	public String getNumFolio() {
		return this.numFolio;
	}

	public void setNumFolio(String numFolio) {
		this.numFolio = numFolio;
	}

	public String getNumeroExt() {
		return this.numeroExt;
	}

	public void setNumeroExt(String numeroExt) {
		this.numeroExt = numeroExt;
	}

	public String getNumeroInt() {
		return this.numeroInt;
	}

	public void setNumeroInt(String numeroInt) {
		this.numeroInt = numeroInt;
	}

	public String getPoblacion() {
		return this.poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public BigDecimal getPorCredIfvt() {
		return this.porCredIfvt;
	}

	public void setPorCredIfvt(BigDecimal porCredIfvt) {
		this.porCredIfvt = porCredIfvt;
	}

	public BigDecimal getPorcenRfcSubcon01() {
		return this.porcenRfcSubcon01;
	}

	public void setPorcenRfcSubcon01(BigDecimal porcenRfcSubcon01) {
		this.porcenRfcSubcon01 = porcenRfcSubcon01;
	}

	public BigDecimal getPorcenRfcSubcon02() {
		return this.porcenRfcSubcon02;
	}

	public void setPorcenRfcSubcon02(BigDecimal porcenRfcSubcon02) {
		this.porcenRfcSubcon02 = porcenRfcSubcon02;
	}

	public BigDecimal getPorcenRfcSubcon03() {
		return this.porcenRfcSubcon03;
	}

	public void setPorcenRfcSubcon03(BigDecimal porcenRfcSubcon03) {
		this.porcenRfcSubcon03 = porcenRfcSubcon03;
	}

	public BigDecimal getPorcenRfcSubcon04() {
		return this.porcenRfcSubcon04;
	}

	public void setPorcenRfcSubcon04(BigDecimal porcenRfcSubcon04) {
		this.porcenRfcSubcon04 = porcenRfcSubcon04;
	}

	public BigDecimal getPorcenRfcSubcon05() {
		return this.porcenRfcSubcon05;
	}

	public void setPorcenRfcSubcon05(BigDecimal porcenRfcSubcon05) {
		this.porcenRfcSubcon05 = porcenRfcSubcon05;
	}

	public BigDecimal getPorcenRfcSubcon06() {
		return this.porcenRfcSubcon06;
	}

	public void setPorcenRfcSubcon06(BigDecimal porcenRfcSubcon06) {
		this.porcenRfcSubcon06 = porcenRfcSubcon06;
	}

	public BigDecimal getPorcenRfcSubcon07() {
		return this.porcenRfcSubcon07;
	}

	public void setPorcenRfcSubcon07(BigDecimal porcenRfcSubcon07) {
		this.porcenRfcSubcon07 = porcenRfcSubcon07;
	}

	public String getRfcSubcontrato01() {
		return this.rfcSubcontrato01;
	}

	public void setRfcSubcontrato01(String rfcSubcontrato01) {
		this.rfcSubcontrato01 = rfcSubcontrato01;
	}

	public String getRfcSubcontrato02() {
		return this.rfcSubcontrato02;
	}

	public void setRfcSubcontrato02(String rfcSubcontrato02) {
		this.rfcSubcontrato02 = rfcSubcontrato02;
	}

	public String getRfcSubcontrato03() {
		return this.rfcSubcontrato03;
	}

	public void setRfcSubcontrato03(String rfcSubcontrato03) {
		this.rfcSubcontrato03 = rfcSubcontrato03;
	}

	public String getRfcSubcontrato04() {
		return this.rfcSubcontrato04;
	}

	public void setRfcSubcontrato04(String rfcSubcontrato04) {
		this.rfcSubcontrato04 = rfcSubcontrato04;
	}

	public String getRfcSubcontrato05() {
		return this.rfcSubcontrato05;
	}

	public void setRfcSubcontrato05(String rfcSubcontrato05) {
		this.rfcSubcontrato05 = rfcSubcontrato05;
	}

	public String getRfcSubcontrato06() {
		return this.rfcSubcontrato06;
	}

	public void setRfcSubcontrato06(String rfcSubcontrato06) {
		this.rfcSubcontrato06 = rfcSubcontrato06;
	}

	public String getRfcSubcontrato07() {
		return this.rfcSubcontrato07;
	}

	public void setRfcSubcontrato07(String rfcSubcontrato07) {
		this.rfcSubcontrato07 = rfcSubcontrato07;
	}

	public BigDecimal getSalIntEym() {
		return this.salIntEym;
	}

	public void setSalIntEym(BigDecimal salIntEym) {
		this.salIntEym = salIntEym;
	}

	public BigDecimal getSalIntIfvt() {
		return this.salIntIfvt;
	}

	public void setSalIntIfvt(BigDecimal salIntIfvt) {
		this.salIntIfvt = salIntIfvt;
	}

	public BigDecimal getSalIntIvc() {
		return this.salIntIvc;
	}

	public void setSalIntIvc(BigDecimal salIntIvc) {
		this.salIntIvc = salIntIvc;
	}

	public BigDecimal getSalIntSar() {
		return this.salIntSar;
	}

	public void setSalIntSar(BigDecimal salIntSar) {
		this.salIntSar = salIntSar;
	}

	public String getSeccion() {
		return this.seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public BigDecimal getSemanaRedImss() {
		return this.semanaRedImss;
	}

	public void setSemanaRedImss(BigDecimal semanaRedImss) {
		this.semanaRedImss = semanaRedImss;
	}

	public String getSindicalizado() {
		return this.sindicalizado;
	}

	public void setSindicalizado(String sindicalizado) {
		this.sindicalizado = sindicalizado;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubdelegacionImss() {
		return this.subdelegacionImss;
	}

	public void setSubdelegacionImss(String subdelegacionImss) {
		this.subdelegacionImss = subdelegacionImss;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public BigDecimal getTelefonoCel() {
		return this.telefonoCel;
	}

	public void setTelefonoCel(BigDecimal telefonoCel) {
		this.telefonoCel = telefonoCel;
	}

	public String getTipoCredIfvt() {
		return this.tipoCredIfvt;
	}

	public void setTipoCredIfvt(String tipoCredIfvt) {
		this.tipoCredIfvt = tipoCredIfvt;
	}

	public String getTipoJornada() {
		return this.tipoJornada;
	}

	public void setTipoJornada(String tipoJornada) {
		this.tipoJornada = tipoJornada;
	}

	public String getTipoRegimen() {
		return this.tipoRegimen;
	}

	public void setTipoRegimen(String tipoRegimen) {
		this.tipoRegimen = tipoRegimen;
	}

	public String getTipoTrabajadorImss() {
		return this.tipoTrabajadorImss;
	}

	public void setTipoTrabajadorImss(String tipoTrabajadorImss) {
		this.tipoTrabajadorImss = tipoTrabajadorImss;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}