package dev.ronronea.viewpagertabfragmentgestionboilerplate.ui.fragment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dev.ronronea.viewpagertabfragmentgestionboilerplate.databinding.Fragment1Binding

class Fragment1 : Fragment() {

    private var _binding: Fragment1Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(Fragment1ViewModel::class.java)

        _binding = Fragment1Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.text
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}