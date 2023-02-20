
public class PruebaEncapsulamiento {
	
	public static void main(String[] args) {
		Cuenta cuentaUsuario4 = new Cuenta();
		Cliente cliente4 = new Cliente();
		
		cliente4.setDocumento("adwa3d2");
		cliente4.setNombre("Diego");
		
		cuentaUsuario4.setTitular(cliente4);
		System.out.println(cliente4.getNombre());
		System.out.println(cuentaUsuario4.getTitular().getNombre());
	}

}
