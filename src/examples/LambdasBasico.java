package examples;

import java.util.ArrayList;
import java.util.List;

public class LambdasBasico {

	private Integer codigo;
	private String moneda;
	private String descripcion;
	private float valor;
	
	
	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getMoneda() {
		return moneda;
	}


	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}

	public LambdasBasico(Integer codigo, String moneda, String descripcion, float valor) {
		super();
		this.codigo = codigo;
		this.moneda = moneda;
		this.descripcion = descripcion;
		this.valor = valor;
	}

	
	public static void main(String[] args) {
		List<LambdasBasico> lista = new ArrayList<>();
		
		lista.add(new LambdasBasico(1, "BITCOIN", "BTC", 61000f));
		lista.add(new LambdasBasico(2, "ETHEREUM", "ETH", 4100f));
		lista.add(new LambdasBasico(3, "CARDANO", "ADA", 1.97f));
		
		lista.stream().filter(val -> val.getValor() > 50).forEach(lis -> System.out.println(lis.getMoneda()));
	}
}
