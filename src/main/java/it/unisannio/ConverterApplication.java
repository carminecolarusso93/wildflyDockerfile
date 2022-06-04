package it.unisannio;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


@ApplicationPath("/rest")
public class ConverterApplication extends Application {
	public Set<Class<?>> getClasses() {
		Set<Class<?>> s = new HashSet<Class<?>>();
		s.add(it.unisannio.presentation.ConverterController.class);
		return s;
	}
	/*
	public Set<Object> getSingletons() {
		Set<Object> s = new HashSet<Object>();
		s.add(new it.unisannio.presentation.ConverterController());
		return s;
	}*/
	
}
