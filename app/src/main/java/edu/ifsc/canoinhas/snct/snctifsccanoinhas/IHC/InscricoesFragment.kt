package edu.ifsc.canoinhas.snct.snctifsccanoinhas.IHC

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import edu.ifsc.canoinhas.snct.snctifsccanoinhas.R

/**
 * A simple [Fragment] subclass.
 */
class InscricoesFragment : Fragment() {

    lateinit var inscricoesWebView: WebView


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater!!.inflate(R.layout.fragment_inscricoes, container, false)

        inscricoesWebView = v.findViewById<View>(R.id.webViewInscricoes) as WebView
        inscricoesWebView.loadUrl("https://sigaa.ifsc.edu.br/sigaa/link/public/extensao/formInscricaoOnline?id=189&flag=true")
        val webSettings = inscricoesWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.setSupportZoom(false)

        inscricoesWebView.webViewClient = WebViewClient()

        return v
    }

}// Required empty public constructor
