package com.example.cashflow.ui.registrarmovimientos

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cashflow.R

class RegistrarMovimientosFragment : Fragment() {

    companion object {
        fun newInstance() = RegistrarMovimientosFragment()
    }

    private val viewModel: RegistrarMovimientosViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_registrar_movimientos, container, false)
    }
}