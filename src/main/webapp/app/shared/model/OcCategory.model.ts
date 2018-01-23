  export class OcCategory {
      public category_id: Integer;
      public image: String;
      public parent_id: Integer;
      public top: Boolean;
      public column: Integer;
      public sort_order: Integer;
      public status: Boolean;
      public date_added: java.sql.Timestamp;
      public date_modified: java.sql.Timestamp;

    constructor() {
    }
}