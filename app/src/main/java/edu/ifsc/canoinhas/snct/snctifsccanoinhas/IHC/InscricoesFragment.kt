package edu.ifsc.canoinhas.snct.snctifsccanoinhas.IHC

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.widget.SwipeRefreshLayout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import edu.ifsc.canoinhas.snct.snctifsccanoinhas.R

/**
 * A simple [Fragment] subclass.
 */
class InscricoesFragment : Fragment() {

    lateinit var inscricoesWebView: WebView
    lateinit var swipe: SwipeRefreshLayout
    internal lateinit var view : View



    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        view = inflater!!.inflate(R.layout.fragment_inscricoes, container, false)

        swipe = view.findViewById(R.id.srl_swipe_inscricoes)
        swipe.setOnRefreshListener { carregaPagina() }

        carregaPagina()

        return view
    }

    fun carregaPagina(){
        inscricoesWebView = view.findViewById(R.id.webViewInscricoes)
        inscricoesWebView.settings.javaScriptEnabled = true
        inscricoesWebView.settings.setAppCacheEnabled(true)
        inscricoesWebView.loadUrl("https://sigaa.ifsc.edu.br/sigaa/link/public/extensao/formInscricaoOnline?id=189&flag=true")
        swipe.isRefreshing = true
        inscricoesWebView.webViewClient = object : WebViewClient() {

            override fun onReceivedError(view: WebView, errorCode: Int, description: String, failingUrl: String) {

                inscricoesWebView.loadUrl("file:///android_asset/error.html")
            }

            override fun onPageFinished(view: WebView, url: String) {
                swipe.isRefreshing = false
            }

        }
    }


}