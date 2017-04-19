package com.desmond.squarecamera;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class CameraActivity extends AppCompatActivity {
    public static final String TAG = CameraActivity.class.getSimpleName();
    public static final String CAMERA_ERROR = "camera_error";
    public static final int RESULT_ERROR = -2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.squarecamera__CameraFullScreenTheme);
        super.onCreate(savedInstanceState);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.squarecamera__activity_camera);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, CameraFragment.newInstance(), CameraFragment.TAG)
                    .commit();
        }
    }

    public void returnPhotoUri(Uri uri) {
        Intent data = new Intent();
        data.setData(uri);
        setResultAndFinish(RESULT_OK, data);
    }

    public void returnError(Throwable t) {
        Intent data = new Intent();
        data.putExtra(CAMERA_ERROR, t);
        setResultAndFinish(RESULT_ERROR, data);
    }


    private void setResultAndFinish(int resultCode, Intent intent){
        if (getParent() == null) {
            setResult(resultCode, intent);
        } else {
            getParent().setResult(resultCode, intent);
        }

        finish();
    }



    public void onCancel(View view) {
        getSupportFragmentManager().popBackStack();
    }
}
