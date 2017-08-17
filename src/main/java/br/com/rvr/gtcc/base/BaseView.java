package br.com.rvr.gtcc.base;

import javax.annotation.PostConstruct;

/**
 * Criado por Raphael em 20/07/2017.
 */
public interface BaseView {
    @PostConstruct
    void init();

    void configureView();
}
