package android.com.afadesigns.alcandroid;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {
    String uri="https://andela.com/alc/";
    WebView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);


        view=(WebView)findViewById(R.id.web);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl(uri);
        view.requestFocus();
    }
}
