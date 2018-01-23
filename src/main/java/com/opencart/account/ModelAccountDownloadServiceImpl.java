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
public class ModelAccountDownloadServiceImpl implements ModelAccountDownloadService {

  private final static Logger logger = Logger.getLogger(ModelAccountDownloadServiceImpl.class.getName());
  private ModelAccountDownloadDao dao;

  @Inject
  protected ModelAccountDownloadServiceImpl(final ModelAccountDownloadDao rhs) {
      requireNonNull(rhs);
      this.dao = dao;
  }

  /**
   source file name:java.math.BigInteger
   */
  @Override
  public java.math.BigInteger getTotalDownloads(Integer customer_id) {
    logger.info("getTotalDownloads - entered");

    final java.math.BigInteger returnList = dao.getTotalDownloads(customer_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelAccountDownload0Dto
   */
  @Override
  public List<ModelAccountDownload0Dto> getDownloads(Integer customer_id,Integer language_id) {
    logger.info("getDownloads - entered");

    final List<ModelAccountDownload0Dto> returnList = dao.getDownloads(customer_id,language_id);

    logger.info(returnList.toString());

    return returnList;
  }

  /**
   source file name:ModelAccountDownload1Dto
   */
  @Override
  public List<ModelAccountDownload1Dto> getDownload(Integer customer_id,Integer download_id) {
    logger.info("getDownload - entered");

    final List<ModelAccountDownload1Dto> returnList = dao.getDownload(customer_id,download_id);

    logger.info(returnList.toString());

    return returnList;
  }
}