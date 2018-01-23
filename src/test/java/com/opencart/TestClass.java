package com.opencart;

import com.google.inject.AbstractModule;
import com.google.inject.Module;

public class TestClass extends GoogleGuiceTest {
	
//	  @Inject
//	  ModelAccountAddressDaoImpl dao;
//	  
//	  @Inject
//	  ModelAccountOrderDaoImpl anotherDao;

	  @Override
	  protected Module getTestModule() {
	    return new AbstractModule() {
	        @Override
	        protected void configure() {
//	            bind(ModelAccountAddressDaoImpl.class);
//	            bind(ModelAccountOrderDaoImpl.class);
	        }
	    };
	  }
//
//	  @Test
//	  public void testgetAddresses() throws Exception {
//	  	Integer customer_id = 1;
//	    List<OcAddress> result = dao.getQuery(customer_id);
//	    assertThat("getQuery", result, notNullValue());
////	    assertTrue("getQuery", result.size() > 0);
//	  }
	  
}
