package satedshark.com.vk.minorityopinion;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GeneralActivity extends AppCompatActivity {

    private static final String INTENT_EXTRA_PLAYER = "intent_extra_player";

    private static ViewPager mViewPager;
    private static Player mMainPlayer;

    public static Intent getIntent(Context context, int numberPlayer){
        Intent intent = new Intent(context, GeneralActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        mMainPlayer = PlayerLab.get().getPlayer(numberPlayer);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        mViewPager = findViewById(R.id.general_container);

        FragmentManager fragmentManager = getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentStatePagerAdapter(fragmentManager) {
            @Override
            public Fragment getItem(int i) {
                Fragment fragment;
                switch (i){
                    case 0: fragment = new FristFragment();
                    break;
                    case 1: fragment = new SecondFragment();
                    break;
                    case 2: fragment = new ThirdFragment();
                    break;
                    default: return null;
                }
                return fragment;
            }

            @Override
            public int getCount() {
                return 3;
            }
        });
        //TODO Make ViewPager
    }
}
