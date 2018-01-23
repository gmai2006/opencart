  export class OcReview {
      public review_id: Integer;
      public product_id: Integer;
      public customer_id: Integer;
      public author: String;
      public text: String;
      public rating: Integer;
      public status: Boolean;
      public date_added: java.sql.Timestamp;
      public date_modified: java.sql.Timestamp;

    constructor() {
    }
}