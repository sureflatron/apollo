package myapps.user.business;

import myapps.user.dao.BitacoraDAO;
import myapps.user.ldap.DescriptorBitacora;
import myapps.user.model.MuBitacora;
import org.apache.log4j.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Named
@Stateless
public class BitacoraBL implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	BitacoraDAO dao;

	private static Logger log = Logger.getLogger(BitacoraBL.class);

	public void save(MuBitacora dato) {
		try {
			dao.save(dato);
		} catch (Exception e) {
			log.error("[save] " + e);
		}
	}

	public List<MuBitacora> listBitacora(MuBitacora muBitacoraObj,Date fechainc,Date fechaFin) {
		return dao.listBitacora(muBitacoraObj,fechainc,fechaFin);
	}

	@SuppressWarnings("rawtypes")
	public void accionInsert(String user, String ip, Enum dato, String id, String name) {

		String ele = ((DescriptorBitacora) dato).getFormulario();
		String formulario = ((DescriptorBitacora) dato).getFormulario();
		String accion = "Se adiciono: " + ele + " con Id:" + id + ", Nombre:" + name;

		MuBitacora bitacora = new MuBitacora();
		bitacora.setUsuario(user);
		bitacora.setFormulario(formulario);
		bitacora.setDireccionIp(ip);
		bitacora.setAccion(accion);
		bitacora.setFecha(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		save(bitacora);
	}

	@SuppressWarnings("rawtypes")
	public void accionDelete(String user, String ip, Enum dato, String id, String name) {

		String ele = ((DescriptorBitacora) dato).getFormulario();
		String formulario = ((DescriptorBitacora) dato).getFormulario();
		String accion = "Se elimino: " + ele + " con Id:" + id + ", Nombre:" + name;

		MuBitacora bitacora = new MuBitacora();
		bitacora.setUsuario(user);
		bitacora.setFormulario(formulario);
		bitacora.setDireccionIp(ip);
		bitacora.setAccion(accion);
		bitacora.setFecha(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		save(bitacora);
	}

	@SuppressWarnings("rawtypes")
	public void accionUpdate(String user, String ip, Enum dato, String id, String name) {

		String ele = ((DescriptorBitacora) dato).getFormulario();
		String formulario = ((DescriptorBitacora) dato).getFormulario();
		String accion = "Se modifico: " + ele + " con Id:" + id + ", Nombre:" + name;

		MuBitacora bitacora = new MuBitacora();
		bitacora.setUsuario(user);
		bitacora.setFormulario(formulario);
		bitacora.setDireccionIp(ip);
		bitacora.setAccion(accion);
		bitacora.setFecha(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		save(bitacora);
	}

	@SuppressWarnings("rawtypes")
	public void accionFind(String user, String ip, Enum dato, String id, String name) {

		String ele = ((DescriptorBitacora) dato).getFormulario();
		String formulario = ((DescriptorBitacora) dato).getFormulario();
		String accion = "Se busco: " + ele + " con Campos:" + id + ", Otros:" + name;

		MuBitacora bitacora = new MuBitacora();
		bitacora.setUsuario(user);
		bitacora.setFormulario(formulario);
		bitacora.setDireccionIp(ip);
		bitacora.setAccion(accion);
		bitacora.setFecha(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		save(bitacora);
	}

	@SuppressWarnings("rawtypes")
	public void accionCortar(String user, String ip, Enum dato, String id) {

		String ele = ((DescriptorBitacora) dato).getFormulario();
		String formulario = ((DescriptorBitacora) dato).getFormulario();
		String accion = "Se corto: " + ele + " con NumeroTelefono:" + id;

		MuBitacora bitacora = new MuBitacora();
		bitacora.setUsuario(user);
		bitacora.setFormulario(formulario);
		bitacora.setDireccionIp(ip);
		bitacora.setAccion(accion);
		bitacora.setFecha(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		save(bitacora);
	}

	@SuppressWarnings("rawtypes")
	public void accionReconectar(String user, String ip, Enum dato, String id) {

		String ele = ((DescriptorBitacora) dato).getFormulario();
		String formulario = ((DescriptorBitacora) dato).getFormulario();
		String accion = "Se reconecto: " + ele + " con NumeroTelefono:" + id;

		MuBitacora bitacora = new MuBitacora();
		bitacora.setUsuario(user);
		bitacora.setFormulario(formulario);
		bitacora.setDireccionIp(ip);
		bitacora.setAccion(accion);
		bitacora.setFecha(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		save(bitacora);
	}

	@SuppressWarnings("rawtypes")
	public void accion(String user, String ip, Enum dato, String accion) {

		String ele = ((DescriptorBitacora) dato).getFormulario();
		String formulario = ((DescriptorBitacora) dato).getFormulario();
		accion = ele + " - " + accion;

		MuBitacora bitacora = new MuBitacora();
		bitacora.setUsuario(user);
		bitacora.setFormulario(formulario);
		bitacora.setDireccionIp(ip);
		bitacora.setAccion(accion);
		bitacora.setFecha(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		save(bitacora);
	}
}
