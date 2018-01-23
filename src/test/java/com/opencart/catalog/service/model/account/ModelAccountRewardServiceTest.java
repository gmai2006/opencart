package com.opencart.catalog.service.model.account;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.opencart.model.*;
import com.opencart.catalog.dao.model.account.ModelAccountRewardDAO;
import com.opencart.catalog.model.*;

public class ModelAccountRewardServiceTest {
  @Mock
  ModelAccountRewardDAO dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  @Test
  public void testgetTotalPoints() throws Exception {
    ModelAccountRewardService service = new ModelAccountRewardServiceImpl(dao);

    GettotalpointsDTO bean = mock(GettotalpointsDTO.class);
    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.getTotalPoints(customerid)).thenReturn(Arrays.asList(bean));

    List<GettotalpointsDTO> result = service.getTotalPoints(customerid);

    assertThat("getTotalPoints()", result, notNullValue());
    assertThat("getTotalPoints()", result.size(), is(1));
  }
  @Test
  public void testgetTotalRewards() throws Exception {
    ModelAccountRewardService service = new ModelAccountRewardServiceImpl(dao);

    GettotalrewardsDTO bean = mock(GettotalrewardsDTO.class);
    //replace these null with real values from DB 
    Integer customerid = null;

    when(dao.getTotalRewards(customerid)).thenReturn(Arrays.asList(bean));

    List<GettotalrewardsDTO> result = service.getTotalRewards(customerid);

    assertThat("getTotalRewards()", result, notNullValue());
    assertThat("getTotalRewards()", result.size(), is(1));
  }
}