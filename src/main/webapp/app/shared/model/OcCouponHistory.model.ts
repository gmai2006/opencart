  export class OcCouponHistory {
      public coupon_history_id: Integer;
      public coupon_id: Integer;
      public order_id: Integer;
      public customer_id: Integer;
      public amount: java.math.BigDecimal;
      public date_added: java.sql.Timestamp;

    constructor() {
    }
}