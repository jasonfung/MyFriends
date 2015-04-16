package com.ebookfrenzy.myfriends;

        import android.content.Intent;
        import android.support.v7.app.ActionBarActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.TextView;

        import org.w3c.dom.Text;


public class Result extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String name = getIntent().getStringExtra("name");

        String phone = getIntent().getStringExtra("phone");
        String email = getIntent().getStringExtra("email");
        setContentView(R.layout.activity_result);

        TextView nameTextView = (TextView) findViewById(R.id.textView);
        nameTextView.setText(name);

        TextView emailTextView = (TextView) findViewById(R.id.textView2);
        emailTextView.setText(email);

        TextView phoneTextView = (TextView) findViewById(R.id.textView3);
        phoneTextView.setText(phone);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId()) {

            case R.id.menuOne:
                Intent intent1 = new Intent(Result.this, About.class);
                startActivity(intent1);
                return true;
            case R.id.menuTwo:
                Intent intent2 = new Intent(Result.this, Help.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }

    }
}