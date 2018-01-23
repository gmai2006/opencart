/*************************************************************************
 *
 * DATASCIENCE9 LLC CONFIDENTIAL
 * __________________
 *
 *  [2018] Datascience9 LLC
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Datascience9 LLC and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Datascience9 LLC
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Datascience9 LLC.
 * @author Paul Mai - Datascience9 LLC
 */
package com.opencart.account;

import static java.util.Objects.requireNonNull;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import com.opencart.entity.*;
import com.opencart.entity.dao.*;

/**
* auto generated from SQL
*/
public class ModelAccountCustomFieldServiceImpl implements ModelAccountCustomFieldService {

  private final static Logger logger = Logger.getLogger(ModelAccountCustomFieldServiceImpl.class.getName());
  private ModelAccountCustomFieldDao dao;

  @Inject
  protected ModelAccountCustomFieldServiceImpl(final ModelAccountCustomFieldDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:ModelAccountCustomField0Dto
   */
  @Override
  public List<ModelAccountCustomField0Dto> getCustomFieldValueQuery(Integer custom_field_id,Integer language_id) {
    logger.info("getCustomFieldValueQuery - entered");

    final List<ModelAccountCustomField0Dto> returnList = dao.getCustomFieldValueQuery(custom_field_id,language_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelAccountCustomField1Dto
   */
  @Override
  public List<ModelAccountCustomField1Dto> getCustomFieldQuery(Integer language_id,Integer customer_group_id) {
    logger.info("getCustomFieldQuery - entered");

    final List<ModelAccountCustomField1Dto> returnList = dao.getCustomFieldQuery(language_id,customer_group_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelAccountCustomField2Dto
   */
  @Override
  public List<ModelAccountCustomField2Dto> getCustomField(Integer custom_field_id,Integer language_id) {
    logger.info("getCustomField - entered");

    final List<ModelAccountCustomField2Dto> returnList = dao.getCustomField(custom_field_id,language_id);

    logger.info(returnList.toString());

    return returnList;
  }
}