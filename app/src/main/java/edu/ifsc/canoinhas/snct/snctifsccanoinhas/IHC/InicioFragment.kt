package edu.ifsc.canoinhas.snct.snctifsccanoinhas.IHC

import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.widget.SwipeRefreshLayout
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

    internal lateinit var srl_swipe : SwipeRefreshLayout
    internal lateinit var view : View
    internal lateinit var inicioWebView: WebView

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        view = inflater!!.inflate(R.layout.fragment_inicio, container, false)
        srl_swipe = view.findViewById(R.id.srl_swipe)
        inicioWebView = view.findViewById(R.id.webViewInicio)

        if(estaConectado(view.context)){
            chamaLayoutComConexao(inicioWebView)
        }
        else{
            chamaLayoutSemConexao(inicioWebView)
        }

        srl_swipe.setOnRefreshListener(object : SwipeRefreshLayout.OnRefreshListener {
            override fun onRefresh() {
                if(estaConectado(view.context)){
                    chamaLayoutComConexao(inicioWebView)
                }
                else{
                    chamaLayoutSemConexao(inicioWebView)
                }
            }
        })

        return view
    }

    fun estaConectado(context: Context): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if (connectivityManager.activeNetworkInfo != null
                && connectivityManager.activeNetworkInfo.isAvailable
                && connectivityManager.activeNetworkInfo.isConnected) {
            return true
        } else {
            return false
        }
    }
    fun chamaLayoutComConexao(webView: WebView){

        webView.loadUrl("file:///android_asset/twitter.html")
        webView.getSettings().setJavaScriptEnabled(true)
        webView.getSettings().setAppCacheEnabled(true)

        srl_swipe.isRefreshing = true
        webView.webViewClient = object : WebViewClient() {

            override fun onPageFinished(view: WebView, url: String) {
                srl_swipe.isRefreshing = false
            }

        }

    }
    fun chamaLayoutSemConexao(webView: WebView){


        webView.loadUrl("file:///android_asset/inicio_sem_internet.html")
        webView.getSettings().setJavaScriptEnabled(true)
        webView.getSettings().setAppCacheEnabled(true)

        srl_swipe.isRefreshing = true
        webView.webViewClient = object : WebViewClient() {

            override fun onPageFinished(view: WebView, url: String) {
                srl_swipe.isRefreshing = false
            }

        }

    }

}
