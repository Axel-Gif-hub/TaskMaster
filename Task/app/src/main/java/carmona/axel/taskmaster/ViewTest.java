package carmona.axel.taskmaster;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ViewTest extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_test);

        // Get the WebView from the layout XML
        webView = findViewById(R.id.webview);

        // Configure WebView settings
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Enable JavaScript support
        webSettings.setDomStorageEnabled(true); // Enable local storage

        // Set a custom WebViewClient to handle page navigation
        webView.setWebViewClient(new WebViewClient());

        // Load a web page into the WebView
        webView.loadUrl("n.sanchezcarlosjr.com/");
    }

    @Override
    public void onBackPressed() {
        // Check if the WebView can go back
        if (webView.canGoBack()) {
            // Go back in WebView's history
            webView.goBack();
        } else {
            // If the WebView cannot go back, proceed with normal back button behavior
            super.onBackPressed();
        }
    }
}