  export class OcCurrency {
      public currency_id: Integer;
      public title: String;
      public code: String;
      public symbol_left: String;
      public symbol_right: String;
      public decimal_place: String;
      public value: number;
      public status: Boolean;
      public date_modified: java.sql.Timestamp;

    constructor() {
    }
}