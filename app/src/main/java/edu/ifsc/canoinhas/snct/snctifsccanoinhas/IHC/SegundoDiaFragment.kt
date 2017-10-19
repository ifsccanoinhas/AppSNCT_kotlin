package edu.ifsc.canoinhas.snct.snctifsccanoinhas.IHC

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import edu.ifsc.canoinhas.snct.snctifsccanoinhas.R

import java.util.ArrayList
import java.util.HashMap

/**
 * A simple [Fragment] subclass.
 */
class SegundoDiaFragment : Fragment() {

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
        return v
    }

    private fun prepareListData() {
        listDataHeader = ArrayList<String>()
        listDataChild = HashMap<String, List<String>>()
        // Adding child data
        listDataHeader.add("08:30 - 11:45")
        listDataHeader.add("13:30 - 17:00")
        listDataHeader.add("18:45 - 22:00")
        // Adding child data
        val horario1 = ArrayList<String>()
        horario1.add("Evento: Apresentações e socialização de trabalhos e projetos desenvolvidos nas escolas municipais, estaduais e no IFSC Câmpus Canoinhas\nLocal: Auditório")
        horario1.add("Evento: Oficina\nTema: Criptografia Simples\nResponsável: Profª Carla\nLocal: Sala 05")
        horario1.add("Evento: Oficina\nTema: GPS - Curiosidades e facilidades para a agricultura\nResponsável: Prof Lauro\nLocal: Sala 11")
        horario1.add("Evento: Oficina\nTema: Construção do pluviômetro e aproveitamento de água da chuva\nResponsável: Prof Jeferson Schick\nLocal: Sala 15")
        horario1.add("Evento: Oficina\nTema: Cálculo de traços de concreto\nResponsável: Profª Rosângela\nLocal: Laboratório de solos")
        horario1.add("Evento: Oficina\nTema: A ciência do bem-estar na vida prática\nResponsável: Profª Maressa\nLocal: Sala 24")
        horario1.add("Evento: Oficina\nTema: Montagem caseira de minhocário\nResponsável: Alunos de agroecologia\nLocal: Sala 01")
        horario1.add("Evento: Oficina\nTema: Preparo de microrganismos eficazes\nResponsável: Alunos de agroecologia\nLocal: Laboratório de produção vegetal")
        horario1.add("Evento: Oficina\nTema: Replantio de verduras\nResponsável: Alunos de agroecologia\nLocal: Sala 02")
        val horario2 = ArrayList<String>()
        horario2.add("Evento: Apresentações e socialização de trabalhos e projetos desenvolvidos nas escolas municipais, estaduais e no IFSC Câmpus Canoinhas\nLocal: Auditório")
        horario2.add("Evento: Oficina\nTema: Torre de palitos\nResponsável: Prof Manassés\nLocal: Laboratório de elétrica")
        horario2.add("Evento: Oficina\nTema: Phyton\nResponsável: Prof Lucas\nLocal: Sala 02")
        horario2.add("Evento: Oficina\nTema: Programação matemática\nResponsável: Prof Lucas\nLocal: Laboratório de Informática 13")
        horario2.add("Evento: Oficina\nTema: Determinação da quantidade de sódio nos alimentos\nResponsável: Profª Joyce e Profª Priscila\nLocal: Laboratório de alimentos")
        horario2.add("Evento: Oficina\nTema: Groma egípcia\nResponsável: Profª Daiane\nLocal: Laboratório de solos")
        horario2.add("Evento: Oficina\nTema: Fazendo arte com matemática\nResponsável: Profª Carla\nLocal: Laboratório de informática 14    ")
        val horario3 = ArrayList<String>()
        horario3.add("Evento: Palestra\nTema: Quando a topologia encontra a física\nPalestrante: Prof. Gustavo Machado Monteiro - UNICAMP\nLocal: Auditório")
        horario3.add("Evento: Palestra\nTema: Amigo ou inimigo? O glutem na intolerância alimentar e na doença celíaca\nPalestrante: Prof. Patrícia - IFSC Câmpus Canoinhas\nLocal: Auditório")
        horario3.add("Evento: Palestra e apresentação musical\nTema: Com licença matemática\nPalestrante: Prof. Felipe Moron Escanhoela - IFSC Câmpus Joinville\nLocal: Auditório")
        listDataChild.put(listDataHeader[0], horario1) // Header, Child data
        listDataChild.put(listDataHeader[1], horario2)
        listDataChild.put(listDataHeader[2], horario3) // Header, Child data
    }

}
