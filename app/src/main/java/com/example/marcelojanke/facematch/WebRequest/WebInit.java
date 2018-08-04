package com.example.marcelojanke.facematch.WebRequest;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class WebInit {
    private Context context;
    private String URL;

    public WebInit(Context context, String URL) {
        this.context = context;
        this.URL = URL;
    }


    public void Info(){
        RequestQueue requestQueue = Volley.newRequestQueue(this.context.getApplicationContext());
        StringRequest request = new StringRequest(Request.Method.GET, this.URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        requestQueue.add(request);
    }

}
