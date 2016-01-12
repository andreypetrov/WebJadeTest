package rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Root path for all jax-rs services. 
 * e.g. GET http://localhost:8080/TestWeb/rest/generic
 * @author Andrey
 *
 */
@ApplicationPath("rest")
public class ApplicationConfig extends Application {

}