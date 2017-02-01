  export class OcCoupon {
      public code: string;
      public discount: number;
      public dateEnd: java.util.Date;
      public type: string;
      public dateAdded: java.sql.Timestamp;
      public total: number;
      public dateStart: java.util.Date;
      public couponId: number;
      public shipping: Boolean;
      public usesTotal: number;
      public logged: Boolean;
      public name: string;
      public usesCustomer: string;
      public status: Boolean;

    constructor() {
    }
}