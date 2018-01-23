  export class OcProductOptionValue {
      public product_option_value_id: Integer;
      public product_option_id: Integer;
      public product_id: Integer;
      public option_id: Integer;
      public option_value_id: Integer;
      public quantity: Integer;
      public subtract: Boolean;
      public price: java.math.BigDecimal;
      public price_prefix: String;
      public points: Integer;
      public points_prefix: String;
      public weight: java.math.BigDecimal;
      public weight_prefix: String;

    constructor() {
    }
}