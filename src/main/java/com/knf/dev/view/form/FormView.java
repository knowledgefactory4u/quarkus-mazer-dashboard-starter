package com.knf.dev.view.form;

import io.quarkus.qute.Location;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateException;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class FormView {

    @Location("form/form-editor-ckeditor")
    Template ckeditor;

    @Location("form/form-editor-quill")
    Template quill;

    @Location("form/form-editor-summernote")
    Template summernote;

    @Location("form/form-editor-tinymce")
    Template tinymce;

    @Location("form/form-element-checkbox")
    Template checkbox;

    @Location("form/form-element-input")
    Template input;

    @Location("form/form-element-radio")
    Template radio;

    @Location("form/form-element-input-group")
    Template inputGroup;

    @Location("form/form-element-select")
    Template select;

    @Location("form/form-element-textarea")
    Template textarea;

    @Location("form/form-layout")
    Template layout;

    //Ckeditor View
    @GET
    @Path("/form-editor-ckeditor")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance alert()
            throws TemplateException {
        return ckeditor.instance();
    }

    //quill View
    @GET
    @Path("/form-editor-quill")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance quill()
            throws TemplateException {
        return quill.instance();
    }

    //summernote View
    @GET
    @Path("/form-editor-summernote")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance summernote()
            throws TemplateException {
        return summernote.instance();
    }

    //tinymce View
    @GET
    @Path("/form-editor-tinymce")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance tinymce()
            throws TemplateException {
        return tinymce.instance();
    }

    //checkbox View
    @GET
    @Path("/form-element-checkbox")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance checkbox()
            throws TemplateException {
        return checkbox.instance();
    }

    //input View
    @GET
    @Path("/form-element-input")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance input()
            throws TemplateException {
        return input.instance();
    }

    //radio View
    @GET
    @Path("/form-element-radio")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance radio()
            throws TemplateException {
        return radio.instance();
    }

    //input Group View
    @GET
    @Path("/form-element-input-group")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance inputGroup()
            throws TemplateException {
        return inputGroup.instance();
    }

    //select Group View
    @GET
    @Path("/form-element-select")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance select()
            throws TemplateException {
        return select.instance();
    }

    //textarea Group View
    @GET
    @Path("/form-element-textarea")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance textarea()
            throws TemplateException {
        return textarea.instance();
    }

    //layout Group View
    @GET
    @Path("/form-layout")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance layout()
            throws TemplateException {
        return layout.instance();
    }
}
