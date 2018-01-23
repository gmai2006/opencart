package com.opencart.tool;

import java.util.List;
import com.opencart.entity.*;

public interface ModelToolUploadService {
   public List<OcUpload> getUploadByCode(String code);
}