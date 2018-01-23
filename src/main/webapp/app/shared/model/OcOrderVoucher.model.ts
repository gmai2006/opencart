  export class OcOrderVoucher {
      public order_voucher_id: Integer;
      public order_id: Integer;
      public voucher_id: Integer;
      public description: String;
      public code: String;
      public from_name: String;
      public from_email: String;
      public to_name: String;
      public to_email: String;
      public voucher_theme_id: Integer;
      public message: String;
      public amount: java.math.BigDecimal;

    constructor() {
    }
}