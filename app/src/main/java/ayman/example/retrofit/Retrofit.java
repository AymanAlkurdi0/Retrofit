package ayman.example.retrofit;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by zero on 1/16/2018.
 */
//todo:(4)identify interface of Retrofit which will content the method you have on the API
public interface Retrofit {

    //Ex: /liveEGP.asmx/pricesList?Currency_ID=1&authentication=aymanadmin123456

    @GET("/liveEGP.asmx/pricesList")
    public void getPrice(@Query("Currency_ID") int Currency_ID, @Query("authentication") String authentication, Callback<ObjectDataObject> callback);


    // @GET("/liveEGP.asmx/pricesList"); the type of method and url(Name) of it

    //@Query("Currency_ID") int Currency_ID, @Query("authentication") String authentication; the parameter

    //Callback<ObjectDataObject> callback; <ObjectDataObject> type of the callback it's depend of the API response


}
