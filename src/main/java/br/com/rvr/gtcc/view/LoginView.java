package br.com.rvr.gtcc.view;

import br.com.rvr.gtcc.base.BaseView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.VerticalLayout;

/**
 * Criado por Raphael em 20/07/2017.
 */
@UIScope
@SpringView(name = LoginView.VIEW_NAME)
public class LoginView extends VerticalLayout implements View, BaseView {
    public static final String VIEW_NAME = "LOGIN_VIEW";

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        System.out.println("entrou na view");
    }

    @Override
    public void init() {
        System.out.println("iniciou a view");
    }

    @Override
    public void configureView() {
        System.out.println("configurou a view");
    }
}
