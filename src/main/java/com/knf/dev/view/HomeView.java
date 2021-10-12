package com.knf.dev.view;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateException;
import io.quarkus.qute.TemplateInstance;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HomeView {
    @Inject
    Template index;

    //HomeView View
    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance index()
            throws TemplateException {
        return index.instance();
    }
}
