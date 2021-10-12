package com.knf.dev.view.layout;

import io.quarkus.qute.Location;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateException;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class LayoutView {

    @Location("layout/layout-default")
    Template defaultView;

    @Location("layout/layout-horizontal")
    Template horizontal;

    @Location("layout/layout-rtl")
    Template rtl;

    @Location("layout/layout-vertical-1-column")
    Template vcolumn;

    @Location("layout/layout-vertical-navbar")
    Template vnav;

    //Default View
    @GET
    @Path("/layout-default")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance defaultView()
            throws TemplateException {
        return defaultView.instance();
    }

    //horizontal View
    @GET
    @Path("/layout-horizontal")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance horizontal()
            throws TemplateException {
        return horizontal.instance();
    }

    //rtl View
    @GET
    @Path("/layout-rtl")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance rtl()
            throws TemplateException {
        return rtl.instance();
    }

    //vcol View
    @GET
    @Path("/layout-vertical-1-column")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance vcolumn()
            throws TemplateException {
        return vcolumn.instance();
    }

    //vnav View
    @GET
    @Path("/layout-vertical-navbar")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance vnav()
            throws TemplateException {
        return vnav.instance();
    }

}
