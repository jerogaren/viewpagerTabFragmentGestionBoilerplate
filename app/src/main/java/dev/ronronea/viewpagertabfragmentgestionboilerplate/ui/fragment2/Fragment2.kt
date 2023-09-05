package dev.ronronea.viewpagertabfragmentgestionboilerplate.ui.fragment2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dev.ronronea.viewpagertabfragmentgestionboilerplate.databinding.Fragment2Binding

class Fragment2 : Fragment() {

    private var _binding: Fragment2Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fragment2ViewModel =
            ViewModelProvider(this).get(Fragment2ViewModel::class.java)

        _binding = Fragment2Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.text
        fragment2ViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}