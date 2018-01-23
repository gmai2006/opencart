  export class OcCoupon {
      public coupon_id: Integer;
      public name: String;
      public code: String;
      public type: String;
      public discount: java.math.BigDecimal;
      public logged: Boolean;
      public shipping: Boolean;
      public total: java.math.BigDecimal;
      public date_start: java.util.Date;
      public date_end: java.util.Date;
      public uses_total: Integer;
      public uses_customer: String;
      public status: Boolean;
      public date_added: java.sql.Timestamp;

    constructor() {
    }
}