package com.ika;

import org.apache.wicket.request.mapper.parameter.PageParameters;



import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.PropertyModel;

import java.util.Date;

import org.apache.wicket.markup.html.WebPage;


public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;
	
	
	public HomePage(final PageParameters parameters) {
		super(parameters);
		
		final Usuario usuario = new Usuario();
				
		Form usuarioForm = new Form("usuarioForm", new CompoundPropertyModel(usuario)) {
			@Override
			protected void onSubmit() {
				String mensaje;
				System.out.println("------------------------------------");
				System.out.println("Datos capturados");
				System.out.println("------------------------------------");
				System.out.println(usuario.nombre);
				System.out.println(usuario.correo);
				System.out.println(usuario.celular);
				System.out.println(usuario.fechaNacimiento);
			}
		};
		//add(new Label("version", getApplication().getFrameworkSettings().getVersion()));
		
		usuarioForm.add(new TextField<>("nombre"));
		usuarioForm.add(new TextField<>("celular"));
		usuarioForm.add(new TextField<>("correo"));
		usuarioForm.add(new TextField<>("fechaNacimiento"));
		add(usuarioForm);
	}
}