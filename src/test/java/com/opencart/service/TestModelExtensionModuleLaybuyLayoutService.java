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

import com.opencart.extension.module.*;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

public class TestModelExtensionModuleLaybuyLayoutService  {
  @Mock
  ModelExtensionModuleLaybuyLayoutDao dao;

  @Rule
  public MockitoRule mockitoRule = MockitoJUnit.rule();

  ModelExtensionModuleLaybuyLayoutServiceImpl service;

  @Before
  public void before() {
    service = new ModelExtensionModuleLaybuyLayoutServiceImpl(dao);
  }

}