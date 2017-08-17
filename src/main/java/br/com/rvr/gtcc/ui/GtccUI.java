package br.com.rvr.gtcc.ui;

import br.com.rvr.gtcc.bean.LoggedUser;
import br.com.rvr.gtcc.entity.Usuario;
import br.com.rvr.gtcc.repository.UsuarioRepository;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Criado por Raphael em 20/07/2017.
 */
@SpringUI
public class GtccUI extends UI {

    private VerticalLayout root;

    private UsuarioRepository repo;
    private LoggedUser loggedUser;

    @Autowired
    public GtccUI(UsuarioRepository repo, LoggedUser loggedUser) {
        this.repo = repo;
        this.loggedUser = loggedUser;
    }

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        buildView();
        buildButton();
    }

    private void buildView() {
        root = new VerticalLayout();
        root.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
        setContent(root);
    }

    private void buildButton() {

        HorizontalLayout fieldLayout = new HorizontalLayout();

        TextField login = new TextField("Login");
        TextField senha = new TextField("Senha");

        fieldLayout.setWidth("80%");

        fieldLayout.addComponents(login, senha);


        Button addUser = new Button("Add", click -> {

            Usuario usuario = new Usuario();
            usuario.setEmail(login.getValue());
            usuario.setSenha(senha.getValue());

            repo.save(usuario);
        });

        Button loginButton = new Button("Login", click -> {
            Usuario usu = repo.findFirstByEmailAndSenha(login.getValue(), senha.getValue());
            setLoggedUser(usu);
        });

        Button listUser = new Button("List User", click ->
                root.addComponent(new Label(getLoggedUser().getEmail())));

        HorizontalLayout buttonsLayout = new HorizontalLayout(addUser, loginButton, listUser);

        root.addComponents(fieldLayout, buttonsLayout);
        root.setResponsive(true);
    }

    public Usuario getLoggedUser() {
        return loggedUser.getLoggedUser();
    }

    public void setLoggedUser(Usuario usuario) {
        this.loggedUser.setLoggedUser(usuario);
    }
}
