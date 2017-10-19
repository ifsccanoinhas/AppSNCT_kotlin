package edu.ifsc.canoinhas.snct.snctifsccanoinhas.IHC
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListAdapter
import android.widget.ExpandableListView
import edu.ifsc.canoinhas.snct.snctifsccanoinhas.R
import java.util.ArrayList
import java.util.HashMap

class PrimeiroDiaFragment : Fragment() {


    internal lateinit var listAdapter: ExpandableListAdapter
    internal lateinit var expListView: ExpandableListView
    internal lateinit var listDataHeader: MutableList<String>
    internal lateinit var listDataChild: HashMap<String, List<String>>


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater!!.inflate(R.layout.activity_primeiro_dia_fragment, container, false)

        expListView = v.findViewById(R.id.primeiroDia)
        prepareListData()
        listAdapter = ExpandableListAdapter(activity, listDataHeader, listDataChild)
        expListView.setAdapter(listAdapter)
        expListView.expandGroup(0)
        expListView.expandGroup(1)
        expListView.expandGroup(2)
        expListView.expandGroup(3)
        expListView.expandGroup(4)

        return v
    }

    private fun prepareListData() {
        listDataHeader = ArrayList<String>()
        listDataChild = HashMap<String, List<String>>()
        // Adding child data
        listDataHeader.add("19:00 - 19:15")
        listDataHeader.add("19:15 - 19:30")
        listDataHeader.add("19:30 - 19:45")
        listDataHeader.add("19:45 - 21:00")
        listDataHeader.add("21:00 - 22:30")
        // Adding child data
        val horario1 = ArrayList<String>()
        horario1.add("Solenidade de Abertura")
        val horario2 = ArrayList<String>()
        horario2.add("Evento: Entrega premiação SEPEI e OBI (Olimpíada Brasileira de Informática)\nLocal: Auditório")
        val horario3 = ArrayList<String>()
        horario3.add("Evento: Apresentação Cultural: Dança do cubo - Alunos da Escola de Educação Básica Municipal Reinaldo Kruger\nLocal: Auditório")
        val horario4 = ArrayList<String>()
        horario4.add("Evento: Mesa Redonda\nTema: A matemática nas diferentes áreas de formação\nLocal: Auditório")
        val horario5 = ArrayList<String>()
        horario5.add("Evento: Palestra\nTema:Implantação do Sistema de Redução Energia Elétrica no Câmpus Canoinhas\nLocal: Auditório")
        listDataChild.put(listDataHeader[0], horario1) // Header, Child data
        listDataChild.put(listDataHeader[1], horario2)
        listDataChild.put(listDataHeader[2], horario3) // Header, Child data
        listDataChild.put(listDataHeader[3], horario4)
        listDataChild.put(listDataHeader[4], horario5) // Header, Child data

    }

}

