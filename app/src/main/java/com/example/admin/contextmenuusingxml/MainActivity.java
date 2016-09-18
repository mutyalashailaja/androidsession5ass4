package com.example.admin.contextmenuusingxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView ContextMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView ContextMenu=(TextView)findViewById(R.id.contextmenu);
        registerForContextMenu(ContextMenu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Context Menu");

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);



    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        int id=item.getItemId();
        if(id==R.id.item1){
            Toast.makeText(this,"this is action1",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.item2){
            Toast.makeText(this,"this is action2",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.item3){
            Toast.makeText(this,"this is action3",Toast.LENGTH_SHORT).show();
        }

        return true;
    }
}
