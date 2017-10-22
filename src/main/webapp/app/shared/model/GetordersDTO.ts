  export class GetordersDTO {
      public OrderId: number;
      public Firstname: string;
      public Lastname: string;
      public Name: string;
      public DateAdded: java.sql.Timestamp;
      public Total: number;
      public CurrencyCode: string;
      public CurrencyValue: number;

    constructor() {
    }
}