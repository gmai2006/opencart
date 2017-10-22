  export class GetreturnDTO {
      public ReturnId: number;
      public OrderId: number;
      public Firstname: string;
      public Lastname: string;
      public Email: string;
      public Telephone: string;
      public Product: string;
      public Model: string;
      public Quantity: number;
      public Opened: Boolean;
      public Comment: string;
      public DateOrdered: java.util.Date;
      public DateAdded: java.sql.Timestamp;
      public DateModified: java.sql.Timestamp;

    constructor() {
    }
}