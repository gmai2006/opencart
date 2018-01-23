  export class OcCustomer {
      public customer_id: Integer;
      public customer_group_id: Integer;
      public store_id: Integer;
      public language_id: Integer;
      public firstname: String;
      public lastname: String;
      public email: String;
      public telephone: String;
      public fax: String;
      public password: String;
      public salt: String;
      public cart: String;
      public wishlist: String;
      public newsletter: Boolean;
      public address_id: Integer;
      public custom_field: String;
      public ip: String;
      public status: Boolean;
      public approved: Boolean;
      public safe: Boolean;
      public token: String;
      public code: String;
      public date_added: java.sql.Timestamp;

    constructor() {
    }
}