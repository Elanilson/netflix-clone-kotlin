package com.apkdoandroid.spotifyclone.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.apkdoandroid.spotifyclone.FragmentsTab.Albuns
import com.apkdoandroid.spotifyclone.FragmentsTab.Artistas
import com.apkdoandroid.spotifyclone.FragmentsTab.PlayLists

import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems
import kotlinx.android.synthetic.main.fragment_biblioteca.*
import com.apkdoandroid.spotifyclone.R
// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Biblioteca.newInstance] factory method to
 * create an instance of this fragment.
 */
class Biblioteca : Fragment() {
    companion object{
        fun newInstance(): Biblioteca{
            val fragmentBiblioteca = Biblioteca()
            val argumentos = Bundle()
            fragmentBiblioteca.arguments = argumentos
            return fragmentBiblioteca

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_biblioteca, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        var adapter = FragmentPagerItemAdapter(fragmentManager, FragmentPagerItems.with(context)

            .add("Playlists",PlayLists::class.java)
            .add("Artistas",Artistas::class.java)
            .add("Álbuns", Albuns::class.java)
            .create())

        viewpager.adapter = adapter
        viewpagertab.setViewPager(viewpager)
    }

}
