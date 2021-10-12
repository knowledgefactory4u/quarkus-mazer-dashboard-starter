package com.knf.dev.view.ui;

import io.quarkus.qute.Location;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateException;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class UIView {

    @Location("ui/ui-chart-apexcharts")
    Template apexcharts;

    @Location("ui/ui-chart-chartjs")
    Template chartjs;

    @Location("ui/ui-file-uploader")
    Template uploader;

    @Location("ui/ui-icons-bootstrap-icons")
    Template icons;

    @Location("ui/ui-icons-dripicons")
    Template dripicons;

    @Location("ui/ui-icons-fontawesome")
    Template fontawesome;

    @Location("ui/ui-map-google-map")
    Template map;

    @Location("ui/ui-map-jsvectormap")
    Template jsvectormap;

    @Location("ui/ui-widgets-chatbox")
    Template chatbox;

    @Location("ui/ui-widgets-pricing")
    Template pricing;

    @Location("ui/ui-widgets-todolist")
    Template todolist;

    @Location("ui/sidebar-items")
    Template sidebarItems;

    //apexcharts
    @GET
    @Path("/ui-chart-apexcharts")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance apexcharts()
            throws TemplateException {
        return apexcharts.instance();
    }

    //chartjs
    @GET
    @Path("/ui-chart-chartjs")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance chartjs()
            throws TemplateException {
        return chartjs.instance();
    }

    //uploader
    @GET
    @Path("/ui-file-uploader")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance uploader()
            throws TemplateException {
        return uploader.instance();
    }

    //icons
    @GET
    @Path("/ui-icons-bootstrap-icons")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance icons()
            throws TemplateException {
        return icons.instance();
    }

    //dripicons
    @GET
    @Path("/ui-icons-dripicons")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance dripicons()
            throws TemplateException {
        return dripicons.instance();
    }

    //fontawesome
    @GET
    @Path("/ui-icons-fontawesome")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance fontawesome()
            throws TemplateException {
        return fontawesome.instance();
    }

    //map
    @GET
    @Path("/ui-map-google-map")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance map()
            throws TemplateException {
        return map.instance();
    }

    //jsvectormap
    @GET
    @Path("/ui-map-jsvectormap")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance jsvectormap()
            throws TemplateException {
        return jsvectormap.instance();
    }

    //chatbox
    @GET
    @Path("/ui-widgets-chatbox")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance chatbox()
            throws TemplateException {
        return chatbox.instance();
    }

    //pricing
    @GET
    @Path("/ui-widgets-pricing")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance pricing()
            throws TemplateException {
        return pricing.instance();
    }

    //todolist
    @GET
    @Path("/ui-widgets-todolist")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance todolist()
            throws TemplateException {
        return todolist.instance();
    }

    //sidebarItems
    @GET
    @Path("/sidebar-items")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance sidebarItems()
            throws TemplateException {
        return sidebarItems.instance();
    }

}
