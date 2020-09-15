package pe.edu.upc.almacenamiento.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "articulos")
public class Articulos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "descripcion", length = 30,nullable = false)
	private String descripcion;
	
	@Column(name = "stock",nullable = false)
	private Integer stock;
	
	@Column(name = "precio_compra",nullable = false)
	private Float precioCompra;
	
	@Column(name = "precio_venta",nullable = false)
	private Float precioVenta;
	
	@Column(name = "marca", length = 20,nullable = false)
	private String marca;
	
	@ManyToOne
	@JoinColumn(name="categoria_id")
	private Categoria categoria;
	
	private List<Proveedor> proveedores;

}
