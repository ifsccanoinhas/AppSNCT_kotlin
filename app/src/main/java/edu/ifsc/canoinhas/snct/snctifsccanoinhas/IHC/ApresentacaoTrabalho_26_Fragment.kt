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

class ApresentacaoTrabalho_26_Fragment : Fragment() {//Primeiro dia OK


    internal lateinit var listAdapter: ExpandableListAdapter
    internal lateinit var expListView: ExpandableListView
    internal lateinit var listDataHeader: MutableList<String>
    internal lateinit var listDataChild: HashMap<String, List<String>>


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater!!.inflate(R.layout.activity_apresentacao26, container, false)

        expListView = v.findViewById(R.id.apresentacao_26)
        prepareListData()
        listAdapter = ExpandableListAdapter(activity, listDataHeader, listDataChild)
        expListView.setAdapter(listAdapter)
        expListView.expandGroup(0)
        expListView.expandGroup(1)
        expListView.expandGroup(2)
        expListView.expandGroup(3)
        expListView.expandGroup(4)
        expListView.expandGroup(5)
        expListView.expandGroup(6)
        expListView.expandGroup(7)
        expListView.expandGroup(8)
        expListView.expandGroup(9)
        expListView.expandGroup(10)
        expListView.expandGroup(11)
        expListView.expandGroup(12)


        return v
    }

    private fun prepareListData() {
        listDataHeader = ArrayList<String>()
        listDataChild = HashMap<String, List<String>>()
        // Adding child data
        listDataHeader.add("08:15 - 08:30")
        listDataHeader.add("08:30 - 08:45")
        listDataHeader.add("08:45 - 09:00")
        listDataHeader.add("09:00 - 09:15")
        listDataHeader.add("09:15 - 09:30")
        listDataHeader.add("09:30 - 09:45")
        listDataHeader.add("09:45 - 10:00")
        listDataHeader.add("10:00 - 10:15")
        listDataHeader.add("10:15 - 10:30")
        listDataHeader.add("10:30 - 10:45")
        listDataHeader.add("10:45 - 11:00")
        listDataHeader.add("11:00 - 11:15")
        listDataHeader.add("11:15 - 11:30")
        // Adding child data
        val horario1 = ArrayList<String>()
        horario1.add("Instituto Federal de Santa Catarina\nTítulo: As rotas turísticas como alternativa de renda no espaço rural no município de Canoinhas/SC")
        val horario2 = ArrayList<String>()
        horario2.add("Instituto Federal de Santa Catarina\nTítulo: --------") // Verificar evento
        val horario3 = ArrayList<String>()
        horario3.add("Instituto Federal de Santa Catarina\nTítulo: O cinema como ferramenta pedagógica interdisciplinar nos cursos técnicos integrados do IFSC Câmpus Canoinhas")
        val horario4 = ArrayList<String>()
        horario4.add("Instituto Federal de Santa Catarina\nTítulo: Plataforma negociação de produtos agroecológicos do NEAPLAN")
        val horario5 = ArrayList<String>()
        horario5.add("Instituto Federal de Santa Catarina\nTítulo: Descobrindo quem são os alunos do IFSC Canoinhas")
        val horario6 = ArrayList<String>()
        horario6.add("Instituto Federal de Santa Catarina\nTítulo: Programa de promoção e orientação à prática de caminhada e corrida")
        val horario7 = ArrayList<String>()
        horario7.add("Instituto Federal de Santa Catarina\nTítulo: Reaproveitamento da água do resfriamento dos destiladores para limpeza geral do Câmpus")
        val horario8 = ArrayList<String>()
        horario8.add("Instituto Federal de Santa Catarina\nTítulo: Ensino de programação para crianças em situação de vulnerabilidade no Bairro Piedade, em Canoinhas")
        val horario9 = ArrayList<String>()
        horario9.add("Instituto Federal de Santa Catarina\nTítulo: Informática e Cidadania: Inclusão digital de alunos da rede pública em condição de vulnerabilidade social em Canoinhas/SC")
        val horario10 = ArrayList<String>()
        horario10.add("Instituto Federal de Santa Catarina\nTítulo: ExoCare")
        val horario11 = ArrayList<String>()
        horario11.add("Instituto Federal de Santa Catarina\nTítulo: Memórias do acampamento Chico Lessa")
        val horario12 = ArrayList<String>()
        horario12.add("Instituto Federal de Santa Catarina\nTítulo: Tecendo cidadania: Educação de mulheres em situação de privação de liberdade")
        val horario13 = ArrayList<String>()
        horario13.add("Instituto Federal de Santa Catarina\nTítulo: Eficiência da aplicação de Azospirillum brasilense e adubação orgânica sobre a produtividade de milho de polinização aberta")


        listDataChild.put(listDataHeader[0], horario1) // Header, Child data
        listDataChild.put(listDataHeader[1], horario2)
        listDataChild.put(listDataHeader[2], horario3) // Header, Child data
        listDataChild.put(listDataHeader[3], horario4)
        listDataChild.put(listDataHeader[4], horario5) // Header, Child data
        listDataChild.put(listDataHeader[5], horario6) // Header, Child data
        listDataChild.put(listDataHeader[6], horario7)
        listDataChild.put(listDataHeader[7], horario8) // Header, Child data
        listDataChild.put(listDataHeader[8], horario9)
        listDataChild.put(listDataHeader[9], horario10) // Header, Child data
        listDataChild.put(listDataHeader[10], horario11) // Header, Child data
        listDataChild.put(listDataHeader[11], horario12)
        listDataChild.put(listDataHeader[12], horario13) // Header, Child data


    }

}

