//import io.hschwentner.dddbits.annotation.BoundedContext;

/**
 * @author henning
 *
 */
//@BoundedContext TODO: comment in again when DDDBITS support Java 9
module io.leasingninja.sales {
//    exports io.leasingninja.sales.infrastructure; // for jpa
//    opens io.leasingninja.sales.infrastructure to spring.data.jpa; // for jpa
//	opens io.leasingninja.sales.infrastructure to io.leasingninja.webapp;

    // alle
//    requires org.apache.logging.slf4j;
//    requires  org.slf4j; // erst mit Version 1.8
//    requires slf4j.api;
//    requires transitive logback.classic;
	
	// Domain Layer
    requires jmolecules.ddd;
    requires io.hschwentner.dddbits;
	requires io.leasingninja.riskmanagement;
	
	// Application Layer
    requires spring.beans;
//    requires spring.core;
    requires spring.context;
    requires spring.web;
    requires spring.webmvc;
//    requires spring.boot;
//    requires spring.boot.autoconfigure;

    requires org.mapstruct;
    opens io.leasingninja.sales.application to org.mapstruct;
    requires transitive java.sql;
    requires transitive java.annotation;

    // Infrastructure Layer
    requires java.persistence;
//    requires java.xml.bind;
    requires spring.data.commons;
//    requires spring.data.jpa;
    /* JSON implementation */
//    requires com.fasterxml.jackson.databind;
//    requires transitive com.fasterxml.jackson.core;
    requires com.google.gson;
}


//	exports * to de.wps.leasingninja.vertriebtest

//	requires org.junit.jupiter.api;
//	requires org.assertj;