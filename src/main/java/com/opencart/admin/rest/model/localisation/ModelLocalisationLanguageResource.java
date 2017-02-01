package com.opencart.admin.rest.model.localisation;


import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opencart.admin.dao.model.localisation.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelLocalisationLanguage")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelLocalisationLanguageResource {
  Log logger = LogFactory.getLog(ModelLocalisationLanguageResource.class);

  @Inject
  ModelLocalisationLanguageDAOImpl service;

      @Path("/addLanguage9")
      @GET
      public Response addLanguage9() {
         return Response.ok(service.addLanguage9().toString()).build();  
      }
      @Path("/getLanguages")
      @GET
      public Response getLanguages() {
         return Response.ok(service.getLanguages().toString()).build();  
      }
      @Path("/addLanguage29")
      @GET
      public Response addLanguage29() {
         return Response.ok(service.addLanguage29().toString()).build();  
      }
      @Path("/addLanguage36")
      @GET
      public Response addLanguage36() {
         return Response.ok(service.addLanguage36().toString()).build();  
      }
      @Path("/addLanguage37")
      @GET
      public Response addLanguage37() {
         return Response.ok(service.addLanguage37().toString()).build();  
      }
      @Path("/addLanguage38")
      @GET
      public Response addLanguage38() {
         return Response.ok(service.addLanguage38().toString()).build();  
      }
      @Path("/addLanguage39")
      @GET
      public Response addLanguage39() {
         return Response.ok(service.addLanguage39().toString()).build();  
      }
      @Path("/addLanguage32")
      @GET
      public Response addLanguage32() {
         return Response.ok(service.addLanguage32().toString()).build();  
      }
      @Path("/addLanguage33")
      @GET
      public Response addLanguage33() {
         return Response.ok(service.addLanguage33().toString()).build();  
      }
      @Path("/addLanguage34")
      @GET
      public Response addLanguage34() {
         return Response.ok(service.addLanguage34().toString()).build();  
      }
      @Path("/addLanguage35")
      @GET
      public Response addLanguage35() {
         return Response.ok(service.addLanguage35().toString()).build();  
      }
      @Path("/addLanguage30")
      @GET
      public Response addLanguage30() {
         return Response.ok(service.addLanguage30().toString()).build();  
      }
      @Path("/addLanguage31")
      @GET
      public Response addLanguage31() {
         return Response.ok(service.addLanguage31().toString()).build();  
      }
      @Path("/addLanguage18")
      @GET
      public Response addLanguage18() {
         return Response.ok(service.addLanguage18().toString()).build();  
      }
      @Path("/addLanguage19")
      @GET
      public Response addLanguage19() {
         return Response.ok(service.addLanguage19().toString()).build();  
      }
      @Path("/getLanguageByCode")
      @GET
      public Response getLanguageByCode() {
         return Response.ok(service.getLanguageByCode().toString()).build();  
      }
      @Path("/addLanguage25")
      @GET
      public Response addLanguage25() {
         return Response.ok(service.addLanguage25().toString()).build();  
      }
      @Path("/addLanguage26")
      @GET
      public Response addLanguage26() {
         return Response.ok(service.addLanguage26().toString()).build();  
      }
      @Path("/addLanguage27")
      @GET
      public Response addLanguage27() {
         return Response.ok(service.addLanguage27().toString()).build();  
      }
      @Path("/addLanguage28")
      @GET
      public Response addLanguage28() {
         return Response.ok(service.addLanguage28().toString()).build();  
      }
      @Path("/addLanguage21")
      @GET
      public Response addLanguage21() {
         return Response.ok(service.addLanguage21().toString()).build();  
      }
      @Path("/addLanguage22")
      @GET
      public Response addLanguage22() {
         return Response.ok(service.addLanguage22().toString()).build();  
      }
      @Path("/addLanguage23")
      @GET
      public Response addLanguage23() {
         return Response.ok(service.addLanguage23().toString()).build();  
      }
      @Path("/addLanguage24")
      @GET
      public Response addLanguage24() {
         return Response.ok(service.addLanguage24().toString()).build();  
      }
      @Path("/editLanguage")
      @GET
      public Response editLanguage(  @QueryParam("Code")  String Code) {
         return Response.ok(service.editLanguage(Code).toString()).build();  
      }
      @Path("/addLanguage20")
      @GET
      public Response addLanguage20() {
         return Response.ok(service.addLanguage20().toString()).build();  
      }
      @Path("/deleteLanguage12")
      @GET
      public Response deleteLanguage12() {
         return Response.ok(service.deleteLanguage12().toString()).build();  
      }
      @Path("/addLanguage14")
      @GET
      public Response addLanguage14() {
         return Response.ok(service.addLanguage14().toString()).build();  
      }
      @Path("/deleteLanguage13")
      @GET
      public Response deleteLanguage13() {
         return Response.ok(service.deleteLanguage13().toString()).build();  
      }
      @Path("/addLanguage15")
      @GET
      public Response addLanguage15() {
         return Response.ok(service.addLanguage15().toString()).build();  
      }
      @Path("/deleteLanguage14")
      @GET
      public Response deleteLanguage14() {
         return Response.ok(service.deleteLanguage14().toString()).build();  
      }
      @Path("/addLanguage16")
      @GET
      public Response addLanguage16() {
         return Response.ok(service.addLanguage16().toString()).build();  
      }
      @Path("/deleteLanguage15")
      @GET
      public Response deleteLanguage15() {
         return Response.ok(service.deleteLanguage15().toString()).build();  
      }
      @Path("/addLanguage17")
      @GET
      public Response addLanguage17() {
         return Response.ok(service.addLanguage17().toString()).build();  
      }
      @Path("/addLanguage10")
      @GET
      public Response addLanguage10() {
         return Response.ok(service.addLanguage10().toString()).build();  
      }
      @Path("/addLanguage11")
      @GET
      public Response addLanguage11() {
         return Response.ok(service.addLanguage11().toString()).build();  
      }
      @Path("/deleteLanguage10")
      @GET
      public Response deleteLanguage10() {
         return Response.ok(service.deleteLanguage10().toString()).build();  
      }
      @Path("/getTotalLanguages")
      @GET
      public Response getTotalLanguages() {
         return Response.ok(service.getTotalLanguages().toString()).build();  
      }
      @Path("/addLanguage12")
      @GET
      public Response addLanguage12() {
         return Response.ok(service.addLanguage12().toString()).build();  
      }
      @Path("/deleteLanguage11")
      @GET
      public Response deleteLanguage11() {
         return Response.ok(service.deleteLanguage11().toString()).build();  
      }
      @Path("/deleteLanguage")
      @GET
      public Response deleteLanguage() {
         return Response.ok(service.deleteLanguage().toString()).build();  
      }
      @Path("/addLanguage13")
      @GET
      public Response addLanguage13() {
         return Response.ok(service.addLanguage13().toString()).build();  
      }
      @Path("/addLanguage50")
      @GET
      public Response addLanguage50() {
         return Response.ok(service.addLanguage50().toString()).build();  
      }
      @Path("/addLanguage")
      @GET
      public Response addLanguage() {
         return Response.ok(service.addLanguage().toString()).build();  
      }
      @Path("/deleteLanguage16")
      @GET
      public Response deleteLanguage16() {
         return Response.ok(service.deleteLanguage16().toString()).build();  
      }
      @Path("/deleteLanguage17")
      @GET
      public Response deleteLanguage17() {
         return Response.ok(service.deleteLanguage17().toString()).build();  
      }
      @Path("/deleteLanguage18")
      @GET
      public Response deleteLanguage18() {
         return Response.ok(service.deleteLanguage18().toString()).build();  
      }
      @Path("/deleteLanguage19")
      @GET
      public Response deleteLanguage19() {
         return Response.ok(service.deleteLanguage19().toString()).build();  
      }
      @Path("/getLanguage")
      @GET
      public Response getLanguage() {
         return Response.ok(service.getLanguage().toString()).build();  
      }
      @Path("/deleteLanguage9")
      @GET
      public Response deleteLanguage9() {
         return Response.ok(service.deleteLanguage9().toString()).build();  
      }
      @Path("/deleteLanguage8")
      @GET
      public Response deleteLanguage8() {
         return Response.ok(service.deleteLanguage8().toString()).build();  
      }
      @Path("/deleteLanguage7")
      @GET
      public Response deleteLanguage7() {
         return Response.ok(service.deleteLanguage7().toString()).build();  
      }
      @Path("/deleteLanguage6")
      @GET
      public Response deleteLanguage6() {
         return Response.ok(service.deleteLanguage6().toString()).build();  
      }
      @Path("/editLanguage2")
      @GET
      public Response editLanguage2() {
         return Response.ok(service.editLanguage2().toString()).build();  
      }
      @Path("/deleteLanguage5")
      @GET
      public Response deleteLanguage5() {
         return Response.ok(service.deleteLanguage5().toString()).build();  
      }
      @Path("/editLanguage3")
      @GET
      public Response editLanguage3() {
         return Response.ok(service.editLanguage3().toString()).build();  
      }
      @Path("/deleteLanguage4")
      @GET
      public Response deleteLanguage4() {
         return Response.ok(service.deleteLanguage4().toString()).build();  
      }
      @Path("/deleteLanguage3")
      @GET
      public Response deleteLanguage3() {
         return Response.ok(service.deleteLanguage3().toString()).build();  
      }
      @Path("/deleteLanguage2")
      @GET
      public Response deleteLanguage2() {
         return Response.ok(service.deleteLanguage2().toString()).build();  
      }
      @Path("/addLanguage47")
      @GET
      public Response addLanguage47() {
         return Response.ok(service.addLanguage47().toString()).build();  
      }
      @Path("/deleteLanguage1")
      @GET
      public Response deleteLanguage1() {
         return Response.ok(service.deleteLanguage1().toString()).build();  
      }
      @Path("/addLanguage48")
      @GET
      public Response addLanguage48() {
         return Response.ok(service.addLanguage48().toString()).build();  
      }
      @Path("/addLanguage49")
      @GET
      public Response addLanguage49() {
         return Response.ok(service.addLanguage49().toString()).build();  
      }
      @Path("/editLanguage1")
      @GET
      public Response editLanguage1() {
         return Response.ok(service.editLanguage1().toString()).build();  
      }
      @Path("/addLanguage43")
      @GET
      public Response addLanguage43() {
         return Response.ok(service.addLanguage43().toString()).build();  
      }
      @Path("/deleteLanguage20")
      @GET
      public Response deleteLanguage20() {
         return Response.ok(service.deleteLanguage20().toString()).build();  
      }
      @Path("/addLanguage44")
      @GET
      public Response addLanguage44() {
         return Response.ok(service.addLanguage44().toString()).build();  
      }
      @Path("/deleteLanguage21")
      @GET
      public Response deleteLanguage21() {
         return Response.ok(service.deleteLanguage21().toString()).build();  
      }
      @Path("/addLanguage45")
      @GET
      public Response addLanguage45() {
         return Response.ok(service.addLanguage45().toString()).build();  
      }
      @Path("/deleteLanguage22")
      @GET
      public Response deleteLanguage22() {
         return Response.ok(service.deleteLanguage22().toString()).build();  
      }
      @Path("/addLanguage46")
      @GET
      public Response addLanguage46() {
         return Response.ok(service.addLanguage46().toString()).build();  
      }
      @Path("/addLanguage8")
      @GET
      public Response addLanguage8() {
         return Response.ok(service.addLanguage8().toString()).build();  
      }
      @Path("/addLanguage7")
      @GET
      public Response addLanguage7() {
         return Response.ok(service.addLanguage7().toString()).build();  
      }
      @Path("/addLanguage40")
      @GET
      public Response addLanguage40() {
         return Response.ok(service.addLanguage40().toString()).build();  
      }
      @Path("/addLanguage6")
      @GET
      public Response addLanguage6() {
         return Response.ok(service.addLanguage6().toString()).build();  
      }
      @Path("/addLanguage41")
      @GET
      public Response addLanguage41() {
         return Response.ok(service.addLanguage41().toString()).build();  
      }
      @Path("/addLanguage5")
      @GET
      public Response addLanguage5() {
         return Response.ok(service.addLanguage5().toString()).build();  
      }
      @Path("/addLanguage42")
      @GET
      public Response addLanguage42() {
         return Response.ok(service.addLanguage42().toString()).build();  
      }
      @Path("/addLanguage4")
      @GET
      public Response addLanguage4() {
         return Response.ok(service.addLanguage4().toString()).build();  
      }
      @Path("/addLanguage3")
      @GET
      public Response addLanguage3() {
         return Response.ok(service.addLanguage3().toString()).build();  
      }
      @Path("/addLanguage2")
      @GET
      public Response addLanguage2() {
         return Response.ok(service.addLanguage2().toString()).build();  
      }
      @Path("/addLanguage1")
      @GET
      public Response addLanguage1() {
         return Response.ok(service.addLanguage1().toString()).build();  
      }
}