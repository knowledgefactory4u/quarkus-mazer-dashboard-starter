package com.knf.dev.view.authentication;

import io.quarkus.qute.Location;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateException;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class AuthView {

    @Location("auth/auth-forgot-password")
    Template forgotPassword;

    @Location("auth/auth-login")
    Template login;

    @Location("auth/auth-register")
    Template register;

    //Forgot Password View
    @GET
    @Path("/auth-forgot-password")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance forgotPassword()
            throws TemplateException {
        return forgotPassword.instance();
    }

    //Login View
    @GET
    @Path("/auth-login")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance login()
            throws TemplateException {
        return login.instance();
    }

    //Register View
    @GET
    @Path("/auth-register")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance register()
            throws TemplateException {
        return register.instance();
    }

}
