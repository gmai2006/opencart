package com.opencart.admin.rest;


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

import com.opencart.admin.dao.*;

import com.opencart.admin.model.*;

/**
 * Auto generated RESTful class
 * @author paul
 */

@Path("/ModelCatalogProduct")
@Stateless
@Produces({MediaType.APPLICATION_JSON})
public class ModelCatalogProductResource {
  Log logger = LogFactory.getLog(ModelCatalogProductResource.class);

  @Inject
  ModelCatalogProductDAOImpl service;

      @Path("/getProductAttributes1")
      @GET
      public Response getProductAttributes1() {
         return Response.ok(service.getProductAttributes1().toString()).build();  
      }
      @Path("/deleteProduct19")
      @GET
      public Response deleteProduct19() {
         return Response.ok(service.deleteProduct19().toString()).build();  
      }
      @Path("/deleteProduct17")
      @GET
      public Response deleteProduct17() {
         return Response.ok(service.deleteProduct17().toString()).build();  
      }
      @Path("/deleteProduct15")
      @GET
      public Response deleteProduct15() {
         return Response.ok(service.deleteProduct15().toString()).build();  
      }
      @Path("/deleteProduct16")
      @GET
      public Response deleteProduct16() {
         return Response.ok(service.deleteProduct16().toString()).build();  
      }
      @Path("/deleteProduct13")
      @GET
      public Response deleteProduct13() {
         return Response.ok(service.deleteProduct13().toString()).build();  
      }
      @Path("/deleteProduct14")
      @GET
      public Response deleteProduct14() {
         return Response.ok(service.deleteProduct14().toString()).build();  
      }
      @Path("/getTotalProductsByAttributeId")
      @GET
      public Response getTotalProductsByAttributeId() {
         return Response.ok(service.getTotalProductsByAttributeId().toString()).build();  
      }
      @Path("/deleteProduct11")
      @GET
      public Response deleteProduct11() {
         return Response.ok(service.deleteProduct11().toString()).build();  
      }
      @Path("/deleteProduct12")
      @GET
      public Response deleteProduct12() {
         return Response.ok(service.deleteProduct12().toString()).build();  
      }
      @Path("/deleteProduct10")
      @GET
      public Response deleteProduct10() {
         return Response.ok(service.deleteProduct10().toString()).build();  
      }
      @Path("/getProductRewards")
      @GET
      public Response getProductRewards() {
         return Response.ok(service.getProductRewards().toString()).build();  
      }
      @Path("/deleteProduct1")
      @GET
      public Response deleteProduct1() {
         return Response.ok(service.deleteProduct1().toString()).build();  
      }
      @Path("/deleteProduct3")
      @GET
      public Response deleteProduct3() {
         return Response.ok(service.deleteProduct3().toString()).build();  
      }
      @Path("/deleteProduct2")
      @GET
      public Response deleteProduct2() {
         return Response.ok(service.deleteProduct2().toString()).build();  
      }
      @Path("/getTotalProductsByTaxClassId")
      @GET
      public Response getTotalProductsByTaxClassId() {
         return Response.ok(service.getTotalProductsByTaxClassId().toString()).build();  
      }
      @Path("/getTotalProductsByLengthClassId")
      @GET
      public Response getTotalProductsByLengthClassId() {
         return Response.ok(service.getTotalProductsByLengthClassId().toString()).build();  
      }
      @Path("/deleteProduct9")
      @GET
      public Response deleteProduct9() {
         return Response.ok(service.deleteProduct9().toString()).build();  
      }
      @Path("/deleteProduct8")
      @GET
      public Response deleteProduct8() {
         return Response.ok(service.deleteProduct8().toString()).build();  
      }
      @Path("/getProductCategories")
      @GET
      public Response getProductCategories() {
         return Response.ok(service.getProductCategories().toString()).build();  
      }
      @Path("/deleteProduct5")
      @GET
      public Response deleteProduct5() {
         return Response.ok(service.deleteProduct5().toString()).build();  
      }
      @Path("/deleteProduct4")
      @GET
      public Response deleteProduct4() {
         return Response.ok(service.deleteProduct4().toString()).build();  
      }
      @Path("/deleteProduct7")
      @GET
      public Response deleteProduct7() {
         return Response.ok(service.deleteProduct7().toString()).build();  
      }
      @Path("/deleteProduct6")
      @GET
      public Response deleteProduct6() {
         return Response.ok(service.deleteProduct6().toString()).build();  
      }
      @Path("/editProduct39")
      @GET
      public Response editProduct39() {
         return Response.ok(service.editProduct39().toString()).build();  
      }
      @Path("/getProductDiscounts")
      @GET
      public Response getProductDiscounts() {
         return Response.ok(service.getProductDiscounts().toString()).build();  
      }
      @Path("/editProduct38")
      @GET
      public Response editProduct38() {
         return Response.ok(service.editProduct38().toString()).build();  
      }
      @Path("/getTotalProductsByWeightClassId")
      @GET
      public Response getTotalProductsByWeightClassId() {
         return Response.ok(service.getTotalProductsByWeightClassId().toString()).build();  
      }
      @Path("/getTotalProductsByOptionId")
      @GET
      public Response getTotalProductsByOptionId() {
         return Response.ok(service.getTotalProductsByOptionId().toString()).build();  
      }
      @Path("/addProduct")
      @GET
      public Response addProduct() {
         return Response.ok(service.addProduct().toString()).build();  
      }
      @Path("/getProductStores")
      @GET
      public Response getProductStores() {
         return Response.ok(service.getProductStores().toString()).build();  
      }
      @Path("/getProductOptions1")
      @GET
      public Response getProductOptions1() {
         return Response.ok(service.getProductOptions1().toString()).build();  
      }
      @Path("/editProduct31")
      @GET
      public Response editProduct31() {
         return Response.ok(service.editProduct31().toString()).build();  
      }
      @Path("/editProduct30")
      @GET
      public Response editProduct30() {
         return Response.ok(service.editProduct30().toString()).build();  
      }
      @Path("/editProduct35")
      @GET
      public Response editProduct35() {
         return Response.ok(service.editProduct35().toString()).build();  
      }
      @Path("/editProduct34")
      @GET
      public Response editProduct34() {
         return Response.ok(service.editProduct34().toString()).build();  
      }
      @Path("/editProduct33")
      @GET
      public Response editProduct33() {
         return Response.ok(service.editProduct33().toString()).build();  
      }
      @Path("/editProduct32")
      @GET
      public Response editProduct32() {
         return Response.ok(service.editProduct32().toString()).build();  
      }
      @Path("/editProduct")
      @GET
      public Response editProduct() {
         return Response.ok(service.editProduct().toString()).build();  
      }
      @Path("/getProductDescriptions")
      @GET
      public Response getProductDescriptions() {
         return Response.ok(service.getProductDescriptions().toString()).build();  
      }
      @Path("/getProductOptionValue")
      @GET
      public Response getProductOptionValue(  @QueryParam("OptionValueId")  Integer OptionValueId) {
         return Response.ok(service.getProductOptionValue(OptionValueId).toString()).build();  
      }
      @Path("/getTotalProductsByDownloadId")
      @GET
      public Response getTotalProductsByDownloadId() {
         return Response.ok(service.getTotalProductsByDownloadId().toString()).build();  
      }
      @Path("/editProduct28")
      @GET
      public Response editProduct28() {
         return Response.ok(service.editProduct28().toString()).build();  
      }
      @Path("/editProduct27")
      @GET
      public Response editProduct27() {
         return Response.ok(service.editProduct27().toString()).build();  
      }
      @Path("/editProduct26")
      @GET
      public Response editProduct26() {
         return Response.ok(service.editProduct26().toString()).build();  
      }
      @Path("/editProduct25")
      @GET
      public Response editProduct25() {
         return Response.ok(service.editProduct25().toString()).build();  
      }
      @Path("/getProductDownloads")
      @GET
      public Response getProductDownloads() {
         return Response.ok(service.getProductDownloads().toString()).build();  
      }
      @Path("/editProduct29")
      @GET
      public Response editProduct29() {
         return Response.ok(service.editProduct29().toString()).build();  
      }
      @Path("/editProduct20")
      @GET
      public Response editProduct20() {
         return Response.ok(service.editProduct20().toString()).build();  
      }
      @Path("/editProduct24")
      @GET
      public Response editProduct24() {
         return Response.ok(service.editProduct24().toString()).build();  
      }
      @Path("/editProduct23")
      @GET
      public Response editProduct23() {
         return Response.ok(service.editProduct23().toString()).build();  
      }
      @Path("/editProduct22")
      @GET
      public Response editProduct22() {
         return Response.ok(service.editProduct22().toString()).build();  
      }
      @Path("/getRecurrings")
      @GET
      public Response getRecurrings() {
         return Response.ok(service.getRecurrings().toString()).build();  
      }
      @Path("/editProduct21")
      @GET
      public Response editProduct21() {
         return Response.ok(service.editProduct21().toString()).build();  
      }
      @Path("/editProduct17")
      @GET
      public Response editProduct17() {
         return Response.ok(service.editProduct17().toString()).build();  
      }
      @Path("/getProductOptions")
      @GET
      public Response getProductOptions() {
         return Response.ok(service.getProductOptions().toString()).build();  
      }
      @Path("/editProduct16")
      @GET
      public Response editProduct16() {
         return Response.ok(service.editProduct16().toString()).build();  
      }
      @Path("/editProduct15")
      @GET
      public Response editProduct15() {
         return Response.ok(service.editProduct15().toString()).build();  
      }
      @Path("/editProduct14")
      @GET
      public Response editProduct14() {
         return Response.ok(service.editProduct14().toString()).build();  
      }
      @Path("/getProductImages")
      @GET
      public Response getProductImages() {
         return Response.ok(service.getProductImages().toString()).build();  
      }
      @Path("/getProductAttributes")
      @GET
      public Response getProductAttributes(  @QueryParam("AttributeId")  Integer AttributeId) {
         return Response.ok(service.getProductAttributes(AttributeId).toString()).build();  
      }
      @Path("/editProduct19")
      @GET
      public Response editProduct19() {
         return Response.ok(service.editProduct19().toString()).build();  
      }
      @Path("/editProduct18")
      @GET
      public Response editProduct18() {
         return Response.ok(service.editProduct18().toString()).build();  
      }
      @Path("/editProduct13")
      @GET
      public Response editProduct13() {
         return Response.ok(service.editProduct13().toString()).build();  
      }
      @Path("/editProduct12")
      @GET
      public Response editProduct12() {
         return Response.ok(service.editProduct12().toString()).build();  
      }
      @Path("/editProduct11")
      @GET
      public Response editProduct11() {
         return Response.ok(service.editProduct11().toString()).build();  
      }
      @Path("/editProduct10")
      @GET
      public Response editProduct10() {
         return Response.ok(service.editProduct10().toString()).build();  
      }
      @Path("/getProductsByCategoryId")
      @GET
      public Response getProductsByCategoryId() {
         return Response.ok(service.getProductsByCategoryId().toString()).build();  
      }
      @Path("/getTotalProductsByLayoutId")
      @GET
      public Response getTotalProductsByLayoutId() {
         return Response.ok(service.getTotalProductsByLayoutId().toString()).build();  
      }
      @Path("/deleteProduct")
      @GET
      public Response deleteProduct() {
         return Response.ok(service.deleteProduct().toString()).build();  
      }
      @Path("/addProduct19")
      @GET
      public Response addProduct19() {
         return Response.ok(service.addProduct19().toString()).build();  
      }
      @Path("/addProduct17")
      @GET
      public Response addProduct17() {
         return Response.ok(service.addProduct17().toString()).build();  
      }
      @Path("/addProduct18")
      @GET
      public Response addProduct18() {
         return Response.ok(service.addProduct18().toString()).build();  
      }
      @Path("/addProduct15")
      @GET
      public Response addProduct15() {
         return Response.ok(service.addProduct15().toString()).build();  
      }
      @Path("/addProduct16")
      @GET
      public Response addProduct16() {
         return Response.ok(service.addProduct16().toString()).build();  
      }
      @Path("/addProduct13")
      @GET
      public Response addProduct13() {
         return Response.ok(service.addProduct13().toString()).build();  
      }
      @Path("/addProduct14")
      @GET
      public Response addProduct14() {
         return Response.ok(service.addProduct14().toString()).build();  
      }
      @Path("/getProductFilters")
      @GET
      public Response getProductFilters() {
         return Response.ok(service.getProductFilters().toString()).build();  
      }
      @Path("/getProductRelated")
      @GET
      public Response getProductRelated() {
         return Response.ok(service.getProductRelated().toString()).build();  
      }
      @Path("/getTotalProductsByManufacturerId")
      @GET
      public Response getTotalProductsByManufacturerId() {
         return Response.ok(service.getTotalProductsByManufacturerId().toString()).build();  
      }
      @Path("/getProductLayouts")
      @GET
      public Response getProductLayouts() {
         return Response.ok(service.getProductLayouts().toString()).build();  
      }
      @Path("/getProductSpecials")
      @GET
      public Response getProductSpecials() {
         return Response.ok(service.getProductSpecials().toString()).build();  
      }
      @Path("/addProduct11")
      @GET
      public Response addProduct11() {
         return Response.ok(service.addProduct11().toString()).build();  
      }
      @Path("/addProduct12")
      @GET
      public Response addProduct12() {
         return Response.ok(service.addProduct12().toString()).build();  
      }
      @Path("/addProduct10")
      @GET
      public Response addProduct10() {
         return Response.ok(service.addProduct10().toString()).build();  
      }
      @Path("/editProduct8")
      @GET
      public Response editProduct8() {
         return Response.ok(service.editProduct8().toString()).build();  
      }
      @Path("/editProduct7")
      @GET
      public Response editProduct7() {
         return Response.ok(service.editProduct7().toString()).build();  
      }
      @Path("/editProduct6")
      @GET
      public Response editProduct6() {
         return Response.ok(service.editProduct6().toString()).build();  
      }
      @Path("/getTotalProductsByProfileId")
      @GET
      public Response getTotalProductsByProfileId() {
         return Response.ok(service.getTotalProductsByProfileId().toString()).build();  
      }
      @Path("/editProduct5")
      @GET
      public Response editProduct5() {
         return Response.ok(service.editProduct5().toString()).build();  
      }
      @Path("/editProduct9")
      @GET
      public Response editProduct9() {
         return Response.ok(service.editProduct9().toString()).build();  
      }
      @Path("/copyProduct")
      @GET
      public Response copyProduct() {
         return Response.ok(service.copyProduct().toString()).build();  
      }
      @Path("/addProduct23")
      @GET
      public Response addProduct23() {
         return Response.ok(service.addProduct23().toString()).build();  
      }
      @Path("/addProduct20")
      @GET
      public Response addProduct20() {
         return Response.ok(service.addProduct20().toString()).build();  
      }
      @Path("/addProduct21")
      @GET
      public Response addProduct21() {
         return Response.ok(service.addProduct21().toString()).build();  
      }
      @Path("/editProduct4")
      @GET
      public Response editProduct4() {
         return Response.ok(service.editProduct4().toString()).build();  
      }
      @Path("/editProduct3")
      @GET
      public Response editProduct3() {
         return Response.ok(service.editProduct3().toString()).build();  
      }
      @Path("/editProduct2")
      @GET
      public Response editProduct2() {
         return Response.ok(service.editProduct2().toString()).build();  
      }
      @Path("/getTotalProductsByStockStatusId")
      @GET
      public Response getTotalProductsByStockStatusId() {
         return Response.ok(service.getTotalProductsByStockStatusId().toString()).build();  
      }
      @Path("/editProduct1")
      @GET
      public Response editProduct1() {
         return Response.ok(service.editProduct1().toString()).build();  
      }
      @Path("/addProduct7")
      @GET
      public Response addProduct7() {
         return Response.ok(service.addProduct7().toString()).build();  
      }
      @Path("/addProduct6")
      @GET
      public Response addProduct6() {
         return Response.ok(service.addProduct6().toString()).build();  
      }
      @Path("/addProduct9")
      @GET
      public Response addProduct9() {
         return Response.ok(service.addProduct9().toString()).build();  
      }
      @Path("/addProduct8")
      @GET
      public Response addProduct8() {
         return Response.ok(service.addProduct8().toString()).build();  
      }
      @Path("/addProduct1")
      @GET
      public Response addProduct1() {
         return Response.ok(service.addProduct1().toString()).build();  
      }
      @Path("/addProduct3")
      @GET
      public Response addProduct3() {
         return Response.ok(service.addProduct3().toString()).build();  
      }
      @Path("/addProduct2")
      @GET
      public Response addProduct2() {
         return Response.ok(service.addProduct2().toString()).build();  
      }
      @Path("/addProduct5")
      @GET
      public Response addProduct5() {
         return Response.ok(service.addProduct5().toString()).build();  
      }
      @Path("/addProduct4")
      @GET
      public Response addProduct4() {
         return Response.ok(service.addProduct4().toString()).build();  
      }
}