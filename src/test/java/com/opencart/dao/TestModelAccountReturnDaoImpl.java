package com.opencart.dao;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.*;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Module;
import com.opencart.GoogleGuiceTest;
import com.opencart.entity.*;
import com.opencart.util.JsonUtils;

import com.opencart.account.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;


public class TestModelAccountReturnDaoImpl extends GoogleGuiceTest {

  @Inject
  ModelAccountReturnDaoImpl dao;

  @Override
  protected Module getTestModule() {
    return new AbstractModule() {
        @Override
        protected void configure() {
            bind(ModelAccountReturnDaoImpl.class);
        }
    };
  }

  /* *
   * SELECT r.return_id, r.order_id, r.firstname, r.lastname, rs.name as status, r.date_added FROM "oc_return" r LEFT JOIN oc_return_status rs ON (r.return_status_id = rs.return_status_id) WHERE r.customer_id = 'param0' AND rs.language_id = 'param1' ORDER BY r.return_id DESC LIMIT param2,param3 
   */
  @Test
  public void testgetReturns() throws Exception {

    Integer customer_id = 0;
    Integer language_id = null;

    List<ModelAccountReturn0Dto> result = dao.getReturns(customer_id, language_id);
    assertThat("getReturns", result, notNullValue());
  }

  /* *
   * SELECT COUNT(*) AS total FROM "oc_return" WHERE customer_id = 'param0' 
   */
  @Test
  public void testgetTotalReturns() throws Exception {
    Integer customer_id = 0;
    java.math.BigInteger result = dao.getTotalReturns(customer_id);
    assertThat("getTotalReturns", result, notNullValue());
  }

  /* *
   * SELECT rh.date_added, rs.name AS status, rh.comment FROM oc_return_history rh LEFT JOIN oc_return_status rs ON rh.return_status_id = rs.return_status_id WHERE rh.return_id = 'param0' AND rs.language_id = 'param1' ORDER BY rh.date_added ASC 
   */
  @Test
  public void testgetReturnHistories() throws Exception {

    Integer return_id = 0;
    Integer language_id = null;

    List<ModelAccountReturn1Dto> result = dao.getReturnHistories(return_id, language_id);
    assertThat("getReturnHistories", result, notNullValue());
  }

  /* *
   * SELECT r.return_id, r.order_id, r.firstname, r.lastname, r.email, r.telephone, r.product, r.model, r.quantity, r.opened, (SELECT rr.name FROM oc_return_reason rr WHERE rr.return_reason_id = r.return_reason_id AND rr.language_id = 'param0') AS reason, (SELECT ra.name FROM oc_return_action ra WHERE ra.return_action_id = r.return_action_id AND ra.language_id = 'param1') AS action, (SELECT rs.name FROM oc_return_status rs WHERE rs.return_status_id = r.return_status_id AND rs.language_id = 'param2') AS status, r.comment, r.date_ordered, r.date_added, r.date_modified FROM "oc_return" r WHERE r.return_id = 'param3' AND r.customer_id = 'param4' 
   */
  @Test
  public void testgetReturn() throws Exception {

    String language_id = null;
    Integer return_id = 1;
    Integer customer_id = 0;

    List<ModelAccountReturn2Dto> result = dao.getReturn(language_id, return_id, customer_id);
    assertThat("getReturn", result, notNullValue());
  }
}