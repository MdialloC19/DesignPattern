public class President {
    private static President instance =null;
    private String login;
    private String code;


    private President(String login, String code){
        this.login=login;
        this.code=code;
    }

   public static synchronized President getInstance(String code, String login) {
      if (instance == null) {
         instance = new President(login, code);
      }
      return instance;
   }

   public String toString() {
    return "Login: " + login + "\nCode: " + code;
 }



}