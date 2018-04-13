package labs.a.s.database_test;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class InsertFragment extends Fragment {


    public InsertFragment() {
        // Required empty public constructor
    }

View view;
    Button add;
    EditText pid,pquantity,pprice;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_insert, container, false);

        add=(Button)view.findViewById(R.id.add_button);
        pid=(EditText)view.findViewById(R.id.product_id);
        pprice=(EditText)view.findViewById(R.id.product_price);
        pquantity=(EditText)view.findViewById(R.id.product_quantity);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            DatabaseHelper dh=new DatabaseHelper(getContext());
            User users = new User();
            users.setmId(Integer.parseInt(pid.getText().toString()));
            users.setmPrice(Integer.parseInt(pprice.getText().toString()));
            users.setmQuantity(Integer.parseInt(pquantity.getText().toString()));
            long l = dh.Add_User(users);
            if(l<0)
            {
                Toast.makeText(getActivity(),"Sucess",Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(getActivity(),"Sucess",Toast.LENGTH_LONG).show();
            }
            }
        });
        return view;
    }

}
