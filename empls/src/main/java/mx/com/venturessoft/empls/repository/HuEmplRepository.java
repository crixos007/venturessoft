package mx.com.venturessoft.empls.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import mx.com.venturessoft.empls.dto.IHuEmplDto;
import mx.com.venturessoft.empls.entity.HuEmpl;
import mx.com.venturessoft.empls.entity.HuEmplPK;

public interface HuEmplRepository extends JpaRepository<HuEmpl, HuEmplPK> {
	@Query(nativeQuery = true, value =  
			"SELECT he.NUM_EMP AS numEmp, he.NUM_CIA AS numCia, he.actividad,he.APELL_MAT AS apellMat,he.APELL_PAT AS apellPat,he.area,he.banco,he.banco2, " +
			"		he.CD_BANCO AS cdBanco,he.centro,he.CLAVE_LOCALIDAD AS claveLocalidad,he.CLAVE_PAIS_TEL AS lavePaisTel, " +
			"		he.CLAVE_PROVINCIA AS claveProvincia,he.COD_AREA_TEL AS codAreaTel,he.COD_ID_01 AS codId01,he.COD_ID_02 AS codId02, " +
			"		he.COD_ID_03 AS codId03,he.COD_ID_04 AS codId04,he.COD_ID_05 AS codId05,he.COD_ID_06 AS codId06, " +
			"		he.COD_ID_07 AS codId07,he.COD_ID_08 AS codId08,he.COD_ID_09 AS codId09,he.COD_ID_10 AS codId10,he.COD_ID_11 AS codId11, " +
			"		he.COD_ID_12 AS codId12,he.COD_ID_13 AS codId13,he.COD_ID_14 AS codId14,he.COD_ID_15 AS codId15,he.COD_ID_16 AS codId16, " +
			"		he.COD_ID_17 AS codId17,he.COD_ID_18 AS codId18,he.COD_ID_19 AS codId19,he.COD_ID_20 AS codId20,he.COD_ID_21 AS codId21, " +
			"		he.COD_ID_22 AS codId22,he.COD_ID_23 AS codId23,he.COD_ID_24 AS codId24,he.COD_ID_25 AS codId25,he.COD_ID_26 AS codId26, " +
			"		he.COD_ID_27 AS codId27,he.COD_ID_28 AS codId28,he.COD_ID_29 AS codId29,he.COD_ID_30 AS codId30,he.contrato, " +
			"		he.CTA_DEUD AS ctaDeud,he.CTA_DEUD2 AS ctaDeud2,he.cuenta,he.CUENTA_CLAVE AS cuentaClave,he.CUENTA_VALES AS cuentaVales, " +
			"		he.CUENTA_VALES_COMEDOR AS cuentaValesComedor,he.CUENTA_VALES_GASOLINA AS cuentaValesGasolina,he.cuenta2,he.DECLARACION_IMP AS declaracionImp, " +
			"		he.EDO_BANCO AS edoBanco,he.email,he.ESTADO_CIVIL AS estadoCivil,he.estatura,he.EXTENSION_TEL AS extensionTel, " +
			"		he.FECHA_ANTIGUEDAD AS fechaAntiguedad,he.FECHA_ANTIGUEDAD_SUB AS fechaAntiguedadSub,he.FECHA_BAJA AS fechaBaja, " +
			"		he.FECHA_CONTRATO AS fechaContrato,he.FECHA_INGRESO AS fechaIngreso,he.FECHA_MERITO AS fechaMerito,he.FECHA_NAC AS fechaNac, " +
			"		he.FECHA_PROMOCION AS fechaPromocion,he.FECHA_SUELDO AS fechaSueldo,he.FECHA_TERMINACION AS fechaTerminacion,he.FORMA_PAGO AS formaPago, " +
			"		he.FORMATO_SUELDO AS formatoSueldo,he.GPO_SANGUINEO AS gpoSanguineo,he.GRUPO_PRESTACION AS grupoPrestacion, " +
			"		he.GRUPO_PRESTACION_SUB AS grupoPrestacionSub,he.JORNADA_RED AS jornadaRed,he.licencia,he.linea,he.LOCALIDAD_NAC AS localidadNac, " +
			"		he.LUGAR_PAGO AS lugarPago,he.moneda,he.nacionalidad,he.nip,he.nombre,he.PAIS_NAC AS paisNac,he.pasaporte,he.peso,he.plaza, " +
			"		he.PROVINCIA_NAC AS provinciaNac,he.puesto,he.sexo,he.status,he.sucursal,he.sucursal2,he.sueldo,he.supervisor,he.TARJETA_VAL AS tarjetaVal, " +
			"		he.TARJETA_VAL_COMEDOR AS tarjetaValComedor,he.TARJETA_VAL_GASOLINA AS tarjetaValGasolina,he.telefono,he.TIPO_CONTRATO AS tipoContrato, " +
			"		he.TIPO_CUENTA AS tipoCuenta,he.TIPO_CUENTA2 AS tipoCuenta2,he.TIPO_EMPL AS tipoEmpl,he.TIPO_LICENCIA AS tipoLicencia,he.turno, " +
			"		he.VENCE_LICENCIA AS venceLicencia,he.VENCE_PASAPORTE AS vencePasaporte,he.zona,hem.AFIL_FONACOT AS afilFonacot,hem.AFIL_IMSS AS afilImss, " +
			"		hem.ASIMILADO_A_SALARIOS AS asimiladoASalarios,hem.BIMESTRE_SUSPENSION AS bimestreSuspension,hem.CLAVE_ELECTOR AS claveElector, " +
			"		hem.CLAVE_POBLACION AS clavePoblacion,hem.clinica,hem.COD_POS AS codPos,hem.colonia,hem.CONTRATO_SAR AS contratoSar,hem.CRED_IFVT AS credIfvt, " +
			"		hem.curp,hem.DELEGACION_IMSS AS delegacionImss,hem.DIG_VER_RFC AS digVerRfc,hem.domicilio,hem.EMAIL_1 AS email1,hem.EMAIL_2 AS email2, " +
			"		hem.estado,hem.F_AVISO_LIBERACION AS fAvisoLiberacion,hem.F_INI_DESCUENTO AS fIniDescuento,hem.F_RECEPCION_CIA AS fRecepcionCia, " +
			"		hem.FECHA_ALTA_CONSAR AS fechaAltaConsar,hem.FECHA_ALTA_FONAC AS fechaAltaFonac,hem.FECHA_BAJA_CONSAR AS fechaBajaConsar, " +
			"		hem.FECHA_BAJA_FONAC AS fechaBajaFonac,hem.FECHA_MOD_IFVT AS fechaModIfvt,hem.FECHA_MOV AS fechaMov,hem.FECHA_RFC AS fechaRfc, " +
			"		hem.GRUPO_IMSS AS grupoImss,hem.HOMO_RFC AS homoRfc,hem.LETRAS_RFC AS letrasRfc,hem.MOTIVO_BAJA_FONAC AS motivoBajaFonac, " +
			"		hem.MOV_SUA_IFVT AS movSuaIfvt,hem.NUM_FOLIO AS numFolio,hem.NUMERO_EXT AS numeroExt,hem.NUMERO_INT AS numeroInt,hem.poblacion, " +
			"		hem.POR_CRED_IFVT AS porCredIfvt,hem.PORCEN_RFC_SUBCON_01 AS porcenRfcSubcon01,hem.PORCEN_RFC_SUBCON_02 AS porcenRfcSubcon02, " +
			"		hem.PORCEN_RFC_SUBCON_03 AS porcenRfcSubcon03,hem.PORCEN_RFC_SUBCON_04 AS porcenRfcSubcon04,hem.PORCEN_RFC_SUBCON_05 AS porcenRfcSubcon05, " +
			"		hem.PORCEN_RFC_SUBCON_06 AS porcenRfcSubcon06,hem.PORCEN_RFC_SUBCON_07 AS porcenRfcSubcon07,hem.RFC_SUBCONTRATO_01 AS rfcSubcontrato01, " +
			"		hem.RFC_SUBCONTRATO_02 AS rfcSubcontrato02,hem.RFC_SUBCONTRATO_03 AS rfcSubcontrato03,hem.RFC_SUBCONTRATO_04 AS rfcSubcontrato04, " +
			"		hem.RFC_SUBCONTRATO_05 AS rfcSubcontrato05,hem.RFC_SUBCONTRATO_06 AS rfcSubcontrato06,hem.RFC_SUBCONTRATO_07 AS rfcSubcontrato07, " +
			"		hem.SAL_INT_EYM AS salIntEym,hem.SAL_INT_IFVT AS salIntIfvt,hem.SAL_INT_IVC AS salIntIvc,hem.SAL_INT_SAR AS salIntSar,hem.seccion, " +
			"		hem.SEMANA_RED_IMSS AS semanaRedImss,hem.sindicalizado,hem.SUBDELEGACION_IMSS AS subdelegacionImss,hem.TELEFONO_CEL AS telefonoCel, " +
			"		hem.TIPO_CRED_IFVT AS tipoCredIfvt,hem.TIPO_JORNADA AS tipoJornada,hem.TIPO_REGIMEN AS tipoRegimen,hem.TIPO_TRABAJADOR_IMSS AS tipoTrabajadorImss, " +
			"		hem.USER_ID AS userId " +
			"FROM HUMAN.HU_EMPLS he, HUMAN.HU_EMPLS_MEX hem  " +
			"WHERE he.NUM_EMP = hem.NUM_EMP  " +
			"AND he.NUM_CIA = hem.NUM_CIA ")
	List<IHuEmplDto> findAllEmpls();
	
	@Query(nativeQuery = true, value =  
			"SELECT he.NUM_EMP AS numEmp, he.NUM_CIA AS numCia, he.actividad,he.APELL_MAT AS apellMat,he.APELL_PAT AS apellPat,he.area,he.banco,he.banco2, " +
			"		he.CD_BANCO AS cdBanco,he.centro,he.CLAVE_LOCALIDAD AS claveLocalidad,he.CLAVE_PAIS_TEL AS lavePaisTel, " +
			"		he.CLAVE_PROVINCIA AS claveProvincia,he.COD_AREA_TEL AS codAreaTel,he.COD_ID_01 AS codId01,he.COD_ID_02 AS codId02, " +
			"		he.COD_ID_03 AS codId03,he.COD_ID_04 AS codId04,he.COD_ID_05 AS codId05,he.COD_ID_06 AS codId06, " +
			"		he.COD_ID_07 AS codId07,he.COD_ID_08 AS codId08,he.COD_ID_09 AS codId09,he.COD_ID_10 AS codId10,he.COD_ID_11 AS codId11, " +
			"		he.COD_ID_12 AS codId12,he.COD_ID_13 AS codId13,he.COD_ID_14 AS codId14,he.COD_ID_15 AS codId15,he.COD_ID_16 AS codId16, " +
			"		he.COD_ID_17 AS codId17,he.COD_ID_18 AS codId18,he.COD_ID_19 AS codId19,he.COD_ID_20 AS codId20,he.COD_ID_21 AS codId21, " +
			"		he.COD_ID_22 AS codId22,he.COD_ID_23 AS codId23,he.COD_ID_24 AS codId24,he.COD_ID_25 AS codId25,he.COD_ID_26 AS codId26, " +
			"		he.COD_ID_27 AS codId27,he.COD_ID_28 AS codId28,he.COD_ID_29 AS codId29,he.COD_ID_30 AS codId30,he.contrato, " +
			"		he.CTA_DEUD AS ctaDeud,he.CTA_DEUD2 AS ctaDeud2,he.cuenta,he.CUENTA_CLAVE AS cuentaClave,he.CUENTA_VALES AS cuentaVales, " +
			"		he.CUENTA_VALES_COMEDOR AS cuentaValesComedor,he.CUENTA_VALES_GASOLINA AS cuentaValesGasolina,he.cuenta2,he.DECLARACION_IMP AS declaracionImp, " +
			"		he.EDO_BANCO AS edoBanco,he.email,he.ESTADO_CIVIL AS estadoCivil,he.estatura,he.EXTENSION_TEL AS extensionTel, " +
			"		he.FECHA_ANTIGUEDAD AS fechaAntiguedad,he.FECHA_ANTIGUEDAD_SUB AS fechaAntiguedadSub,he.FECHA_BAJA AS fechaBaja, " +
			"		he.FECHA_CONTRATO AS fechaContrato,he.FECHA_INGRESO AS fechaIngreso,he.FECHA_MERITO AS fechaMerito,he.FECHA_NAC AS fechaNac, " +
			"		he.FECHA_PROMOCION AS fechaPromocion,he.FECHA_SUELDO AS fechaSueldo,he.FECHA_TERMINACION AS fechaTerminacion,he.FORMA_PAGO AS formaPago, " +
			"		he.FORMATO_SUELDO AS formatoSueldo,he.GPO_SANGUINEO AS gpoSanguineo,he.GRUPO_PRESTACION AS grupoPrestacion, " +
			"		he.GRUPO_PRESTACION_SUB AS grupoPrestacionSub,he.JORNADA_RED AS jornadaRed,he.licencia,he.linea,he.LOCALIDAD_NAC AS localidadNac, " +
			"		he.LUGAR_PAGO AS lugarPago,he.moneda,he.nacionalidad,he.nip,he.nombre,he.PAIS_NAC AS paisNac,he.pasaporte,he.peso,he.plaza, " +
			"		he.PROVINCIA_NAC AS provinciaNac,he.puesto,he.sexo,he.status,he.sucursal,he.sucursal2,he.sueldo,he.supervisor,he.TARJETA_VAL AS tarjetaVal, " +
			"		he.TARJETA_VAL_COMEDOR AS tarjetaValComedor,he.TARJETA_VAL_GASOLINA AS tarjetaValGasolina,he.telefono,he.TIPO_CONTRATO AS tipoContrato, " +
			"		he.TIPO_CUENTA AS tipoCuenta,he.TIPO_CUENTA2 AS tipoCuenta2,he.TIPO_EMPL AS tipoEmpl,he.TIPO_LICENCIA AS tipoLicencia,he.turno, " +
			"		he.VENCE_LICENCIA AS venceLicencia,he.VENCE_PASAPORTE AS vencePasaporte,he.zona,hem.AFIL_FONACOT AS afilFonacot,hem.AFIL_IMSS AS afilImss, " +
			"		hem.ASIMILADO_A_SALARIOS AS asimiladoASalarios,hem.BIMESTRE_SUSPENSION AS bimestreSuspension,hem.CLAVE_ELECTOR AS claveElector, " +
			"		hem.CLAVE_POBLACION AS clavePoblacion,hem.clinica,hem.COD_POS AS codPos,hem.colonia,hem.CONTRATO_SAR AS contratoSar,hem.CRED_IFVT AS credIfvt, " +
			"		hem.curp,hem.DELEGACION_IMSS AS delegacionImss,hem.DIG_VER_RFC AS digVerRfc,hem.domicilio,hem.EMAIL_1 AS email1,hem.EMAIL_2 AS email2, " +
			"		hem.estado,hem.F_AVISO_LIBERACION AS fAvisoLiberacion,hem.F_INI_DESCUENTO AS fIniDescuento,hem.F_RECEPCION_CIA AS fRecepcionCia, " +
			"		hem.FECHA_ALTA_CONSAR AS fechaAltaConsar,hem.FECHA_ALTA_FONAC AS fechaAltaFonac,hem.FECHA_BAJA_CONSAR AS fechaBajaConsar, " +
			"		hem.FECHA_BAJA_FONAC AS fechaBajaFonac,hem.FECHA_MOD_IFVT AS fechaModIfvt,hem.FECHA_MOV AS fechaMov,hem.FECHA_RFC AS fechaRfc, " +
			"		hem.GRUPO_IMSS AS grupoImss,hem.HOMO_RFC AS homoRfc,hem.LETRAS_RFC AS letrasRfc,hem.MOTIVO_BAJA_FONAC AS motivoBajaFonac, " +
			"		hem.MOV_SUA_IFVT AS movSuaIfvt,hem.NUM_FOLIO AS numFolio,hem.NUMERO_EXT AS numeroExt,hem.NUMERO_INT AS numeroInt,hem.poblacion, " +
			"		hem.POR_CRED_IFVT AS porCredIfvt,hem.PORCEN_RFC_SUBCON_01 AS porcenRfcSubcon01,hem.PORCEN_RFC_SUBCON_02 AS porcenRfcSubcon02, " +
			"		hem.PORCEN_RFC_SUBCON_03 AS porcenRfcSubcon03,hem.PORCEN_RFC_SUBCON_04 AS porcenRfcSubcon04,hem.PORCEN_RFC_SUBCON_05 AS porcenRfcSubcon05, " +
			"		hem.PORCEN_RFC_SUBCON_06 AS porcenRfcSubcon06,hem.PORCEN_RFC_SUBCON_07 AS porcenRfcSubcon07,hem.RFC_SUBCONTRATO_01 AS rfcSubcontrato01, " +
			"		hem.RFC_SUBCONTRATO_02 AS rfcSubcontrato02,hem.RFC_SUBCONTRATO_03 AS rfcSubcontrato03,hem.RFC_SUBCONTRATO_04 AS rfcSubcontrato04, " +
			"		hem.RFC_SUBCONTRATO_05 AS rfcSubcontrato05,hem.RFC_SUBCONTRATO_06 AS rfcSubcontrato06,hem.RFC_SUBCONTRATO_07 AS rfcSubcontrato07, " +
			"		hem.SAL_INT_EYM AS salIntEym,hem.SAL_INT_IFVT AS salIntIfvt,hem.SAL_INT_IVC AS salIntIvc,hem.SAL_INT_SAR AS salIntSar,hem.seccion, " +
			"		hem.SEMANA_RED_IMSS AS semanaRedImss,hem.sindicalizado,hem.SUBDELEGACION_IMSS AS subdelegacionImss,hem.TELEFONO_CEL AS telefonoCel, " +
			"		hem.TIPO_CRED_IFVT AS tipoCredIfvt,hem.TIPO_JORNADA AS tipoJornada,hem.TIPO_REGIMEN AS tipoRegimen,hem.TIPO_TRABAJADOR_IMSS AS tipoTrabajadorImss, " +
			"		hem.USER_ID AS userId " +
			"FROM HUMAN.HU_EMPLS he, HUMAN.HU_EMPLS_MEX hem  " +
			"WHERE he.NUM_EMP = hem.NUM_EMP  " +
			"AND he.NUM_CIA = hem.NUM_CIA " +
			"AND he.NUM_CIA = ?1 AND he.NUM_EMP = ?2")
	List<IHuEmplDto> findAllEmpls(long numCia, long numEmp);
	
	@Query(nativeQuery = true, value =  
			"SELECT he.NUM_EMP AS numEmp, he.NUM_CIA AS numCia, he.actividad,he.APELL_MAT AS apellMat,he.APELL_PAT AS apellPat,he.area,he.banco,he.banco2, " +
			"		he.CD_BANCO AS cdBanco,he.centro,he.CLAVE_LOCALIDAD AS claveLocalidad,he.CLAVE_PAIS_TEL AS lavePaisTel, " +
			"		he.CLAVE_PROVINCIA AS claveProvincia,he.COD_AREA_TEL AS codAreaTel,he.COD_ID_01 AS codId01,he.COD_ID_02 AS codId02, " +
			"		he.COD_ID_03 AS codId03,he.COD_ID_04 AS codId04,he.COD_ID_05 AS codId05,he.COD_ID_06 AS codId06, " +
			"		he.COD_ID_07 AS codId07,he.COD_ID_08 AS codId08,he.COD_ID_09 AS codId09,he.COD_ID_10 AS codId10,he.COD_ID_11 AS codId11, " +
			"		he.COD_ID_12 AS codId12,he.COD_ID_13 AS codId13,he.COD_ID_14 AS codId14,he.COD_ID_15 AS codId15,he.COD_ID_16 AS codId16, " +
			"		he.COD_ID_17 AS codId17,he.COD_ID_18 AS codId18,he.COD_ID_19 AS codId19,he.COD_ID_20 AS codId20,he.COD_ID_21 AS codId21, " +
			"		he.COD_ID_22 AS codId22,he.COD_ID_23 AS codId23,he.COD_ID_24 AS codId24,he.COD_ID_25 AS codId25,he.COD_ID_26 AS codId26, " +
			"		he.COD_ID_27 AS codId27,he.COD_ID_28 AS codId28,he.COD_ID_29 AS codId29,he.COD_ID_30 AS codId30,he.contrato, " +
			"		he.CTA_DEUD AS ctaDeud,he.CTA_DEUD2 AS ctaDeud2,he.cuenta,he.CUENTA_CLAVE AS cuentaClave,he.CUENTA_VALES AS cuentaVales, " +
			"		he.CUENTA_VALES_COMEDOR AS cuentaValesComedor,he.CUENTA_VALES_GASOLINA AS cuentaValesGasolina,he.cuenta2,he.DECLARACION_IMP AS declaracionImp, " +
			"		he.EDO_BANCO AS edoBanco,he.email,he.ESTADO_CIVIL AS estadoCivil,he.estatura,he.EXTENSION_TEL AS extensionTel, " +
			"		he.FECHA_ANTIGUEDAD AS fechaAntiguedad,he.FECHA_ANTIGUEDAD_SUB AS fechaAntiguedadSub,he.FECHA_BAJA AS fechaBaja, " +
			"		he.FECHA_CONTRATO AS fechaContrato,he.FECHA_INGRESO AS fechaIngreso,he.FECHA_MERITO AS fechaMerito,he.FECHA_NAC AS fechaNac, " +
			"		he.FECHA_PROMOCION AS fechaPromocion,he.FECHA_SUELDO AS fechaSueldo,he.FECHA_TERMINACION AS fechaTerminacion,he.FORMA_PAGO AS formaPago, " +
			"		he.FORMATO_SUELDO AS formatoSueldo,he.GPO_SANGUINEO AS gpoSanguineo,he.GRUPO_PRESTACION AS grupoPrestacion, " +
			"		he.GRUPO_PRESTACION_SUB AS grupoPrestacionSub,he.JORNADA_RED AS jornadaRed,he.licencia,he.linea,he.LOCALIDAD_NAC AS localidadNac, " +
			"		he.LUGAR_PAGO AS lugarPago,he.moneda,he.nacionalidad,he.nip,he.nombre,he.PAIS_NAC AS paisNac,he.pasaporte,he.peso,he.plaza, " +
			"		he.PROVINCIA_NAC AS provinciaNac,he.puesto,he.sexo,he.status,he.sucursal,he.sucursal2,he.sueldo,he.supervisor,he.TARJETA_VAL AS tarjetaVal, " +
			"		he.TARJETA_VAL_COMEDOR AS tarjetaValComedor,he.TARJETA_VAL_GASOLINA AS tarjetaValGasolina,he.telefono,he.TIPO_CONTRATO AS tipoContrato, " +
			"		he.TIPO_CUENTA AS tipoCuenta,he.TIPO_CUENTA2 AS tipoCuenta2,he.TIPO_EMPL AS tipoEmpl,he.TIPO_LICENCIA AS tipoLicencia,he.turno, " +
			"		he.VENCE_LICENCIA AS venceLicencia,he.VENCE_PASAPORTE AS vencePasaporte,he.zona,hem.AFIL_FONACOT AS afilFonacot,hem.AFIL_IMSS AS afilImss, " +
			"		hem.ASIMILADO_A_SALARIOS AS asimiladoASalarios,hem.BIMESTRE_SUSPENSION AS bimestreSuspension,hem.CLAVE_ELECTOR AS claveElector, " +
			"		hem.CLAVE_POBLACION AS clavePoblacion,hem.clinica,hem.COD_POS AS codPos,hem.colonia,hem.CONTRATO_SAR AS contratoSar,hem.CRED_IFVT AS credIfvt, " +
			"		hem.curp,hem.DELEGACION_IMSS AS delegacionImss,hem.DIG_VER_RFC AS digVerRfc,hem.domicilio,hem.EMAIL_1 AS email1,hem.EMAIL_2 AS email2, " +
			"		hem.estado,hem.F_AVISO_LIBERACION AS fAvisoLiberacion,hem.F_INI_DESCUENTO AS fIniDescuento,hem.F_RECEPCION_CIA AS fRecepcionCia, " +
			"		hem.FECHA_ALTA_CONSAR AS fechaAltaConsar,hem.FECHA_ALTA_FONAC AS fechaAltaFonac,hem.FECHA_BAJA_CONSAR AS fechaBajaConsar, " +
			"		hem.FECHA_BAJA_FONAC AS fechaBajaFonac,hem.FECHA_MOD_IFVT AS fechaModIfvt,hem.FECHA_MOV AS fechaMov,hem.FECHA_RFC AS fechaRfc, " +
			"		hem.GRUPO_IMSS AS grupoImss,hem.HOMO_RFC AS homoRfc,hem.LETRAS_RFC AS letrasRfc,hem.MOTIVO_BAJA_FONAC AS motivoBajaFonac, " +
			"		hem.MOV_SUA_IFVT AS movSuaIfvt,hem.NUM_FOLIO AS numFolio,hem.NUMERO_EXT AS numeroExt,hem.NUMERO_INT AS numeroInt,hem.poblacion, " +
			"		hem.POR_CRED_IFVT AS porCredIfvt,hem.PORCEN_RFC_SUBCON_01 AS porcenRfcSubcon01,hem.PORCEN_RFC_SUBCON_02 AS porcenRfcSubcon02, " +
			"		hem.PORCEN_RFC_SUBCON_03 AS porcenRfcSubcon03,hem.PORCEN_RFC_SUBCON_04 AS porcenRfcSubcon04,hem.PORCEN_RFC_SUBCON_05 AS porcenRfcSubcon05, " +
			"		hem.PORCEN_RFC_SUBCON_06 AS porcenRfcSubcon06,hem.PORCEN_RFC_SUBCON_07 AS porcenRfcSubcon07,hem.RFC_SUBCONTRATO_01 AS rfcSubcontrato01, " +
			"		hem.RFC_SUBCONTRATO_02 AS rfcSubcontrato02,hem.RFC_SUBCONTRATO_03 AS rfcSubcontrato03,hem.RFC_SUBCONTRATO_04 AS rfcSubcontrato04, " +
			"		hem.RFC_SUBCONTRATO_05 AS rfcSubcontrato05,hem.RFC_SUBCONTRATO_06 AS rfcSubcontrato06,hem.RFC_SUBCONTRATO_07 AS rfcSubcontrato07, " +
			"		hem.SAL_INT_EYM AS salIntEym,hem.SAL_INT_IFVT AS salIntIfvt,hem.SAL_INT_IVC AS salIntIvc,hem.SAL_INT_SAR AS salIntSar,hem.seccion, " +
			"		hem.SEMANA_RED_IMSS AS semanaRedImss,hem.sindicalizado,hem.SUBDELEGACION_IMSS AS subdelegacionImss,hem.TELEFONO_CEL AS telefonoCel, " +
			"		hem.TIPO_CRED_IFVT AS tipoCredIfvt,hem.TIPO_JORNADA AS tipoJornada,hem.TIPO_REGIMEN AS tipoRegimen,hem.TIPO_TRABAJADOR_IMSS AS tipoTrabajadorImss, " +
			"		hem.USER_ID AS userId " +
			"FROM HUMAN.HU_EMPLS he, HUMAN.HU_EMPLS_MEX hem  " +
			"WHERE he.NUM_EMP = hem.NUM_EMP  " +
			"AND he.NUM_CIA = hem.NUM_CIA " +
			"AND he.NUM_CIA = ?1")
	List<IHuEmplDto> findAllEmplsByNumCia(long numCia);
	
	@Query(nativeQuery = true, value =  
			"SELECT he.NUM_EMP AS numEmp, he.NUM_CIA AS numCia, he.actividad,he.APELL_MAT AS apellMat,he.APELL_PAT AS apellPat,he.area,he.banco,he.banco2, " +
			"		he.CD_BANCO AS cdBanco,he.centro,he.CLAVE_LOCALIDAD AS claveLocalidad,he.CLAVE_PAIS_TEL AS lavePaisTel, " +
			"		he.CLAVE_PROVINCIA AS claveProvincia,he.COD_AREA_TEL AS codAreaTel,he.COD_ID_01 AS codId01,he.COD_ID_02 AS codId02, " +
			"		he.COD_ID_03 AS codId03,he.COD_ID_04 AS codId04,he.COD_ID_05 AS codId05,he.COD_ID_06 AS codId06, " +
			"		he.COD_ID_07 AS codId07,he.COD_ID_08 AS codId08,he.COD_ID_09 AS codId09,he.COD_ID_10 AS codId10,he.COD_ID_11 AS codId11, " +
			"		he.COD_ID_12 AS codId12,he.COD_ID_13 AS codId13,he.COD_ID_14 AS codId14,he.COD_ID_15 AS codId15,he.COD_ID_16 AS codId16, " +
			"		he.COD_ID_17 AS codId17,he.COD_ID_18 AS codId18,he.COD_ID_19 AS codId19,he.COD_ID_20 AS codId20,he.COD_ID_21 AS codId21, " +
			"		he.COD_ID_22 AS codId22,he.COD_ID_23 AS codId23,he.COD_ID_24 AS codId24,he.COD_ID_25 AS codId25,he.COD_ID_26 AS codId26, " +
			"		he.COD_ID_27 AS codId27,he.COD_ID_28 AS codId28,he.COD_ID_29 AS codId29,he.COD_ID_30 AS codId30,he.contrato, " +
			"		he.CTA_DEUD AS ctaDeud,he.CTA_DEUD2 AS ctaDeud2,he.cuenta,he.CUENTA_CLAVE AS cuentaClave,he.CUENTA_VALES AS cuentaVales, " +
			"		he.CUENTA_VALES_COMEDOR AS cuentaValesComedor,he.CUENTA_VALES_GASOLINA AS cuentaValesGasolina,he.cuenta2,he.DECLARACION_IMP AS declaracionImp, " +
			"		he.EDO_BANCO AS edoBanco,he.email,he.ESTADO_CIVIL AS estadoCivil,he.estatura,he.EXTENSION_TEL AS extensionTel, " +
			"		he.FECHA_ANTIGUEDAD AS fechaAntiguedad,he.FECHA_ANTIGUEDAD_SUB AS fechaAntiguedadSub,he.FECHA_BAJA AS fechaBaja, " +
			"		he.FECHA_CONTRATO AS fechaContrato,he.FECHA_INGRESO AS fechaIngreso,he.FECHA_MERITO AS fechaMerito,he.FECHA_NAC AS fechaNac, " +
			"		he.FECHA_PROMOCION AS fechaPromocion,he.FECHA_SUELDO AS fechaSueldo,he.FECHA_TERMINACION AS fechaTerminacion,he.FORMA_PAGO AS formaPago, " +
			"		he.FORMATO_SUELDO AS formatoSueldo,he.GPO_SANGUINEO AS gpoSanguineo,he.GRUPO_PRESTACION AS grupoPrestacion, " +
			"		he.GRUPO_PRESTACION_SUB AS grupoPrestacionSub,he.JORNADA_RED AS jornadaRed,he.licencia,he.linea,he.LOCALIDAD_NAC AS localidadNac, " +
			"		he.LUGAR_PAGO AS lugarPago,he.moneda,he.nacionalidad,he.nip,he.nombre,he.PAIS_NAC AS paisNac,he.pasaporte,he.peso,he.plaza, " +
			"		he.PROVINCIA_NAC AS provinciaNac,he.puesto,he.sexo,he.status,he.sucursal,he.sucursal2,he.sueldo,he.supervisor,he.TARJETA_VAL AS tarjetaVal, " +
			"		he.TARJETA_VAL_COMEDOR AS tarjetaValComedor,he.TARJETA_VAL_GASOLINA AS tarjetaValGasolina,he.telefono,he.TIPO_CONTRATO AS tipoContrato, " +
			"		he.TIPO_CUENTA AS tipoCuenta,he.TIPO_CUENTA2 AS tipoCuenta2,he.TIPO_EMPL AS tipoEmpl,he.TIPO_LICENCIA AS tipoLicencia,he.turno, " +
			"		he.VENCE_LICENCIA AS venceLicencia,he.VENCE_PASAPORTE AS vencePasaporte,he.zona,hem.AFIL_FONACOT AS afilFonacot,hem.AFIL_IMSS AS afilImss, " +
			"		hem.ASIMILADO_A_SALARIOS AS asimiladoASalarios,hem.BIMESTRE_SUSPENSION AS bimestreSuspension,hem.CLAVE_ELECTOR AS claveElector, " +
			"		hem.CLAVE_POBLACION AS clavePoblacion,hem.clinica,hem.COD_POS AS codPos,hem.colonia,hem.CONTRATO_SAR AS contratoSar,hem.CRED_IFVT AS credIfvt, " +
			"		hem.curp,hem.DELEGACION_IMSS AS delegacionImss,hem.DIG_VER_RFC AS digVerRfc,hem.domicilio,hem.EMAIL_1 AS email1,hem.EMAIL_2 AS email2, " +
			"		hem.estado,hem.F_AVISO_LIBERACION AS fAvisoLiberacion,hem.F_INI_DESCUENTO AS fIniDescuento,hem.F_RECEPCION_CIA AS fRecepcionCia, " +
			"		hem.FECHA_ALTA_CONSAR AS fechaAltaConsar,hem.FECHA_ALTA_FONAC AS fechaAltaFonac,hem.FECHA_BAJA_CONSAR AS fechaBajaConsar, " +
			"		hem.FECHA_BAJA_FONAC AS fechaBajaFonac,hem.FECHA_MOD_IFVT AS fechaModIfvt,hem.FECHA_MOV AS fechaMov,hem.FECHA_RFC AS fechaRfc, " +
			"		hem.GRUPO_IMSS AS grupoImss,hem.HOMO_RFC AS homoRfc,hem.LETRAS_RFC AS letrasRfc,hem.MOTIVO_BAJA_FONAC AS motivoBajaFonac, " +
			"		hem.MOV_SUA_IFVT AS movSuaIfvt,hem.NUM_FOLIO AS numFolio,hem.NUMERO_EXT AS numeroExt,hem.NUMERO_INT AS numeroInt,hem.poblacion, " +
			"		hem.POR_CRED_IFVT AS porCredIfvt,hem.PORCEN_RFC_SUBCON_01 AS porcenRfcSubcon01,hem.PORCEN_RFC_SUBCON_02 AS porcenRfcSubcon02, " +
			"		hem.PORCEN_RFC_SUBCON_03 AS porcenRfcSubcon03,hem.PORCEN_RFC_SUBCON_04 AS porcenRfcSubcon04,hem.PORCEN_RFC_SUBCON_05 AS porcenRfcSubcon05, " +
			"		hem.PORCEN_RFC_SUBCON_06 AS porcenRfcSubcon06,hem.PORCEN_RFC_SUBCON_07 AS porcenRfcSubcon07,hem.RFC_SUBCONTRATO_01 AS rfcSubcontrato01, " +
			"		hem.RFC_SUBCONTRATO_02 AS rfcSubcontrato02,hem.RFC_SUBCONTRATO_03 AS rfcSubcontrato03,hem.RFC_SUBCONTRATO_04 AS rfcSubcontrato04, " +
			"		hem.RFC_SUBCONTRATO_05 AS rfcSubcontrato05,hem.RFC_SUBCONTRATO_06 AS rfcSubcontrato06,hem.RFC_SUBCONTRATO_07 AS rfcSubcontrato07, " +
			"		hem.SAL_INT_EYM AS salIntEym,hem.SAL_INT_IFVT AS salIntIfvt,hem.SAL_INT_IVC AS salIntIvc,hem.SAL_INT_SAR AS salIntSar,hem.seccion, " +
			"		hem.SEMANA_RED_IMSS AS semanaRedImss,hem.sindicalizado,hem.SUBDELEGACION_IMSS AS subdelegacionImss,hem.TELEFONO_CEL AS telefonoCel, " +
			"		hem.TIPO_CRED_IFVT AS tipoCredIfvt,hem.TIPO_JORNADA AS tipoJornada,hem.TIPO_REGIMEN AS tipoRegimen,hem.TIPO_TRABAJADOR_IMSS AS tipoTrabajadorImss, " +
			"		hem.USER_ID AS userId " +
			"FROM HUMAN.HU_EMPLS he, HUMAN.HU_EMPLS_MEX hem  " +
			"WHERE he.NUM_EMP = hem.NUM_EMP  " +
			"AND he.NUM_CIA = hem.NUM_CIA " +
			"AND he.NUM_EMP = ?1")
	List<IHuEmplDto> findAllEmplsByNumEmp(long numEmp);
}
