  export class OcUser {
      public user_id: Integer;
      public user_group_id: Integer;
      public username: String;
      public password: String;
      public salt: String;
      public firstname: String;
      public lastname: String;
      public email: String;
      public image: String;
      public code: String;
      public ip: String;
      public status: Boolean;
      public date_added: java.sql.Timestamp;

    constructor() {
    }
}