
package com.apiregistro2022.entity;

//utilizamos Loombok

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder //Construccion
@NoArgsConstructor //
@AllArgsConstructor //
@Data //
//Definiendo la entidad para la persistencia de datos
@Entity(name="Producto")

//Definiendo la tabla de base de datos
@Table(name="t_producto")
public class Producto implements Serializable{
    //Agregamos el ID de la serializacion
    private static final long serialVersion=1L;
    //Definiendo la clave primaria
    @Id
    //Defines la columna
    @Column(name="codpro")
    private long codigo;
    @Column(name="nompro")
    private String nombre;
    @Column(name="precpro")
    private double preciocompra;
    @Column(name="prevpro")
    private double precioventa;
    @Column(name="canpro")
    private int cantidad;
    @Column(name="estpro")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="codcat", nullable = false)
    private Categoria categoria;
    
}
