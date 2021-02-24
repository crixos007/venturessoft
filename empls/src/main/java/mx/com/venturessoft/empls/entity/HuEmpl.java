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
 * The persistent class for the HU_EMPLS database table.
 * 
 */
@Entity
@Table(name="HU_EMPLS")
@NamedQuery(name="HuEmpl.findAll", query="SELECT h FROM HuEmpl h")
public class HuEmpl implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HuEmplPK id;

	private BigDecimal actividad;

	@Column(name="APELL_MAT")
	private String apellMat;

	@Column(name="APELL_PAT")
	private String apellPat;

	private String area;

	private String banco;

	private String banco2;

	@Column(name="CD_BANCO")
	private String cdBanco;

	private String centro;

	@Column(name="CLAVE_LOCALIDAD")
	private String claveLocalidad;

	@Column(name="CLAVE_PAIS_TEL")
	private BigDecimal clavePaisTel;

	@Column(name="CLAVE_PROVINCIA")
	private String claveProvincia;

	@Column(name="COD_AREA_TEL")
	private BigDecimal codAreaTel;

	@Column(name="COD_ID_01")
	private String codId01;

	@Column(name="COD_ID_02")
	private String codId02;

	@Column(name="COD_ID_03")
	private String codId03;

	@Column(name="COD_ID_04")
	private String codId04;

	@Column(name="COD_ID_05")
	private String codId05;

	@Column(name="COD_ID_06")
	private String codId06;

	@Column(name="COD_ID_07")
	private String codId07;

	@Column(name="COD_ID_08")
	private String codId08;

	@Column(name="COD_ID_09")
	private String codId09;

	@Column(name="COD_ID_10")
	private String codId10;

	@Column(name="COD_ID_11")
	private String codId11;

	@Column(name="COD_ID_12")
	private String codId12;

	@Column(name="COD_ID_13")
	private String codId13;

	@Column(name="COD_ID_14")
	private String codId14;

	@Column(name="COD_ID_15")
	private String codId15;

	@Column(name="COD_ID_16")
	private String codId16;

	@Column(name="COD_ID_17")
	private String codId17;

	@Column(name="COD_ID_18")
	private String codId18;

	@Column(name="COD_ID_19")
	private String codId19;

	@Column(name="COD_ID_20")
	private String codId20;

	@Column(name="COD_ID_21")
	private String codId21;

	@Column(name="COD_ID_22")
	private String codId22;

	@Column(name="COD_ID_23")
	private String codId23;

	@Column(name="COD_ID_24")
	private String codId24;

	@Column(name="COD_ID_25")
	private String codId25;

	@Column(name="COD_ID_26")
	private String codId26;

	@Column(name="COD_ID_27")
	private String codId27;

	@Column(name="COD_ID_28")
	private String codId28;

	@Column(name="COD_ID_29")
	private String codId29;

	@Column(name="COD_ID_30")
	private String codId30;

	private BigDecimal contrato;

	@Column(name="CTA_DEUD")
	private String ctaDeud;

	@Column(name="CTA_DEUD2")
	private String ctaDeud2;

	private String cuenta;

	@Column(name="CUENTA_CLAVE")
	private String cuentaClave;

	@Column(name="CUENTA_VALES")
	private String cuentaVales;

	@Column(name="CUENTA_VALES_COMEDOR")
	private String cuentaValesComedor;

	@Column(name="CUENTA_VALES_GASOLINA")
	private String cuentaValesGasolina;

	private String cuenta2;

	@Column(name="DECLARACION_IMP")
	private String declaracionImp;

	@Column(name="EDO_BANCO")
	private String edoBanco;

	private String email;

	@Column(name="ESTADO_CIVIL")
	private String estadoCivil;

	private BigDecimal estatura;

	@Column(name="EXTENSION_TEL")
	private BigDecimal extensionTel;

	@Column(name="FECHA_ANTIGUEDAD")
	private LocalDateTime fechaAntiguedad;

	@Column(name="FECHA_ANTIGUEDAD_SUB")
	private LocalDateTime fechaAntiguedadSub;

	@Column(name="FECHA_BAJA")
	private LocalDateTime fechaBaja;

	@Column(name="FECHA_CONTRATO")
	private LocalDateTime fechaContrato;

	@Column(name="FECHA_INGRESO")
	private LocalDateTime fechaIngreso;

	@Column(name="FECHA_MERITO")
	private LocalDateTime fechaMerito;

	@Column(name="FECHA_NAC")
	private LocalDateTime fechaNac;

	@Column(name="FECHA_PROMOCION")
	private LocalDateTime fechaPromocion;

	@Column(name="FECHA_SUELDO")
	private LocalDateTime fechaSueldo;

	@Column(name="FECHA_TERMINACION")
	private LocalDateTime fechaTerminacion;

	@Column(name="FORMA_PAGO")
	private String formaPago;

	@Column(name="FORMATO_SUELDO")
	private String formatoSueldo;

	@Column(name="GPO_SANGUINEO")
	private String gpoSanguineo;

	@Column(name="GRUPO_PRESTACION")
	private String grupoPrestacion;

	@Column(name="GRUPO_PRESTACION_SUB")
	private String grupoPrestacionSub;

	@Column(name="JORNADA_RED")
	private BigDecimal jornadaRed;

	private String licencia;

	private String linea;

	@Column(name="LOCALIDAD_NAC")
	private String localidadNac;

	@Column(name="LUGAR_PAGO")
	private String lugarPago;

	private String moneda;

	private String nacionalidad;

	private BigDecimal nip;

	private String nombre;

	@Column(name="PAIS_NAC")
	private String paisNac;

	private String pasaporte;

	private BigDecimal peso;

	private BigDecimal plaza;

	@Column(name="PROVINCIA_NAC")
	private String provinciaNac;

	private String puesto;

	private String sexo;

	private String status;

	private String sucursal;

	private String sucursal2;

	private BigDecimal sueldo;

	private String supervisor;

	@Column(name="TARJETA_VAL")
	private String tarjetaVal;

	@Column(name="TARJETA_VAL_COMEDOR")
	private String tarjetaValComedor;

	@Column(name="TARJETA_VAL_GASOLINA")
	private String tarjetaValGasolina;

	private BigDecimal telefono;

	@Column(name="TIPO_CONTRATO")
	private String tipoContrato;

	@Column(name="TIPO_CUENTA")
	private String tipoCuenta;

	@Column(name="TIPO_CUENTA2")
	private String tipoCuenta2;

	@Column(name="TIPO_EMPL")
	private String tipoEmpl;

	@Column(name="TIPO_LICENCIA")
	private String tipoLicencia;

	private BigDecimal turno;

	@Column(name="VENCE_LICENCIA")
	private LocalDateTime venceLicencia;

	@Column(name="VENCE_PASAPORTE")
	private LocalDateTime vencePasaporte;

	private BigDecimal zona;

	public HuEmpl() {
	}

	public HuEmplPK getId() {
		return this.id;
	}

	public void setId(HuEmplPK id) {
		this.id = id;
	}

	public BigDecimal getActividad() {
		return this.actividad;
	}

	public void setActividad(BigDecimal actividad) {
		this.actividad = actividad;
	}

	public String getApellMat() {
		return this.apellMat;
	}

	public void setApellMat(String apellMat) {
		this.apellMat = apellMat;
	}

	public String getApellPat() {
		return this.apellPat;
	}

	public void setApellPat(String apellPat) {
		this.apellPat = apellPat;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getBanco() {
		return this.banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getBanco2() {
		return this.banco2;
	}

	public void setBanco2(String banco2) {
		this.banco2 = banco2;
	}

	public String getCdBanco() {
		return this.cdBanco;
	}

	public void setCdBanco(String cdBanco) {
		this.cdBanco = cdBanco;
	}

	public String getCentro() {
		return this.centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	public String getClaveLocalidad() {
		return this.claveLocalidad;
	}

	public void setClaveLocalidad(String claveLocalidad) {
		this.claveLocalidad = claveLocalidad;
	}

	public BigDecimal getClavePaisTel() {
		return this.clavePaisTel;
	}

	public void setClavePaisTel(BigDecimal clavePaisTel) {
		this.clavePaisTel = clavePaisTel;
	}

	public String getClaveProvincia() {
		return this.claveProvincia;
	}

	public void setClaveProvincia(String claveProvincia) {
		this.claveProvincia = claveProvincia;
	}

	public BigDecimal getCodAreaTel() {
		return this.codAreaTel;
	}

	public void setCodAreaTel(BigDecimal codAreaTel) {
		this.codAreaTel = codAreaTel;
	}

	public String getCodId01() {
		return this.codId01;
	}

	public void setCodId01(String codId01) {
		this.codId01 = codId01;
	}

	public String getCodId02() {
		return this.codId02;
	}

	public void setCodId02(String codId02) {
		this.codId02 = codId02;
	}

	public String getCodId03() {
		return this.codId03;
	}

	public void setCodId03(String codId03) {
		this.codId03 = codId03;
	}

	public String getCodId04() {
		return this.codId04;
	}

	public void setCodId04(String codId04) {
		this.codId04 = codId04;
	}

	public String getCodId05() {
		return this.codId05;
	}

	public void setCodId05(String codId05) {
		this.codId05 = codId05;
	}

	public String getCodId06() {
		return this.codId06;
	}

	public void setCodId06(String codId06) {
		this.codId06 = codId06;
	}

	public String getCodId07() {
		return this.codId07;
	}

	public void setCodId07(String codId07) {
		this.codId07 = codId07;
	}

	public String getCodId08() {
		return this.codId08;
	}

	public void setCodId08(String codId08) {
		this.codId08 = codId08;
	}

	public String getCodId09() {
		return this.codId09;
	}

	public void setCodId09(String codId09) {
		this.codId09 = codId09;
	}

	public String getCodId10() {
		return this.codId10;
	}

	public void setCodId10(String codId10) {
		this.codId10 = codId10;
	}

	public String getCodId11() {
		return this.codId11;
	}

	public void setCodId11(String codId11) {
		this.codId11 = codId11;
	}

	public String getCodId12() {
		return this.codId12;
	}

	public void setCodId12(String codId12) {
		this.codId12 = codId12;
	}

	public String getCodId13() {
		return this.codId13;
	}

	public void setCodId13(String codId13) {
		this.codId13 = codId13;
	}

	public String getCodId14() {
		return this.codId14;
	}

	public void setCodId14(String codId14) {
		this.codId14 = codId14;
	}

	public String getCodId15() {
		return this.codId15;
	}

	public void setCodId15(String codId15) {
		this.codId15 = codId15;
	}

	public String getCodId16() {
		return this.codId16;
	}

	public void setCodId16(String codId16) {
		this.codId16 = codId16;
	}

	public String getCodId17() {
		return this.codId17;
	}

	public void setCodId17(String codId17) {
		this.codId17 = codId17;
	}

	public String getCodId18() {
		return this.codId18;
	}

	public void setCodId18(String codId18) {
		this.codId18 = codId18;
	}

	public String getCodId19() {
		return this.codId19;
	}

	public void setCodId19(String codId19) {
		this.codId19 = codId19;
	}

	public String getCodId20() {
		return this.codId20;
	}

	public void setCodId20(String codId20) {
		this.codId20 = codId20;
	}

	public String getCodId21() {
		return this.codId21;
	}

	public void setCodId21(String codId21) {
		this.codId21 = codId21;
	}

	public String getCodId22() {
		return this.codId22;
	}

	public void setCodId22(String codId22) {
		this.codId22 = codId22;
	}

	public String getCodId23() {
		return this.codId23;
	}

	public void setCodId23(String codId23) {
		this.codId23 = codId23;
	}

	public String getCodId24() {
		return this.codId24;
	}

	public void setCodId24(String codId24) {
		this.codId24 = codId24;
	}

	public String getCodId25() {
		return this.codId25;
	}

	public void setCodId25(String codId25) {
		this.codId25 = codId25;
	}

	public String getCodId26() {
		return this.codId26;
	}

	public void setCodId26(String codId26) {
		this.codId26 = codId26;
	}

	public String getCodId27() {
		return this.codId27;
	}

	public void setCodId27(String codId27) {
		this.codId27 = codId27;
	}

	public String getCodId28() {
		return this.codId28;
	}

	public void setCodId28(String codId28) {
		this.codId28 = codId28;
	}

	public String getCodId29() {
		return this.codId29;
	}

	public void setCodId29(String codId29) {
		this.codId29 = codId29;
	}

	public String getCodId30() {
		return this.codId30;
	}

	public void setCodId30(String codId30) {
		this.codId30 = codId30;
	}

	public BigDecimal getContrato() {
		return this.contrato;
	}

	public void setContrato(BigDecimal contrato) {
		this.contrato = contrato;
	}

	public String getCtaDeud() {
		return this.ctaDeud;
	}

	public void setCtaDeud(String ctaDeud) {
		this.ctaDeud = ctaDeud;
	}

	public String getCtaDeud2() {
		return this.ctaDeud2;
	}

	public void setCtaDeud2(String ctaDeud2) {
		this.ctaDeud2 = ctaDeud2;
	}

	public String getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getCuentaClave() {
		return this.cuentaClave;
	}

	public void setCuentaClave(String cuentaClave) {
		this.cuentaClave = cuentaClave;
	}

	public String getCuentaVales() {
		return this.cuentaVales;
	}

	public void setCuentaVales(String cuentaVales) {
		this.cuentaVales = cuentaVales;
	}

	public String getCuentaValesComedor() {
		return this.cuentaValesComedor;
	}

	public void setCuentaValesComedor(String cuentaValesComedor) {
		this.cuentaValesComedor = cuentaValesComedor;
	}

	public String getCuentaValesGasolina() {
		return this.cuentaValesGasolina;
	}

	public void setCuentaValesGasolina(String cuentaValesGasolina) {
		this.cuentaValesGasolina = cuentaValesGasolina;
	}

	public String getCuenta2() {
		return this.cuenta2;
	}

	public void setCuenta2(String cuenta2) {
		this.cuenta2 = cuenta2;
	}

	public String getDeclaracionImp() {
		return this.declaracionImp;
	}

	public void setDeclaracionImp(String declaracionImp) {
		this.declaracionImp = declaracionImp;
	}

	public String getEdoBanco() {
		return this.edoBanco;
	}

	public void setEdoBanco(String edoBanco) {
		this.edoBanco = edoBanco;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public BigDecimal getEstatura() {
		return this.estatura;
	}

	public void setEstatura(BigDecimal estatura) {
		this.estatura = estatura;
	}

	public BigDecimal getExtensionTel() {
		return this.extensionTel;
	}

	public void setExtensionTel(BigDecimal extensionTel) {
		this.extensionTel = extensionTel;
	}

	public LocalDateTime getFechaAntiguedad() {
		return this.fechaAntiguedad;
	}

	public void setFechaAntiguedad(LocalDateTime fechaAntiguedad) {
		this.fechaAntiguedad = fechaAntiguedad;
	}

	public LocalDateTime getFechaAntiguedadSub() {
		return this.fechaAntiguedadSub;
	}

	public void setFechaAntiguedadSub(LocalDateTime fechaAntiguedadSub) {
		this.fechaAntiguedadSub = fechaAntiguedadSub;
	}

	public LocalDateTime getFechaBaja() {
		return this.fechaBaja;
	}

	public void setFechaBaja(LocalDateTime fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public LocalDateTime getFechaContrato() {
		return this.fechaContrato;
	}

	public void setFechaContrato(LocalDateTime fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	public LocalDateTime getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public LocalDateTime getFechaMerito() {
		return this.fechaMerito;
	}

	public void setFechaMerito(LocalDateTime fechaMerito) {
		this.fechaMerito = fechaMerito;
	}

	public LocalDateTime getFechaNac() {
		return this.fechaNac;
	}

	public void setFechaNac(LocalDateTime fechaNac) {
		this.fechaNac = fechaNac;
	}

	public LocalDateTime getFechaPromocion() {
		return this.fechaPromocion;
	}

	public void setFechaPromocion(LocalDateTime fechaPromocion) {
		this.fechaPromocion = fechaPromocion;
	}

	public LocalDateTime getFechaSueldo() {
		return this.fechaSueldo;
	}

	public void setFechaSueldo(LocalDateTime fechaSueldo) {
		this.fechaSueldo = fechaSueldo;
	}

	public LocalDateTime getFechaTerminacion() {
		return this.fechaTerminacion;
	}

	public void setFechaTerminacion(LocalDateTime fechaTerminacion) {
		this.fechaTerminacion = fechaTerminacion;
	}

	public String getFormaPago() {
		return this.formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public String getFormatoSueldo() {
		return this.formatoSueldo;
	}

	public void setFormatoSueldo(String formatoSueldo) {
		this.formatoSueldo = formatoSueldo;
	}

	public String getGpoSanguineo() {
		return this.gpoSanguineo;
	}

	public void setGpoSanguineo(String gpoSanguineo) {
		this.gpoSanguineo = gpoSanguineo;
	}

	public String getGrupoPrestacion() {
		return this.grupoPrestacion;
	}

	public void setGrupoPrestacion(String grupoPrestacion) {
		this.grupoPrestacion = grupoPrestacion;
	}

	public String getGrupoPrestacionSub() {
		return this.grupoPrestacionSub;
	}

	public void setGrupoPrestacionSub(String grupoPrestacionSub) {
		this.grupoPrestacionSub = grupoPrestacionSub;
	}

	public BigDecimal getJornadaRed() {
		return this.jornadaRed;
	}

	public void setJornadaRed(BigDecimal jornadaRed) {
		this.jornadaRed = jornadaRed;
	}

	public String getLicencia() {
		return this.licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public String getLinea() {
		return this.linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getLocalidadNac() {
		return this.localidadNac;
	}

	public void setLocalidadNac(String localidadNac) {
		this.localidadNac = localidadNac;
	}

	public String getLugarPago() {
		return this.lugarPago;
	}

	public void setLugarPago(String lugarPago) {
		this.lugarPago = lugarPago;
	}

	public String getMoneda() {
		return this.moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public BigDecimal getNip() {
		return this.nip;
	}

	public void setNip(BigDecimal nip) {
		this.nip = nip;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaisNac() {
		return this.paisNac;
	}

	public void setPaisNac(String paisNac) {
		this.paisNac = paisNac;
	}

	public String getPasaporte() {
		return this.pasaporte;
	}

	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}

	public BigDecimal getPeso() {
		return this.peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public BigDecimal getPlaza() {
		return this.plaza;
	}

	public void setPlaza(BigDecimal plaza) {
		this.plaza = plaza;
	}

	public String getProvinciaNac() {
		return this.provinciaNac;
	}

	public void setProvinciaNac(String provinciaNac) {
		this.provinciaNac = provinciaNac;
	}

	public String getPuesto() {
		return this.puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public String getSucursal2() {
		return this.sucursal2;
	}

	public void setSucursal2(String sucursal2) {
		this.sucursal2 = sucursal2;
	}

	public BigDecimal getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}

	public String getSupervisor() {
		return this.supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public String getTarjetaVal() {
		return this.tarjetaVal;
	}

	public void setTarjetaVal(String tarjetaVal) {
		this.tarjetaVal = tarjetaVal;
	}

	public String getTarjetaValComedor() {
		return this.tarjetaValComedor;
	}

	public void setTarjetaValComedor(String tarjetaValComedor) {
		this.tarjetaValComedor = tarjetaValComedor;
	}

	public String getTarjetaValGasolina() {
		return this.tarjetaValGasolina;
	}

	public void setTarjetaValGasolina(String tarjetaValGasolina) {
		this.tarjetaValGasolina = tarjetaValGasolina;
	}

	public BigDecimal getTelefono() {
		return this.telefono;
	}

	public void setTelefono(BigDecimal telefono) {
		this.telefono = telefono;
	}

	public String getTipoContrato() {
		return this.tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public String getTipoCuenta() {
		return this.tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getTipoCuenta2() {
		return this.tipoCuenta2;
	}

	public void setTipoCuenta2(String tipoCuenta2) {
		this.tipoCuenta2 = tipoCuenta2;
	}

	public String getTipoEmpl() {
		return this.tipoEmpl;
	}

	public void setTipoEmpl(String tipoEmpl) {
		this.tipoEmpl = tipoEmpl;
	}

	public String getTipoLicencia() {
		return this.tipoLicencia;
	}

	public void setTipoLicencia(String tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}

	public BigDecimal getTurno() {
		return this.turno;
	}

	public void setTurno(BigDecimal turno) {
		this.turno = turno;
	}

	public LocalDateTime getVenceLicencia() {
		return this.venceLicencia;
	}

	public void setVenceLicencia(LocalDateTime venceLicencia) {
		this.venceLicencia = venceLicencia;
	}

	public LocalDateTime getVencePasaporte() {
		return this.vencePasaporte;
	}

	public void setVencePasaporte(LocalDateTime vencePasaporte) {
		this.vencePasaporte = vencePasaporte;
	}

	public BigDecimal getZona() {
		return this.zona;
	}

	public void setZona(BigDecimal zona) {
		this.zona = zona;
	}

}