package ayman.example.retrofit;

import android.util.Log;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by zero on 1/17/2018.
 */

public class Presenter {

    //todo:(5)identify The method for calling it
   void requestPrice(String url, String authentication, int currencey){

        //pass the url
       RestAdapter restAdapter = new RestAdapter.Builder()
               .setEndpoint(url)
               .build();

       //pass interface
       Retrofit inter = restAdapter.create(Retrofit.class);
       //call the method
       inter.getPrice(currencey, authentication, new Callback<ObjectDataObject>() {
           @Override
           public void success(ObjectDataObject ayNodes, Response response) {
            //on success
               Log.e("inter.getPrice", "success " + response.getStatus());
               Log.e("inter.getPrice", "success And ChangeTime : " + ayNodes.dataModes[0].getChangeTime());
           }

           @Override
           public void failure(RetrofitError error) {
               //on failure
               Log.e("inter.getPrice", "failure " + error.getMessage());
           }

       });
   }
   }

