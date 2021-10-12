package com.knf.dev.view.component;

import io.quarkus.qute.Location;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateException;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class ComponentView {

    @Location("component/component-alert")
    Template alert;

    @Location("component/component-badge")
    Template badge;

    @Location("component/component-breadcrumb")
    Template breadcrumb;

    @Location("component/component-button")
    Template button;

    @Location("component/component-card")
    Template card;

    @Location("component/component-carousel")
    Template carousel;

    @Location("component/component-dropdown")
    Template dropdown;

    @Location("component/component-list-group")
    Template listGroup;

    @Location("component/component-modal")
    Template modal;

    @Location("component/component-navs")
    Template nav;

    @Location("component/component-pagination")
    Template pagination;

    @Location("component/component-progress")
    Template progress;

    @Location("component/component-spinner")
    Template spinner;

    @Location("component/component-tooltip")
    Template tooltip;


    //Alert View
    @GET
    @Path("/component-alert")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance alert()
            throws TemplateException {
        return alert.instance();
    }

    //Badge View
    @GET
    @Path("/component-badge")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance badge()
            throws TemplateException {
        return badge.instance();
    }

    //breadcrumb View
    @GET
    @Path("/component-breadcrumb")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance breadcrumb()
            throws TemplateException {
        return breadcrumb.instance();
    }

    //Button View
    @GET
    @Path("/component-button")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance button()
            throws TemplateException {
        return button.instance();
    }

    //Card View
    @GET
    @Path("/component-card")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance card()
            throws TemplateException {
        return card.instance();
    }

    //Carousel View
    @GET
    @Path("/component-carousel")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance carousel()
            throws TemplateException {
        return carousel.instance();
    }

    //Dropdown View
    @GET
    @Path("/component-dropdown")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance dropdown()
            throws TemplateException {
        return dropdown.instance();
    }

    //List Group View
    @GET
    @Path("/component-list-group")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance listGroup()
            throws TemplateException {
        return listGroup.instance();
    }

    //Modal View
    @GET
    @Path("/component-modal")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance modal()
            throws TemplateException {
        return modal.instance();
    }

    //Navs View
    @GET
    @Path("/component-navs")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance navs()
            throws TemplateException {
        return nav.instance();
    }

    //Pagination View
    @GET
    @Path("/component-pagination")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance pagination()
            throws TemplateException {
        return pagination.instance();
    }

    //Progress View
    @GET
    @Path("/component-progress")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance progress()
            throws TemplateException {
        return progress.instance();
    }

    //Spinner View
    @GET
    @Path("/component-spinner")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance spinner()
            throws TemplateException {
        return spinner.instance();
    }

    //Tooltip View
    @GET
    @Path("/component-tooltip")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance tooltip()
            throws TemplateException {
        return tooltip.instance();
    }

}
