package edu.ifsc.canoinhas.snct.snctifsccanoinhas.IHC

import android.app.AlertDialog
import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.AppBarLayout
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import edu.ifsc.canoinhas.snct.snctifsccanoinhas.R

/**
 * A simple [Fragment] subclass.
 */
class ApresentacaoFragment : Fragment() {

    private var appBar: AppBarLayout? = null
    private var tabs: TabLayout? = null
    private var viewPager: ViewPager? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.activity_apresentacao_fragment, container, false)

        val contenedor = container!!.parent as View
        appBar = contenedor.findViewById<View>(R.id.appbar) as AppBarLayout
        tabs = TabLayout(activity)
        tabs!!.setTabTextColors(Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF"))
        tabs!!.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"))
        appBar!!.addView(tabs)
        mensagem()
        viewPager = view.findViewById(R.id.pager)
        val pagerAdapter = ViewPagerAdapter(fragmentManager)
        viewPager!!.adapter = pagerAdapter
        tabs!!.setupWithViewPager(viewPager)
        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        appBar!!.removeView(tabs)
    }

    inner class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

        internal var tituloTabs = arrayOf("Dia 25/10", "Dia 26/10")

        override fun getItem(position: Int): Fragment? {

            when (position) {
                0 -> return ApresentacaoTrabalho_25_Fragment()
                1 -> return ApresentacaoTrabalho_26_Fragment()
            }
            return null
        }

        override fun getCount(): Int {
            return 2
        }

        override fun getPageTitle(position: Int): CharSequence {
            return tituloTabs[position]
        }
    }

    private fun mensagem() {
        val mensagem = AlertDialog.Builder(context).setTitle("Local de apresentação")
        mensagem.setMessage("Todos os trabalhos serão apresentados no auditório do IFSC")
        mensagem.setNeutralButton("Entendi", null)
        mensagem.show()
    }
}
