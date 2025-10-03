package com.example.app.fragment

import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.app.MainActivity
import com.example.app.R
import com.example.app.state.SettingsState

class SettingsFragment : Fragment() {

    companion object {
        fun newInstance() = SettingsFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_settings, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Switch>(R.id.switchOnlyFavorite).setOnCheckedChangeListener { _, isChecked ->
            SettingsState.onlyFavorite = isChecked
            Toast.makeText(requireContext(), "Only Favorite: $isChecked (mock)", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<Button>(R.id.btnBackHome).setOnClickListener {
            (requireActivity() as MainActivity).navigateTo(HomeFragment.newInstance(), addToBackStack = false)
        }
    }
}