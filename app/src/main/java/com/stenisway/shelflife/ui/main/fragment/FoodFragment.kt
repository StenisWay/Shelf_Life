package com.stenisway.shelflife.ui.main.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stenisway.shelflife.R
import com.stenisway.shelflife.ui.main.viewmodel.FoodViewModel

class FoodFragment : Fragment() {

    companion object {
        fun newInstance() = FoodFragment()
    }

    private lateinit var viewModel: FoodViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_food, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FoodViewModel::class.java)
        // TODO: Use the ViewModel
    }

}