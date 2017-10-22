  export class OcOrderRecurring {
      public orderRecurringId: number;
      public recurringId: number;
      public recurringDuration: number;
      public recurringPrice: Float;
      public productName: string;
      public productQuantity: number;
      public trial: Boolean;
      public reference: string;
      public dateAdded: java.sql.Timestamp;
      public trialPrice: Float;
      public productId: number;
      public recurringFrequency: string;
      public recurringName: string;
      public trialCycle: number;
      public orderId: number;
      public recurringCycle: number;
      public trialFrequency: string;
      public recurringDescription: string;
      public trialDuration: number;
      public status: number;

    constructor() {
    }
}