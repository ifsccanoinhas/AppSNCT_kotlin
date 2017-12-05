package edu.ifsc.canoinhas.snct.snctifsccanoinhas.IHC

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import edu.ifsc.canoinhas.snct.snctifsccanoinhas.R

import java.util.ArrayList
import java.util.HashMap

/**
 * A simple [Fragment] subclass.
 */
class SegundoDiaFragment : Fragment() {//Segundo Dia OK

    internal lateinit var listAdapter: ExpandableListAdapter
    internal lateinit var expListView: ExpandableListView
    internal lateinit var listDataHeader: MutableList<String>
    internal lateinit var listDataChild: HashMap<String, List<String>>

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater!!.inflate(R.layout.activity_segundo_dia_fragment, container, false)

        expListView = v.findViewById<View>(R.id.segundoDia) as ExpandableListView
        prepareListData()
        listAdapter = ExpandableListAdapter(activity, listDataHeader, listDataChild)
        expListView.setAdapter(listAdapter)
        expListView.expandGroup(0)
        expListView.expandGroup(1)
        expListView.expandGroup(2)


        expListView.onItemClickListener
        return v
    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {
        return super.onContextItemSelected(item)
    }
    private fun prepareListData() {
        listDataHeader = ArrayList<String>()
        listDataChild = HashMap<String, List<String>>()
        // Adding child data
        listDataHeader.add("08:15 - 12:00") // manhã
        listDataHeader.add("13:30 - 17:00") // tarde
        listDataHeader.add("18:45 - 22:00") // noite
        // Adding child data
        val horario1 = ArrayList<String>() // eventos manhã
        horario1.add("Evento: Apresentações e socialização de trabalhos e projetos desenvolvidos nas escolas municipais, estaduais e no IFSC Câmpus Canoinhas\nLocal: Auditório")
        horario1.add("Evento: Oficina\nTema: Criptografia Simples\nResponsável: Profª Carla\nVagas: FECHADO")
        horario1.add("Evento: Oficina\nTema: GPS - Curiosidades e facilidades para a agricultura\nResponsável: Prof Lauro\nVagas: FECHADO")
        horario1.add("Evento: Oficina\nTema: Entenda sua conta de luz usando a matemática\nResponsável: Prof. Everto Follador e Profª Barbara Prust\nVagas: FECHADO")
        horario1.add("Evento: Oficina\nTema: Scratch – Ensino de programação para crianças\nResponsável: Fernanda Machado Belem e João Paulo Zorek\nVagas: FECHADO")
        horario1.add("Evento: Oficina\nTema: Construção do pluviômetro e aproveitamento de água da chuva\nResponsável: Prof Jefferson Schick\nVagas: FECHADO")
        horario1.add("Evento: Oficina\nTema: Cálculo de traços de concreto\nResponsável: Profª Rosângela\nVagas: FECHADO")
        horario1.add("Evento: Oficina\nTema: A ciência do bem-estar na vida prática\nResponsável: Profª Maressa\nVagas: 4")
        horario1.add("Evento: Oficina\nTema: Caldas no controle de pragas\nResponsável: Profª Magali\nVagas: 4")
        horario1.add("Evento: Oficina\nTema: Montagem caseira de minhocário\nResponsável: Alunos de agroecologia\nVagas: FECHADO")
        horario1.add("Evento: Oficina\nTema: Preparo de microrganismos eficazes\nResponsável: Alunos de agroecologia\nVagas: 8")
        horario1.add("Evento: Oficina\nTema: Replantio de vegetais\nResponsável: Alunos de agroecologia\nVagas: FECHADO")
        horario1.add("Evento: Oficina\nTema: Produção de cerveja artesanal (1ª parte)\nRestrição: Exclusiva para maiores de 18 anos\nResponsável: Paula Moreira, Maiara Fragoso e Professor Joel Souza\nVagas: 11")
        val horario2 = ArrayList<String>() // eventos tarde
        horario2.add("Evento: Apresentações e socialização de trabalhos e projetos desenvolvidos nas escolas municipais, estaduais e no IFSC Câmpus Canoinhas\nLocal: Auditório")
        horario2.add("Evento: Oficina\nTema: Torre de palitos\nResponsável: Prof Manassés\nVagas: FECHADO")
        horario2.add("Evento: Oficina\nTema: Python Para OBI (Olimpíada Brasileira de Informática)\nResponsável: Prof Lucas\nVagas: FECHADO")
        horario2.add("Evento: Oficina\nTema: Programação matemática\nResponsável: Prof Lucas\nVagas: FECHADO")
        horario2.add("Evento: Oficina\nTema: Determinação da quantidade de sódio nos alimentos\nResponsável: Profª Joyce e Profª Priscila\nVagas: 5")
        horario2.add("Evento: Oficina\nTema: Groma egípcia\nResponsável: Profª Daiane\nVagas: 5")
        horario2.add("Evento: Oficina\nTema: Fazendo arte com matemática\nResponsável: Profª Carla\nVagas: FECHADO")
        horario2.add("Evento: Oficina\nTema: Produção de cerveja artesanal (2ª parte)\nRestrição: Exclusiva para maiores de 18 anos\nResponsável: Paula Moreira, Maiara Fragoso e Professor Joel Souza\nVagas 11")
        val horario3 = ArrayList<String>() // eventos noite
        horario3.add("Evento: Palestra\nTema: Quando a topologia encontra a física\nPalestrante: Prof. Gustavo Machado Monteiro - UNICAMP\nLocal: Auditório")
        horario3.add("Evento: Palestra\nTema: Amigo ou inimigo? O glutem na intolerância alimentar e na doença celíaca\nPalestrante: Prof. Patrícia Maria Fritsch - IFSC Câmpus Canoinhas\nLocal: Auditório")
        horario3.add("Evento: Palestra e apresentação musical\nTema: Com licença matemática\nPalestrantes e apresentação musical: Prof. Felipe Moron Escanhoela - IFSC Câmpus Joinville\nFrancis Saibel(IFSC Canoinhas)\nIgor Guterres Faria(IFSC Canoinhas)\nMaurício Tomaselli (Canoinhas)\nLocal: Auditório")
        listDataChild.put(listDataHeader[0], horario1) // Header, Child data
        listDataChild.put(listDataHeader[1], horario2)
        listDataChild.put(listDataHeader[2], horario3) // Header, Child data


    }

}
