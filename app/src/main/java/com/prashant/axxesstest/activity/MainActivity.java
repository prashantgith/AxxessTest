package com.prashant.axxesstest.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.prashant.axxesstest.R;
import com.prashant.axxesstest.adapter.ShapeAdapter;
import com.prashant.axxesstest.app.ApiClient;
import com.prashant.axxesstest.app.ApiInterface;
import com.prashant.axxesstest.model.ApiResponse.Datum;
import com.prashant.axxesstest.utils.CommonUtils;
import com.prashant.axxesstest.utils.TransparentProgressDialog;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//23/7
public class MainActivity extends AppCompatActivity
{
    private String TAG = MainActivity.class.getSimpleName();
    private ImageView ivSearch;
    private EditText etSearch;
    private GridView gvData;
    private ShapeAdapter shapeAdapter;
    private ArrayList<Datum> data;
    private LinearLayout llTool;
    private boolean exit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivSearch = findViewById(R.id.img_search);
        etSearch = findViewById(R.id.edt_search);
        gvData = findViewById(R.id.gv_data);
        llTool = findViewById(R.id.ll_tool);
        data = new ArrayList<>();


        ivSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CommonUtils.isNetworkConnected(MainActivity.this))
                {
                    etSearch.clearFocus();
                    if(etSearch.getText().toString().length() > 0)
                    {
                        callApi();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,getResources().getString(R.string.write_something),Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this,getResources().getString(R.string.check_internet),Toast.LENGTH_LONG).show();
                }
            }
        });

        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        data = savedInstanceState.getParcelableArrayList("data");
        shapeAdapter = new ShapeAdapter(MainActivity.this, R.layout.row_shape, data);
        gvData.setAdapter(shapeAdapter);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelableArrayList("data", data);
    }


    //Fetching data from server
    private void callApi()
    {
        if(data.size() > 0 )
        {
            data.clear();
        }

        final TransparentProgressDialog progressDialog = new TransparentProgressDialog(MainActivity.this);
        progressDialog.show();
        progressDialog.setCancelable(false);

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

        Call<com.prashant.axxesstest.model.ApiResponse.Response> call = apiInterface.getResponse("vanilla","Client-ID 137cda6b5008a7c");

        call.enqueue(new Callback<com.prashant.axxesstest.model.ApiResponse.Response>() {
            @Override
            public void onResponse(Call<com.prashant.axxesstest.model.ApiResponse.Response> call, Response<com.prashant.axxesstest.model.ApiResponse.Response> response) {
                progressDialog.dismiss();
                if(response.code() == 200) {
                    Log.e(TAG, "onResponse: " + response.body().getSuccess());
                    data.addAll(response.body().getData());
                    shapeAdapter = new ShapeAdapter(MainActivity.this, R.layout.row_shape, data);
                    gvData.setAdapter(shapeAdapter);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),getResources().getString(R.string.something_went_wrong),Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<com.prashant.axxesstest.model.ApiResponse.Response> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(getApplicationContext(),getResources().getString(R.string.unable_load_data),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onBackPressed()
    {
            if (exit)
            {
                System.exit(0);
            }
            else
            {
                Toast.makeText(this, getResources().getString(R.string.exit),Toast.LENGTH_SHORT).show();
                exit = true;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        exit = false;
                    }
                }, 3 * 1000);
            }
        
    }

}
