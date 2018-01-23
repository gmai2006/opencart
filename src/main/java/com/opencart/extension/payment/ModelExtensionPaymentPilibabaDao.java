package com.opencart.extension.payment;

import java.util.List;

import com.opencart.entity.*;

public interface ModelExtensionPaymentPilibabaDao {
   public java.math.BigDecimal getOrderTaxAmount(Integer order_id);
}