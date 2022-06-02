<<<<<<< HEAD
package com.revature.subscription.models;

public class Sub {

   private String id;
   private String sub_name;
   private int price;
   private String user_id;

   public Sub() { super(); }

   public Sub(String id, String sub_name, int price, String user_id) {
      this.id = id;
      this.sub_name = sub_name;
      this.price = price;
      this.user_id = user_id;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getSub_name() {
      return sub_name;
   }

   public void setSub_name(String sub_name) {
      this.sub_name = sub_name;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public String getUser_id() {
      return user_id;
   }

   public void setUser_id(String user_id) {
      this.user_id = user_id;
   }

   @Override
   public String toString() {
      return "Sub{" +
              "id='" + id + '\'' +
              ", sub_name='" + sub_name + '\'' +
              ", price=" + price +
              ", user_id='" + user_id + '\'' +
              '}';
   }
=======
package com.revature.subscription.models;public class Sub {
>>>>>>> 6284209945c9f372959f13df25b4ea59254c8356
}
