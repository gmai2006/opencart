package com.opencart.account;

import java.util.List;

import com.opencart.entity.*;

public interface ModelAccountDownloadDao {
   public java.math.BigInteger getTotalDownloads(Integer customer_id);

   public List<ModelAccountDownload0Dto> getDownloads(Integer customer_id,Integer language_id);

   public List<ModelAccountDownload1Dto> getDownload(Integer customer_id,Integer download_id);
}