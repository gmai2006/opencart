  export class OcOrderHistory {
      public order_history_id: Integer;
      public order_id: Integer;
      public order_status_id: Integer;
      public notify: Boolean;
      public comment: String;
      public date_added: java.sql.Timestamp;

    constructor() {
    }
}