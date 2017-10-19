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
class TerceiroDiaFragment : Fragment() {

    internal lateinit var listAdapter: ExpandableListAdapter
    internal lateinit var expListView: ExpandableListView
    internal lateinit var listDataHeader: MutableList<String>
    internal lateinit var listDataChild: HashMap<String, List<String>>

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val v = inflater!!.inflate(R.layout.activity_terceiro_dia_fragment, container, false)

        expListView = v.findViewById<View>(R.id.terceiroDia) as ExpandableListView
        prepareListData()
        listAdapter = ExpandableListAdapter(activity, listDataHeader, listDataChild)
        expListView.setAdapter(listAdapter)
        expListView.expandGroup(0)
        expListView.expandGroup(1)


        return v
    }

    private fun prepareListData() {
        listDataHeader = ArrayList<String>()
        listDataChild = HashMap<String, List<String>>()
        // Adding child data
        listDataHeader.add("08:30 - 11:45")
        listDataHeader.add("13:30 - 17:00")
        // Adding child data
        val horario1 = ArrayList<String>()
        horario1.add("Evento: Apresentações e socialização de trabalhos e projetos desenvolvidos nas escolas municipais, estaduais e no IFSC Câmpus Canoinhas\nLocal: Auditório")
        horario1.add("Evento: Oficina\nTema: Cálculo de traços de concreto\nResponsável: Profª Rosangela\nLocal: Laboratório de solos")
        horario1.add("Evento: Oficina\nTema: Torre de palitos\nResponsável: Prof Manassés\nLocal: Laboratório de elétrica")
        horario1.add("Evento: Oficina\nTema: Fazendo arte com a matemática\nResponsável: Profª Carla\nLocal: Laboratório de Informática 14")
        horario1.add("Evento: Oficina\nTema: Química no cotidiano: eletroquímica, bateria, poder caloríco e colorimetria\nResponsável: Profª Maressa\nLocal: Laboratório de ciências da natureza")
        horario1.add("Evento: Oficina\nTema: Energia eólica\nResponsável: Profª Roberta\nLocal: Sala 05")
        horario1.add("Evento: Oficina\nTema: Relaxamento\nResponsável: Profª Maristela\nLocal: Sala 15")
        val horario2 = ArrayList<String>()
        horario2.add("Evento: Torneio de Xadrez\nHorário: 13:15")
        horario2.add("Evento: Gincana de perguntas - Torta na cara\nHorário: 15:30")
        horario2.add("Evento: Oficina\nTema: Energia eólica\nResponsável: Profª Roberta\nLocal: Sala 05")
        horario2.add("Evento: Oficina\nTema: Fazendo arte com a matemática\nResponsável: Profª Carla\nLocal: Laboratório de Informática 14")
        horario2.add("Evento: Oficina\nTema: Diferentes tipos de Tangram\nResponsável: Profª Carla\nLocal: Sala 24")
        horario2.add("Evento: Oficina\nTema: Diferentes tipos de Tangram\nResponsável: Profª Carla\nLocal: Sala 25")
        horario2.add("Evento: Oficina\nTema: Criptografia\nResponsável: Profª Carla\nLocal: Laboratório de Informática 13")
        horario2.add("Evento: Oficina\nTema: Telefonia IP(necessário portar smarthphone e ter conhecimento linux)\nResponsável: Jonas\nLocal: Laboratório de redes")
        horario2.add("Evento: Oficina\nTema: Tabuleiro de composições geométricas\nResponsável: Cinthia\nLocal: Laboratório de solos")
        horario2.add("Evento: Oficina\nTema: Estamparia em papel\nResponsável: Profª Micheline\nLocal: Laboratório de artes")
        horario2.add("Evento: Oficina\nTema: As calorias presentes nos alimentos\nResponsável: Profª Joice\nLocal: Laboratório de alimentos")
        horario2.add("Evento: Oficina\nTema: Relaxamento\nResponsável: Profª Maristela\nLocal: Sala 15")
        horario2.add("Evento: Oficina\nTema: Análise dos custos de produção de brigadeiros: tradicional e gourmet seguindo as Boas Práticas de Fabricação\nResponsável: Frederico Schroder\nMaiara Soares Fragoso\nLocal: Laboratório de Panificação")
        horario2.add("Evento: Encerramento e premiação gincana IFSC Sustentável")
        horario2.add("Evento: Premiação do torneio de Xadrez e da gincana de perguntas - Torta na cara")
        listDataChild.put(listDataHeader[0], horario1) // Header, Child data
        listDataChild.put(listDataHeader[1], horario2)

    }

}
