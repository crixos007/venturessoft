package mx.com.venturessoft.empls.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class HuEmplDto implements Serializable{
	private static final long serialVersionUID = 5265145419892642650L;

	//HuEmpl.java
	private long numCia;
	private long numEmp;
	private BigDecimal actividad;
	private String apellMat;
	private String apellPat;
	private String area;
	private String banco;
	private String banco2;
	private String cdBanco;
	private String centro;
	private String claveLocalidad;
	private BigDecimal clavePaisTel;
	private String claveProvincia;
	private BigDecimal codAreaTel;
	private String codId01;
	private String codId02;
	private String codId03;
	private String codId04;
	private String codId05;
	private String codId06;
	private String codId07;
	private String codId08;
	private String codId09;
	private String codId10;
	private String codId11;
	private String codId12;
	private String codId13;
	private String codId14;
	private String codId15;
	private String codId16;
	private String codId17;
	private String codId18;
	private String codId19;
	private String codId20;
	private String codId21;
	private String codId22;
	private String codId23;
	private String codId24;
	private String codId25;
	private String codId26;
	private String codId27;
	private String codId28;
	private String codId29;
	private String codId30;
	private BigDecimal contrato;
	private String ctaDeud;
	private String ctaDeud2;
	private String cuenta;
	private String cuentaClave;
	private String cuentaVales;
	private String cuentaValesComedor;
	private String cuentaValesGasolina;
	private String cuenta2;
	private String declaracionImp;
	private String edoBanco;
	private String email;
	private String estadoCivil;
	private BigDecimal estatura;
	private BigDecimal extensionTel;
	private LocalDateTime fechaAntiguedad;
	private LocalDateTime fechaAntiguedadSub;
	private LocalDateTime fechaBaja;
	private LocalDateTime fechaContrato;
	private LocalDateTime fechaIngreso;
	private LocalDateTime fechaMerito;
	private LocalDateTime fechaNac;
	private LocalDateTime fechaPromocion;
	private LocalDateTime fechaSueldo;
	private LocalDateTime fechaTerminacion;
	private String formaPago;
	private String formatoSueldo;
	private String gpoSanguineo;
	private String grupoPrestacion;
	private String grupoPrestacionSub;
	private BigDecimal jornadaRed;
	private String licencia;
	private String linea;
	private String localidadNac;
	private String lugarPago;
	private String moneda;
	private String nacionalidad;
	private BigDecimal nip;
	private String nombre;
	private String paisNac;
	private String pasaporte;
	private BigDecimal peso;
	private BigDecimal plaza;
	private String provinciaNac;
	private String puesto;
	private String sexo;
	private String status;
	private String sucursal;
	private String sucursal2;
	private BigDecimal sueldo;
	private String supervisor;
	private String tarjetaVal;
	private String tarjetaValComedor;
	private String tarjetaValGasolina;
	private BigDecimal telefono;
	private String tipoContrato;
	private String tipoCuenta;
	private String tipoCuenta2;
	private String tipoEmpl;
	private String tipoLicencia;
	private BigDecimal turno;
	private LocalDateTime venceLicencia;
	private LocalDateTime vencePasaporte;
	private BigDecimal zona;

	//HuEmplsMex.java
	private String afilFonacot;
	private String afilImss;
	private String asimiladoASalarios;
	private BigDecimal bimestreSuspension;
	private String claveElector;
	private String clavePoblacion;
	private BigDecimal clinica;
	private BigDecimal codPos;
	private String colonia;
	private String contratoSar;
	private String credIfvt;
	private String curp;
	private String delegacionImss;
	private String digVerRfc;
	private String domicilio;
	private String email1;
	private String email2;
	private String estado;
	private LocalDateTime fAvisoLiberacion;
	private LocalDateTime fIniDescuento;
	private LocalDateTime fRecepcionCia;
	private LocalDateTime fechaAltaConsar;
	private LocalDateTime fechaAltaFonac;
	private LocalDateTime fechaBajaConsar;
	private LocalDateTime fechaBajaFonac;
	private LocalDateTime fechaModIfvt;
	private LocalDateTime fechaMov;
	private String fechaRfc;
	private BigDecimal grupoImss;
	private String homoRfc;
	private String letrasRfc;
	private String motivoBajaFonac;
	private BigDecimal movSuaIfvt;
	private String numFolio;
	private String numeroExt;
	private String numeroInt;
	private String poblacion;
	private BigDecimal porCredIfvt;
	private BigDecimal porcenRfcSubcon01;
	private BigDecimal porcenRfcSubcon02;
	private BigDecimal porcenRfcSubcon03;
	private BigDecimal porcenRfcSubcon04;
	private BigDecimal porcenRfcSubcon05;
	private BigDecimal porcenRfcSubcon06;
	private BigDecimal porcenRfcSubcon07;
	private String rfcSubcontrato01;
	private String rfcSubcontrato02;
	private String rfcSubcontrato03;
	private String rfcSubcontrato04;
	private String rfcSubcontrato05;
	private String rfcSubcontrato06;
	private String rfcSubcontrato07;
	private BigDecimal salIntEym;
	private BigDecimal salIntIfvt;
	private BigDecimal salIntIvc;
	private BigDecimal salIntSar;
	private String seccion;
	private BigDecimal semanaRedImss;
	private String sindicalizado;
	private String subdelegacionImss;
	private BigDecimal telefonoCel;
	private String tipoCredIfvt;
	private String tipoJornada;
	private String tipoRegimen;
	private String tipoTrabajadorImss;
	private String userId;
	
	/**
	 * @return the numCia
	 */
	public long getNumCia() {
		return numCia;
	}
	/**
	 * @param numCia the numCia to set
	 */
	public void setNumCia(long numCia) {
		this.numCia = numCia;
	}
	/**
	 * @return the numEmp
	 */
	public long getNumEmp() {
		return numEmp;
	}
	/**
	 * @param numEmp the numEmp to set
	 */
	public void setNumEmp(long numEmp) {
		this.numEmp = numEmp;
	}
	/**
	 * @return the actividad
	 */
	public BigDecimal getActividad() {
		return actividad;
	}
	/**
	 * @param actividad the actividad to set
	 */
	public void setActividad(BigDecimal actividad) {
		this.actividad = actividad;
	}
	/**
	 * @return the apellMat
	 */
	public String getApellMat() {
		return apellMat;
	}
	/**
	 * @param apellMat the apellMat to set
	 */
	public void setApellMat(String apellMat) {
		this.apellMat = apellMat;
	}
	/**
	 * @return the apellPat
	 */
	public String getApellPat() {
		return apellPat;
	}
	/**
	 * @param apellPat the apellPat to set
	 */
	public void setApellPat(String apellPat) {
		this.apellPat = apellPat;
	}
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * @return the banco
	 */
	public String getBanco() {
		return banco;
	}
	/**
	 * @param banco the banco to set
	 */
	public void setBanco(String banco) {
		this.banco = banco;
	}
	/**
	 * @return the banco2
	 */
	public String getBanco2() {
		return banco2;
	}
	/**
	 * @param banco2 the banco2 to set
	 */
	public void setBanco2(String banco2) {
		this.banco2 = banco2;
	}
	/**
	 * @return the cdBanco
	 */
	public String getCdBanco() {
		return cdBanco;
	}
	/**
	 * @param cdBanco the cdBanco to set
	 */
	public void setCdBanco(String cdBanco) {
		this.cdBanco = cdBanco;
	}
	/**
	 * @return the centro
	 */
	public String getCentro() {
		return centro;
	}
	/**
	 * @param centro the centro to set
	 */
	public void setCentro(String centro) {
		this.centro = centro;
	}
	/**
	 * @return the claveLocalidad
	 */
	public String getClaveLocalidad() {
		return claveLocalidad;
	}
	/**
	 * @param claveLocalidad the claveLocalidad to set
	 */
	public void setClaveLocalidad(String claveLocalidad) {
		this.claveLocalidad = claveLocalidad;
	}
	/**
	 * @return the clavePaisTel
	 */
	public BigDecimal getClavePaisTel() {
		return clavePaisTel;
	}
	/**
	 * @param clavePaisTel the clavePaisTel to set
	 */
	public void setClavePaisTel(BigDecimal clavePaisTel) {
		this.clavePaisTel = clavePaisTel;
	}
	/**
	 * @return the claveProvincia
	 */
	public String getClaveProvincia() {
		return claveProvincia;
	}
	/**
	 * @param claveProvincia the claveProvincia to set
	 */
	public void setClaveProvincia(String claveProvincia) {
		this.claveProvincia = claveProvincia;
	}
	/**
	 * @return the codAreaTel
	 */
	public BigDecimal getCodAreaTel() {
		return codAreaTel;
	}
	/**
	 * @param codAreaTel the codAreaTel to set
	 */
	public void setCodAreaTel(BigDecimal codAreaTel) {
		this.codAreaTel = codAreaTel;
	}
	/**
	 * @return the codId01
	 */
	public String getCodId01() {
		return codId01;
	}
	/**
	 * @param codId01 the codId01 to set
	 */
	public void setCodId01(String codId01) {
		this.codId01 = codId01;
	}
	/**
	 * @return the codId02
	 */
	public String getCodId02() {
		return codId02;
	}
	/**
	 * @param codId02 the codId02 to set
	 */
	public void setCodId02(String codId02) {
		this.codId02 = codId02;
	}
	/**
	 * @return the codId03
	 */
	public String getCodId03() {
		return codId03;
	}
	/**
	 * @param codId03 the codId03 to set
	 */
	public void setCodId03(String codId03) {
		this.codId03 = codId03;
	}
	/**
	 * @return the codId04
	 */
	public String getCodId04() {
		return codId04;
	}
	/**
	 * @param codId04 the codId04 to set
	 */
	public void setCodId04(String codId04) {
		this.codId04 = codId04;
	}
	/**
	 * @return the codId05
	 */
	public String getCodId05() {
		return codId05;
	}
	/**
	 * @param codId05 the codId05 to set
	 */
	public void setCodId05(String codId05) {
		this.codId05 = codId05;
	}
	/**
	 * @return the codId06
	 */
	public String getCodId06() {
		return codId06;
	}
	/**
	 * @param codId06 the codId06 to set
	 */
	public void setCodId06(String codId06) {
		this.codId06 = codId06;
	}
	/**
	 * @return the codId07
	 */
	public String getCodId07() {
		return codId07;
	}
	/**
	 * @param codId07 the codId07 to set
	 */
	public void setCodId07(String codId07) {
		this.codId07 = codId07;
	}
	/**
	 * @return the codId08
	 */
	public String getCodId08() {
		return codId08;
	}
	/**
	 * @param codId08 the codId08 to set
	 */
	public void setCodId08(String codId08) {
		this.codId08 = codId08;
	}
	/**
	 * @return the codId09
	 */
	public String getCodId09() {
		return codId09;
	}
	/**
	 * @param codId09 the codId09 to set
	 */
	public void setCodId09(String codId09) {
		this.codId09 = codId09;
	}
	/**
	 * @return the codId10
	 */
	public String getCodId10() {
		return codId10;
	}
	/**
	 * @param codId10 the codId10 to set
	 */
	public void setCodId10(String codId10) {
		this.codId10 = codId10;
	}
	/**
	 * @return the codId11
	 */
	public String getCodId11() {
		return codId11;
	}
	/**
	 * @param codId11 the codId11 to set
	 */
	public void setCodId11(String codId11) {
		this.codId11 = codId11;
	}
	/**
	 * @return the codId12
	 */
	public String getCodId12() {
		return codId12;
	}
	/**
	 * @param codId12 the codId12 to set
	 */
	public void setCodId12(String codId12) {
		this.codId12 = codId12;
	}
	/**
	 * @return the codId13
	 */
	public String getCodId13() {
		return codId13;
	}
	/**
	 * @param codId13 the codId13 to set
	 */
	public void setCodId13(String codId13) {
		this.codId13 = codId13;
	}
	/**
	 * @return the codId14
	 */
	public String getCodId14() {
		return codId14;
	}
	/**
	 * @param codId14 the codId14 to set
	 */
	public void setCodId14(String codId14) {
		this.codId14 = codId14;
	}
	/**
	 * @return the codId15
	 */
	public String getCodId15() {
		return codId15;
	}
	/**
	 * @param codId15 the codId15 to set
	 */
	public void setCodId15(String codId15) {
		this.codId15 = codId15;
	}
	/**
	 * @return the codId16
	 */
	public String getCodId16() {
		return codId16;
	}
	/**
	 * @param codId16 the codId16 to set
	 */
	public void setCodId16(String codId16) {
		this.codId16 = codId16;
	}
	/**
	 * @return the codId17
	 */
	public String getCodId17() {
		return codId17;
	}
	/**
	 * @param codId17 the codId17 to set
	 */
	public void setCodId17(String codId17) {
		this.codId17 = codId17;
	}
	/**
	 * @return the codId18
	 */
	public String getCodId18() {
		return codId18;
	}
	/**
	 * @param codId18 the codId18 to set
	 */
	public void setCodId18(String codId18) {
		this.codId18 = codId18;
	}
	/**
	 * @return the codId19
	 */
	public String getCodId19() {
		return codId19;
	}
	/**
	 * @param codId19 the codId19 to set
	 */
	public void setCodId19(String codId19) {
		this.codId19 = codId19;
	}
	/**
	 * @return the codId20
	 */
	public String getCodId20() {
		return codId20;
	}
	/**
	 * @param codId20 the codId20 to set
	 */
	public void setCodId20(String codId20) {
		this.codId20 = codId20;
	}
	/**
	 * @return the codId21
	 */
	public String getCodId21() {
		return codId21;
	}
	/**
	 * @param codId21 the codId21 to set
	 */
	public void setCodId21(String codId21) {
		this.codId21 = codId21;
	}
	/**
	 * @return the codId22
	 */
	public String getCodId22() {
		return codId22;
	}
	/**
	 * @param codId22 the codId22 to set
	 */
	public void setCodId22(String codId22) {
		this.codId22 = codId22;
	}
	/**
	 * @return the codId23
	 */
	public String getCodId23() {
		return codId23;
	}
	/**
	 * @param codId23 the codId23 to set
	 */
	public void setCodId23(String codId23) {
		this.codId23 = codId23;
	}
	/**
	 * @return the codId24
	 */
	public String getCodId24() {
		return codId24;
	}
	/**
	 * @param codId24 the codId24 to set
	 */
	public void setCodId24(String codId24) {
		this.codId24 = codId24;
	}
	/**
	 * @return the codId25
	 */
	public String getCodId25() {
		return codId25;
	}
	/**
	 * @param codId25 the codId25 to set
	 */
	public void setCodId25(String codId25) {
		this.codId25 = codId25;
	}
	/**
	 * @return the codId26
	 */
	public String getCodId26() {
		return codId26;
	}
	/**
	 * @param codId26 the codId26 to set
	 */
	public void setCodId26(String codId26) {
		this.codId26 = codId26;
	}
	/**
	 * @return the codId27
	 */
	public String getCodId27() {
		return codId27;
	}
	/**
	 * @param codId27 the codId27 to set
	 */
	public void setCodId27(String codId27) {
		this.codId27 = codId27;
	}
	/**
	 * @return the codId28
	 */
	public String getCodId28() {
		return codId28;
	}
	/**
	 * @param codId28 the codId28 to set
	 */
	public void setCodId28(String codId28) {
		this.codId28 = codId28;
	}
	/**
	 * @return the codId29
	 */
	public String getCodId29() {
		return codId29;
	}
	/**
	 * @param codId29 the codId29 to set
	 */
	public void setCodId29(String codId29) {
		this.codId29 = codId29;
	}
	/**
	 * @return the codId30
	 */
	public String getCodId30() {
		return codId30;
	}
	/**
	 * @param codId30 the codId30 to set
	 */
	public void setCodId30(String codId30) {
		this.codId30 = codId30;
	}
	/**
	 * @return the contrato
	 */
	public BigDecimal getContrato() {
		return contrato;
	}
	/**
	 * @param contrato the contrato to set
	 */
	public void setContrato(BigDecimal contrato) {
		this.contrato = contrato;
	}
	/**
	 * @return the ctaDeud
	 */
	public String getCtaDeud() {
		return ctaDeud;
	}
	/**
	 * @param ctaDeud the ctaDeud to set
	 */
	public void setCtaDeud(String ctaDeud) {
		this.ctaDeud = ctaDeud;
	}
	/**
	 * @return the ctaDeud2
	 */
	public String getCtaDeud2() {
		return ctaDeud2;
	}
	/**
	 * @param ctaDeud2 the ctaDeud2 to set
	 */
	public void setCtaDeud2(String ctaDeud2) {
		this.ctaDeud2 = ctaDeud2;
	}
	/**
	 * @return the cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * @return the cuentaClave
	 */
	public String getCuentaClave() {
		return cuentaClave;
	}
	/**
	 * @param cuentaClave the cuentaClave to set
	 */
	public void setCuentaClave(String cuentaClave) {
		this.cuentaClave = cuentaClave;
	}
	/**
	 * @return the cuentaVales
	 */
	public String getCuentaVales() {
		return cuentaVales;
	}
	/**
	 * @param cuentaVales the cuentaVales to set
	 */
	public void setCuentaVales(String cuentaVales) {
		this.cuentaVales = cuentaVales;
	}
	/**
	 * @return the cuentaValesComedor
	 */
	public String getCuentaValesComedor() {
		return cuentaValesComedor;
	}
	/**
	 * @param cuentaValesComedor the cuentaValesComedor to set
	 */
	public void setCuentaValesComedor(String cuentaValesComedor) {
		this.cuentaValesComedor = cuentaValesComedor;
	}
	/**
	 * @return the cuentaValesGasolina
	 */
	public String getCuentaValesGasolina() {
		return cuentaValesGasolina;
	}
	/**
	 * @param cuentaValesGasolina the cuentaValesGasolina to set
	 */
	public void setCuentaValesGasolina(String cuentaValesGasolina) {
		this.cuentaValesGasolina = cuentaValesGasolina;
	}
	/**
	 * @return the cuenta2
	 */
	public String getCuenta2() {
		return cuenta2;
	}
	/**
	 * @param cuenta2 the cuenta2 to set
	 */
	public void setCuenta2(String cuenta2) {
		this.cuenta2 = cuenta2;
	}
	/**
	 * @return the declaracionImp
	 */
	public String getDeclaracionImp() {
		return declaracionImp;
	}
	/**
	 * @param declaracionImp the declaracionImp to set
	 */
	public void setDeclaracionImp(String declaracionImp) {
		this.declaracionImp = declaracionImp;
	}
	/**
	 * @return the edoBanco
	 */
	public String getEdoBanco() {
		return edoBanco;
	}
	/**
	 * @param edoBanco the edoBanco to set
	 */
	public void setEdoBanco(String edoBanco) {
		this.edoBanco = edoBanco;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the estadoCivil
	 */
	public String getEstadoCivil() {
		return estadoCivil;
	}
	/**
	 * @param estadoCivil the estadoCivil to set
	 */
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	/**
	 * @return the estatura
	 */
	public BigDecimal getEstatura() {
		return estatura;
	}
	/**
	 * @param estatura the estatura to set
	 */
	public void setEstatura(BigDecimal estatura) {
		this.estatura = estatura;
	}
	/**
	 * @return the extensionTel
	 */
	public BigDecimal getExtensionTel() {
		return extensionTel;
	}
	/**
	 * @param extensionTel the extensionTel to set
	 */
	public void setExtensionTel(BigDecimal extensionTel) {
		this.extensionTel = extensionTel;
	}
	/**
	 * @return the fechaAntiguedad
	 */
	public LocalDateTime getFechaAntiguedad() {
		return fechaAntiguedad;
	}
	/**
	 * @param fechaAntiguedad the fechaAntiguedad to set
	 */
	public void setFechaAntiguedad(LocalDateTime fechaAntiguedad) {
		this.fechaAntiguedad = fechaAntiguedad;
	}
	/**
	 * @return the fechaAntiguedadSub
	 */
	public LocalDateTime getFechaAntiguedadSub() {
		return fechaAntiguedadSub;
	}
	/**
	 * @param fechaAntiguedadSub the fechaAntiguedadSub to set
	 */
	public void setFechaAntiguedadSub(LocalDateTime fechaAntiguedadSub) {
		this.fechaAntiguedadSub = fechaAntiguedadSub;
	}
	/**
	 * @return the fechaBaja
	 */
	public LocalDateTime getFechaBaja() {
		return fechaBaja;
	}
	/**
	 * @param fechaBaja the fechaBaja to set
	 */
	public void setFechaBaja(LocalDateTime fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	/**
	 * @return the fechaContrato
	 */
	public LocalDateTime getFechaContrato() {
		return fechaContrato;
	}
	/**
	 * @param fechaContrato the fechaContrato to set
	 */
	public void setFechaContrato(LocalDateTime fechaContrato) {
		this.fechaContrato = fechaContrato;
	}
	/**
	 * @return the fechaIngreso
	 */
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	/**
	 * @return the fechaMerito
	 */
	public LocalDateTime getFechaMerito() {
		return fechaMerito;
	}
	/**
	 * @param fechaMerito the fechaMerito to set
	 */
	public void setFechaMerito(LocalDateTime fechaMerito) {
		this.fechaMerito = fechaMerito;
	}
	/**
	 * @return the fechaNac
	 */
	public LocalDateTime getFechaNac() {
		return fechaNac;
	}
	/**
	 * @param fechaNac the fechaNac to set
	 */
	public void setFechaNac(LocalDateTime fechaNac) {
		this.fechaNac = fechaNac;
	}
	/**
	 * @return the fechaPromocion
	 */
	public LocalDateTime getFechaPromocion() {
		return fechaPromocion;
	}
	/**
	 * @param fechaPromocion the fechaPromocion to set
	 */
	public void setFechaPromocion(LocalDateTime fechaPromocion) {
		this.fechaPromocion = fechaPromocion;
	}
	/**
	 * @return the fechaSueldo
	 */
	public LocalDateTime getFechaSueldo() {
		return fechaSueldo;
	}
	/**
	 * @param fechaSueldo the fechaSueldo to set
	 */
	public void setFechaSueldo(LocalDateTime fechaSueldo) {
		this.fechaSueldo = fechaSueldo;
	}
	/**
	 * @return the fechaTerminacion
	 */
	public LocalDateTime getFechaTerminacion() {
		return fechaTerminacion;
	}
	/**
	 * @param fechaTerminacion the fechaTerminacion to set
	 */
	public void setFechaTerminacion(LocalDateTime fechaTerminacion) {
		this.fechaTerminacion = fechaTerminacion;
	}
	/**
	 * @return the formaPago
	 */
	public String getFormaPago() {
		return formaPago;
	}
	/**
	 * @param formaPago the formaPago to set
	 */
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	/**
	 * @return the formatoSueldo
	 */
	public String getFormatoSueldo() {
		return formatoSueldo;
	}
	/**
	 * @param formatoSueldo the formatoSueldo to set
	 */
	public void setFormatoSueldo(String formatoSueldo) {
		this.formatoSueldo = formatoSueldo;
	}
	/**
	 * @return the gpoSanguineo
	 */
	public String getGpoSanguineo() {
		return gpoSanguineo;
	}
	/**
	 * @param gpoSanguineo the gpoSanguineo to set
	 */
	public void setGpoSanguineo(String gpoSanguineo) {
		this.gpoSanguineo = gpoSanguineo;
	}
	/**
	 * @return the grupoPrestacion
	 */
	public String getGrupoPrestacion() {
		return grupoPrestacion;
	}
	/**
	 * @param grupoPrestacion the grupoPrestacion to set
	 */
	public void setGrupoPrestacion(String grupoPrestacion) {
		this.grupoPrestacion = grupoPrestacion;
	}
	/**
	 * @return the grupoPrestacionSub
	 */
	public String getGrupoPrestacionSub() {
		return grupoPrestacionSub;
	}
	/**
	 * @param grupoPrestacionSub the grupoPrestacionSub to set
	 */
	public void setGrupoPrestacionSub(String grupoPrestacionSub) {
		this.grupoPrestacionSub = grupoPrestacionSub;
	}
	/**
	 * @return the jornadaRed
	 */
	public BigDecimal getJornadaRed() {
		return jornadaRed;
	}
	/**
	 * @param jornadaRed the jornadaRed to set
	 */
	public void setJornadaRed(BigDecimal jornadaRed) {
		this.jornadaRed = jornadaRed;
	}
	/**
	 * @return the licencia
	 */
	public String getLicencia() {
		return licencia;
	}
	/**
	 * @param licencia the licencia to set
	 */
	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}
	/**
	 * @return the linea
	 */
	public String getLinea() {
		return linea;
	}
	/**
	 * @param linea the linea to set
	 */
	public void setLinea(String linea) {
		this.linea = linea;
	}
	/**
	 * @return the localidadNac
	 */
	public String getLocalidadNac() {
		return localidadNac;
	}
	/**
	 * @param localidadNac the localidadNac to set
	 */
	public void setLocalidadNac(String localidadNac) {
		this.localidadNac = localidadNac;
	}
	/**
	 * @return the lugarPago
	 */
	public String getLugarPago() {
		return lugarPago;
	}
	/**
	 * @param lugarPago the lugarPago to set
	 */
	public void setLugarPago(String lugarPago) {
		this.lugarPago = lugarPago;
	}
	/**
	 * @return the moneda
	 */
	public String getMoneda() {
		return moneda;
	}
	/**
	 * @param moneda the moneda to set
	 */
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	/**
	 * @return the nip
	 */
	public BigDecimal getNip() {
		return nip;
	}
	/**
	 * @param nip the nip to set
	 */
	public void setNip(BigDecimal nip) {
		this.nip = nip;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the paisNac
	 */
	public String getPaisNac() {
		return paisNac;
	}
	/**
	 * @param paisNac the paisNac to set
	 */
	public void setPaisNac(String paisNac) {
		this.paisNac = paisNac;
	}
	/**
	 * @return the pasaporte
	 */
	public String getPasaporte() {
		return pasaporte;
	}
	/**
	 * @param pasaporte the pasaporte to set
	 */
	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}
	/**
	 * @return the peso
	 */
	public BigDecimal getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}
	/**
	 * @return the plaza
	 */
	public BigDecimal getPlaza() {
		return plaza;
	}
	/**
	 * @param plaza the plaza to set
	 */
	public void setPlaza(BigDecimal plaza) {
		this.plaza = plaza;
	}
	/**
	 * @return the provinciaNac
	 */
	public String getProvinciaNac() {
		return provinciaNac;
	}
	/**
	 * @param provinciaNac the provinciaNac to set
	 */
	public void setProvinciaNac(String provinciaNac) {
		this.provinciaNac = provinciaNac;
	}
	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}
	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the sucursal
	 */
	public String getSucursal() {
		return sucursal;
	}
	/**
	 * @param sucursal the sucursal to set
	 */
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	/**
	 * @return the sucursal2
	 */
	public String getSucursal2() {
		return sucursal2;
	}
	/**
	 * @param sucursal2 the sucursal2 to set
	 */
	public void setSucursal2(String sucursal2) {
		this.sucursal2 = sucursal2;
	}
	/**
	 * @return the sueldo
	 */
	public BigDecimal getSueldo() {
		return sueldo;
	}
	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}
	/**
	 * @return the supervisor
	 */
	public String getSupervisor() {
		return supervisor;
	}
	/**
	 * @param supervisor the supervisor to set
	 */
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	/**
	 * @return the tarjetaVal
	 */
	public String getTarjetaVal() {
		return tarjetaVal;
	}
	/**
	 * @param tarjetaVal the tarjetaVal to set
	 */
	public void setTarjetaVal(String tarjetaVal) {
		this.tarjetaVal = tarjetaVal;
	}
	/**
	 * @return the tarjetaValComedor
	 */
	public String getTarjetaValComedor() {
		return tarjetaValComedor;
	}
	/**
	 * @param tarjetaValComedor the tarjetaValComedor to set
	 */
	public void setTarjetaValComedor(String tarjetaValComedor) {
		this.tarjetaValComedor = tarjetaValComedor;
	}
	/**
	 * @return the tarjetaValGasolina
	 */
	public String getTarjetaValGasolina() {
		return tarjetaValGasolina;
	}
	/**
	 * @param tarjetaValGasolina the tarjetaValGasolina to set
	 */
	public void setTarjetaValGasolina(String tarjetaValGasolina) {
		this.tarjetaValGasolina = tarjetaValGasolina;
	}
	/**
	 * @return the telefono
	 */
	public BigDecimal getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(BigDecimal telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the tipoContrato
	 */
	public String getTipoContrato() {
		return tipoContrato;
	}
	/**
	 * @param tipoContrato the tipoContrato to set
	 */
	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	/**
	 * @return the tipoCuenta
	 */
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	/**
	 * @param tipoCuenta the tipoCuenta to set
	 */
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	/**
	 * @return the tipoCuenta2
	 */
	public String getTipoCuenta2() {
		return tipoCuenta2;
	}
	/**
	 * @param tipoCuenta2 the tipoCuenta2 to set
	 */
	public void setTipoCuenta2(String tipoCuenta2) {
		this.tipoCuenta2 = tipoCuenta2;
	}
	/**
	 * @return the tipoEmpl
	 */
	public String getTipoEmpl() {
		return tipoEmpl;
	}
	/**
	 * @param tipoEmpl the tipoEmpl to set
	 */
	public void setTipoEmpl(String tipoEmpl) {
		this.tipoEmpl = tipoEmpl;
	}
	/**
	 * @return the tipoLicencia
	 */
	public String getTipoLicencia() {
		return tipoLicencia;
	}
	/**
	 * @param tipoLicencia the tipoLicencia to set
	 */
	public void setTipoLicencia(String tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}
	/**
	 * @return the turno
	 */
	public BigDecimal getTurno() {
		return turno;
	}
	/**
	 * @param turno the turno to set
	 */
	public void setTurno(BigDecimal turno) {
		this.turno = turno;
	}
	/**
	 * @return the venceLicencia
	 */
	public LocalDateTime getVenceLicencia() {
		return venceLicencia;
	}
	/**
	 * @param venceLicencia the venceLicencia to set
	 */
	public void setVenceLicencia(LocalDateTime venceLicencia) {
		this.venceLicencia = venceLicencia;
	}
	/**
	 * @return the vencePasaporte
	 */
	public LocalDateTime getVencePasaporte() {
		return vencePasaporte;
	}
	/**
	 * @param vencePasaporte the vencePasaporte to set
	 */
	public void setVencePasaporte(LocalDateTime vencePasaporte) {
		this.vencePasaporte = vencePasaporte;
	}
	/**
	 * @return the zona
	 */
	public BigDecimal getZona() {
		return zona;
	}
	/**
	 * @param zona the zona to set
	 */
	public void setZona(BigDecimal zona) {
		this.zona = zona;
	}
	/**
	 * @return the afilFonacot
	 */
	public String getAfilFonacot() {
		return afilFonacot;
	}
	/**
	 * @param afilFonacot the afilFonacot to set
	 */
	public void setAfilFonacot(String afilFonacot) {
		this.afilFonacot = afilFonacot;
	}
	/**
	 * @return the afilImss
	 */
	public String getAfilImss() {
		return afilImss;
	}
	/**
	 * @param afilImss the afilImss to set
	 */
	public void setAfilImss(String afilImss) {
		this.afilImss = afilImss;
	}
	/**
	 * @return the asimiladoASalarios
	 */
	public String getAsimiladoASalarios() {
		return asimiladoASalarios;
	}
	/**
	 * @param asimiladoASalarios the asimiladoASalarios to set
	 */
	public void setAsimiladoASalarios(String asimiladoASalarios) {
		this.asimiladoASalarios = asimiladoASalarios;
	}
	/**
	 * @return the bimestreSuspension
	 */
	public BigDecimal getBimestreSuspension() {
		return bimestreSuspension;
	}
	/**
	 * @param bimestreSuspension the bimestreSuspension to set
	 */
	public void setBimestreSuspension(BigDecimal bimestreSuspension) {
		this.bimestreSuspension = bimestreSuspension;
	}
	/**
	 * @return the claveElector
	 */
	public String getClaveElector() {
		return claveElector;
	}
	/**
	 * @param claveElector the claveElector to set
	 */
	public void setClaveElector(String claveElector) {
		this.claveElector = claveElector;
	}
	/**
	 * @return the clavePoblacion
	 */
	public String getClavePoblacion() {
		return clavePoblacion;
	}
	/**
	 * @param clavePoblacion the clavePoblacion to set
	 */
	public void setClavePoblacion(String clavePoblacion) {
		this.clavePoblacion = clavePoblacion;
	}
	/**
	 * @return the clinica
	 */
	public BigDecimal getClinica() {
		return clinica;
	}
	/**
	 * @param clinica the clinica to set
	 */
	public void setClinica(BigDecimal clinica) {
		this.clinica = clinica;
	}
	/**
	 * @return the codPos
	 */
	public BigDecimal getCodPos() {
		return codPos;
	}
	/**
	 * @param codPos the codPos to set
	 */
	public void setCodPos(BigDecimal codPos) {
		this.codPos = codPos;
	}
	/**
	 * @return the colonia
	 */
	public String getColonia() {
		return colonia;
	}
	/**
	 * @param colonia the colonia to set
	 */
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	/**
	 * @return the contratoSar
	 */
	public String getContratoSar() {
		return contratoSar;
	}
	/**
	 * @param contratoSar the contratoSar to set
	 */
	public void setContratoSar(String contratoSar) {
		this.contratoSar = contratoSar;
	}
	/**
	 * @return the credIfvt
	 */
	public String getCredIfvt() {
		return credIfvt;
	}
	/**
	 * @param credIfvt the credIfvt to set
	 */
	public void setCredIfvt(String credIfvt) {
		this.credIfvt = credIfvt;
	}
	/**
	 * @return the curp
	 */
	public String getCurp() {
		return curp;
	}
	/**
	 * @param curp the curp to set
	 */
	public void setCurp(String curp) {
		this.curp = curp;
	}
	/**
	 * @return the delegacionImss
	 */
	public String getDelegacionImss() {
		return delegacionImss;
	}
	/**
	 * @param delegacionImss the delegacionImss to set
	 */
	public void setDelegacionImss(String delegacionImss) {
		this.delegacionImss = delegacionImss;
	}
	/**
	 * @return the digVerRfc
	 */
	public String getDigVerRfc() {
		return digVerRfc;
	}
	/**
	 * @param digVerRfc the digVerRfc to set
	 */
	public void setDigVerRfc(String digVerRfc) {
		this.digVerRfc = digVerRfc;
	}
	/**
	 * @return the domicilio
	 */
	public String getDomicilio() {
		return domicilio;
	}
	/**
	 * @param domicilio the domicilio to set
	 */
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	/**
	 * @return the email1
	 */
	public String getEmail1() {
		return email1;
	}
	/**
	 * @param email1 the email1 to set
	 */
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	/**
	 * @return the email2
	 */
	public String getEmail2() {
		return email2;
	}
	/**
	 * @param email2 the email2 to set
	 */
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * @return the fAvisoLiberacion
	 */
	public LocalDateTime getfAvisoLiberacion() {
		return fAvisoLiberacion;
	}
	/**
	 * @param fAvisoLiberacion the fAvisoLiberacion to set
	 */
	public void setfAvisoLiberacion(LocalDateTime fAvisoLiberacion) {
		this.fAvisoLiberacion = fAvisoLiberacion;
	}
	/**
	 * @return the fIniDescuento
	 */
	public LocalDateTime getfIniDescuento() {
		return fIniDescuento;
	}
	/**
	 * @param fIniDescuento the fIniDescuento to set
	 */
	public void setfIniDescuento(LocalDateTime fIniDescuento) {
		this.fIniDescuento = fIniDescuento;
	}
	/**
	 * @return the fRecepcionCia
	 */
	public LocalDateTime getfRecepcionCia() {
		return fRecepcionCia;
	}
	/**
	 * @param fRecepcionCia the fRecepcionCia to set
	 */
	public void setfRecepcionCia(LocalDateTime fRecepcionCia) {
		this.fRecepcionCia = fRecepcionCia;
	}
	/**
	 * @return the fechaAltaConsar
	 */
	public LocalDateTime getFechaAltaConsar() {
		return fechaAltaConsar;
	}
	/**
	 * @param fechaAltaConsar the fechaAltaConsar to set
	 */
	public void setFechaAltaConsar(LocalDateTime fechaAltaConsar) {
		this.fechaAltaConsar = fechaAltaConsar;
	}
	/**
	 * @return the fechaAltaFonac
	 */
	public LocalDateTime getFechaAltaFonac() {
		return fechaAltaFonac;
	}
	/**
	 * @param fechaAltaFonac the fechaAltaFonac to set
	 */
	public void setFechaAltaFonac(LocalDateTime fechaAltaFonac) {
		this.fechaAltaFonac = fechaAltaFonac;
	}
	/**
	 * @return the fechaBajaConsar
	 */
	public LocalDateTime getFechaBajaConsar() {
		return fechaBajaConsar;
	}
	/**
	 * @param fechaBajaConsar the fechaBajaConsar to set
	 */
	public void setFechaBajaConsar(LocalDateTime fechaBajaConsar) {
		this.fechaBajaConsar = fechaBajaConsar;
	}
	/**
	 * @return the fechaBajaFonac
	 */
	public LocalDateTime getFechaBajaFonac() {
		return fechaBajaFonac;
	}
	/**
	 * @param fechaBajaFonac the fechaBajaFonac to set
	 */
	public void setFechaBajaFonac(LocalDateTime fechaBajaFonac) {
		this.fechaBajaFonac = fechaBajaFonac;
	}
	/**
	 * @return the fechaModIfvt
	 */
	public LocalDateTime getFechaModIfvt() {
		return fechaModIfvt;
	}
	/**
	 * @param fechaModIfvt the fechaModIfvt to set
	 */
	public void setFechaModIfvt(LocalDateTime fechaModIfvt) {
		this.fechaModIfvt = fechaModIfvt;
	}
	/**
	 * @return the fechaMov
	 */
	public LocalDateTime getFechaMov() {
		return fechaMov;
	}
	/**
	 * @param fechaMov the fechaMov to set
	 */
	public void setFechaMov(LocalDateTime fechaMov) {
		this.fechaMov = fechaMov;
	}
	/**
	 * @return the fechaRfc
	 */
	public String getFechaRfc() {
		return fechaRfc;
	}
	/**
	 * @param fechaRfc the fechaRfc to set
	 */
	public void setFechaRfc(String fechaRfc) {
		this.fechaRfc = fechaRfc;
	}
	/**
	 * @return the grupoImss
	 */
	public BigDecimal getGrupoImss() {
		return grupoImss;
	}
	/**
	 * @param grupoImss the grupoImss to set
	 */
	public void setGrupoImss(BigDecimal grupoImss) {
		this.grupoImss = grupoImss;
	}
	/**
	 * @return the homoRfc
	 */
	public String getHomoRfc() {
		return homoRfc;
	}
	/**
	 * @param homoRfc the homoRfc to set
	 */
	public void setHomoRfc(String homoRfc) {
		this.homoRfc = homoRfc;
	}
	/**
	 * @return the letrasRfc
	 */
	public String getLetrasRfc() {
		return letrasRfc;
	}
	/**
	 * @param letrasRfc the letrasRfc to set
	 */
	public void setLetrasRfc(String letrasRfc) {
		this.letrasRfc = letrasRfc;
	}
	/**
	 * @return the motivoBajaFonac
	 */
	public String getMotivoBajaFonac() {
		return motivoBajaFonac;
	}
	/**
	 * @param motivoBajaFonac the motivoBajaFonac to set
	 */
	public void setMotivoBajaFonac(String motivoBajaFonac) {
		this.motivoBajaFonac = motivoBajaFonac;
	}
	/**
	 * @return the movSuaIfvt
	 */
	public BigDecimal getMovSuaIfvt() {
		return movSuaIfvt;
	}
	/**
	 * @param movSuaIfvt the movSuaIfvt to set
	 */
	public void setMovSuaIfvt(BigDecimal movSuaIfvt) {
		this.movSuaIfvt = movSuaIfvt;
	}
	/**
	 * @return the numFolio
	 */
	public String getNumFolio() {
		return numFolio;
	}
	/**
	 * @param numFolio the numFolio to set
	 */
	public void setNumFolio(String numFolio) {
		this.numFolio = numFolio;
	}
	/**
	 * @return the numeroExt
	 */
	public String getNumeroExt() {
		return numeroExt;
	}
	/**
	 * @param numeroExt the numeroExt to set
	 */
	public void setNumeroExt(String numeroExt) {
		this.numeroExt = numeroExt;
	}
	/**
	 * @return the numeroInt
	 */
	public String getNumeroInt() {
		return numeroInt;
	}
	/**
	 * @param numeroInt the numeroInt to set
	 */
	public void setNumeroInt(String numeroInt) {
		this.numeroInt = numeroInt;
	}
	/**
	 * @return the poblacion
	 */
	public String getPoblacion() {
		return poblacion;
	}
	/**
	 * @param poblacion the poblacion to set
	 */
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	/**
	 * @return the porCredIfvt
	 */
	public BigDecimal getPorCredIfvt() {
		return porCredIfvt;
	}
	/**
	 * @param porCredIfvt the porCredIfvt to set
	 */
	public void setPorCredIfvt(BigDecimal porCredIfvt) {
		this.porCredIfvt = porCredIfvt;
	}
	/**
	 * @return the porcenRfcSubcon01
	 */
	public BigDecimal getPorcenRfcSubcon01() {
		return porcenRfcSubcon01;
	}
	/**
	 * @param porcenRfcSubcon01 the porcenRfcSubcon01 to set
	 */
	public void setPorcenRfcSubcon01(BigDecimal porcenRfcSubcon01) {
		this.porcenRfcSubcon01 = porcenRfcSubcon01;
	}
	/**
	 * @return the porcenRfcSubcon02
	 */
	public BigDecimal getPorcenRfcSubcon02() {
		return porcenRfcSubcon02;
	}
	/**
	 * @param porcenRfcSubcon02 the porcenRfcSubcon02 to set
	 */
	public void setPorcenRfcSubcon02(BigDecimal porcenRfcSubcon02) {
		this.porcenRfcSubcon02 = porcenRfcSubcon02;
	}
	/**
	 * @return the porcenRfcSubcon03
	 */
	public BigDecimal getPorcenRfcSubcon03() {
		return porcenRfcSubcon03;
	}
	/**
	 * @param porcenRfcSubcon03 the porcenRfcSubcon03 to set
	 */
	public void setPorcenRfcSubcon03(BigDecimal porcenRfcSubcon03) {
		this.porcenRfcSubcon03 = porcenRfcSubcon03;
	}
	/**
	 * @return the porcenRfcSubcon04
	 */
	public BigDecimal getPorcenRfcSubcon04() {
		return porcenRfcSubcon04;
	}
	/**
	 * @param porcenRfcSubcon04 the porcenRfcSubcon04 to set
	 */
	public void setPorcenRfcSubcon04(BigDecimal porcenRfcSubcon04) {
		this.porcenRfcSubcon04 = porcenRfcSubcon04;
	}
	/**
	 * @return the porcenRfcSubcon05
	 */
	public BigDecimal getPorcenRfcSubcon05() {
		return porcenRfcSubcon05;
	}
	/**
	 * @param porcenRfcSubcon05 the porcenRfcSubcon05 to set
	 */
	public void setPorcenRfcSubcon05(BigDecimal porcenRfcSubcon05) {
		this.porcenRfcSubcon05 = porcenRfcSubcon05;
	}
	/**
	 * @return the porcenRfcSubcon06
	 */
	public BigDecimal getPorcenRfcSubcon06() {
		return porcenRfcSubcon06;
	}
	/**
	 * @param porcenRfcSubcon06 the porcenRfcSubcon06 to set
	 */
	public void setPorcenRfcSubcon06(BigDecimal porcenRfcSubcon06) {
		this.porcenRfcSubcon06 = porcenRfcSubcon06;
	}
	/**
	 * @return the porcenRfcSubcon07
	 */
	public BigDecimal getPorcenRfcSubcon07() {
		return porcenRfcSubcon07;
	}
	/**
	 * @param porcenRfcSubcon07 the porcenRfcSubcon07 to set
	 */
	public void setPorcenRfcSubcon07(BigDecimal porcenRfcSubcon07) {
		this.porcenRfcSubcon07 = porcenRfcSubcon07;
	}
	/**
	 * @return the rfcSubcontrato01
	 */
	public String getRfcSubcontrato01() {
		return rfcSubcontrato01;
	}
	/**
	 * @param rfcSubcontrato01 the rfcSubcontrato01 to set
	 */
	public void setRfcSubcontrato01(String rfcSubcontrato01) {
		this.rfcSubcontrato01 = rfcSubcontrato01;
	}
	/**
	 * @return the rfcSubcontrato02
	 */
	public String getRfcSubcontrato02() {
		return rfcSubcontrato02;
	}
	/**
	 * @param rfcSubcontrato02 the rfcSubcontrato02 to set
	 */
	public void setRfcSubcontrato02(String rfcSubcontrato02) {
		this.rfcSubcontrato02 = rfcSubcontrato02;
	}
	/**
	 * @return the rfcSubcontrato03
	 */
	public String getRfcSubcontrato03() {
		return rfcSubcontrato03;
	}
	/**
	 * @param rfcSubcontrato03 the rfcSubcontrato03 to set
	 */
	public void setRfcSubcontrato03(String rfcSubcontrato03) {
		this.rfcSubcontrato03 = rfcSubcontrato03;
	}
	/**
	 * @return the rfcSubcontrato04
	 */
	public String getRfcSubcontrato04() {
		return rfcSubcontrato04;
	}
	/**
	 * @param rfcSubcontrato04 the rfcSubcontrato04 to set
	 */
	public void setRfcSubcontrato04(String rfcSubcontrato04) {
		this.rfcSubcontrato04 = rfcSubcontrato04;
	}
	/**
	 * @return the rfcSubcontrato05
	 */
	public String getRfcSubcontrato05() {
		return rfcSubcontrato05;
	}
	/**
	 * @param rfcSubcontrato05 the rfcSubcontrato05 to set
	 */
	public void setRfcSubcontrato05(String rfcSubcontrato05) {
		this.rfcSubcontrato05 = rfcSubcontrato05;
	}
	/**
	 * @return the rfcSubcontrato06
	 */
	public String getRfcSubcontrato06() {
		return rfcSubcontrato06;
	}
	/**
	 * @param rfcSubcontrato06 the rfcSubcontrato06 to set
	 */
	public void setRfcSubcontrato06(String rfcSubcontrato06) {
		this.rfcSubcontrato06 = rfcSubcontrato06;
	}
	/**
	 * @return the rfcSubcontrato07
	 */
	public String getRfcSubcontrato07() {
		return rfcSubcontrato07;
	}
	/**
	 * @param rfcSubcontrato07 the rfcSubcontrato07 to set
	 */
	public void setRfcSubcontrato07(String rfcSubcontrato07) {
		this.rfcSubcontrato07 = rfcSubcontrato07;
	}
	/**
	 * @return the salIntEym
	 */
	public BigDecimal getSalIntEym() {
		return salIntEym;
	}
	/**
	 * @param salIntEym the salIntEym to set
	 */
	public void setSalIntEym(BigDecimal salIntEym) {
		this.salIntEym = salIntEym;
	}
	/**
	 * @return the salIntIfvt
	 */
	public BigDecimal getSalIntIfvt() {
		return salIntIfvt;
	}
	/**
	 * @param salIntIfvt the salIntIfvt to set
	 */
	public void setSalIntIfvt(BigDecimal salIntIfvt) {
		this.salIntIfvt = salIntIfvt;
	}
	/**
	 * @return the salIntIvc
	 */
	public BigDecimal getSalIntIvc() {
		return salIntIvc;
	}
	/**
	 * @param salIntIvc the salIntIvc to set
	 */
	public void setSalIntIvc(BigDecimal salIntIvc) {
		this.salIntIvc = salIntIvc;
	}
	/**
	 * @return the salIntSar
	 */
	public BigDecimal getSalIntSar() {
		return salIntSar;
	}
	/**
	 * @param salIntSar the salIntSar to set
	 */
	public void setSalIntSar(BigDecimal salIntSar) {
		this.salIntSar = salIntSar;
	}
	/**
	 * @return the seccion
	 */
	public String getSeccion() {
		return seccion;
	}
	/**
	 * @param seccion the seccion to set
	 */
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	/**
	 * @return the semanaRedImss
	 */
	public BigDecimal getSemanaRedImss() {
		return semanaRedImss;
	}
	/**
	 * @param semanaRedImss the semanaRedImss to set
	 */
	public void setSemanaRedImss(BigDecimal semanaRedImss) {
		this.semanaRedImss = semanaRedImss;
	}
	/**
	 * @return the sindicalizado
	 */
	public String getSindicalizado() {
		return sindicalizado;
	}
	/**
	 * @param sindicalizado the sindicalizado to set
	 */
	public void setSindicalizado(String sindicalizado) {
		this.sindicalizado = sindicalizado;
	}
	/**
	 * @return the subdelegacionImss
	 */
	public String getSubdelegacionImss() {
		return subdelegacionImss;
	}
	/**
	 * @param subdelegacionImss the subdelegacionImss to set
	 */
	public void setSubdelegacionImss(String subdelegacionImss) {
		this.subdelegacionImss = subdelegacionImss;
	}
	/**
	 * @return the telefonoCel
	 */
	public BigDecimal getTelefonoCel() {
		return telefonoCel;
	}
	/**
	 * @param telefonoCel the telefonoCel to set
	 */
	public void setTelefonoCel(BigDecimal telefonoCel) {
		this.telefonoCel = telefonoCel;
	}
	/**
	 * @return the tipoCredIfvt
	 */
	public String getTipoCredIfvt() {
		return tipoCredIfvt;
	}
	/**
	 * @param tipoCredIfvt the tipoCredIfvt to set
	 */
	public void setTipoCredIfvt(String tipoCredIfvt) {
		this.tipoCredIfvt = tipoCredIfvt;
	}
	/**
	 * @return the tipoJornada
	 */
	public String getTipoJornada() {
		return tipoJornada;
	}
	/**
	 * @param tipoJornada the tipoJornada to set
	 */
	public void setTipoJornada(String tipoJornada) {
		this.tipoJornada = tipoJornada;
	}
	/**
	 * @return the tipoRegimen
	 */
	public String getTipoRegimen() {
		return tipoRegimen;
	}
	/**
	 * @param tipoRegimen the tipoRegimen to set
	 */
	public void setTipoRegimen(String tipoRegimen) {
		this.tipoRegimen = tipoRegimen;
	}
	/**
	 * @return the tipoTrabajadorImss
	 */
	public String getTipoTrabajadorImss() {
		return tipoTrabajadorImss;
	}
	/**
	 * @param tipoTrabajadorImss the tipoTrabajadorImss to set
	 */
	public void setTipoTrabajadorImss(String tipoTrabajadorImss) {
		this.tipoTrabajadorImss = tipoTrabajadorImss;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actividad == null) ? 0 : actividad.hashCode());
		result = prime * result + ((afilFonacot == null) ? 0 : afilFonacot.hashCode());
		result = prime * result + ((afilImss == null) ? 0 : afilImss.hashCode());
		result = prime * result + ((apellMat == null) ? 0 : apellMat.hashCode());
		result = prime * result + ((apellPat == null) ? 0 : apellPat.hashCode());
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((asimiladoASalarios == null) ? 0 : asimiladoASalarios.hashCode());
		result = prime * result + ((banco == null) ? 0 : banco.hashCode());
		result = prime * result + ((banco2 == null) ? 0 : banco2.hashCode());
		result = prime * result + ((bimestreSuspension == null) ? 0 : bimestreSuspension.hashCode());
		result = prime * result + ((cdBanco == null) ? 0 : cdBanco.hashCode());
		result = prime * result + ((centro == null) ? 0 : centro.hashCode());
		result = prime * result + ((claveElector == null) ? 0 : claveElector.hashCode());
		result = prime * result + ((claveLocalidad == null) ? 0 : claveLocalidad.hashCode());
		result = prime * result + ((clavePaisTel == null) ? 0 : clavePaisTel.hashCode());
		result = prime * result + ((clavePoblacion == null) ? 0 : clavePoblacion.hashCode());
		result = prime * result + ((claveProvincia == null) ? 0 : claveProvincia.hashCode());
		result = prime * result + ((clinica == null) ? 0 : clinica.hashCode());
		result = prime * result + ((codAreaTel == null) ? 0 : codAreaTel.hashCode());
		result = prime * result + ((codId01 == null) ? 0 : codId01.hashCode());
		result = prime * result + ((codId02 == null) ? 0 : codId02.hashCode());
		result = prime * result + ((codId03 == null) ? 0 : codId03.hashCode());
		result = prime * result + ((codId04 == null) ? 0 : codId04.hashCode());
		result = prime * result + ((codId05 == null) ? 0 : codId05.hashCode());
		result = prime * result + ((codId06 == null) ? 0 : codId06.hashCode());
		result = prime * result + ((codId07 == null) ? 0 : codId07.hashCode());
		result = prime * result + ((codId08 == null) ? 0 : codId08.hashCode());
		result = prime * result + ((codId09 == null) ? 0 : codId09.hashCode());
		result = prime * result + ((codId10 == null) ? 0 : codId10.hashCode());
		result = prime * result + ((codId11 == null) ? 0 : codId11.hashCode());
		result = prime * result + ((codId12 == null) ? 0 : codId12.hashCode());
		result = prime * result + ((codId13 == null) ? 0 : codId13.hashCode());
		result = prime * result + ((codId14 == null) ? 0 : codId14.hashCode());
		result = prime * result + ((codId15 == null) ? 0 : codId15.hashCode());
		result = prime * result + ((codId16 == null) ? 0 : codId16.hashCode());
		result = prime * result + ((codId17 == null) ? 0 : codId17.hashCode());
		result = prime * result + ((codId18 == null) ? 0 : codId18.hashCode());
		result = prime * result + ((codId19 == null) ? 0 : codId19.hashCode());
		result = prime * result + ((codId20 == null) ? 0 : codId20.hashCode());
		result = prime * result + ((codId21 == null) ? 0 : codId21.hashCode());
		result = prime * result + ((codId22 == null) ? 0 : codId22.hashCode());
		result = prime * result + ((codId23 == null) ? 0 : codId23.hashCode());
		result = prime * result + ((codId24 == null) ? 0 : codId24.hashCode());
		result = prime * result + ((codId25 == null) ? 0 : codId25.hashCode());
		result = prime * result + ((codId26 == null) ? 0 : codId26.hashCode());
		result = prime * result + ((codId27 == null) ? 0 : codId27.hashCode());
		result = prime * result + ((codId28 == null) ? 0 : codId28.hashCode());
		result = prime * result + ((codId29 == null) ? 0 : codId29.hashCode());
		result = prime * result + ((codId30 == null) ? 0 : codId30.hashCode());
		result = prime * result + ((codPos == null) ? 0 : codPos.hashCode());
		result = prime * result + ((colonia == null) ? 0 : colonia.hashCode());
		result = prime * result + ((contrato == null) ? 0 : contrato.hashCode());
		result = prime * result + ((contratoSar == null) ? 0 : contratoSar.hashCode());
		result = prime * result + ((credIfvt == null) ? 0 : credIfvt.hashCode());
		result = prime * result + ((ctaDeud == null) ? 0 : ctaDeud.hashCode());
		result = prime * result + ((ctaDeud2 == null) ? 0 : ctaDeud2.hashCode());
		result = prime * result + ((cuenta == null) ? 0 : cuenta.hashCode());
		result = prime * result + ((cuenta2 == null) ? 0 : cuenta2.hashCode());
		result = prime * result + ((cuentaClave == null) ? 0 : cuentaClave.hashCode());
		result = prime * result + ((cuentaVales == null) ? 0 : cuentaVales.hashCode());
		result = prime * result + ((cuentaValesComedor == null) ? 0 : cuentaValesComedor.hashCode());
		result = prime * result + ((cuentaValesGasolina == null) ? 0 : cuentaValesGasolina.hashCode());
		result = prime * result + ((curp == null) ? 0 : curp.hashCode());
		result = prime * result + ((declaracionImp == null) ? 0 : declaracionImp.hashCode());
		result = prime * result + ((delegacionImss == null) ? 0 : delegacionImss.hashCode());
		result = prime * result + ((digVerRfc == null) ? 0 : digVerRfc.hashCode());
		result = prime * result + ((domicilio == null) ? 0 : domicilio.hashCode());
		result = prime * result + ((edoBanco == null) ? 0 : edoBanco.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((email1 == null) ? 0 : email1.hashCode());
		result = prime * result + ((email2 == null) ? 0 : email2.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((estadoCivil == null) ? 0 : estadoCivil.hashCode());
		result = prime * result + ((estatura == null) ? 0 : estatura.hashCode());
		result = prime * result + ((extensionTel == null) ? 0 : extensionTel.hashCode());
		result = prime * result + ((fAvisoLiberacion == null) ? 0 : fAvisoLiberacion.hashCode());
		result = prime * result + ((fIniDescuento == null) ? 0 : fIniDescuento.hashCode());
		result = prime * result + ((fRecepcionCia == null) ? 0 : fRecepcionCia.hashCode());
		result = prime * result + ((fechaAltaConsar == null) ? 0 : fechaAltaConsar.hashCode());
		result = prime * result + ((fechaAltaFonac == null) ? 0 : fechaAltaFonac.hashCode());
		result = prime * result + ((fechaAntiguedad == null) ? 0 : fechaAntiguedad.hashCode());
		result = prime * result + ((fechaAntiguedadSub == null) ? 0 : fechaAntiguedadSub.hashCode());
		result = prime * result + ((fechaBaja == null) ? 0 : fechaBaja.hashCode());
		result = prime * result + ((fechaBajaConsar == null) ? 0 : fechaBajaConsar.hashCode());
		result = prime * result + ((fechaBajaFonac == null) ? 0 : fechaBajaFonac.hashCode());
		result = prime * result + ((fechaContrato == null) ? 0 : fechaContrato.hashCode());
		result = prime * result + ((fechaIngreso == null) ? 0 : fechaIngreso.hashCode());
		result = prime * result + ((fechaMerito == null) ? 0 : fechaMerito.hashCode());
		result = prime * result + ((fechaModIfvt == null) ? 0 : fechaModIfvt.hashCode());
		result = prime * result + ((fechaMov == null) ? 0 : fechaMov.hashCode());
		result = prime * result + ((fechaNac == null) ? 0 : fechaNac.hashCode());
		result = prime * result + ((fechaPromocion == null) ? 0 : fechaPromocion.hashCode());
		result = prime * result + ((fechaRfc == null) ? 0 : fechaRfc.hashCode());
		result = prime * result + ((fechaSueldo == null) ? 0 : fechaSueldo.hashCode());
		result = prime * result + ((fechaTerminacion == null) ? 0 : fechaTerminacion.hashCode());
		result = prime * result + ((formaPago == null) ? 0 : formaPago.hashCode());
		result = prime * result + ((formatoSueldo == null) ? 0 : formatoSueldo.hashCode());
		result = prime * result + ((gpoSanguineo == null) ? 0 : gpoSanguineo.hashCode());
		result = prime * result + ((grupoImss == null) ? 0 : grupoImss.hashCode());
		result = prime * result + ((grupoPrestacion == null) ? 0 : grupoPrestacion.hashCode());
		result = prime * result + ((grupoPrestacionSub == null) ? 0 : grupoPrestacionSub.hashCode());
		result = prime * result + ((homoRfc == null) ? 0 : homoRfc.hashCode());
		result = prime * result + ((jornadaRed == null) ? 0 : jornadaRed.hashCode());
		result = prime * result + ((letrasRfc == null) ? 0 : letrasRfc.hashCode());
		result = prime * result + ((licencia == null) ? 0 : licencia.hashCode());
		result = prime * result + ((linea == null) ? 0 : linea.hashCode());
		result = prime * result + ((localidadNac == null) ? 0 : localidadNac.hashCode());
		result = prime * result + ((lugarPago == null) ? 0 : lugarPago.hashCode());
		result = prime * result + ((moneda == null) ? 0 : moneda.hashCode());
		result = prime * result + ((motivoBajaFonac == null) ? 0 : motivoBajaFonac.hashCode());
		result = prime * result + ((movSuaIfvt == null) ? 0 : movSuaIfvt.hashCode());
		result = prime * result + ((nacionalidad == null) ? 0 : nacionalidad.hashCode());
		result = prime * result + ((nip == null) ? 0 : nip.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + (int) (numCia ^ (numCia >>> 32));
		result = prime * result + (int) (numEmp ^ (numEmp >>> 32));
		result = prime * result + ((numFolio == null) ? 0 : numFolio.hashCode());
		result = prime * result + ((numeroExt == null) ? 0 : numeroExt.hashCode());
		result = prime * result + ((numeroInt == null) ? 0 : numeroInt.hashCode());
		result = prime * result + ((paisNac == null) ? 0 : paisNac.hashCode());
		result = prime * result + ((pasaporte == null) ? 0 : pasaporte.hashCode());
		result = prime * result + ((peso == null) ? 0 : peso.hashCode());
		result = prime * result + ((plaza == null) ? 0 : plaza.hashCode());
		result = prime * result + ((poblacion == null) ? 0 : poblacion.hashCode());
		result = prime * result + ((porCredIfvt == null) ? 0 : porCredIfvt.hashCode());
		result = prime * result + ((porcenRfcSubcon01 == null) ? 0 : porcenRfcSubcon01.hashCode());
		result = prime * result + ((porcenRfcSubcon02 == null) ? 0 : porcenRfcSubcon02.hashCode());
		result = prime * result + ((porcenRfcSubcon03 == null) ? 0 : porcenRfcSubcon03.hashCode());
		result = prime * result + ((porcenRfcSubcon04 == null) ? 0 : porcenRfcSubcon04.hashCode());
		result = prime * result + ((porcenRfcSubcon05 == null) ? 0 : porcenRfcSubcon05.hashCode());
		result = prime * result + ((porcenRfcSubcon06 == null) ? 0 : porcenRfcSubcon06.hashCode());
		result = prime * result + ((porcenRfcSubcon07 == null) ? 0 : porcenRfcSubcon07.hashCode());
		result = prime * result + ((provinciaNac == null) ? 0 : provinciaNac.hashCode());
		result = prime * result + ((puesto == null) ? 0 : puesto.hashCode());
		result = prime * result + ((rfcSubcontrato01 == null) ? 0 : rfcSubcontrato01.hashCode());
		result = prime * result + ((rfcSubcontrato02 == null) ? 0 : rfcSubcontrato02.hashCode());
		result = prime * result + ((rfcSubcontrato03 == null) ? 0 : rfcSubcontrato03.hashCode());
		result = prime * result + ((rfcSubcontrato04 == null) ? 0 : rfcSubcontrato04.hashCode());
		result = prime * result + ((rfcSubcontrato05 == null) ? 0 : rfcSubcontrato05.hashCode());
		result = prime * result + ((rfcSubcontrato06 == null) ? 0 : rfcSubcontrato06.hashCode());
		result = prime * result + ((rfcSubcontrato07 == null) ? 0 : rfcSubcontrato07.hashCode());
		result = prime * result + ((salIntEym == null) ? 0 : salIntEym.hashCode());
		result = prime * result + ((salIntIfvt == null) ? 0 : salIntIfvt.hashCode());
		result = prime * result + ((salIntIvc == null) ? 0 : salIntIvc.hashCode());
		result = prime * result + ((salIntSar == null) ? 0 : salIntSar.hashCode());
		result = prime * result + ((seccion == null) ? 0 : seccion.hashCode());
		result = prime * result + ((semanaRedImss == null) ? 0 : semanaRedImss.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((sindicalizado == null) ? 0 : sindicalizado.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((subdelegacionImss == null) ? 0 : subdelegacionImss.hashCode());
		result = prime * result + ((sucursal == null) ? 0 : sucursal.hashCode());
		result = prime * result + ((sucursal2 == null) ? 0 : sucursal2.hashCode());
		result = prime * result + ((sueldo == null) ? 0 : sueldo.hashCode());
		result = prime * result + ((supervisor == null) ? 0 : supervisor.hashCode());
		result = prime * result + ((tarjetaVal == null) ? 0 : tarjetaVal.hashCode());
		result = prime * result + ((tarjetaValComedor == null) ? 0 : tarjetaValComedor.hashCode());
		result = prime * result + ((tarjetaValGasolina == null) ? 0 : tarjetaValGasolina.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result + ((telefonoCel == null) ? 0 : telefonoCel.hashCode());
		result = prime * result + ((tipoContrato == null) ? 0 : tipoContrato.hashCode());
		result = prime * result + ((tipoCredIfvt == null) ? 0 : tipoCredIfvt.hashCode());
		result = prime * result + ((tipoCuenta == null) ? 0 : tipoCuenta.hashCode());
		result = prime * result + ((tipoCuenta2 == null) ? 0 : tipoCuenta2.hashCode());
		result = prime * result + ((tipoEmpl == null) ? 0 : tipoEmpl.hashCode());
		result = prime * result + ((tipoJornada == null) ? 0 : tipoJornada.hashCode());
		result = prime * result + ((tipoLicencia == null) ? 0 : tipoLicencia.hashCode());
		result = prime * result + ((tipoRegimen == null) ? 0 : tipoRegimen.hashCode());
		result = prime * result + ((tipoTrabajadorImss == null) ? 0 : tipoTrabajadorImss.hashCode());
		result = prime * result + ((turno == null) ? 0 : turno.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((venceLicencia == null) ? 0 : venceLicencia.hashCode());
		result = prime * result + ((vencePasaporte == null) ? 0 : vencePasaporte.hashCode());
		result = prime * result + ((zona == null) ? 0 : zona.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HuEmplDto other = (HuEmplDto) obj;
		if (actividad == null) {
			if (other.actividad != null)
				return false;
		} else if (!actividad.equals(other.actividad))
			return false;
		if (afilFonacot == null) {
			if (other.afilFonacot != null)
				return false;
		} else if (!afilFonacot.equals(other.afilFonacot))
			return false;
		if (afilImss == null) {
			if (other.afilImss != null)
				return false;
		} else if (!afilImss.equals(other.afilImss))
			return false;
		if (apellMat == null) {
			if (other.apellMat != null)
				return false;
		} else if (!apellMat.equals(other.apellMat))
			return false;
		if (apellPat == null) {
			if (other.apellPat != null)
				return false;
		} else if (!apellPat.equals(other.apellPat))
			return false;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (asimiladoASalarios == null) {
			if (other.asimiladoASalarios != null)
				return false;
		} else if (!asimiladoASalarios.equals(other.asimiladoASalarios))
			return false;
		if (banco == null) {
			if (other.banco != null)
				return false;
		} else if (!banco.equals(other.banco))
			return false;
		if (banco2 == null) {
			if (other.banco2 != null)
				return false;
		} else if (!banco2.equals(other.banco2))
			return false;
		if (bimestreSuspension == null) {
			if (other.bimestreSuspension != null)
				return false;
		} else if (!bimestreSuspension.equals(other.bimestreSuspension))
			return false;
		if (cdBanco == null) {
			if (other.cdBanco != null)
				return false;
		} else if (!cdBanco.equals(other.cdBanco))
			return false;
		if (centro == null) {
			if (other.centro != null)
				return false;
		} else if (!centro.equals(other.centro))
			return false;
		if (claveElector == null) {
			if (other.claveElector != null)
				return false;
		} else if (!claveElector.equals(other.claveElector))
			return false;
		if (claveLocalidad == null) {
			if (other.claveLocalidad != null)
				return false;
		} else if (!claveLocalidad.equals(other.claveLocalidad))
			return false;
		if (clavePaisTel == null) {
			if (other.clavePaisTel != null)
				return false;
		} else if (!clavePaisTel.equals(other.clavePaisTel))
			return false;
		if (clavePoblacion == null) {
			if (other.clavePoblacion != null)
				return false;
		} else if (!clavePoblacion.equals(other.clavePoblacion))
			return false;
		if (claveProvincia == null) {
			if (other.claveProvincia != null)
				return false;
		} else if (!claveProvincia.equals(other.claveProvincia))
			return false;
		if (clinica == null) {
			if (other.clinica != null)
				return false;
		} else if (!clinica.equals(other.clinica))
			return false;
		if (codAreaTel == null) {
			if (other.codAreaTel != null)
				return false;
		} else if (!codAreaTel.equals(other.codAreaTel))
			return false;
		if (codId01 == null) {
			if (other.codId01 != null)
				return false;
		} else if (!codId01.equals(other.codId01))
			return false;
		if (codId02 == null) {
			if (other.codId02 != null)
				return false;
		} else if (!codId02.equals(other.codId02))
			return false;
		if (codId03 == null) {
			if (other.codId03 != null)
				return false;
		} else if (!codId03.equals(other.codId03))
			return false;
		if (codId04 == null) {
			if (other.codId04 != null)
				return false;
		} else if (!codId04.equals(other.codId04))
			return false;
		if (codId05 == null) {
			if (other.codId05 != null)
				return false;
		} else if (!codId05.equals(other.codId05))
			return false;
		if (codId06 == null) {
			if (other.codId06 != null)
				return false;
		} else if (!codId06.equals(other.codId06))
			return false;
		if (codId07 == null) {
			if (other.codId07 != null)
				return false;
		} else if (!codId07.equals(other.codId07))
			return false;
		if (codId08 == null) {
			if (other.codId08 != null)
				return false;
		} else if (!codId08.equals(other.codId08))
			return false;
		if (codId09 == null) {
			if (other.codId09 != null)
				return false;
		} else if (!codId09.equals(other.codId09))
			return false;
		if (codId10 == null) {
			if (other.codId10 != null)
				return false;
		} else if (!codId10.equals(other.codId10))
			return false;
		if (codId11 == null) {
			if (other.codId11 != null)
				return false;
		} else if (!codId11.equals(other.codId11))
			return false;
		if (codId12 == null) {
			if (other.codId12 != null)
				return false;
		} else if (!codId12.equals(other.codId12))
			return false;
		if (codId13 == null) {
			if (other.codId13 != null)
				return false;
		} else if (!codId13.equals(other.codId13))
			return false;
		if (codId14 == null) {
			if (other.codId14 != null)
				return false;
		} else if (!codId14.equals(other.codId14))
			return false;
		if (codId15 == null) {
			if (other.codId15 != null)
				return false;
		} else if (!codId15.equals(other.codId15))
			return false;
		if (codId16 == null) {
			if (other.codId16 != null)
				return false;
		} else if (!codId16.equals(other.codId16))
			return false;
		if (codId17 == null) {
			if (other.codId17 != null)
				return false;
		} else if (!codId17.equals(other.codId17))
			return false;
		if (codId18 == null) {
			if (other.codId18 != null)
				return false;
		} else if (!codId18.equals(other.codId18))
			return false;
		if (codId19 == null) {
			if (other.codId19 != null)
				return false;
		} else if (!codId19.equals(other.codId19))
			return false;
		if (codId20 == null) {
			if (other.codId20 != null)
				return false;
		} else if (!codId20.equals(other.codId20))
			return false;
		if (codId21 == null) {
			if (other.codId21 != null)
				return false;
		} else if (!codId21.equals(other.codId21))
			return false;
		if (codId22 == null) {
			if (other.codId22 != null)
				return false;
		} else if (!codId22.equals(other.codId22))
			return false;
		if (codId23 == null) {
			if (other.codId23 != null)
				return false;
		} else if (!codId23.equals(other.codId23))
			return false;
		if (codId24 == null) {
			if (other.codId24 != null)
				return false;
		} else if (!codId24.equals(other.codId24))
			return false;
		if (codId25 == null) {
			if (other.codId25 != null)
				return false;
		} else if (!codId25.equals(other.codId25))
			return false;
		if (codId26 == null) {
			if (other.codId26 != null)
				return false;
		} else if (!codId26.equals(other.codId26))
			return false;
		if (codId27 == null) {
			if (other.codId27 != null)
				return false;
		} else if (!codId27.equals(other.codId27))
			return false;
		if (codId28 == null) {
			if (other.codId28 != null)
				return false;
		} else if (!codId28.equals(other.codId28))
			return false;
		if (codId29 == null) {
			if (other.codId29 != null)
				return false;
		} else if (!codId29.equals(other.codId29))
			return false;
		if (codId30 == null) {
			if (other.codId30 != null)
				return false;
		} else if (!codId30.equals(other.codId30))
			return false;
		if (codPos == null) {
			if (other.codPos != null)
				return false;
		} else if (!codPos.equals(other.codPos))
			return false;
		if (colonia == null) {
			if (other.colonia != null)
				return false;
		} else if (!colonia.equals(other.colonia))
			return false;
		if (contrato == null) {
			if (other.contrato != null)
				return false;
		} else if (!contrato.equals(other.contrato))
			return false;
		if (contratoSar == null) {
			if (other.contratoSar != null)
				return false;
		} else if (!contratoSar.equals(other.contratoSar))
			return false;
		if (credIfvt == null) {
			if (other.credIfvt != null)
				return false;
		} else if (!credIfvt.equals(other.credIfvt))
			return false;
		if (ctaDeud == null) {
			if (other.ctaDeud != null)
				return false;
		} else if (!ctaDeud.equals(other.ctaDeud))
			return false;
		if (ctaDeud2 == null) {
			if (other.ctaDeud2 != null)
				return false;
		} else if (!ctaDeud2.equals(other.ctaDeud2))
			return false;
		if (cuenta == null) {
			if (other.cuenta != null)
				return false;
		} else if (!cuenta.equals(other.cuenta))
			return false;
		if (cuenta2 == null) {
			if (other.cuenta2 != null)
				return false;
		} else if (!cuenta2.equals(other.cuenta2))
			return false;
		if (cuentaClave == null) {
			if (other.cuentaClave != null)
				return false;
		} else if (!cuentaClave.equals(other.cuentaClave))
			return false;
		if (cuentaVales == null) {
			if (other.cuentaVales != null)
				return false;
		} else if (!cuentaVales.equals(other.cuentaVales))
			return false;
		if (cuentaValesComedor == null) {
			if (other.cuentaValesComedor != null)
				return false;
		} else if (!cuentaValesComedor.equals(other.cuentaValesComedor))
			return false;
		if (cuentaValesGasolina == null) {
			if (other.cuentaValesGasolina != null)
				return false;
		} else if (!cuentaValesGasolina.equals(other.cuentaValesGasolina))
			return false;
		if (curp == null) {
			if (other.curp != null)
				return false;
		} else if (!curp.equals(other.curp))
			return false;
		if (declaracionImp == null) {
			if (other.declaracionImp != null)
				return false;
		} else if (!declaracionImp.equals(other.declaracionImp))
			return false;
		if (delegacionImss == null) {
			if (other.delegacionImss != null)
				return false;
		} else if (!delegacionImss.equals(other.delegacionImss))
			return false;
		if (digVerRfc == null) {
			if (other.digVerRfc != null)
				return false;
		} else if (!digVerRfc.equals(other.digVerRfc))
			return false;
		if (domicilio == null) {
			if (other.domicilio != null)
				return false;
		} else if (!domicilio.equals(other.domicilio))
			return false;
		if (edoBanco == null) {
			if (other.edoBanco != null)
				return false;
		} else if (!edoBanco.equals(other.edoBanco))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (email1 == null) {
			if (other.email1 != null)
				return false;
		} else if (!email1.equals(other.email1))
			return false;
		if (email2 == null) {
			if (other.email2 != null)
				return false;
		} else if (!email2.equals(other.email2))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (estadoCivil == null) {
			if (other.estadoCivil != null)
				return false;
		} else if (!estadoCivil.equals(other.estadoCivil))
			return false;
		if (estatura == null) {
			if (other.estatura != null)
				return false;
		} else if (!estatura.equals(other.estatura))
			return false;
		if (extensionTel == null) {
			if (other.extensionTel != null)
				return false;
		} else if (!extensionTel.equals(other.extensionTel))
			return false;
		if (fAvisoLiberacion == null) {
			if (other.fAvisoLiberacion != null)
				return false;
		} else if (!fAvisoLiberacion.equals(other.fAvisoLiberacion))
			return false;
		if (fIniDescuento == null) {
			if (other.fIniDescuento != null)
				return false;
		} else if (!fIniDescuento.equals(other.fIniDescuento))
			return false;
		if (fRecepcionCia == null) {
			if (other.fRecepcionCia != null)
				return false;
		} else if (!fRecepcionCia.equals(other.fRecepcionCia))
			return false;
		if (fechaAltaConsar == null) {
			if (other.fechaAltaConsar != null)
				return false;
		} else if (!fechaAltaConsar.equals(other.fechaAltaConsar))
			return false;
		if (fechaAltaFonac == null) {
			if (other.fechaAltaFonac != null)
				return false;
		} else if (!fechaAltaFonac.equals(other.fechaAltaFonac))
			return false;
		if (fechaAntiguedad == null) {
			if (other.fechaAntiguedad != null)
				return false;
		} else if (!fechaAntiguedad.equals(other.fechaAntiguedad))
			return false;
		if (fechaAntiguedadSub == null) {
			if (other.fechaAntiguedadSub != null)
				return false;
		} else if (!fechaAntiguedadSub.equals(other.fechaAntiguedadSub))
			return false;
		if (fechaBaja == null) {
			if (other.fechaBaja != null)
				return false;
		} else if (!fechaBaja.equals(other.fechaBaja))
			return false;
		if (fechaBajaConsar == null) {
			if (other.fechaBajaConsar != null)
				return false;
		} else if (!fechaBajaConsar.equals(other.fechaBajaConsar))
			return false;
		if (fechaBajaFonac == null) {
			if (other.fechaBajaFonac != null)
				return false;
		} else if (!fechaBajaFonac.equals(other.fechaBajaFonac))
			return false;
		if (fechaContrato == null) {
			if (other.fechaContrato != null)
				return false;
		} else if (!fechaContrato.equals(other.fechaContrato))
			return false;
		if (fechaIngreso == null) {
			if (other.fechaIngreso != null)
				return false;
		} else if (!fechaIngreso.equals(other.fechaIngreso))
			return false;
		if (fechaMerito == null) {
			if (other.fechaMerito != null)
				return false;
		} else if (!fechaMerito.equals(other.fechaMerito))
			return false;
		if (fechaModIfvt == null) {
			if (other.fechaModIfvt != null)
				return false;
		} else if (!fechaModIfvt.equals(other.fechaModIfvt))
			return false;
		if (fechaMov == null) {
			if (other.fechaMov != null)
				return false;
		} else if (!fechaMov.equals(other.fechaMov))
			return false;
		if (fechaNac == null) {
			if (other.fechaNac != null)
				return false;
		} else if (!fechaNac.equals(other.fechaNac))
			return false;
		if (fechaPromocion == null) {
			if (other.fechaPromocion != null)
				return false;
		} else if (!fechaPromocion.equals(other.fechaPromocion))
			return false;
		if (fechaRfc == null) {
			if (other.fechaRfc != null)
				return false;
		} else if (!fechaRfc.equals(other.fechaRfc))
			return false;
		if (fechaSueldo == null) {
			if (other.fechaSueldo != null)
				return false;
		} else if (!fechaSueldo.equals(other.fechaSueldo))
			return false;
		if (fechaTerminacion == null) {
			if (other.fechaTerminacion != null)
				return false;
		} else if (!fechaTerminacion.equals(other.fechaTerminacion))
			return false;
		if (formaPago == null) {
			if (other.formaPago != null)
				return false;
		} else if (!formaPago.equals(other.formaPago))
			return false;
		if (formatoSueldo == null) {
			if (other.formatoSueldo != null)
				return false;
		} else if (!formatoSueldo.equals(other.formatoSueldo))
			return false;
		if (gpoSanguineo == null) {
			if (other.gpoSanguineo != null)
				return false;
		} else if (!gpoSanguineo.equals(other.gpoSanguineo))
			return false;
		if (grupoImss == null) {
			if (other.grupoImss != null)
				return false;
		} else if (!grupoImss.equals(other.grupoImss))
			return false;
		if (grupoPrestacion == null) {
			if (other.grupoPrestacion != null)
				return false;
		} else if (!grupoPrestacion.equals(other.grupoPrestacion))
			return false;
		if (grupoPrestacionSub == null) {
			if (other.grupoPrestacionSub != null)
				return false;
		} else if (!grupoPrestacionSub.equals(other.grupoPrestacionSub))
			return false;
		if (homoRfc == null) {
			if (other.homoRfc != null)
				return false;
		} else if (!homoRfc.equals(other.homoRfc))
			return false;
		if (jornadaRed == null) {
			if (other.jornadaRed != null)
				return false;
		} else if (!jornadaRed.equals(other.jornadaRed))
			return false;
		if (letrasRfc == null) {
			if (other.letrasRfc != null)
				return false;
		} else if (!letrasRfc.equals(other.letrasRfc))
			return false;
		if (licencia == null) {
			if (other.licencia != null)
				return false;
		} else if (!licencia.equals(other.licencia))
			return false;
		if (linea == null) {
			if (other.linea != null)
				return false;
		} else if (!linea.equals(other.linea))
			return false;
		if (localidadNac == null) {
			if (other.localidadNac != null)
				return false;
		} else if (!localidadNac.equals(other.localidadNac))
			return false;
		if (lugarPago == null) {
			if (other.lugarPago != null)
				return false;
		} else if (!lugarPago.equals(other.lugarPago))
			return false;
		if (moneda == null) {
			if (other.moneda != null)
				return false;
		} else if (!moneda.equals(other.moneda))
			return false;
		if (motivoBajaFonac == null) {
			if (other.motivoBajaFonac != null)
				return false;
		} else if (!motivoBajaFonac.equals(other.motivoBajaFonac))
			return false;
		if (movSuaIfvt == null) {
			if (other.movSuaIfvt != null)
				return false;
		} else if (!movSuaIfvt.equals(other.movSuaIfvt))
			return false;
		if (nacionalidad == null) {
			if (other.nacionalidad != null)
				return false;
		} else if (!nacionalidad.equals(other.nacionalidad))
			return false;
		if (nip == null) {
			if (other.nip != null)
				return false;
		} else if (!nip.equals(other.nip))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numCia != other.numCia)
			return false;
		if (numEmp != other.numEmp)
			return false;
		if (numFolio == null) {
			if (other.numFolio != null)
				return false;
		} else if (!numFolio.equals(other.numFolio))
			return false;
		if (numeroExt == null) {
			if (other.numeroExt != null)
				return false;
		} else if (!numeroExt.equals(other.numeroExt))
			return false;
		if (numeroInt == null) {
			if (other.numeroInt != null)
				return false;
		} else if (!numeroInt.equals(other.numeroInt))
			return false;
		if (paisNac == null) {
			if (other.paisNac != null)
				return false;
		} else if (!paisNac.equals(other.paisNac))
			return false;
		if (pasaporte == null) {
			if (other.pasaporte != null)
				return false;
		} else if (!pasaporte.equals(other.pasaporte))
			return false;
		if (peso == null) {
			if (other.peso != null)
				return false;
		} else if (!peso.equals(other.peso))
			return false;
		if (plaza == null) {
			if (other.plaza != null)
				return false;
		} else if (!plaza.equals(other.plaza))
			return false;
		if (poblacion == null) {
			if (other.poblacion != null)
				return false;
		} else if (!poblacion.equals(other.poblacion))
			return false;
		if (porCredIfvt == null) {
			if (other.porCredIfvt != null)
				return false;
		} else if (!porCredIfvt.equals(other.porCredIfvt))
			return false;
		if (porcenRfcSubcon01 == null) {
			if (other.porcenRfcSubcon01 != null)
				return false;
		} else if (!porcenRfcSubcon01.equals(other.porcenRfcSubcon01))
			return false;
		if (porcenRfcSubcon02 == null) {
			if (other.porcenRfcSubcon02 != null)
				return false;
		} else if (!porcenRfcSubcon02.equals(other.porcenRfcSubcon02))
			return false;
		if (porcenRfcSubcon03 == null) {
			if (other.porcenRfcSubcon03 != null)
				return false;
		} else if (!porcenRfcSubcon03.equals(other.porcenRfcSubcon03))
			return false;
		if (porcenRfcSubcon04 == null) {
			if (other.porcenRfcSubcon04 != null)
				return false;
		} else if (!porcenRfcSubcon04.equals(other.porcenRfcSubcon04))
			return false;
		if (porcenRfcSubcon05 == null) {
			if (other.porcenRfcSubcon05 != null)
				return false;
		} else if (!porcenRfcSubcon05.equals(other.porcenRfcSubcon05))
			return false;
		if (porcenRfcSubcon06 == null) {
			if (other.porcenRfcSubcon06 != null)
				return false;
		} else if (!porcenRfcSubcon06.equals(other.porcenRfcSubcon06))
			return false;
		if (porcenRfcSubcon07 == null) {
			if (other.porcenRfcSubcon07 != null)
				return false;
		} else if (!porcenRfcSubcon07.equals(other.porcenRfcSubcon07))
			return false;
		if (provinciaNac == null) {
			if (other.provinciaNac != null)
				return false;
		} else if (!provinciaNac.equals(other.provinciaNac))
			return false;
		if (puesto == null) {
			if (other.puesto != null)
				return false;
		} else if (!puesto.equals(other.puesto))
			return false;
		if (rfcSubcontrato01 == null) {
			if (other.rfcSubcontrato01 != null)
				return false;
		} else if (!rfcSubcontrato01.equals(other.rfcSubcontrato01))
			return false;
		if (rfcSubcontrato02 == null) {
			if (other.rfcSubcontrato02 != null)
				return false;
		} else if (!rfcSubcontrato02.equals(other.rfcSubcontrato02))
			return false;
		if (rfcSubcontrato03 == null) {
			if (other.rfcSubcontrato03 != null)
				return false;
		} else if (!rfcSubcontrato03.equals(other.rfcSubcontrato03))
			return false;
		if (rfcSubcontrato04 == null) {
			if (other.rfcSubcontrato04 != null)
				return false;
		} else if (!rfcSubcontrato04.equals(other.rfcSubcontrato04))
			return false;
		if (rfcSubcontrato05 == null) {
			if (other.rfcSubcontrato05 != null)
				return false;
		} else if (!rfcSubcontrato05.equals(other.rfcSubcontrato05))
			return false;
		if (rfcSubcontrato06 == null) {
			if (other.rfcSubcontrato06 != null)
				return false;
		} else if (!rfcSubcontrato06.equals(other.rfcSubcontrato06))
			return false;
		if (rfcSubcontrato07 == null) {
			if (other.rfcSubcontrato07 != null)
				return false;
		} else if (!rfcSubcontrato07.equals(other.rfcSubcontrato07))
			return false;
		if (salIntEym == null) {
			if (other.salIntEym != null)
				return false;
		} else if (!salIntEym.equals(other.salIntEym))
			return false;
		if (salIntIfvt == null) {
			if (other.salIntIfvt != null)
				return false;
		} else if (!salIntIfvt.equals(other.salIntIfvt))
			return false;
		if (salIntIvc == null) {
			if (other.salIntIvc != null)
				return false;
		} else if (!salIntIvc.equals(other.salIntIvc))
			return false;
		if (salIntSar == null) {
			if (other.salIntSar != null)
				return false;
		} else if (!salIntSar.equals(other.salIntSar))
			return false;
		if (seccion == null) {
			if (other.seccion != null)
				return false;
		} else if (!seccion.equals(other.seccion))
			return false;
		if (semanaRedImss == null) {
			if (other.semanaRedImss != null)
				return false;
		} else if (!semanaRedImss.equals(other.semanaRedImss))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (sindicalizado == null) {
			if (other.sindicalizado != null)
				return false;
		} else if (!sindicalizado.equals(other.sindicalizado))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (subdelegacionImss == null) {
			if (other.subdelegacionImss != null)
				return false;
		} else if (!subdelegacionImss.equals(other.subdelegacionImss))
			return false;
		if (sucursal == null) {
			if (other.sucursal != null)
				return false;
		} else if (!sucursal.equals(other.sucursal))
			return false;
		if (sucursal2 == null) {
			if (other.sucursal2 != null)
				return false;
		} else if (!sucursal2.equals(other.sucursal2))
			return false;
		if (sueldo == null) {
			if (other.sueldo != null)
				return false;
		} else if (!sueldo.equals(other.sueldo))
			return false;
		if (supervisor == null) {
			if (other.supervisor != null)
				return false;
		} else if (!supervisor.equals(other.supervisor))
			return false;
		if (tarjetaVal == null) {
			if (other.tarjetaVal != null)
				return false;
		} else if (!tarjetaVal.equals(other.tarjetaVal))
			return false;
		if (tarjetaValComedor == null) {
			if (other.tarjetaValComedor != null)
				return false;
		} else if (!tarjetaValComedor.equals(other.tarjetaValComedor))
			return false;
		if (tarjetaValGasolina == null) {
			if (other.tarjetaValGasolina != null)
				return false;
		} else if (!tarjetaValGasolina.equals(other.tarjetaValGasolina))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (telefonoCel == null) {
			if (other.telefonoCel != null)
				return false;
		} else if (!telefonoCel.equals(other.telefonoCel))
			return false;
		if (tipoContrato == null) {
			if (other.tipoContrato != null)
				return false;
		} else if (!tipoContrato.equals(other.tipoContrato))
			return false;
		if (tipoCredIfvt == null) {
			if (other.tipoCredIfvt != null)
				return false;
		} else if (!tipoCredIfvt.equals(other.tipoCredIfvt))
			return false;
		if (tipoCuenta == null) {
			if (other.tipoCuenta != null)
				return false;
		} else if (!tipoCuenta.equals(other.tipoCuenta))
			return false;
		if (tipoCuenta2 == null) {
			if (other.tipoCuenta2 != null)
				return false;
		} else if (!tipoCuenta2.equals(other.tipoCuenta2))
			return false;
		if (tipoEmpl == null) {
			if (other.tipoEmpl != null)
				return false;
		} else if (!tipoEmpl.equals(other.tipoEmpl))
			return false;
		if (tipoJornada == null) {
			if (other.tipoJornada != null)
				return false;
		} else if (!tipoJornada.equals(other.tipoJornada))
			return false;
		if (tipoLicencia == null) {
			if (other.tipoLicencia != null)
				return false;
		} else if (!tipoLicencia.equals(other.tipoLicencia))
			return false;
		if (tipoRegimen == null) {
			if (other.tipoRegimen != null)
				return false;
		} else if (!tipoRegimen.equals(other.tipoRegimen))
			return false;
		if (tipoTrabajadorImss == null) {
			if (other.tipoTrabajadorImss != null)
				return false;
		} else if (!tipoTrabajadorImss.equals(other.tipoTrabajadorImss))
			return false;
		if (turno == null) {
			if (other.turno != null)
				return false;
		} else if (!turno.equals(other.turno))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (venceLicencia == null) {
			if (other.venceLicencia != null)
				return false;
		} else if (!venceLicencia.equals(other.venceLicencia))
			return false;
		if (vencePasaporte == null) {
			if (other.vencePasaporte != null)
				return false;
		} else if (!vencePasaporte.equals(other.vencePasaporte))
			return false;
		if (zona == null) {
			if (other.zona != null)
				return false;
		} else if (!zona.equals(other.zona))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "HuEmplDto [numCia=" + numCia + ", numEmp=" + numEmp + ", actividad=" + actividad + ", apellMat="
				+ apellMat + ", apellPat=" + apellPat + ", area=" + area + ", banco=" + banco + ", banco2=" + banco2
				+ ", cdBanco=" + cdBanco + ", centro=" + centro + ", claveLocalidad=" + claveLocalidad
				+ ", clavePaisTel=" + clavePaisTel + ", claveProvincia=" + claveProvincia + ", codAreaTel=" + codAreaTel
				+ ", codId01=" + codId01 + ", codId02=" + codId02 + ", codId03=" + codId03 + ", codId04=" + codId04
				+ ", codId05=" + codId05 + ", codId06=" + codId06 + ", codId07=" + codId07 + ", codId08=" + codId08
				+ ", codId09=" + codId09 + ", codId10=" + codId10 + ", codId11=" + codId11 + ", codId12=" + codId12
				+ ", codId13=" + codId13 + ", codId14=" + codId14 + ", codId15=" + codId15 + ", codId16=" + codId16
				+ ", codId17=" + codId17 + ", codId18=" + codId18 + ", codId19=" + codId19 + ", codId20=" + codId20
				+ ", codId21=" + codId21 + ", codId22=" + codId22 + ", codId23=" + codId23 + ", codId24=" + codId24
				+ ", codId25=" + codId25 + ", codId26=" + codId26 + ", codId27=" + codId27 + ", codId28=" + codId28
				+ ", codId29=" + codId29 + ", codId30=" + codId30 + ", contrato=" + contrato + ", ctaDeud=" + ctaDeud
				+ ", ctaDeud2=" + ctaDeud2 + ", cuenta=" + cuenta + ", cuentaClave=" + cuentaClave + ", cuentaVales="
				+ cuentaVales + ", cuentaValesComedor=" + cuentaValesComedor + ", cuentaValesGasolina="
				+ cuentaValesGasolina + ", cuenta2=" + cuenta2 + ", declaracionImp=" + declaracionImp + ", edoBanco="
				+ edoBanco + ", email=" + email + ", estadoCivil=" + estadoCivil + ", estatura=" + estatura
				+ ", extensionTel=" + extensionTel + ", fechaAntiguedad=" + fechaAntiguedad + ", fechaAntiguedadSub="
				+ fechaAntiguedadSub + ", fechaBaja=" + fechaBaja + ", fechaContrato=" + fechaContrato
				+ ", fechaIngreso=" + fechaIngreso + ", fechaMerito=" + fechaMerito + ", fechaNac=" + fechaNac
				+ ", fechaPromocion=" + fechaPromocion + ", fechaSueldo=" + fechaSueldo + ", fechaTerminacion="
				+ fechaTerminacion + ", formaPago=" + formaPago + ", formatoSueldo=" + formatoSueldo + ", gpoSanguineo="
				+ gpoSanguineo + ", grupoPrestacion=" + grupoPrestacion + ", grupoPrestacionSub=" + grupoPrestacionSub
				+ ", jornadaRed=" + jornadaRed + ", licencia=" + licencia + ", linea=" + linea + ", localidadNac="
				+ localidadNac + ", lugarPago=" + lugarPago + ", moneda=" + moneda + ", nacionalidad=" + nacionalidad
				+ ", nip=" + nip + ", nombre=" + nombre + ", paisNac=" + paisNac + ", pasaporte=" + pasaporte
				+ ", peso=" + peso + ", plaza=" + plaza + ", provinciaNac=" + provinciaNac + ", puesto=" + puesto
				+ ", sexo=" + sexo + ", status=" + status + ", sucursal=" + sucursal + ", sucursal2=" + sucursal2
				+ ", sueldo=" + sueldo + ", supervisor=" + supervisor + ", tarjetaVal=" + tarjetaVal
				+ ", tarjetaValComedor=" + tarjetaValComedor + ", tarjetaValGasolina=" + tarjetaValGasolina
				+ ", telefono=" + telefono + ", tipoContrato=" + tipoContrato + ", tipoCuenta=" + tipoCuenta
				+ ", tipoCuenta2=" + tipoCuenta2 + ", tipoEmpl=" + tipoEmpl + ", tipoLicencia=" + tipoLicencia
				+ ", turno=" + turno + ", venceLicencia=" + venceLicencia + ", vencePasaporte=" + vencePasaporte
				+ ", zona=" + zona + ", afilFonacot=" + afilFonacot + ", afilImss=" + afilImss + ", asimiladoASalarios="
				+ asimiladoASalarios + ", bimestreSuspension=" + bimestreSuspension + ", claveElector=" + claveElector
				+ ", clavePoblacion=" + clavePoblacion + ", clinica=" + clinica + ", codPos=" + codPos + ", colonia="
				+ colonia + ", contratoSar=" + contratoSar + ", credIfvt=" + credIfvt + ", curp=" + curp
				+ ", delegacionImss=" + delegacionImss + ", digVerRfc=" + digVerRfc + ", domicilio=" + domicilio
				+ ", email1=" + email1 + ", email2=" + email2 + ", estado=" + estado + ", fAvisoLiberacion="
				+ fAvisoLiberacion + ", fIniDescuento=" + fIniDescuento + ", fRecepcionCia=" + fRecepcionCia
				+ ", fechaAltaConsar=" + fechaAltaConsar + ", fechaAltaFonac=" + fechaAltaFonac + ", fechaBajaConsar="
				+ fechaBajaConsar + ", fechaBajaFonac=" + fechaBajaFonac + ", fechaModIfvt=" + fechaModIfvt
				+ ", fechaMov=" + fechaMov + ", fechaRfc=" + fechaRfc + ", grupoImss=" + grupoImss + ", homoRfc="
				+ homoRfc + ", letrasRfc=" + letrasRfc + ", motivoBajaFonac=" + motivoBajaFonac + ", movSuaIfvt="
				+ movSuaIfvt + ", numFolio=" + numFolio + ", numeroExt=" + numeroExt + ", numeroInt=" + numeroInt
				+ ", poblacion=" + poblacion + ", porCredIfvt=" + porCredIfvt + ", porcenRfcSubcon01="
				+ porcenRfcSubcon01 + ", porcenRfcSubcon02=" + porcenRfcSubcon02 + ", porcenRfcSubcon03="
				+ porcenRfcSubcon03 + ", porcenRfcSubcon04=" + porcenRfcSubcon04 + ", porcenRfcSubcon05="
				+ porcenRfcSubcon05 + ", porcenRfcSubcon06=" + porcenRfcSubcon06 + ", porcenRfcSubcon07="
				+ porcenRfcSubcon07 + ", rfcSubcontrato01=" + rfcSubcontrato01 + ", rfcSubcontrato02="
				+ rfcSubcontrato02 + ", rfcSubcontrato03=" + rfcSubcontrato03 + ", rfcSubcontrato04=" + rfcSubcontrato04
				+ ", rfcSubcontrato05=" + rfcSubcontrato05 + ", rfcSubcontrato06=" + rfcSubcontrato06
				+ ", rfcSubcontrato07=" + rfcSubcontrato07 + ", salIntEym=" + salIntEym + ", salIntIfvt=" + salIntIfvt
				+ ", salIntIvc=" + salIntIvc + ", salIntSar=" + salIntSar + ", seccion=" + seccion + ", semanaRedImss="
				+ semanaRedImss + ", sindicalizado=" + sindicalizado + ", subdelegacionImss=" + subdelegacionImss
				+ ", telefonoCel=" + telefonoCel + ", tipoCredIfvt=" + tipoCredIfvt + ", tipoJornada=" + tipoJornada
				+ ", tipoRegimen=" + tipoRegimen + ", tipoTrabajadorImss=" + tipoTrabajadorImss + ", userId=" + userId
				+ "]";
	}
}