   // ApiService.java
   public interface ApiService {
       @GET("endpoint")
       Call<List<MyDataModel>> getData();
   }
