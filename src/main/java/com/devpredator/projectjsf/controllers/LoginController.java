package com.devpredator.projectjsf.controllers;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.io.IOException;

/**
 * Clase que permite controlar el funcionamiento con la pantalla de login.xhtml
 * .
 */

@ManagedBean(name = "loginControlller")
public class LoginController {

    private String usuario;

    private String password;

    public void ingresar() {
        System.out.println("Usuario:  " + usuario);

        if (usuario.equals("dev") && password.equals("123")) {
            try {
                redireccionar("principal.xhtml");
            } catch (IOException e) {
                FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
                        new FacesMessage(FacesMessage.SEVERITY_FATAL, "Page no found", ""));
                e.printStackTrace();
            }

        } else {
            FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "USUARIO INCORECTO", ""));
        }
    }

    private void redireccionar(String pagina) throws IOException {
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.redirect(pagina);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
