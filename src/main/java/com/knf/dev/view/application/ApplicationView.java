package com.knf.dev.view.application;

import io.quarkus.qute.Location;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateException;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class ApplicationView {

    @Location("application/application-chat")
    Template chat;

    @Location("application/application-checkout")
    Template checkout;

    @Location("application/application-email")
    Template email;

    @Location("application/application-gallery")
    Template gallery;

    //Chat View
    @GET
    @Path("/application-chat")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance chat()
            throws TemplateException {
        return chat.instance();
    }

    //Checkout View
    @GET
    @Path("/application-checkout")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance checkout()
            throws TemplateException {
        return checkout.instance();
    }

    //Email View
    @GET
    @Path("/application-email")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance email()
            throws TemplateException {
        return email.instance();
    }

    //Gallery View
    @GET
    @Path("/application-gallery")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance gallery()
            throws TemplateException {
        return gallery.instance();
    }
}
