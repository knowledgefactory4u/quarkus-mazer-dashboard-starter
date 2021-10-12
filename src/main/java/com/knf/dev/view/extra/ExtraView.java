package com.knf.dev.view.extra;

import io.quarkus.qute.Location;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateException;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class ExtraView {

    @Location("extra/extra-component-avatar")
    Template avatar;

    @Location("extra/extra-component-divider")
    Template divider;

    @Location("extra/extra-component-rating")
    Template rating;

    @Location("extra/extra-component-sweetalert")
    Template sweetalert;

    @Location("extra/extra-component-toastify")
    Template toastify;

    //Avatar View
    @GET
    @Path("/extra-component-avatar")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance avatar()
            throws TemplateException {
        return avatar.instance();
    }

    //Rating View
    @GET
    @Path("/extra-component-rating")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance rating()
            throws TemplateException {
        return rating.instance();
    }

    //Divider View
    @GET
    @Path("/extra-component-divider")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance divider()
            throws TemplateException {
        return divider.instance();
    }

    //Sweetalert View
    @GET
    @Path("/extra-component-sweetalert")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance sweetalert()
            throws TemplateException {
        return sweetalert.instance();
    }

    //Toastify View
    @GET
    @Path("/extra-component-toastify")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance toastify()
            throws TemplateException {
        return toastify.instance();
    }
}
