package bleizing.rivaperawat.activity;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import java.util.HashMap;

import bleizing.rivaperawat.R;
import bleizing.rivaperawat.fragment.CatatanFragment;
import bleizing.rivaperawat.fragment.DetailOrderFragment;
import bleizing.rivaperawat.fragment.NavigasiFragment;
import bleizing.rivaperawat.fragment.PerawatanFragment;
import bleizing.rivaperawat.fragment.TimerFragment;

public class DetailOrderActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";

    private static final String FRAGMENT_CATATAN_TAG = "CatatanFragment";
    private static final String FRAGMENT_NAVIGASI_TAG = "NavigasiFragment";
    private static final String FRAGMENT_PERAWATAN_TAG = "PerawatanFragment";
    private static final String FRAGMENT_TIMER_TAG = "TimerFragment";

    private String last_title;

    private HashMap<Integer, String> hashMapTitle;

    private int countFragment = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_order);

        hashMapTitle = new HashMap<>();

        last_title = "";

        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.gradient_biru_biru));
        actionBar.setTitle("LOGIN");
        actionBar.setDisplayHomeAsUpEnabled(true);

        if (savedInstanceState == null) {
            DetailOrderFragment fragment = new DetailOrderFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, fragment, TAG).commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                goBack();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        goBack();
    }

    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    private void goBack() {
        FragmentManager fm = getSupportFragmentManager();
        if (fm.getBackStackEntryCount() > 0) {
            fm.popBackStack();

            countFragment--;
            setActionBarTitle(hashMapTitle.get(countFragment));
        } else {
            // app icon in action bar clicked; go home
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
    }

    public void changeToCatatanFragment() {
        last_title = getSupportActionBar().getTitle().toString();

        hashMapTitle.put(countFragment, last_title);
        countFragment++;

        CatatanFragment fragment = new CatatanFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment, FRAGMENT_CATATAN_TAG);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void changeToNavigasiFragment() {
        last_title = getSupportActionBar().getTitle().toString();

        hashMapTitle.put(countFragment, last_title);
        countFragment++;

        NavigasiFragment fragment = new NavigasiFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment, FRAGMENT_NAVIGASI_TAG);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void changeToPerawatanFragment() {
        last_title = getSupportActionBar().getTitle().toString();

        hashMapTitle.put(countFragment, last_title);
        countFragment++;

        PerawatanFragment fragment = new PerawatanFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment, FRAGMENT_PERAWATAN_TAG);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void changeToTimerFragment() {
        last_title = getSupportActionBar().getTitle().toString();

        hashMapTitle.put(countFragment, last_title);
        countFragment++;

        TimerFragment fragment = new TimerFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment, FRAGMENT_TIMER_TAG);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
