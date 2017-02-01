package com.opencart.catalog.dao.model.account;

import javax.ws.rs.core.Response;

public interface ModelAccountRewardDAO {
  public Response getTotalPoints(  Integer Points);
  public Response getTotalRewards();
}