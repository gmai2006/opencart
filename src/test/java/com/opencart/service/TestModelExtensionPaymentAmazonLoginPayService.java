package com.opencart.service;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.*;
import org.junit.Before;

import static org.mockito.Mockito.*;
import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Module;
import com.opencart.GoogleGuiceTest;
import com.opencart.entity.*;
import com.opencart.util.JsonUtils;

import com.opencart.extension.payment.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelExtensionPaymentAmazonLoginPayService  {
  @Mock
  ModelExtensionPaymentAmazonLoginPayDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelExtensionPaymentAmazonLoginPayServiceImpl service;

  @Before
  public void before() {
    service = new ModelExtensionPaymentAmazonLoginPayServiceImpl(dao);
  }

  /* *
   * SELECT a FROM "oc_address"  a WHERE "firstname" = 'param0' AND "lastname" = 'param1' AND "address_1" = 'param2' AND "address_2" = 'param3' AND "postcode" = 'param4' AND "city" = 'param5' AND "zone_id" = 'param6' AND "country_id" = 'param7'  
   */
  @Test
  public void testaddAddress() throws Exception {

    List<OcAddress> list = mock(List.class);

    String firstname = "s";
    String lastname = "s";
    String address_1 = "s";
    String address_2 = "s";
    String postcode = "s";
    String city = "s";
    Integer zone_id = 0;
    Integer country_id = 0;

    when(dao.addAddress(firstname, lastname, address_1, address_2, postcode, city, zone_id, country_id)).thenReturn(list);

    List<OcAddress> result = dao.addAddress(firstname, lastname, address_1, address_2, postcode, city, zone_id, country_id);

    assertThat("$methodName$()", result, notNullValue());
  }
}