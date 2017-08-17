package br.com.rvr.gtcc.entity;

import br.com.rvr.gtcc.entity.interfaces.UsuarioInteface;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Criado por Raphael em 20/07/2017.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements UsuarioInteface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Integer id;
    public static final String _id = "id";

    @Getter @Setter private String nome;
    public static final String _nome = "nome";

    @Getter @Setter private String email;
    public static final String _email = "email";

    @Getter @Setter private String senha;
    public static final String _senha = "senha";

    @Getter @Setter private LocalDate date;
    public static final String _date = "date";
}
