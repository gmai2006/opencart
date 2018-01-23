package com.opencart.extension.total;

import java.util.List;

import com.opencart.entity.*;

public interface ModelExtensionTotalVoucherDao {
   public List<Integer> getOrderQuery(Integer order_id);

   public List<ModelExtensionTotalVoucher0Dto> getVoucherQuery(String code,Integer language_id);

   public List<Integer> getOrderVoucherQuery(Integer order_id,Integer voucher_id);

   public java.math.BigDecimal getVoucherHistoryQuery(Integer voucher_id);
}