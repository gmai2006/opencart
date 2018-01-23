  export class OcCustomerSearch {
      public customer_search_id: Integer;
      public store_id: Integer;
      public language_id: Integer;
      public customer_id: Integer;
      public keyword: String;
      public category_id: Integer;
      public sub_category: Boolean;
      public description: Boolean;
      public products: Integer;
      public ip: String;
      public date_added: java.sql.Timestamp;

    constructor() {
    }
}