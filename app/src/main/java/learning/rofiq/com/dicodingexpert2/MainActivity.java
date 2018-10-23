package learning.rofiq.com.dicodingexpert2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnMoveActivity, activityWithData, activityWithObject;
    private Button btnDial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = (Button)findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        activityWithData = (Button)findViewById(R.id.btn_move_with_data);
        activityWithData.setOnClickListener(this);

        activityWithObject= (Button)findViewById(R.id.btn_move_with_object);
        activityWithObject.setOnClickListener(this);

        btnDial = (Button)findViewById(R.id.btn_dialNumber);
        btnDial.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_with_data:
                Intent moveWithData = new Intent(MainActivity.this, ActivityWithData.class);
                moveWithData.putExtra(ActivityWithData.EXTRA_NAME,"Dicoding Boy");
                moveWithData.putExtra(ActivityWithData.EXTRA_AGE,"5");
                startActivity(moveWithData);
                break;
            case R.id.btn_move_with_object:
                Person mPerson = new Person();
                mPerson.setName("Dicoding Boy");
                mPerson.setAge(5);
                mPerson.setEmail("academy@dicoding.com");
                mPerson.setCity("Bandung");
                Intent moveWithObject = new Intent(MainActivity.this, activityWithObject.class);
                moveWithObject.putExtra(learning.rofiq.com.dicodingexpert2.activityWithObject.EXTRA_PERSON,mPerson);
                startActivity(moveWithObject);
                break;
            case R.id.btn_dialNumber:
                String PhoneNumber = "085748939721";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " +PhoneNumber));
                startActivity(dialPhoneIntent);
        }
    }
}
