   // MainActivity.java
   Retrofit retrofit = new Retrofit.Builder()
           .baseUrl("https://api.example.com/")
           .addConverterFactory(GsonConverterFactory.create())
           .build();

   ApiService apiService = retrofit.create(ApiService.class);

   apiService.getData().enqueue(new Callback<List<MyDataModel>>() {
       @Override
       public void onResponse(Call<List<MyDataModel>> call, Response<List<MyDataModel>> response) {
           if (response.isSuccessful()) {
               List<MyDataModel> data = response.body();
               // Proses data
           }
       }

       @Override
       public void onFailure(Call<List<MyDataModel>> call, Throwable t) {
           // Tangani kesalahan
       }
   });
