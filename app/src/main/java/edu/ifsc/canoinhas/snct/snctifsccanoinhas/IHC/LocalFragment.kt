package edu.ifsc.canoinhas.snct.snctifsccanoinhas.IHC

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import edu.ifsc.canoinhas.snct.snctifsccanoinhas.R


/**
 * A simple [Fragment] subclass.
 */
class LocalFragment : Fragment(), OnMapReadyCallback {

    internal lateinit var map: GoogleMap
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater!!.inflate(R.layout.fragment_maps, container, false)

        return v
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map1) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap

        val ifsc = LatLng(-26.183198, -50.366949)
        val option = MarkerOptions()
        option.position(ifsc).title("IFSC - Câmpus Canoinhas")
        map.addMarker(option)
        map.setTrafficEnabled(true)
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(ifsc, 17F))
    }
}
