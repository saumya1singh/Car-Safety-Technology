package com.monstertechno.otpverificationuidesign.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProviders
import com.monstertechno.otpverificationuidesign.R
import kotlinx.android.synthetic.main.fragment_dashboard.*

class DashboardFragment : androidx.fragment.app.Fragment() {
    
    private lateinit var dashboardViewModel: DashboardViewModel
    private lateinit var upload1: Button
    private lateinit var upload2: Button
    
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        upload1 = root.findViewById(R.id.upload1)
        upload2= root.findViewById(R.id.upload2)
        
    
    
        upload1.setOnClickListener(View.OnClickListener {
            val intent = Intent(context, LicenseActivity::class.java)
            startActivity(intent)
        })
    
        upload2.setOnClickListener(View.OnClickListener {
            val intent = Intent(context, AdhaarActivity::class.java)
            startActivity(intent)
        })
       
        return root
    }
}