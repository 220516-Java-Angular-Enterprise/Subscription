<<<<<<< HEAD
package com.revature.subscription.models;

public class Order {
=======
<<<<<<< HEAD
package com.revature.subscription.models;

public class Order {

    private String id;
    private int totalSale;
    private String user_id;
    private String subs_id;

    public Order() { super(); }

    public Order(String id, int totalSale, String user_id, String subs_id) {
        this.id = id;
        this.totalSale = totalSale;
        this.user_id = user_id;
        this.subs_id = subs_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(int totalSale) {
        this.totalSale = totalSale;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getSubs_id() {
        return subs_id;
    }

    public void setSubs_id(String subs_id) {
        this.subs_id = subs_id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", totalSale=" + totalSale +
                ", user_id='" + user_id + '\'' +
                ", subs_id='" + subs_id + '\'' +
                '}';
    }
=======
package com.revature.subscription.models;public class Order {
>>>>>>> 6284209945c9f372959f13df25b4ea59254c8356
>>>>>>> f0cc6cd9e86be6247d8efe3b47113f24b179bc02
}
