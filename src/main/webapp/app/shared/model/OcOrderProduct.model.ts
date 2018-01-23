  export class OcOrderProduct {
      public order_product_id: Integer;
      public order_id: Integer;
      public product_id: Integer;
      public name: String;
      public model: String;
      public quantity: Integer;
      public price: java.math.BigDecimal;
      public total: java.math.BigDecimal;
      public tax: java.math.BigDecimal;
      public reward: Integer;

    constructor() {
    }
}