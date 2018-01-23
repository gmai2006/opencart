  export class OcReturn {
      public return_id: Integer;
      public order_id: Integer;
      public product_id: Integer;
      public customer_id: Integer;
      public firstname: String;
      public lastname: String;
      public email: String;
      public telephone: String;
      public product: String;
      public model: String;
      public quantity: Integer;
      public opened: Boolean;
      public return_reason_id: Integer;
      public return_action_id: Integer;
      public return_status_id: Integer;
      public comment: String;
      public date_ordered: java.util.Date;
      public date_added: java.sql.Timestamp;
      public date_modified: java.sql.Timestamp;

    constructor() {
    }
}