package br.com.rvr.gtcc.entity.interfaces;

import java.time.LocalDate;

/**
 * Criado por Raphael em 17/08/2017.
 */
public interface UsuarioInteface extends BaseInterface {
    LocalDate getDate();

    void setDate(LocalDate date);

    String getSenha();

    void setSenha(String senha);

    String getEmail();

    void setEmail(String email);

    String getNome();

    void setNome(String nome);
}
