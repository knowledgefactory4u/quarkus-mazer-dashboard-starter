package com.knf.dev.view.error;

import io.quarkus.qute.Location;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateException;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class ErrorView {

    @Location("error/error-403")
    Template forbidden;

    @Location("error/error-404")
    Template pageNotFoundError;

    @Location("error/error-500")
    Template internalServerError;


    //403 View
    @GET
    @Path("/error-403")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance forbidden()
            throws TemplateException {
        return forbidden.instance();
    }

    //404 View
    @GET
    @Path("/error-404")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance pageNotFoundError()
            throws TemplateException {
        return pageNotFoundError.instance();
    }

    //500 View
    @GET
    @Path("/error-500")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance internalServerError()
            throws TemplateException {
        return internalServerError.instance();
    }
}
