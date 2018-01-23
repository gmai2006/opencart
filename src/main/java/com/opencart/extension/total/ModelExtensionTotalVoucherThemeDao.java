package com.opencart.extension.total;

import java.util.List;

import com.opencart.entity.*;

public interface ModelExtensionTotalVoucherThemeDao {
   public List<ModelExtensionTotalVoucherTheme0Dto> getVoucherThemes(Integer language_id);

   public List<ModelExtensionTotalVoucherTheme0Dto> getVoucherTheme(Integer voucher_theme_id,Integer language_id);
}