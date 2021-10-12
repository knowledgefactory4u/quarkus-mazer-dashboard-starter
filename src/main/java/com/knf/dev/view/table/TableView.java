package com.knf.dev.view.table;

import io.quarkus.qute.Location;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateException;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class TableView {

    @Location("table/table")
    Template table;

    @Location("table/table-datatable")
    Template datatable;

    @Location("table/table-datatable-jquery")
    Template jDatatable;

    //table View
    @GET
    @Path("/table")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance table()
            throws TemplateException {
        return table.instance();
    }

    //datatable View
    @GET
    @Path("/table-datatable")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance datatable()
            throws TemplateException {
        return datatable.instance();
    }

    //jDatatable View
    @GET
    @Path("/table-datatable-jquery")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance jDatatable()
            throws TemplateException {
        return jDatatable.instance();
    }

}
