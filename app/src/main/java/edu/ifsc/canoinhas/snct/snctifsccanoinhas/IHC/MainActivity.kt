package edu.ifsc.canoinhas.snct.snctifsccanoinhas.IHC

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import android.support.v4.widget.DrawerLayout
import android.view.View
import edu.ifsc.canoinhas.snct.snctifsccanoinhas.R

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val inicioFragment = InicioFragment()
        val manager = supportFragmentManager
        manager.beginTransaction().replace(R.id.mainLayout, inicioFragment).commit()

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            val inicioFragment = InicioFragment()
            val manager = supportFragmentManager
            manager.beginTransaction().replace(R.id.mainLayout, inicioFragment).commit()
            supportActionBar!!.title = "SNCT 2017"
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val id = item.itemId
        var barra = "IFSC Canoinhas"

        if (id == R.id.nav_programacao) {
            val programacaoFragment = ProgramacaoFragment()
            val manager = supportFragmentManager
            manager.beginTransaction().replace(R.id.mainLayout, programacaoFragment).commit()
            //inicio_selecionado = true
            barra = "Início"

        } else if (id == R.id.nav_inicio) {
            val inicioFragment = InicioFragment()
            val manager = supportFragmentManager
            manager.beginTransaction().replace(R.id.mainLayout, inicioFragment).commit()
            //inicio_selecionado = true
            barra = "Início"


        }
        else if (id == R.id.nav_apresentacao_trabalho) {
            val apresentacaoFragment = ApresentacaoFragment()
            val manager = supportFragmentManager
            manager.beginTransaction().replace(R.id.mainLayout, apresentacaoFragment).commit()
            //inicio_selecionado = true
            //barra = "Início"

        }  else if (id == R.id.nav_inscricoes) {
            val inscricoesFragment = InscricoesFragment()
            val manager = supportFragmentManager
            manager.beginTransaction().replace(R.id.mainLayout, inscricoesFragment).commit()
           // barra = "Inscrições"
            // inicio_selecionado = false

        }/* else if (id == R.id.nav_programacao) {

            val programacaoFragment = ProgramacaoFragment()
            val manager = supportFragmentManager
            manager.beginTransaction().replace(R.id.mainLayout, programacaoFragment).commit()
            barra = "Programação"
            inicio_selecionado = false

        } else if (id == R.id.nav_avalie_evento) {
            val avalieEventoFragment = AvalieEventoFragment()
            val manager = supportFragmentManager
            manager.beginTransaction().replace(R.id.mainLayout, avalieEventoFragment).commit()
            barra = "Avalie o Evento"
            inicio_selecionado = false

        }*/ else if (id == R.id.nav_sobreAplicativo) {
            val sobreAplicativoFragment = SobreAplicativoFragment()
            val manager = supportFragmentManager
            manager.beginTransaction().replace(R.id.mainLayout, sobreAplicativoFragment).commit()
            //barra = "Sobre o Aplicativo"
            //inicio_selecionado = false

        } else if (id == R.id.nav_sobreEvento) {
            val sobreSNCTFragment = SobreSNCTFragment()
            val manager = supportFragmentManager
            manager.beginTransaction().replace(R.id.mainLayout, sobreSNCTFragment).commit()
            //barra = "Sobre o Evento"
            //inicio_selecionado = false

        }  else if (id == R.id.nav_local) {
            val localFragment = LocalFragment()
            val manager = supportFragmentManager
            manager.beginTransaction().replace(R.id.mainLayout, localFragment).commit()
            //barra = "Local"
            //inicio_selecionado = false
        }
       // supportActionBar!!.title = barra
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
}


