package labs.mikangali.androidcard;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class ActivityHome extends Activity
{
	final static String EXTRA_COLOR_ID = "EXTRA_CARD_COLOR";
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void onClick(View v){
        Intent intent = new Intent(getBaseContext(), ActivityCard.class);
        intent.putExtra(EXTRA_COLOR_ID, v.getId());
        startActivity(intent);
    }
}
