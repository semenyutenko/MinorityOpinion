package satedshark.com.vk.minorityopinion;


import android.os.Bundle;
import android.support.v4.app.Fragment;

public class MainActivity extends SingleFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    Fragment createFragment() {
        return PassFragment.newInstance();
    }

}
