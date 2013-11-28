package com.test.greetingandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Main extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void onClick(View v){
        Intent intent = new Intent(getBaseContext(), SignoutActivity.class);
        intent.putExtra("EXTRA_CARTON_ID", v.getId());
        startActivity(intent);
    }
}
