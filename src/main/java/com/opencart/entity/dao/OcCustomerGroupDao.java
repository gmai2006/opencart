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

package com.opencart.entity.dao;
import java.util.List;
import com.opencart.entity.*;

public interface OcCustomerGroupDao {

    public List<OcCustomerGroup> select(int maxResult);

    public List<OcCustomerGroup> selectAll();

    public OcCustomerGroup create(OcCustomerGroup e);

    public OcCustomerGroup update(OcCustomerGroup e);

    public void delete(OcCustomerGroup e);
}