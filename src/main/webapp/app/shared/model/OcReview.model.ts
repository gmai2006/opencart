  export class OcReview {
      public reviewId: number;
      public dateAdded: java.sql.Timestamp;
      public dateModified: java.sql.Timestamp;
      public author: string;
      public productId: number;
      public rating: number;
      public text: string;
      public customerId: number;
      public status: Boolean;

    constructor() {
    }
}