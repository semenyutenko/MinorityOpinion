package satedshark.com.vk.minorityopinion;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PassFragment extends Fragment implements View.OnClickListener {

    private EditText mEditLogin;
    private EditText mEditPassword;
    private Button mButtonLogIn;
    private Button mButtonSignUp;
    private Button mButtonCloseApplication;
    private PlayerLab playerLab;

    public PassFragment() {
        // Required empty public constructor
    }
    public static PassFragment newInstance() {
        PassFragment fragment = new PassFragment();
        return fragment;
    }

    public static void showToast(Context context, String string){
        Toast toast = Toast.makeText(context, string, Toast.LENGTH_LONG);
        ViewGroup group = (ViewGroup) toast.getView();
        TextView textView = (TextView) group.getChildAt(0);
        textView.setTextSize(30);
        toast.show();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pass, container, false);

        mEditLogin = view.findViewById(R.id.edit_login);
        mEditPassword = view.findViewById(R.id.edit_password);
        mButtonLogIn = view.findViewById(R.id.button_log_in);
        mButtonSignUp = view.findViewById(R.id.button_sign_up);
        mButtonCloseApplication = view.findViewById(R.id.button_close_application);
        playerLab = PlayerLab.get();

        mButtonLogIn.setOnClickListener(this);
        mButtonCloseApplication.setOnClickListener(this);
        mButtonSignUp.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case (R.id.button_log_in): {
                int playerNumber = playerLab.isLegal(mEditLogin.getText().toString(), mEditPassword.getText().toString());
                if(playerNumber >= 0){
                    showToast(getActivity(), "ACCESSED");
                    startActivity(GeneralActivity.getIntent(getActivity(), playerNumber));
                    FragmentManager manager = getFragmentManager();
                    manager.beginTransaction().remove(this).commit();
                }
                else showToast(getActivity(), "IT WON'T WORK");
                break;
            }
            case (R.id.button_close_application): {
                getActivity().finish();
                break;
            }
            case (R.id.button_sign_up):{
                PlayerLab.get().newPlayer(mEditLogin.getText().toString(), mEditPassword.getText().toString());
                showToast(getActivity(), "A PLAYER WAS ADDED");
                break;
            }
        }

    }
}
