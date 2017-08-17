package br.com.rvr.gtcc.bean;

import br.com.rvr.gtcc.entity.Usuario;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import lombok.Getter;
import lombok.Setter;

/**
 * Criado por Raphael em 20/07/2017.
 */
@SpringComponent
@UIScope
public class LoggedUser {
    @Getter @Setter
    private Usuario loggedUser;

}
