package com.example.marcelojanke.facematch.WebRequest;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

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
                        Log.d("Naim",response);
                        Toast.makeText(context,response,Toast.LENGTH_LONG).show();

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context,error.toString(),Toast.LENGTH_LONG).show();


            }
        });

        requestQueue.add(request);
    }

}
