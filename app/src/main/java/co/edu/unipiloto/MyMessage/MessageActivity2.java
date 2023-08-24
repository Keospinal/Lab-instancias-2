package co.edu.unipiloto.MyMessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MessageActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message2);

        Intent intent=getIntent();
        String temp= intent.getStringExtra("mensaje");
        TextView mess = (TextView)findViewById(R.id.Mensaje);
        mess.setText(temp);
    }

    public void EnviarMensaje(View view) {
        EditText Messageview = (EditText)findViewById(R.id.message);
        String temp = Messageview.getText().toString();
        Intent intent=new Intent(this, MessageActivity2.class);
        intent.putExtra("mensaje",temp);
        startActivity(intent);

    }
}