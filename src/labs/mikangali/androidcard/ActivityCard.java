package labs.mikangali.androidcard;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ActivityCard extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carton);
        
        View cardView = findViewById(R.id.cardlayout);
        
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            switch (extras.getInt(ActivityHome.EXTRA_COLOR_ID)) {
            
				case R.id.card_yellow:
					cardView.setBackground(getResources().getDrawable(R.drawable.btn_gradiant_yellow));
					break;
					
				case R.id.card_orange:
					cardView.setBackground(getResources().getDrawable(R.drawable.btn_gradiant_orange));
					break;
					
				case R.id.card_red:
					cardView.setBackground(getResources().getDrawable(R.drawable.btn_gradiant_red));
					break;
	
				default:
					Toast.makeText(this, getString(R.string.card_not_found), Toast.LENGTH_LONG).show();
					finish();
					break;
			}
        	
        }
    }
}
