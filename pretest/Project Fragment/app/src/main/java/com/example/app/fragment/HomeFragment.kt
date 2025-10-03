package com.example.app.fragment

import android.os.Bundle
import android.view.*
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.app.MainActivity
import com.example.app.R
import com.example.app.data.MockBooks
import androidx.recyclerview.widget.RecyclerView
import com.example.app.adapter.BookAdapter
import com.example.app.state.SettingsState


class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_home, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recycler = view.findViewById<RecyclerView>(R.id.rvBooks)
        recycler.layoutManager = LinearLayoutManager(requireContext())

        val books = if (SettingsState.onlyFavorite) {
            MockBooks.items.filter { it.isFavorite }
        } else {
            MockBooks.items
        }

        recycler.adapter = BookAdapter(books) { position ->
            (requireActivity() as MainActivity).navigateTo(
                DetailFragment.newInstance(position),
                addToBackStack = true
            )
        }
    }

}