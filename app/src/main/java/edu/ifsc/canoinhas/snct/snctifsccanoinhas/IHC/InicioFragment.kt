package edu.ifsc.canoinhas.snct.snctifsccanoinhas.IHC

import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import edu.ifsc.canoinhas.snct.snctifsccanoinhas.R


/**
 * A simple [Fragment] subclass.
 */
class InicioFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var v = inflater!!.inflate(R.layout.fragment_inicio, container, false)

        if (verificaConexao(v.context)) {
            v = inflater.inflate(R.layout.fragment_inicio_internet, container, false)
            val twitterWebView : WebView = v.findViewById(R.id.webViewTwitter)

            val html = "            <a class=\"twitter-timeline\"  href=\"https://twitter.com/hashtag/SNCT\" data-widget-id=\"921086101850386432\">SNCT Tweets</a>\n" +
                    "            <script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+\"://platform.twitter.com/widgets.js\";fjs.parentNode.insertBefore(js,fjs);}}(document,\"script\",\"twitter-wjs\");</script>\n" +
                    "          "
            twitterWebView.loadData(html, "text/html", "UTF-8")
            val webSettings = twitterWebView.settings
            webSettings.javaScriptEnabled = true
            webSettings.setSupportZoom(false)

            twitterWebView.webViewClient = WebViewClient()
        }

        return v
    }

    fun verificaConexao(context: Context): Boolean {
        val conectado: Boolean
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if (connectivityManager.activeNetworkInfo != null
                && connectivityManager.activeNetworkInfo.isAvailable
                && connectivityManager.activeNetworkInfo.isConnected) {
            conectado = true
        } else {
            conectado = false
        }
        return conectado
    }



}// Required empty public constructor
