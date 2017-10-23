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

class ApresentacaoTrabalho_25_Fragment : Fragment() {//Primeiro dia OK


    internal lateinit var listAdapter: ExpandableListAdapter
    internal lateinit var expListView: ExpandableListView
    internal lateinit var listDataHeader: MutableList<String>
    internal lateinit var listDataChild: HashMap<String, List<String>>


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater!!.inflate(R.layout.activity_apresentacao25, container, false)

        expListView = v.findViewById(R.id.apresentacao_25)
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
        expListView.expandGroup(13)
        expListView.expandGroup(14)
        expListView.expandGroup(15)
        expListView.expandGroup(16)
        expListView.expandGroup(17)
        expListView.expandGroup(18)
        expListView.expandGroup(19)
        expListView.expandGroup(20)
        expListView.expandGroup(21)
        expListView.expandGroup(22)
        expListView.expandGroup(23)

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
        listDataHeader.add("13:30 - 13:45")
        listDataHeader.add("13:45 - 14:00")
        listDataHeader.add("14:00 - 14:15")
        listDataHeader.add("14:15 - 14:30")
        listDataHeader.add("14:30 - 14:45")
        listDataHeader.add("14:45 - 15:00")
        listDataHeader.add("15:00 - 15:15")
        listDataHeader.add("15:15 - 15:30")
        listDataHeader.add("15:30 - 15:45")
        listDataHeader.add("15:45 - 16:00")
        listDataHeader.add("16:00 - 16:45")
        listDataHeader.add("16:45 - 17:00")

        // Adding child data
        val horario1 = ArrayList<String>()
        horario1.add("Escola: E.E.F Sagrado Coração de Jesus\nTítulo: Jogos matemáticos")
        val horario2 = ArrayList<String>()
        horario2.add("Escola: E.E.B Irmã Maria Felicitas\nTítulo: Ler te dá asas, escrever te faz voar")
        val horario3 = ArrayList<String>()
        horario3.add("Escola: E.E.E Sagrado Coração de Jesus\nTítulo: Compartilhar Livros para reaproveitar conhecimentos")
        val horario4 = ArrayList<String>()
        horario4.add("Escola: E.E.B Irmã Maria Felicitas\nTítulo: Em tempos de crise, reciclar é luxo")
        val horario5 = ArrayList<String>()
        horario5.add("Escola: E.E.B Julia Zaniolo\nTítulo: Irrigador solar: uma alternativa sustentável")
        val horario6 = ArrayList<String>()
        horario6.add("Escola: E.B.M Maria Izabel\nTítulo: Economia informal da comunidade escolar")
        val horario7 = ArrayList<String>()
        horario7.add("Escola: E.E.B Irmã Maria Felicitas\nTítulo: Corpo saudável - Mente em movimento")
        val horario8 = ArrayList<String>()
        horario8.add("Escola: E.B.M Reinaldo Kruger\nTítulo: Cubo mágico - uma brincadeira vantajosa")
        val horario9 = ArrayList<String>()
        horario9.add("Escola: E.B.M Alberto Wardenski\nTítulo: Solo vivo")
        val horario10 = ArrayList<String>()
        horario10.add("Escola: E.E.B Julia Zaniolo\nTítulo: Tecnologia e sustebabilidade: construções de microscópio com materiais recicláveis em prol da educação")
        val horario11 = ArrayList<String>()
        horario11.add("Instituto Federal de Santa Catarina\nTítulo: O meu lugar é cercado de luta e suor: Mulheres Sim - entrelaçando sentidos")
        val horario12 = ArrayList<String>()
        horario12.add("Instituto Federal de Santa Catarina\nTítulo: Minigerador Eólico: introdução ao uso de energias renováveis na construção civil")
        val horario13 = ArrayList<String>()
        horario13.add("Institulo Federal de Santa Catarina\nTítulo: Desenvolvimento de aplicativo para dispositivos móveis para a divulgação do II Simpósio de Humanidades")
        val horario14 = ArrayList<String>()
        horario14.add("Escola: E.B.M Maria Izabel\nTítulo: Economia informal da comunidade escolar")
        val horario15 = ArrayList<String>()
        horario15.add("Instituto Federal de Santa Catarina\nTítulo: Projeto Rondom")
        val horario16 = ArrayList<String>()
        horario16.add("Escola: E.B.M Achiles Pazda\nTítulo: Escola sustentável")
        val horario17 = ArrayList<String>()
        horario17.add("Instituto Federal de Santa Catarina\nTítulo: IFSC/SESC em Atos")
        val horario18 = ArrayList<String>()
        horario18.add("Instituto Federal de Santa Catarina\nTítulo: Integração de discentes na vivência da docência e incentivo à pesquisa atráves da elaboração de mandioquinha-salsa minimamente processada")
        val horario19 = ArrayList<String>()
        horario19.add("Instituto Federal de Santa Catarina\nTítulo: Microbiologia e Facebook: uma parceria a favor da aprendizagem")
        val horario20 = ArrayList<String>()
        horario20.add("Instituto Federal de Santa Catarina\nTítulo: Estabilidade microbiológica e sensorial de salada de fruta processada por métodos combinados")
        val horario21 = ArrayList<String>()
        horario21.add("Instituto Federal de Santa Catarina\nTítulo: Concepção e implantação de um modelo de laboratório de informática de baixo custo com foco em mobilidade e multiusabilidade")
        val horario22 = ArrayList<String>()
        horario22.add("Instituto Federal de Santa Catarina\nTítulo: Tecnologia de alimentos na comunidade")
        val horario23 = ArrayList<String>()
        horario23.add("Instituto Federal de Santa Catarina\nTítulo: Determinação de cloreto de sódio, nitrato e nitrito em queijos comercializados no município de Canoinhas - SC")
        val horario24 = ArrayList<String>()
        horario24.add("Instituto Federal de Santa Catarina\nTítulo: OBI - Apoio e capacitação dos alunos de Escolas Pública de Canoinhas para Olimpíadas Brasileira de Informática")

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
        listDataChild.put(listDataHeader[13], horario14)
        listDataChild.put(listDataHeader[14], horario15) // Header, Child data
        listDataChild.put(listDataHeader[15], horario16) // Header, Child data
        listDataChild.put(listDataHeader[16], horario17)
        listDataChild.put(listDataHeader[17], horario18) // Header, Child data
        listDataChild.put(listDataHeader[18], horario19)
        listDataChild.put(listDataHeader[19], horario20) // Header, Child data
        listDataChild.put(listDataHeader[20], horario21) // Header, Child data
        listDataChild.put(listDataHeader[21], horario22)
        listDataChild.put(listDataHeader[22], horario23) // Header, Child data
        listDataChild.put(listDataHeader[23], horario24)


    }

}

