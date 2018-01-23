  export class OcCustomerTransaction {
      public customer_transaction_id: Integer;
      public customer_id: Integer;
      public order_id: Integer;
      public description: String;
      public amount: java.math.BigDecimal;
      public date_added: java.sql.Timestamp;

    constructor() {
    }
}