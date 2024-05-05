package com.stenisway.shelflife.ui.main.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stenisway.shelflife.R
import com.stenisway.shelflife.ui.main.viewmodel.AddKindViewModel

class AddKindFragment : Fragment() {

    companion object {
        fun newInstance() = AddKindFragment()
    }

    private lateinit var viewModel: AddKindViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_kind, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddKindViewModel::class.java)
        // TODO: Use the ViewModel
    }

}