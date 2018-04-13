package labs.a.s.database_test;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm=getSupportFragmentManager();
    }

    public void insertdata(View view) {
        FragmentTransaction transaction=fm.beginTransaction();
        InsertFragment insert=new InsertFragment();
        transaction.replace(R.id.activity_main_layout,insert,"two");
        transaction.commit();
    }

    public void deletedata(View view) {
        FragmentTransaction transaction=fm.beginTransaction();
        DeleteFragment del=new DeleteFragment();
        transaction.replace(R.id.activity_main_layout,del,"two");
        transaction.commit();
    }



    public void Updatedata(View view) {
        FragmentTransaction transaction=fm.beginTransaction();
        UpdateFragment up=new UpdateFragment();
        transaction.replace(R.id.activity_main_layout,up,"two");
        transaction.commit();
    }

    public void Searchdata(View view) {
        FragmentTransaction transaction=fm.beginTransaction();
        SearchFragment ser=new SearchFragment();
        transaction.replace(R.id.activity_main_layout,ser,"two");
        transaction.commit();
    }
}
