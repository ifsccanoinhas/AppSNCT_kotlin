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
        listDataHeader.add("08:15 - 12:00")
        listDataHeader.add("13:30 - 17:00")
        // Adding child data
        val horario1 = ArrayList<String>()
        horario1.add("Evento: Apresentações e socialização de trabalhos e projetos desenvolvidos nas escolas municipais, estaduais e no IFSC Câmpus Canoinhas\nLocal: Auditório")
        horario1.add("Evento: Oficina\nTema: Cálculo de traços de concreto\nResponsável: Profª Rosangela\nVagas: 4")
        horario1.add("Evento: Oficina\nTema: Torre de palitos\nResponsável: Prof Manassés\nVagas: FECHADO")
        horario1.add("Evento: Oficina\nTema: Fazendo arte com a matemática\nResponsável: Profª Carla\nVagas: FECHADO")
        horario1.add("Evento: Oficina\nTema: Química no cotidiano: eletroquímica, bateria, poder caloríco e colorimetria\nResponsável: Profª Maressa\nVagas: FECHADO")
        horario1.add("Evento: Oficina\nTema: Energia eólica\nResponsável: Profª Roberta\nVagas: FECHADO")
        horario1.add("Evento: Oficina\nTema: Bozó\nResponsável: Profª Maristela\nVagas: FECHADO")
        val horario2 = ArrayList<String>()
        horario2.add("Evento: Oficina\nTema: Energia eólica\nResponsável: Profª Roberta\nVagas: FECHADO")
        horario2.add("Evento: Oficina\nTema: Fazendo arte com a matemática\nResponsável: Profª Carla\nVagas: 15")
        horario2.add("Evento: Oficina\nTema: Diferentes tipos de Tangram\nResponsável: Profª Carla\nVagas: FECHADO")
        horario2.add("Evento: Oficina\nTema: Diferentes tipos de Tangram\nResponsável: Profª Carla\nVagas: FECHADO")
        horario2.add("Evento: Oficina\nTema: Criptografia\nResponsável: Profª Carla\nVagas: FECHADO")
        horario2.add("Evento: Oficina\nTema: Telefonia IP(necessário portar smarthphone e ter conhecimento linux)\nResponsável: Prof. Jonas\nVagas: 20")
        horario2.add("Evento: Oficina\nTema: Tabuleiro de composições geométricas\nResponsável: Cinthia\nVagas: FECHADO")
        horario2.add("Evento: Oficina\nTema: Estamparia em papel\nResponsável: Profª Micheline\nVagas: 5")
        horario2.add("Evento: Oficina\nTema: As calorias presentes nos alimentos\nResponsável: Profª Joice\nVagas: 10")
        horario2.add("Evento: Oficina\nTema: Bozó\nResponsável: Profª Maristela\nVagas: FECHADO")
        horario2.add("Evento: Oficina\nTema: Análise dos custos de produção de brigadeiros: tradicional e gourmet seguindo as Boas Práticas de Fabricação\nResponsável: Frederico Schroder e Maiara Soares Fragoso\nVagas: FECHADO")
        horario2.add("Evento: Oficina\nTema: A Construção da Formação Continuada para a Docência na Educação Profissional Técnica de Nível Médio. *exclusiva para professores do IFSC Canoinhas\nResponsável: Igor Guterres Faria\nVagas: FECHADO")
        horario2.add("Evento: Torneio de Xadrez\nHorário: 13:15")
        horario2.add("Evento: Gincana de perguntas - Torta na cara\nHorário: 15:30")
        horario2.add("Evento: Encerramento e premiação gincana IFSC Sustentável\nHorário: 16:30")
        horario2.add("Evento: Premiação do torneio de Xadrez e da gincana de perguntas - Torta na cara\nHorário: 17:00")
        listDataChild.put(listDataHeader[0], horario1) // Header, Child data
        listDataChild.put(listDataHeader[1], horario2)

    }

}
