  export class OcOrderRecurring {
      public order_recurring_id: Integer;
      public order_id: Integer;
      public reference: String;
      public product_id: Integer;
      public product_name: String;
      public product_quantity: Integer;
      public recurring_id: Integer;
      public recurring_name: String;
      public recurring_description: String;
      public recurring_frequency: String;
      public recurring_cycle: Short;
      public recurring_duration: Short;
      public recurring_price: java.math.BigDecimal;
      public trial: Boolean;
      public trial_frequency: String;
      public trial_cycle: Short;
      public trial_duration: Short;
      public trial_price: java.math.BigDecimal;
      public status: Byte;
      public date_added: java.sql.Timestamp;

    constructor() {
    }
}