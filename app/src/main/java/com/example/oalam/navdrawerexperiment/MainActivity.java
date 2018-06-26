package com.example.oalam.navdrawerexperiment;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    DrawerLayout  mDrawerLayout;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

//        ActionBarDrawerToggle toggle =
//                new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
//                        R.string.navigation_drawer_open,
//                        R.string.navigation_drawer_close);
//        if (mDrawerLayout != null) {
//            mDrawerLayout.addDrawerListener(toggle);
//        }
//        toggle.syncState();

        NavigationView navigationView=(NavigationView)findViewById(R.id.nav_view);
         mDrawerLayout = findViewById(R.id.drawer_layout);
        if (navigationView != null) {
            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    // set item as selected to persist highlight
                    //item.setChecked(true);
                    switch (item.getItemId()){
                        case R.id.nav_camera:
                            // Handle the camera import action (for now display a toast).
                            mDrawerLayout.closeDrawer(GravityCompat.START);
                            Toast.makeText(MainActivity.this, "Camera", Toast.LENGTH_SHORT).show();
                            return true;
                        case R.id.nav_gallery:
                            // Handle the gallery action (for now display a toast).
                            mDrawerLayout.closeDrawer(GravityCompat.START);
                            Toast.makeText(MainActivity.this, "Galery", Toast.LENGTH_SHORT).show();

                            return true;
                        case R.id.nav_slideshow:
                            // Handle the slideshow action (for now display a toast).
                            mDrawerLayout.closeDrawer(GravityCompat.START);
                            Toast.makeText(MainActivity.this, "SlideShow", Toast.LENGTH_SHORT).show();

                            return true;
                        case R.id.nav_manage:
                            // Handle the tools action (for now display a toast).
                            mDrawerLayout.closeDrawer(GravityCompat.START);
                            Toast.makeText(MainActivity.this, "Manage", Toast.LENGTH_SHORT).show();

                            return true;
                        case R.id.nav_share:
                            // Handle the share action (for now display a toast).
                            mDrawerLayout.closeDrawer(GravityCompat.START);
                            Toast.makeText(MainActivity.this, "Share", Toast.LENGTH_SHORT).show();

                            return true;
                        case R.id.nav_send:
                            // Handle the send action (for now display a toast).
                            mDrawerLayout.closeDrawer(GravityCompat.START);
                            Toast.makeText(MainActivity.this, "Send", Toast.LENGTH_SHORT).show();

                            return true;
                        default:
                            return false;
                    }
                    // close drawer when item is tapped



                }
            });
        }
    }
}
